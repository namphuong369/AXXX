package com.nam.tourismapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1, r2;
    PlaceAdapter adapter1,adapter2;
    List<Place> list1,list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.rec1);
        r2 = findViewById(R.id.rec2);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list1.add(new Place(R.drawable.a1, "Hồ Hoàn Kiếm", "Located in the heart of Hanoi capital, Hoan Kiem Lake or Sword Lake is one of the most important scenic spots. Not only a beautiful landscape, Hoan Kiem Lake is also a place associated with the legend of King Le Loi returning the magic sword to golden turtles passed down by the nation from generation to generation. \"+\n" +
                " Every weekend, Hoan Kiem Lake becomes a busy walking city, bustling, many street music shows, and many community games attracting visitors." +
                " To Hoan Kiem lake, visitors will have the opportunity to admire with their own eyes: Turtle Tower, Ngoc Son Temple, The Huc Bridge, But Tower, Research Radio, ... "));
        list1.add(new Place(R.drawable.a2, "Hồ Ba Bể", "Also one of the famous scenic spots in the North, Ba Be Lake in Bac Kan is one of the largest freshwater lakes in the world today. " +

                "The lake has a history of over 200 million years ago and is a tourist attraction that attracts many tourists. Located at an altitude of about 145m above sea level, the total area of the lake is more than 650ha, nearly 8000m long, the average depth is from 20 to 25m. In the middle of the lake, there are 2 small islands called An Ma and Ba Gua. "+
                "Every year, Ba Be Lake is the place to hold the festival of the Big Song according to the culture of the people living around the lake area. "));
        list1.add(new Place(R.drawable.a3, "Vịnh Hạ Long", "As a famous scenic spot in Vietnam, Ha Long Bay is a familiar name that everyone knows even though it has never been to Ha Long. " +
                "As an enchanting scenic beauty recognized by UNESCO, Ha Long Bay with its blue water color, unique island system, magic caves always has a strong attraction for tourists. " +
                " The beauty that Mother Nature bestows to Ha Long is the great pride of the people of Quang Ninh and the entire people of Vietnam. "));
        list1.add(new Place(R.drawable.a4, "Tam Cốc", "Located in Ninh Binh land with countless famous tourist attractions, Tam Coc is the 3 most eye-catching caves in Ninh Binh with extremely sparkling stalactites. " +
                "Tam Coc scene is harmonious between caves, limestone mountains and water caves. Located only about 7km from Ninh Binh city, Tam Coc brings visitors to sightseeing routes by boat, bicycle and even walking, discovering the charming, charming, picturesque beauty. "));
        list1.add(new Place(R.drawable.a5, "Sapa", "Always occupying a great and eternal affection for anyone who has ever set foot in this Northwestern land. " +
                "As a small town located close to the border area of China, Sapa is home to a lot of tourists both at home and abroad. " +
                "Tourists go to Sapa throughout the year four seasons because every season Sapa is also beautiful. The dreamy town scene, the golden rice-colored terraced fields, the fluffy white clouds in the middle of the valley, or the great moment of conquering Fansipan makes Sapa more attractive. " +
                "If you are planning to go to Sapa, please carry your backpack and go right away, make sure Sapa will not disappoint you. "));
        list1.add(new Place(R.drawable.a6, "Cao nguyên đá Đồng Văn", "As a rocky plateau located in the territory of four districts of Ha Giang, including: Quan Ba, Yen Minh, Meo Vac and Dong Van, Dong Van rocky plateau is a familiar destination for young people who are passionate about traveling. " +
                "Because of the rugged terrain, immense majestic space, the winding pass paths lying close to the deep cliffs increase the excitement of tourists when coming to Ha Giang. " +
                " If you are adventurous, Dong Van rocky plateau must appear in the list of destinations that you need to set foot in. Coming to Dong Van rocky plateau, visitors also have the opportunity to contact and explore the life of the ethnic people here, capturing the most peaceful moments of Ha Giang land. "));
        list1.add(new Place(R.drawable.a7, "Thác Bản Giốc", "It can be said that Ban Gioc waterfall is the most famous waterfall in Cao Bang province. " +
                "Among the beautiful landscapes in Vietnam, Ban Gioc waterfall has blue water with impressive cascading falls. " +
                "For tourists who are always looking for a harmonious mountain and forest space, blue mountains are nowhere to be found, go to Ban Gioc waterfall. " +
                "Make sure that anyone who comes to Ban Gioc waterfall will feel overwhelmed by the enchanting beautiful space, every stream of water pouring down on the waterfall makes the waterfall become more splendid and wonderful. "));
        list2.add(new Place(R.drawable.a8, "Tràng An", "In recent times, Trang An Ninh Binh is the check-in point of a large number of young people, the vibrant and majestic space in each frame makes Trang An never hot." +
                " Most tourists want to experience the feeling of sitting on a boat and admire the beauty of the banks in Trang An. The calm, blue water is surrounded by undulating mountains and large swamps. For those who live virtual, Trang An is really a check-in point for a beautiful virtual living corner. "));
        list2.add(new Place(R.drawable.a9, "Cố đô Huế", "If you mention the famous landscapes in Vietnam but ignore the ancient capital of Hue, it will be a big omission. " +
                "Hue ancient capital today still retains great historical values, is the pride of the people of Hue dreaming. The majestic, ghostly beauty of Hue's ancient architecture can only be felt with direct eyes, it is a Vietnamese feudal history, not only with the Vietnamese people, even tourists. Foreigners also have an interesting curiosity. Especially, when coming to the ancient capital of Hue, do not forget to enjoy Hue Royal Court Music - Human Intangible Cultural Heritage. "));
        list2.add(new Place(R.drawable.a10, "Ngũ hành sơn", "In the south of Da Nang, five mountain peaks: Moc, Thuy, Tho, Kim, Hoa are only about 8km from the center of Da Nang city. " +
                "Ngu Hanh Son is a scenic spot that has been mentioned a lot in Vietnamese poetry and is associated with a legend of the Cham people about the formation of 5 mountains. At the Marble Mountains, charming, peaceful scenery, many large caves with Buddhist temples. This is also the place where the Vietnamese army used many caves as a hospital to serve the army during the war years.  " +
                "If you are looking for one of the famous scenic spots in Vietnam, please add the five elements of paint to your notebook. "));
        list2.add(new Place(R.drawable.a11, "Phố cổ Hội An", "Ancient, peaceful, simple beauty is what you easily feel when traveling to Hoi An Ancient Town. " +
                "Located near the Thu Bon river, Hoi An Ancient Town has a unique architecture influenced from Japan and China and until now still retains its ancient beauty. " +
                "Tourists come to Hoi An ancient town, travel very crowded every year, especially in the summer. Hoi An is always beautiful and dreamlike and when the night comes, that beauty becomes more and more splendid. " +
                "With sparkling, fanciful scenery, the roofs close to the typical golden wall, Hoi An is the next stop that we cannot miss in our journey to discover a beautiful Vietnam. "));
        list2.add(new Place(R.drawable.a12, "Phong Nha Kẻ Bàng", "With an area of over 300,000 hectares, Phong Nha Ke Bang in Quang Binh province is one of the most beautiful landscapes in Vietnam. " +
                "Attracting tourists by the vast natural landscape, majestic cave system. The vegetation and animals in Phong Nha Ke Bang are also very diverse and plentiful, very suitable for us to organize exploring tours. " +
                "Outstanding in the cave system of Phong Nha Ke Bang is Son Doong cave - The largest natural cave in the world, is the conquest of many tourists who have a passion to conquer natural landscapes. wonders. "));
        list2.add(new Place(R.drawable.a13, "Nhà thờ Đức Bà", "Standing out in the heart of Ho Chi Minh City, Notre Dame Cathedral is an architectural work of great religious significance and is also a symbol of Saigon. " +
                "The church has a height of about 60m, features a typical Roman architecture, has 2 giant bell towers and is decorated with colorful glass windows, the opposite side of the church is the prominent red of the layers of bricks are imported from France. " +
                "The church is a familiar gathering place for young people and foreign tourists. If you have the opportunity to come to the city named Uncle Ho, do not forget to drop by to check in at the church. "));
        list2.add(new Place(R.drawable.a14, "Côn Đảo", "Talking about the beautiful scenes of Vietnam from North to South, Con Dao is one of those beautiful scenes. Con Dao is a great resort with green beaches, white sand spread all over the coasts and fresh air. It is not difficult to understand that Con Dao is one of the famous scenic spots in Vietnam and Con Dao is also home to prisons - Where so many Vietnamese people have suffered torture. tons of the most barbaric. "));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        r1.setLayoutManager(layoutManager);
        r1.setHasFixedSize(true);
        r1.setNestedScrollingEnabled(false);
        adapter1=new PlaceAdapter(list1,getApplicationContext(),false);
        r1.setAdapter(adapter1);
        adapter1.setItemClickListener(new PlaceAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                showDialog(list1.get(position).getImage(),
                        list1.get(position).getTitle(),
                        list1.get(position).getContent());
            }
        });
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        r2.setLayoutManager(layoutManager1);
        r2.setHasFixedSize(true);
        r2.setNestedScrollingEnabled(false);
        adapter2=new PlaceAdapter(list2,getApplicationContext(),true);
        r2.setAdapter(adapter2);
        adapter2.setItemClickListener(new PlaceAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                showDialog(list2.get(position).getImage(),
                        list2.get(position).getTitle(),
                        list2.get(position).getContent());
            }
        });
    }
    private void showDialog(int image,String title, String content)
    {
        Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.setContentView(R.layout.dialog_show);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);
        TextView t1=dialog.findViewById(R.id.t1);
        TextView t2=dialog.findViewById(R.id.t2);
        ImageView iv1=dialog.findViewById(R.id.iv1);
        t1.setText(title);
        t2.setText(content);
        iv1.setImageResource(image);
        dialog.show();
    }
}