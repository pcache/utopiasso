package com.nuoyu.utopia.utopiasso.interfaces.service.example.impl;

import com.nuoyu.utopia.utopiasso.interfaces.service.example.IRemoteExampleService;
import com.nuoyu.utopia.utopiasso.service.example.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liuxin3 on 2015/1/17.
 * hession接口对外暴露层
 * 注 这层不能直接调用DAO ，只能调用Service层
 */
@Component
public class RemoteExampleServiceImpl implements IRemoteExampleService {

    @Autowired
    private IExampleService exampleService;

    @Override
    public void test2() {
        exampleService.test();
    }
}
