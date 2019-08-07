package com.hyt.dao;

import com.hyt.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserInfoMapper {
    List<UserInfo> getAll();
    int getCount();
}
