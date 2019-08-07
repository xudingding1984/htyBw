package com.hyt.server;

import com.hyt.dao.UserInfoMapper;
import com.hyt.entity.UserInfo;
import com.hyt.util.BaseVo;
import com.hyt.util.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServer {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public Pagination getAll(BaseVo vo) {
        return new Pagination(userInfoMapper.getAll(),userInfoMapper.getCount(),vo.pageNo,vo.getPageSize());
    }
    public int getCount() {
        return userInfoMapper.getCount();
    }
}
