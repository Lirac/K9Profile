package com.lines.k9profile;

/**
 * Created by Mfoniso on 8/23/2017.
 */

public class Picture {
    private int image;
    private int nextPic;
    private String name;

    public Picture(int image, int nextPic, String name) {
        this.image = image;
        this.nextPic = nextPic;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getNextPic() {
        return nextPic;
    }

    public void setNextPic(int nextPic) {
        this.nextPic = nextPic;
    }

    public String  getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }
}
