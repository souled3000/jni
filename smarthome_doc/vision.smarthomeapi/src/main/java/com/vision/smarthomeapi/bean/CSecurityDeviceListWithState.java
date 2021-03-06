package com.vision.smarthomeapi.bean;

import com.vision.smarthomeapi.dal.data.Constant;

/**
 * 安防设备列表
 * Created by zhaoqing on 2016/1/6.
 */
public class CSecurityDeviceListWithState extends Bean{
    private String token;
    private String userId;

    public CSecurityDeviceListWithState(String token, String userId){

        this.token = token;
        this.userId = userId;
        this.urlOrigin = Constant.UrlOrigin.security_deviceListWithState;

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
