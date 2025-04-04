package com.example.wedbansach_bakend1.dao;

import com.example.wedbansach_bakend1.entity.ChiTietDonHang;
import com.example.wedbansach_bakend1.entity.DonHang;
import com.example.wedbansach_bakend1.entity.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path="donhang")
public interface DonHangRepository extends JpaRepository<DonHang, Long> {
    

}
