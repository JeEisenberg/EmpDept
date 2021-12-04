package com.gavin.mapper;

import com.gavin.pojo.UserInfo;

import java.util.List;


public interface UserInfoMapper {
List<UserInfo> findUserOrder (Integer uid);

}