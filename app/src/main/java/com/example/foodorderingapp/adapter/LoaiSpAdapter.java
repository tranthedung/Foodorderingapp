package com.example.foodorderingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.foodorderingapp.R;
import com.example.foodorderingapp.model.LoaiSp;

import java.util.List;

public class LoaiSpAdapter extends BaseAdapter {
    List<LoaiSp> array;
    Context context;

    public LoaiSpAdapter(Context context, List<LoaiSp> array) {
        this.array = array;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHoler{
        TextView textensp;
        ImageView imghinhanh;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoler viewHoler = null;
        if(view == null){
            viewHoler = new ViewHoler();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item_sanpham,null);
            viewHoler.textensp = view.findViewById(R.id.item_tensp);
            viewHoler.imghinhanh = view.findViewById(R.id.item_image);
            view.setTag(viewHoler);
        }else{
            viewHoler = (ViewHoler) view.getTag();
            viewHoler.textensp.setText(array.get(i).getTensanpham());
            Glide.with(context).load(array.get(i        ).getHinhanh()).into(viewHoler.imghinhanh);
        }
        return view ;
    }
}
