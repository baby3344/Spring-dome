package cn.qwx.entity;

public class Greeting {
    //说话的人
    private String person="Nobody";
    //说话的内容
    private String words="nothing";

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void sayGreeting(){
        System.out.println(person+"说：“"+words+"”");
    }

    //构造注入
    public Greeting(){}

    public  Greeting(String person,String words){
        this.person=person;
        this.words=words;
    }
}
