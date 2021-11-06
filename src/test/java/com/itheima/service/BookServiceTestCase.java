package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/30 16:56
 */
@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据abc");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(5);
        book.setType("测试数据abcefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(5);
    }

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }

    @Test
    void testGetAll() {
        bookService.getAll();
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 1);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
    }
}
