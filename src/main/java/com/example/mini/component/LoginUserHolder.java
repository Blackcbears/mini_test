package com.example.mini.component;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONObject;
import com.example.mini.entity.UserVo;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <br>
 *
 * @author cuijing
 * @className LoginUserHolder
 * @date 2021-03-15 02:39
 */
@Component
public class LoginUserHolder {

    public UserVo getCurrentUser(){
        //从Header中获取用户信息
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String userStr = request.getHeader("user");
        JSONObject userJsonObject = new JSONObject(userStr);
        UserVo userDTO = new UserVo();
        userDTO.setUsername(userJsonObject.getStr("user_name"));
        userDTO.setId(userJsonObject.get("id").toString());
        userDTO.setRoles(Convert.toList(String.class,userJsonObject.get("authorities")));
        return userDTO;
    }
}
