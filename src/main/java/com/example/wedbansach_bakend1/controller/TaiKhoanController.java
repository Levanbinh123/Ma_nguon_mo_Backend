package com.example.wedbansach_bakend1.controller;
import com.example.wedbansach_bakend1.Service.JwtService;
import com.example.wedbansach_bakend1.Service.TaiKhoanService;
import com.example.wedbansach_bakend1.Service.UserService;
import com.example.wedbansach_bakend1.dao.NguoiDungRepository;
import com.example.wedbansach_bakend1.entity.NguoiDung;
import com.example.wedbansach_bakend1.entity.ThongBao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/tai-khoan")
public class TaiKhoanController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;
    @Autowired
    private NguoiDungRepository nguoiDungRepository;


    @Autowired
    private TaiKhoanService taiKhoanService;

    @CrossOrigin(origins = "http://localhost:3000") // Allow requests from 'http://localhost:3000'
    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNguoiDung(@Validated @RequestBody NguoiDung nguoiDung){
        ResponseEntity<?> response = taiKhoanService.dangKyNguoiDung(nguoiDung);
        return response;
    }
    @GetMapping("/kich-hoat")
    public ResponseEntity<?> kichHoatTaiKhoan(@RequestParam String email,@RequestParam String maKichHoat) {
        ResponseEntity<?> response = taiKhoanService.kichHoatTaiKHoan(email,maKichHoat);
        return response;
    }

}
