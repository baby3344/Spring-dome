package cn.qwx.dao.impl;

import cn.qwx.dao.Ink;

import java.awt.*;

/**
 * 彩色墨盒。colorInk实现Ink接口
 */
public class ColorInk implements Ink {
    //打印采用彩色
    public String getColor(int r,int g,int b){
        Color color=new Color(r,g,b);
        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }


}
