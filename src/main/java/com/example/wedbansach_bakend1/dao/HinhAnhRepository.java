package com.example.wedbansach_bakend1.dao;

import com.example.wedbansach_bakend1.entity.DonHang;
import com.example.wedbansach_bakend1.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="hinh-anh")
public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {

}
