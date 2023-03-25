package com.springboot.springbootlogindemo.service;

import com.springboot.springbootlogindemo.domain.Recoder;
import com.springboot.springbootlogindemo.domain.User;

import java.util.List;

public interface RecoderService {

    Recoder insertRecoder(Recoder recoder);


    List<Recoder> findRecoder(String phone);
}
