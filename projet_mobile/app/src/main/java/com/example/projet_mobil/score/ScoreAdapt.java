package com.example.projet_mobil.score;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.projet_mobil.R;

import java.util.ArrayList;

public class ScoreAdapt extends BaseAdapter {
    private ListScore list;
    private Context mcontext;
    private LayoutInflater mInflater;

    public ScoreAdapt(Context context, ListScore list){
        this.list = list;
        this.mcontext = context;
        this.mInflater = LayoutInflater.from(mcontext);
    }

    public int getCount() {
        return list.size();
    }
    public Object getItem(int position) { return list.get(position); }
    public long getItemId(int position) { return position; }

    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layoutItem;

        //(1) : Réutilisation des layouts
        if (convertView == null) {
            //Initialisation de notre item à partir du  layout XML ""
            layoutItem = (LinearLayout) mInflater.inflate(R.layout.score, parent, false);
        } else {
            layoutItem = (LinearLayout) convertView;
        }

        //(2) : Récupération des TextView de notre layout
        ImageView classement = (ImageView) layoutItem.findViewById(R.id.img_class);
        TextView pseudo = (TextView) layoutItem.findViewById(R.id.tv_pseudo);
        TextView nbPoints = (TextView) layoutItem.findViewById(R.id.tv_nbPoints);

        //(3) : Renseignement des valeurs
        classement.setImageResource(list.get(position).getClassement());
        pseudo.setText(list.get(position).getNom());
        nbPoints.setText(list.get(position).getNbPoints());

        pseudo.setTag(position);
        nbPoints.setTag(position);

        //On retourne l'item créé.
        return layoutItem;
    }
}