package cn.tedu.managesystem.pojo.vo;

public class UserLoginVo {
    private Integer id;
    private String password;

    public UserLoginVo() {
    }

    public UserLoginVo(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginVo{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
