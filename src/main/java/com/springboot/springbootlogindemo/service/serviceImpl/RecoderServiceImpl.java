package com.springboot.springbootlogindemo.service.serviceImpl;

import com.springboot.springbootlogindemo.domain.Recoder;
import com.springboot.springbootlogindemo.domain.User;
import com.springboot.springbootlogindemo.repository.RecoderDao;
import com.springboot.springbootlogindemo.repository.UserDao;
import com.springboot.springbootlogindemo.service.RecoderService;
import com.springboot.springbootlogindemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecoderServiceImpl implements RecoderService {
    @Resource
    private RecoderDao recoderDao;


    @Override
    public Recoder insertRecoder(Recoder recoder) {
        Recoder recoder1 = recoderDao.save(recoder);
        return recoder1;
    }

    @Override
    public List<Recoder> findRecoder(String phone) {
        List<Recoder> byPhone = recoderDao.findByPhone(phone);
        return byPhone;
    }
}
