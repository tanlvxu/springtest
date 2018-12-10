package com.example.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_users")
public class TbUsers {
    @Id
    @Column(name = "_id")
    private Integer id;

    @Id
    private Integer uid;

    private String nick;

    private Integer sex;

    private Integer age;

    private Integer coin;

    private Integer diamond;

    private String uuid;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateTime")
    private Date updatetime;

    private String head;

    /**
     * @return _id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return coin
     */
    public Integer getCoin() {
        return coin;
    }

    /**
     * @param coin
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    /**
     * @return diamond
     */
    public Integer getDiamond() {
        return diamond;
    }

    /**
     * @param diamond
     */
    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return head
     */
    public String getHead() {
        return head;
    }

    /**
     * @param head
     */
    public void setHead(String head) {
        this.head = head;
    }
}