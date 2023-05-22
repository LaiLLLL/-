package com.bysj_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bysj_backend.entity.Address;
import com.bysj_backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper extends BaseMapper<Address> {
}
