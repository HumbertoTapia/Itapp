package com.ander.asus.itapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorTips extends RecyclerView.Adapter<AdaptadorTips.ViewHolderTips> {
    ArrayList<TipsVo> listaTips;

    public AdaptadorTips(ArrayList<TipsVo> listaTips) {
        this.listaTips = listaTips;
    }

    @NonNull
    @Override


    public ViewHolderTips onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderTips(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTips holder, int position) {

        holder.et_titulo.setText(listaTips.get(position).getTitulo());
        holder.et_descripción.setText(listaTips.get(position).getDescripciuon());
        holder.imagen.setImageResource(listaTips.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return listaTips.size();
    }

    public class ViewHolderTips extends RecyclerView.ViewHolder {

        TextView et_titulo, et_descripción;
        ImageView imagen;
        public ViewHolderTips(@NonNull View itemView) {
            super(itemView);

            et_titulo= itemView.findViewById(R.id.id_titulo);
            et_descripción= itemView.findViewById(R.id.id_descripcion);
            imagen= itemView.findViewById(R.id.id_imagen);
        }
    }
}
