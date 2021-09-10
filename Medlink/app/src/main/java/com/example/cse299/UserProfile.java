package com.example.cse299;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {

    private FirebaseUser user;
    private DatabaseReference reference;
    private String UID;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        user = FirebaseAuth.getInstance().getCurrentUser();
       reference = FirebaseDatabase.getInstance().getReference().child("UserInfo").child(UID);



        UID = FirebaseQueries.getInstance().getUID();

        final TextView nameTextView = (TextView) findViewById(R.id.PersonName);
        final TextView ageTextView = (TextView) findViewById(R.id.PersonAge);
        final TextView emailTextView = (TextView) findViewById(R.id.PersonMail);

        reference.child("UserInfo").child(UID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                com.example.cse299.user userP = snapshot.getValue(com.example.cse299.user.class);
                if(userP != null){
                    String name = userP.fullName;
                    String age = userP.age;
                    String email =userP.email;

                    nameTextView.setText(name);
                    ageTextView.setText(age);
                    emailTextView.setText(email);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(UserProfile.this,"Something went wrong!", Toast.LENGTH_LONG).show();
            }
        });
    }
}