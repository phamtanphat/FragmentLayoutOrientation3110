package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 8/3/2018.
 */

public class FragmentListSinhVien extends ListFragment {

    View view;
    SinhvienAdapter sinhvienAdapter;
    ArrayList<Sinhvien> mangsinhvien;
    DataSinhVien dataSinhVien;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentlistsinhvien,container,false);

        dataSinhVien = (DataSinhVien) getActivity();
        mangsinhvien = new ArrayList<>();
        sinhvienAdapter = new SinhvienAdapter(getActivity(),android.R.layout.simple_list_item_1,mangsinhvien);

        setListAdapter(sinhvienAdapter);
        AddSinhVien();
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        dataSinhVien.Recive(mangsinhvien.get(position));
        super.onListItemClick(l, v, position, id);
    }

    private void AddSinhVien() {
        mangsinhvien.add(new Sinhvien("Nguyen Van A",1990,"Quan 1"));
        mangsinhvien.add(new Sinhvien("Nguyen Van B",1991,"Quan 2"));
        mangsinhvien.add(new Sinhvien("Nguyen Van C",1992,"Quan 3"));
        mangsinhvien.add(new Sinhvien("Nguyen Van D",1993,"Quan 4"));
        mangsinhvien.add(new Sinhvien("Nguyen Van E",1994,"Quan 5"));
        mangsinhvien.add(new Sinhvien("Nguyen Van F",1995,"Quan 6"));
        mangsinhvien.add(new Sinhvien("Nguyen Van H",1996,"Quan 7"));
        sinhvienAdapter.notifyDataSetChanged();
    }
}
