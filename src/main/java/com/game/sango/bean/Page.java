package com.game.sango.bean;

import lombok.Data;

import java.util.List;

@Data
public class Page<T>
{
    private int code = 0;
    private String msg = "";
    private int count;
    private List<T> data;

    public Page(List<T> data, int count)
    {
        this.data = data;
        this.count = count;
    }
}
