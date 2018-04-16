package com.luisro00005513.labo5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by luisro on 4/16/18.
 */

public class AdaptadorPlaneta extends RecyclerView.Adapter<AdaptadorPlaneta.PlanetViewHolder>{
    Context mycontext;
    List<ModeloPlaneta> planetaList;


    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mycontext);
        View v = inflater.inflate(R.layout.como_sea, parent);//vista parent que quiero que se infle
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.tituloTxtView.setText(planetaList.get(position).getTitle());
        holder.descripcionTxtView.setText(planetaList.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return planetaList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView tituloTxtView, descripcionTxtView;

        public PlanetViewHolder(View itemView){
            super(itemView);

            tituloTxtView = itemView.findViewById(R.id.Texto_view);

        }//PlanetViewHolder


    }//publicViewHolder




}
