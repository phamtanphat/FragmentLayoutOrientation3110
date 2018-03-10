package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KhoaPhamPC on 8/3/2018.
 */

public class SinhvienAdapter extends ArrayAdapter<Sinhvien> {
    public SinhvienAdapter(@NonNull Context context, int resource, @NonNull List<Sinhvien> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.dong_sinh_vien,null);

        TextView txtten = convertView.findViewById(R.id.textviewten);
        Sinhvien sinhvien = getItem(position);

        txtten.setText(sinhvien.getTen());
        return convertView;
    }
}
