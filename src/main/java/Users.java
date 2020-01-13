import java.util.Date;
import java.text.SimpleDateFormat;

public class Users {
    private int id;
    private String createdAt;
    private String name;
    private String avatar;


    public Users(String createdAt, String name, String avatar, int id) {

        this.createdAt = createdAt;

        this.avatar = avatar;

        this.name = name;

      this.id = id;

    }
    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }
    public String getCreatedAt() {

        return createdAt;

    }
    public void setCreatedAt(String createdAt) {

        this.createdAt = createdAt;

    }
    public String getAvatar() {

        return avatar;

    }
    public void setAvatar(String createdAt) {

        this.avatar = avatar;

    }
    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }





    @Override

    public String toString() {

        return "Users{" +
                ", createdAt=" + createdAt +
                "name='" + name + '\'' +
                ", id=" + id +
                ", avatar=" + avatar +
                '}';

    }

}
