/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author CCNE
 */
class HoaQua {
    String NguonGoc;
    String NgayNhap;
        
    public String getNguonGoc() {
        return NguonGoc;
    }
    public void setNguonGoc(String a) {
        this.NguonGoc = a;
    }
    public String getNgayNhap() {
        return NgayNhap;
    }
    public void setNgayNhap(String a) {
        this.NgayNhap = a;
    }
}

class Orange extends HoaQua {
        
    int SoLuong; 
        
    public int getSoluong() {
        return SoLuong;
    }
    public void setSoLuong(int a) {
        this.SoLuong = a;
    }
}

class Apple extends HoaQua {
    int SoLuong;
        
    public int getSoluong() {
        return SoLuong;
    }
    public void setSoLuong(int a) {
        this.SoLuong = a;
    }
}

class CamCaoPhong extends Orange {
    long Gia;
    String Vi;
        
    public long getGia() {
        return Gia;
    }
    public void setGia(long a) {
        this.Gia = a;
    }
    public String getVi() {
        return Vi;
    }
    public void setVi(String a) {
        this.Vi = a;
    }
}

class CamSanh extends Orange {
    long Gia;
    String Vi;
        
    public long getGia() {
        return Gia;
    }
    public void setGia(long a) {
        this.Gia = a;
    }
    public String getVi() {
        return Vi;
    }
    public void setVi(String a) {
        this.Vi = a;
    }
}

public class TestHoaQua {
    public static void main (String[] args) {
        CamSanh C1 = new CamSanh();
        C1.setGia(32000);
        C1.setNgayNhap("1/1/2018");
        C1.setNguonGoc("Ha Noi");
        C1.setVi("Chua");
        System.out.printf("Cam sanh:");
        System.out.printf("Gia: " + C1.getGia());
        System.out.printf("Ngay nhap: " + C1.getNgayNhap());
        System.out.printf("NguonGoc: " + C1.getNguonGoc());
        System.out.printf("Vi: " + C1.getVi());
    }
}