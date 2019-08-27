package com.zhu.demo.springboot.mapper;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("SELECT id FROM hz_portal_advert WHERE id = #{id}")
    Integer selectUser(int id);
}
