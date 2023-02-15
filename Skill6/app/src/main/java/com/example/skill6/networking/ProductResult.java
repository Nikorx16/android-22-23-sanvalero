package com.example.skill6.networking;

import kotlin.jvm.internal.SerializedIr;

public class ProductResult {
    @SerializedName("id")
    int id;

    @SerializeName("title")
    String tittle;

    @SerializeName("image")
    String productImage;

    public int getId(){
        return id;
    }

    public String getTittle(){
        return tittle;
    }

    public String getProductImage(){
        return  productImage;S
    }
}
