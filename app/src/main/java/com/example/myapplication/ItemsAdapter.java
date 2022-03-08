package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ItemsAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Items> listItem;
    private int positionSelect = -1;

    public ItemsAdapter(CustomListViewExampleActivity context, int idLayout, List<Items> listItem) {
        this.context = context;
        this.idLayout = idLayout;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        if (listItem.size() != 0 && !listItem.isEmpty()) {
            return listItem.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvItemName = (TextView) convertView.findViewById(R.id.tvItemName);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout);
        final Items item = listItem.get(position);

        if (listItem != null && !listItem.isEmpty()) {
            tvItemName.setText(item.getName());
            int idItem = item.getId();
            switch (idItem) {
                case 1:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.xa_can_cau);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                case 7:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 8:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}
