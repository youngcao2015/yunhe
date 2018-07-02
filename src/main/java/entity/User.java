package entity;

/**
 * @descripthion:
 * @author: Young Cao
 * @date: 下午11:07 18/7/2
 */
public class User {
    private Long id;
    private Long phoneNum;
    private String username;
    private String password;
    private String invitationCode;
    private String avatar;
    private String nickname;
    private String sex;
    private String imei;
    private String huanxinAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getHuanxinAccount() {
        return huanxinAccount;
    }

    public void setHuanxinAccount(String huanxinAccount) {
        this.huanxinAccount = huanxinAccount;
    }
}
