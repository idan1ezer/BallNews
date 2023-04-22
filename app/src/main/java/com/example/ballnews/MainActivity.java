package com.example.ballnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView news_recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initRecycle();
    }

    private void initRecycle() {
        news_recycler_view.setLayoutManager(new LinearLayoutManager(this));

        String packName = this.getResources().getString(R.string.ball_type);

        Article a1, a2, a3;

        switch (packName) {
            case "basketball":
                a1 = new Article("Xavier Johnson",
                        "Xavier Johnson is a dynamic point guard who excels at driving to the basket and finishing through contact. He has great court vision and can make pinpoint passes to his teammates.",
                        "https://img.freepik.com/free-vector/cute-man-playing-basketball-cartoon-vector-icon-illustration-people-sports-icon-concept-isolated_138676-5730.jpg");
                a2 = new Article("Jasmine Lee",
                        "Jasmine Lee is a versatile forward who can play both inside and outside. She has a high basketball IQ and makes smart decisions with the ball.",
                        "https://img.freepik.com/free-vector/cute-boy-playing-basket-cartoon-vector-icon-illustration-people-sport-icon-concept-isolated-premium-vector-flat-cartoon-style_138676-4057.jpg");
                a3 = new Article("Malik Anderson",
                        "Malik Anderson is a high-flying shooting guard who loves to attack the rim. He has a quick first step and can get to the basket in a hurry and he has a great work ethic.",
                        "https://img.freepik.com/free-vector/boy-playing-basketball-cartoon-people-sport-icon-concept-isolated-flat-cartoon-style_138676-2193.jpg?w=2000");
                break;
            case "soccer":
                a1 = new Article("Luis Hernandez",
                        "Luis Hernandez is a speedy striker who excels at making runs in behind the defense. He has a lethal finishing ability and is also adept at creating chances for his teammates.",
                        "https://img.freepik.com/free-vector/cute-boy-playing-soccer-cartoon-vector-icon-illustration-people-sport-icon-concept-isolated-premium-vector-flat-cartoon-style_138676-4055.jpg");
                a2 = new Article("Marta Rodriguez",
                        "Marta Rodriguez is a technically gifted attacking midfielder with excellent vision and passing skills. She can also score goals from distance with her powerful shots.",
                        "https://img.freepik.com/premium-vector/cute-happy-kid-girl-playing-football-soccer-flat-cartoon-illustration-football-match_442961-26.jpg");
                a3 = new Article("Ivan Petrovic",
                        "Ivan Petrovic is a tough-tackling center back who is strong in the air and rarely loses a challenge. He is also comfortable with the ball at his feet and can start attacks from the back.",
                        "https://img.freepik.com/premium-vector/cartoon-football-player_591410-129.jpg");
                break;
            default:
                a1 = new Article("Luis Hernandez",
                        "Luis Hernandez is a speedy striker who excels at making runs in behind the defense. He has a lethal finishing ability and is also adept at creating chances for his teammates.",
                        "https://img.freepik.com/free-vector/cute-boy-playing-soccer-cartoon-vector-icon-illustration-people-sport-icon-concept-isolated-premium-vector-flat-cartoon-style_138676-4055.jpg");
                a2 = new Article("Marta Rodriguez",
                        "Marta Rodriguez is a technically gifted attacking midfielder with excellent vision and passing skills. She can also score goals from distance with her powerful shots.",
                        "https://img.freepik.com/premium-vector/cute-happy-kid-girl-playing-football-soccer-flat-cartoon-illustration-football-match_442961-26.jpg");
                a3 = new Article("Ivan Petrovic IV",
                        "Ivan Petrovic is a tough-tackling center back who is strong in the air and rarely loses a challenge. He is also comfortable with the ball at his feet and can start attacks from the back.",
                        "https://us.123rf.com/450wm/mickallnice/mickallnice1805/mickallnice180500005/100914570-kid-kicks-a-ball-vector-and-illustration.jpg");
                break;
        }








        NewsAdapter adapter = new NewsAdapter(Arrays.asList(a1, a2, a3), this);
        news_recycler_view.setAdapter(adapter);
    }

    private void findViews() {
        news_recycler_view = findViewById(R.id.news_recycler_view);
    }

}