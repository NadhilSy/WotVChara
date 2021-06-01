package com.nadhil.wotvchara;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUnitAdapter extends RecyclerView.Adapter<ListUnitAdapter.ListViewHolder> {

    private ArrayList<Unit> listUnit;



    public ListUnitAdapter(ArrayList<Unit> list){
        this.listUnit = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        LayoutInflater mInflat = LayoutInflater.from(viewGroup.getContext());
        view = mInflat.inflate(R.layout.unit_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Unit unit = listUnit.get(position);
        Glide.with(holder.itemView.getContext()).load(unit.getPhoto()).apply(new RequestOptions().override(55, 55)).into(holder.imgPhoto);
        holder.tvName.setText(unit.getName());
        holder.tvDetail.setText(unit.getDetail());

        holder.rcView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                intent.putExtra("nama",listUnit.get(position).getName());
                intent.putExtra("detail", listUnit.get(position).getDetail());
                intent.putExtra("gambar", listUnit.get(position).getPhoto());
                intent.putExtra("seri", listUnit.get(position).getSeries());
                intent.putExtra("tabel", listUnit.get(position).getTabel());
                intent.putExtra("namaLimit", listUnit.get(position).getLimitName());
                intent.putExtra("videoLimit", listUnit.get(position).getLimVideo());
                intent.putExtra("skillImage", listUnit.get(position).getSkillDraw());
                intent.putExtra("skillDeskripsi", listUnit.get(position).getSkillDes());
                intent.putExtra("rare",listUnit.get(position).getRarity());
                intent.putExtra("element", listUnit.get(position).getElement());
                v.getContext().startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {

        return listUnit.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardView rcView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_unit);
            tvName = itemView.findViewById(R.id.tv_unit_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);

            rcView = (CardView) itemView.findViewById(R.id.rl_layout);
        }
    }

}
