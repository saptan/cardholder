package info.goodline.cardholder;

import java.io.Serializable;

public class Card implements Serializable //implements ....
{
    //id карты, заголовок, ссылка на фотографию карты.
    private String id;
    private String title;
    private String photo;

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
