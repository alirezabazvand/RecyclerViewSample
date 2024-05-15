package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adabtorname extends RecyclerView.Adapter<Adabtorname.nameviewholder> {
    String[] names ={};
    int[] ids = {};
    public Adabtorname(){
        TempListItem tempListItem=new TempListItem();
        names = tempListItem.getName();
        ids = tempListItem.getAvatar();
    }
    @NonNull
    @Override
    public nameviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recaycler,parent,false);
        return new Adabtorname.nameviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull nameviewholder holder, int position) {
    holder.setitem(names[position] ,ids[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class nameviewholder extends RecyclerView.ViewHolder{
         private ImageView imageView2;
         private TextView textView;
        public nameviewholder(@NonNull View itemView) {
            super(itemView);
            imageView2 =itemView.findViewById(R.id.imageview_item);
            textView =itemView.findViewById(R.id.textview_item);
        }
        public void setitem(String name, int imageID){
            textView.setText(name);
            imageView2.setImageResource(imageID);
        }
    }
}
