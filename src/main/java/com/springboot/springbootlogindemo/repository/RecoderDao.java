package com.springboot.springbootlogindemo.repository;

import com.springboot.springbootlogindemo.domain.Recoder;
import com.springboot.springbootlogindemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecoderDao extends JpaRepository<Recoder, Long> {
    List<Recoder> findByPhone(String phone); //通过用户名uname查找用户，注意要按照JPA的格式使用驼峰命名法

}
