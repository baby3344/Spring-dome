package cn.qwx.dao;

/**
 * 纸张接口
 */
public interface Paper {
    public static  final String newline="\r\n";

    /**
     * 输出一个字符到纸张
     * @param c
     */
    public void putInChar(char c);

    /**
     * 得到输出纸张上的内容
     * @return
     */
    public String getContent();
}
