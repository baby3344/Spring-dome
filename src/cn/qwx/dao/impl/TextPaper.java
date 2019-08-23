package cn.qwx.dao.impl;
import cn.qwx.dao.Paper;
public class TextPaper implements Paper {
    //每行字符数
    private int charPerLine=16;
    //每页行数
    private int lineParPage=5;
    //setter方法，用于注入每行的字符数
    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }
    //serter方法，用于注入每页的行数
    public void setLineParPage(int lineParPage) {
        this.lineParPage = lineParPage;
    }
    //纸张中的内容
    private String content="";
    //当前横向位置，charPerLine-1
    private int posX=0;
    //当前行数，从0到linePerLine-1
    private int posY=0;
    //当前页数
    private int posP=1;
    public String getContent() {
        //补齐本页空行，并显示页码
        String ret=this.content;
        if(!(posX==0&&posY==0)){
            int count=lineParPage-posY;
            for (int i=0;i<count;i++){
                ret+=Paper.newline;
            }
            ret+="==第"+posP+"页==";
        }
        return ret;
    }

    public void putInChar(char c){
        content+=c;
        ++posX;
        //判断是否换行
        if(posX==lineParPage){
            content+="==第"+posP+"页==";
            content+=Paper.newline+Paper.newline;
            posY=0;
            ++posP;
        }
    }
}
