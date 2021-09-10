package com.example.cse299;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class labAdapter extends RecyclerView.Adapter<labAdapter.ViewHolder> {
    private List<modelLab> userList2;
    Context context2;
    public labAdapter (List<modelLab>userList2,Context context2)
    { this .userList2=userList2;
    this.context2=context2;}


    @NonNull
    @Override
    public labAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.labitem_design,parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull labAdapter.ViewHolder holder, int position) {
        final modelLab temp1 =userList2.get(position);
        int resource=userList2.get(position).getImgv();
        String name=userList2.get(position).getTv1();
        String msg=userList2.get(position).getTv2();


        holder.setData(resource,name,msg);

        holder.imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context2,reports.class);
                intent.putExtra("imagename1", temp1.getImgv());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context2.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList2.size();

    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgv;
        private TextView tv1;
        private TextView tv2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgv=itemView.findViewById(R.id.labimg);
            tv1=itemView.findViewById(R.id.lab1);
            tv2=itemView.findViewById(R.id.lab2);

        }

        public void setData(int resource, String name, String msg) {

            imgv.setImageResource(resource);
            tv1.setText(name);
            tv2.setText(msg);

        }
    }

}
