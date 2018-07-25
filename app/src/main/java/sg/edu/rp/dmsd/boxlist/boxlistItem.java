package sg.edu.rp.dmsd.boxlist;

/**
 * Created by 17010457 on 7/25/2018.
 */

public class boxlistItem {
    private Integer image;

    public boxlistItem(int image){
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "boxlistItem{" +
                "image=" + image +
                '}';
    }
}
