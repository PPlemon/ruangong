package com.halo.demo.service;

import com.halo.demo.mapper.AdminMapper;
import com.halo.demo.model.Admin;
import com.halo.demo.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/26 22:37.
 */
@Service
public class LoginService1{

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 插入用户，分为创建用户和更新用户两种情况
     */

    public int verfity(Admin admin) {
        System.out.println(admin.getTno());
        if (admin.getTno() != null) {
            AdminExample adminExample = new AdminExample();
            adminExample.createCriteria().andTnoEqualTo(admin.getTno());
            List<Admin> adminList = adminMapper.selectByExample(adminExample);
            if (adminList.size() != 0) {
                if (adminList.get(0).getTpassword().equals(admin.getTpassword())) {
                    // 用户存在且密码正确，登录成功
                    System.out.println("登录成功");
                    return 1;
                }
            }
        }
        return 0;
    }


}
