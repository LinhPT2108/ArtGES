package com.myProject.DAO.Promotion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.Entities.Promotion.Voucher;

public interface VoucherDAO extends JpaRepository<Voucher, Integer>{

}
