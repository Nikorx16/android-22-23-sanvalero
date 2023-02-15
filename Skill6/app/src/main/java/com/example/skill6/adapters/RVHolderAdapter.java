package com.example.skill6.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.skill6.R;
import com.example.skill6.networking.ProductResult;

import java.util.List;

public class RVHolderAdapter {
    public static class RVRetrofitAdapter extends RecyclerView.Adapter<RVRetrofitAdapter.RVHolderRetrofit>{
    Context mCntext;
    List<ProductResult> productResults;
    public RVRetrofitAdapter(Context mCntext, List<ProductResult> productResults){
        this.productResults= productResults;
        this.mCntext=mCntext;
    }

        @NonNull
        @Override
        public RVRetrofitAdapter.RVHolderRetrofit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(mCntext).inflate(R.layout.rv_product_item, parent, false);
            return new RVHolderRetrofit(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RVRetrofitAdapter.RVHolderRetrofit holder, int position) {
    holder.tvTitle.setText(productResults.get(position).getTittle());
            Glide.with(mContext).load(ProductResult.
                    get(position).getProductImage()).
                    placeholder(R.drawable.camino).
                    error(R.drawable.ic_launcher_background).
                    into(holder.ivImage);
        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class RVHolderRetrofit extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView ivImage;
        }

        public RVHolderRetrofit(@NonNull View itemView){
        super(itemView);
        ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}
