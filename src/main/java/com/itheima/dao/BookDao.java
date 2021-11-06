package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/27 14:23
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
//    @Select("select * from tbl_book where id=#{id}")
//    Book getById(Integer id);
}
