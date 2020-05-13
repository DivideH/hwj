package com.hwj.demo.model;

/**
 * @Auther: heweijian
 * @Date: 2019/12/28
 * @Description:
 */
public class UserModel {

    private Long id=1L;

    private String userName="hwj";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
