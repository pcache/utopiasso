package com.nuoyu.utopia.utopiasso.persistence.remote;

import com.nuoyu.utopia.utopiasso.interfaces.service.example.IRemoteExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuxin3 on 2015/1/19.
 */
public class RemoteExample {

   private IRemoteExampleService remoteExampleService;

    public void testRemote(){
        System.out.println("===========>测试remote调用");
        remoteExampleService.test2();
    }

    public IRemoteExampleService getRemoteExampleService() {
        return remoteExampleService;
    }

    public void setRemoteExampleService(IRemoteExampleService remoteExampleService) {
        this.remoteExampleService = remoteExampleService;
    }
}
