package com.lines.k9profile;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView dogImage;
    private Album album;
    private int nextImage;

    private TextView dogName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogImage = (ImageView) findViewById(R.id.dogImageView);
        dogName = (TextView) findViewById(R.id.dogNameTextView);

        dogImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);
            }
        });

        album = new Album();
       LoadPix(0);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.options_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nextImage:
                LoadPix(nextImage);
        }
        return super.onOptionsItemSelected(item);
    }

    private void LoadPix(int number){
        Picture picture = album.getPicture(number);

        Drawable drawableImage = ContextCompat.getDrawable(this,picture.getImage());
        dogImage.setImageDrawable(drawableImage);

        dogName.setText(picture.getName());

        nextImage = picture.getNextPic();


    }

}
