package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.model.EmpEntity;
import com.java.service.EmpService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author djin
 *    Emp业务层实现类
 * @date 2020-04-11 09:51:25
 */
@Service(version = "1.0.0")
@Transactional
public class EmpServiceImpl extends BaseServiceImpl<EmpEntity> implements EmpService {
	
}
