package com.lines.k9profile;

/**
 * Created by Mfoniso on 8/22/2017.
 */

public class Album {
    private Picture[] images;



    public Album(){
        images = new Picture[2];

        images[0] = new Picture(R.drawable.boxer,1,"Boxer");
        images[1] = new Picture(R.drawable.cocker,0,"Cocker");
    }

    public Picture getPicture(int position) {
        if (position >= images.length) {
            position = 0;
        }
        return images[position];
    }



}
