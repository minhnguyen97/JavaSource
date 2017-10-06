/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap6;

/**
 *
 * @author Minh Nguyen
 */
import java.util.Scanner;
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String lop;
    private String khoa;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public SinhVien(String maSV, String tenSV, String lop, String khoa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.khoa = khoa;
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên : ");
        this.maSV = sc.nextLine();
        System.out.println("Nhập tên sinh viên : ");
        this.tenSV = sc.nextLine();
        System.out.println("Nhập lớp sinh viên : ");
        this.lop = sc.nextLine();
        System.out.println("Nhập khóa sinh viên : ");
        this.khoa = sc.nextLine();
    }
    public void XuatThongTin() {
        System.out.println("Mã sinh viên : " + this.maSV);
        System.out.println("Tên sinh viên : " + this.tenSV);
        System.out.println("Lớp  : " + this.lop);
        System.out.println("Khoa : " + this.khoa);
    }
}
