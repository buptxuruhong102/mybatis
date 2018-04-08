package com.xrh.generator.service.impl;

import com.xrh.generator.dao.UserInfoMapper;
import com.xrh.generator.entitys.UserInfo;
import com.xrh.generator.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xuruhong on 2018/3/4.
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserInfoMapper mapper;

    @Override
    public UserInfo getUser() {

        for(int i = 0; i < 2; i++){
            UserInfo record = new UserInfo();
            record.setUserName("xrh"+i);
            if(i == 1){
                //record.setUserName(null);
            }
            mapper.insert(record);
        }

        return mapper.selectByPrimaryKey(1);
    }
}
