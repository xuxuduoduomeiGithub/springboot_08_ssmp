package com.itheima.controller.utils;

import lombok.Data;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/31 14:46
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {

    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
