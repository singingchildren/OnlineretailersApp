package com.example.onlineretailersapp.prsenter;

import com.example.onlineretailersapp.utils.MyCllBack;

import java.util.Map;

/**
 * author:${张四佟}
 * date:2019/2/12 15:07
 * description
 */
public interface IPrsenter {
    //参数               接口路径                 接口参数     bean类    解耦编号
    void startRequest(String mPath, Map<String, String> map, Class clazz, int type, String userId, String sessionId);
}
