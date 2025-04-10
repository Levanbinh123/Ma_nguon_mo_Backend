package com.example.wedbansach_bakend1.Security;


public class Endpoints {
    public static final String front_end_host = "http://localhost:3000";
    public static final String[] PUBLIC_GET_ENDPOINS = {
            "/sach",
            "/donhang",
            "/donhang/**",
            "/chi-tiet-don-hang",
            "/chi-tiet-don-hang/**",
            "/sach/**",
            "/hinh-anh",
            "/the-loai/**",
            "/the-loai",
            "/hinh-anh/**",
            "/nguoi-dung/search/existsByTenDangNhap",
            "/nguoi-dung/search/existsByEmail",
            "/tai-khoan/kich-hoat",
            "/nguoi-dung",
            "/nguoi-dung/**",
            "/tai-khoan/dang-ky",
    };

    public static final String[] PUBLIC_POST_ENDPOINS = {

            "/tai-khoan/dang-nhap",
            "/chi-tiet-don-hang",
            "/the-loai/**",
            "/the-loai",
            "/nguoi-dung",
            "/nguoi-dung/**",
            "/don-hang",
            "/sach"

    };

    public static final String[] ADMIN_GET_ENDPOINS = {
            "/nguoi-dung",
            "/nguoi-dung/**",
    };
    public static final String[] ADMIN_POST_ENDPOINS = {
            "/sach",
            "/sach/**",


    };
}