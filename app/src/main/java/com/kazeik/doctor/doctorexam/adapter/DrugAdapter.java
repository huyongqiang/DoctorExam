package com.kazeik.doctor.doctorexam.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kazeik.doctor.doctorexam.R;
import com.kazeik.doctor.doctorexam.bean.DrugItemBean;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kazeik.chen on 2016/4/21 0021 17:18.
 * email:kazeik@163.com ,QQ:77132995
 */
public class DrugAdapter extends MyBaseAdapter<DrugItemBean.ReMsgEntity.ResEntity> {
    public DrugAdapter(Context cont) {
        super(cont);
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        ViewHolder viewHolder;
        if (null == arg1) {
            arg1 = inflater.inflate(R.layout.layout_drug_item, arg2, false);
            viewHolder = new ViewHolder(arg1);
            arg1.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) arg1.getTag();
        }
        DrugItemBean.ReMsgEntity.ResEntity resEntity = getSrcData().get(arg0);
        viewHolder.tvDrugName.setText(resEntity.trade_name);
        viewHolder.tvDrugType.setText(resEntity.medicine_type_name);

        return arg1;
    }

    static class ViewHolder {
        @Bind(R.id.tv_drugName)
        TextView tvDrugName;
        @Bind(R.id.tv_drugType)
        TextView tvDrugType;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
