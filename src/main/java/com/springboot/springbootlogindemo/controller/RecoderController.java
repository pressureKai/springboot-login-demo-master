package com.springboot.springbootlogindemo.controller;

import com.springboot.springbootlogindemo.domain.Recoder;
import com.springboot.springbootlogindemo.domain.User;
import com.springboot.springbootlogindemo.service.RecoderService;
import com.springboot.springbootlogindemo.service.UserService;
import com.springboot.springbootlogindemo.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/recoder")
public class RecoderController {
    @Resource
    private RecoderService recoderService;

    @PostMapping("/list")
    public Result<List<Recoder>> findRecoder(@RequestParam String phone ){
        List<Recoder> recoder = recoderService.findRecoder(phone);
        if(recoder!=null){
            return Result.success(recoder,"查询成功！");
        }else{
            return Result.error("123","查询失败！");
        }
    }

    @PostMapping("/insert")
    public Result<Recoder> insertRecoder(@RequestBody Recoder recoder){
        Recoder user = recoderService.insertRecoder(recoder);
        if(user!=null){
            return Result.success(user,"上传成功！");
        }else{
            return Result.error("456","上传失败！");
        }
    }
}
