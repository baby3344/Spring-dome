package cn.qwx.entity;

import cn.qwx.dao.Ink;
import cn.qwx.dao.Paper;

/**
 * 打印机程序
 */
public class Printer {
    //面向接口编程，而不是具体的实现类
    private Ink ink=null;
    //面向接口编程，而不是具体的实现类
    private Paper paper=null;
    /**
     * 设置注入所需的getter方法
     * @param ink 传入墨盒的参数
     */
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    /**
     * 设置注入所需的setter方法
     * @param paper 传入纸张的参数
     */
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 打印机打印方法
     * @param str
     */
    public void print(String str){
        //输出颜色标记
        System.out.println("使用"+ink.getColor(255,200,0)+"颜色打印：\n");
        //逐字符输出到纸张
        for (int i=0;i<str.length();i++){
            paper.putInChar(str.charAt(i));
        }
        //将纸张的内容输出
        System.out.println(paper.getContent());
    }
}
