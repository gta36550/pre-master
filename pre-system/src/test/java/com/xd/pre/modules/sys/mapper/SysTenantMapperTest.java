package com.xd.pre.modules.sys.mapper;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SysTenantMapperTest extends TestCase {

    @Autowired
    @Qualifier("SysTenantMapper")
    private SysTenantMapper sysTenantMapper;
@Test
    public void aaa(){
        System.out.println(sysTenantMapper.aaa());
    }
}