package com.luisro00005513.labo5;

import android.widget.ImageView;

/**
 * Created by luisro on 4/16/18.
 */

public class ModeloPlaneta {

    public int Id;
    public String title;
    public String desc;
    public ImageView ImagenPlaneta;
    //----------------------------------

    public void ModeloPlaneta(){}
    public void ModeloPlaneta(int Id, String title, String desc){}

    public String getTitle(){
        return title;

    }

    public String getDesc(){
        return desc;

    }



}
