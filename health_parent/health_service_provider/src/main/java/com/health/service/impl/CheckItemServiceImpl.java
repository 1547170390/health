package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.health.dao.CheckItemDao;
import com.health.pojo.CheckItem;
import com.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 检查项服务
 */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl  implements CheckItemService {
    @Autowired
    private CheckItemDao checkItemDao;
    @Override
    //新增
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
