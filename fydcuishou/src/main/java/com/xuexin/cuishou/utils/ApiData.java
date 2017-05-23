package com.xuexin.cuishou.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by wenrui on 2017/5/11.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiData {

    private boolean status;
    private String message;
    private Object data;

}
