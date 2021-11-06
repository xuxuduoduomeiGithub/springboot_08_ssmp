package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/30 17:28
 */
public interface IBookService extends IService<Book> {

    public Boolean modify(Book book);

    IPage<Book> getPage(int currentPage, int pageSize);
}
