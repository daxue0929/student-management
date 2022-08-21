package com.manage.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author daxue0929
 * @date 2022/08/21
 **/

@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Config {

    // 逻辑主键
    private Integer id;
    // 业务主键
    private String configId;

    private String key;

    // 字符串或者json序列化的字符串
    private String value;
}
