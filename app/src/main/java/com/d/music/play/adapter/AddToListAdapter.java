package com.d.music.play.adapter;

import android.content.Context;
import android.view.View;

import com.d.lib.xrv.adapter.CommonAdapter;
import com.d.lib.xrv.adapter.CommonHolder;
import com.d.music.R;
import com.d.music.module.greendao.music.CustomList;

import java.util.List;

/**
 * 添加到列表Popup适配器
 * Created by D on 2017/4/29.
 */
public class AddToListAdapter extends CommonAdapter<CustomList> {

    public AddToListAdapter(Context context, List<CustomList> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void convert(int position, final CommonHolder holder, final CustomList item) {
        holder.setText(R.id.tv_list_name, item.listName);
        holder.setChecked(R.id.cb_check, item.isChecked);
        holder.setViewOnClickListener(R.id.llyt_item, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.isChecked = !item.isChecked;
                holder.setChecked(R.id.cb_check, item.isChecked);
            }
        });
    }
}
