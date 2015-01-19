package com.nuoyu.utopia.utopiasso.service.example.impl;

import com.nuoyu.utopia.utopiasso.persistence.remote.RemoteExample;
import com.nuoyu.utopia.utopiasso.service.example.ITestRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuxin3 on 2015/1/19.
 */
@Service
public class ITestRemoteServiceImpl implements ITestRemoteService {

    @Autowired
    private RemoteExample remoteExample;

    @Override
    public void testRemote() {
        remoteExample.testRemote();
    }
}
