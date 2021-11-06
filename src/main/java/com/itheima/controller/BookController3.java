package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/31 13:46
 */
@RequestMapping("/books")
public class BookController3 {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return iBookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return iBookService.modify(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return iBookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return iBookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return iBookService.getPage(currentPage, pageSize);
    }
}
