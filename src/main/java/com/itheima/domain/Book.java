package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:xuxuduoduomei
 * @Date:2021/10/27 14:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_book")
public class Book {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;
}
