package com.itheima.controller;

import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/31 13:46
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll() {
        return new R(true, iBookService.list());

    }

    @PostMapping
    public R save(@RequestBody Book book) {
//        R r = new R();
//        boolean flag = iBookService.save(book);
//        r.setFlag(flag);
        return new R(iBookService.save(book));
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(iBookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(iBookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {

        return new R(true, iBookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        return new R(true, iBookService.getPage(currentPage, pageSize));
    }
}
