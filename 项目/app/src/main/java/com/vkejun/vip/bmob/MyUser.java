package com.vkejun.vip.bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobDate;
import java.net.URL;

public class MyUser extends BmobUser {
    private String Id;

    private Boolean Is;

    private Boolean Pro;

    private BmobDate Time;

    private BmobDate Timeout;

    private Integer age;

    private Boolean cj;

    private BmobDate cutime;

    private Boolean gl;

    private Boolean gx;

    private Boolean hy;

    private BmobDate hytime;

    private String ico;

    private String ip;

    private Integer jf;

    private String nick;

    private Boolean sex;

    private Integer tick;

    private URL url;

    private Boolean vip;

    public Integer getAge() {
        return this.age;
    }

    public BmobDate getCutime() {
        return this.cutime;
    }

    public BmobDate getHytime() {
        return this.hytime;
    }

    public String getId() {
        return this.Id;
    }

    public String getIp() {
        return this.ip;
    }

    public Boolean getIs() {
        return this.Is;
    }

    public String getNick() {
        return this.nick;
    }

    public Boolean getPro() {
        return this.Pro;
    }

    public boolean getSex() {
        return this.sex.booleanValue();
    }

    public Integer getTick() {
        return this.tick;
    }

    public BmobDate getTime() {
        return this.Time;
    }

    public BmobDate getTimeout() {
        return this.Timeout;
    }

    public Boolean getcj() {
        return this.cj;
    }

    public Boolean getgl() {
        return this.gl;
    }

    public Boolean getgx() {
        return this.gx;
    }

    public Boolean gethy() {
        return this.hy;
    }

    public String getico() {
        return this.ico;
    }

    public int getjf() {
        return this.jf.intValue();
    }

    public URL geturl() {
        return this.url;
    }

    public void setAge(Integer paramInteger) {
        this.age = paramInteger;
    }

    public void setCutime(BmobDate paramBmobDate) {
        this.cutime = paramBmobDate;
    }

    public void setHytime(BmobDate paramBmobDate) {
        this.hytime = paramBmobDate;
    }

    public void setId(String paramString) {
        this.Id = paramString;
    }

    public void setIp(String paramString) {
        this.ip = paramString;
    }

    public void setIs(Boolean paramBoolean) {
        this.Is = paramBoolean;
    }

    public void setNick(String paramString) {
        this.nick = paramString;
    }

    public void setPro(Boolean paramBoolean) {
        this.Pro = paramBoolean;
    }

    public void setSex(boolean paramBoolean) {
        this.sex = new Boolean(paramBoolean);
    }

    public void setTick(Integer paramInteger) {
        this.tick = paramInteger;
    }

    public void setTime(BmobDate paramBmobDate) {
        this.Time = paramBmobDate;
    }

    public void setTimeout(BmobDate paramBmobDate) {
        this.Timeout = paramBmobDate;
    }

    public void setcj(Boolean paramBoolean) {
        this.cj = paramBoolean;
    }

    public void setgl(Boolean paramBoolean) {
        this.gl = paramBoolean;
    }

    public void setgx(Boolean paramBoolean) {
        this.gx = paramBoolean;
    }

    public void sethy(Boolean paramBoolean) {
        this.hy = paramBoolean;
    }

    public void setico(String paramString) {
        this.ico = paramString;
    }

    public void setjf(Integer paramInteger) {
        this.jf = paramInteger;
    }

    public void seturl(URL paramURL) {
        this.url = paramURL;
    }
    
    
}
