package com.manage.core.util;

import java.util.UUID;

/**
 * @author daxue0929
 * @date 2022/08/20
 **/
public class UUIDUtil {
    public static final String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args){

        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
    }
}
