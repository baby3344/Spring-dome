package cn.qwx.dao.impl;

import cn.qwx.dao.Ink;

import java.awt.*;


/**
 * 灰色墨盒，GreyInk实现Ink接口
 */
public class GreyInk implements Ink {
    public String getColor(int r,int g,int b){
        int c=(r+g+b)/3;
        Color color=new Color(c,c,c);
        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
