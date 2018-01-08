package colibri.dev.com.colibritweet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UserInfoActivity extends AppCompatActivity {

    private ImageView userImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        userImageView = findViewById(R.id.user_image_view);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(userImageView);
    }
}