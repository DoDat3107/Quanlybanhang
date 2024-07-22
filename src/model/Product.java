package model;

import java.util.Arrays;

public class Product {
    private int id;
    private String name;
    private String Loai ;
    private int gia;
    private int idNext =1;
    public Product( String name, String loai, int gia) {
        this.id = idNext        ;
        this.name = name;
        Loai = loai;
        this.gia = gia;
        idNext++;
    }
    public Product(int id, String name, String loai, int gia) {
        this.id = id        ;
        this.name = name;
        Loai = loai;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getIdNext() {
        return idNext;
    }

    public void setIdNext(int idNext) {
        this.idNext = idNext;
    }

    @Override
    public String toString() {
        return "STT: " + id + " || Tên sản phẩn: " + name + " || Thuộc loại hàng: " + Loai + " || Giá: " + gia;
    }
}
