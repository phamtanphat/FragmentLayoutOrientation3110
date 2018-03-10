package com.ptp.phamtanphat.fragmentlayoutorientation3110;

import java.io.Serializable;

/**
 * Created by KhoaPhamPC on 8/3/2018.
 */

public class Sinhvien implements Serializable {
    private String Ten;
    private int Namsinh;
    private String Diachi;

    public Sinhvien(String ten, int namsinh, String diachi) {
        Ten = ten;
        Namsinh = namsinh;
        Diachi = diachi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
