package cn.qwx.entity;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.*;

public class User {

    private Integer id; //id
    private String userName;
    private String userPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    private String specialCharacter1; // 特殊字符值1
    private String specialCharacter2; // 特殊字符值2
    private User innerBean; // JavaBean类型
    private List<String> list; // List类型
    private String[] array; // 数组类型
    private Set<String> set; // Set类型
    private Map<String, String> map; // Map类型
    private Properties props; // Properties类型
    private String emptyValue; // 注入空字符串值
    private String nullValue = "init value"; // 注入null值

    public String getSpecialCharacter1() {
        return specialCharacter1;
    }

    public String getSpecialCharacter2() {
        return specialCharacter2;
    }

    public User getInnerBean() {
        return innerBean;
    }

    public List<String> getList() {
        return list;
    }

    public String[] getArray() {
        return array;
    }

    public Set<String> getSet() {
        return set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Properties getProps() {
        return props;
    }

    public String getEmptyValue() {
        return emptyValue;
    }

    public String getNullValue() {
        return nullValue;
    }

    public void setSpecialCharacter1(String specialCharacter1) {
        this.specialCharacter1 = specialCharacter1;
    }

    public void setSpecialCharacter2(String specialCharacter2) {
        this.specialCharacter2 = specialCharacter2;
    }

    public void setInnerBean(User user) {
        this.innerBean = user;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setEmptyValue(String emptyValue) {
        this.emptyValue = emptyValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }
}
