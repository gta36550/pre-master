package com.xd.pre.modules.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.pre.modules.sys.domain.SysDict;
import com.xd.pre.modules.sys.domain.SysDictItem;
import com.xd.pre.modules.sys.dto.DictDTO;
import com.xd.pre.modules.sys.mapper.SysDictMapper;
import com.xd.pre.modules.sys.service.ISysDictService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author lihaodong
 * @since 2019-05-17
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements ISysDictService {


    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateDict(DictDTO dictDto) {
        SysDict sysDict = new SysDict();
        BeanUtil.copyProperties(dictDto, sysDict);
        return updateById(sysDict);
    }


    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public List<SysDictItem> queryDictItemByDictName(String dictName) {


        return baseMapper.queryDictItemByDictName(dictName);
    }
}
