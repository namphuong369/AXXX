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
        list1.add(new Place(R.drawable.a1, "Hồ Hoàn Kiếm", "Tọa lạc ngay trung tâm của thủ đô Hà Nội, hồ Hoàn Kiếm hay hồ Gươm là một trong số các điểm danh lam thắng cảnh quan trọng bậc nhất. Không chỉ là cảnh quan tươi đẹp, hồ Hoàn Kiếm còn là nơi gắn liền với sự tích vua Lê Lợi trả lại gươm thần cho rùa vàng được dân tộc truyền lại từ đời này qua đời khác. Vào mỗi cuối tuần, hồ Hoàn Kiếm trở thành phố đi bộ đông đúc, tấp nập, nhiều chương trình âm nhạc biểu diễn đường phố, nhiều trò chơi cộng đồng hấp dẫn du khách. Tới hồ Hoàn Kiếm, du khách sẽ có cơ hội tận mắt chiêm ngưỡng: Tháp Rùa, đền Ngọc Sơn, cầu Thê Húc, tháp Bút, đài Nghiên,.."));
        list1.add(new Place(R.drawable.a2, "Hồ Ba Bể", "Cũng là một trong số các danh lam thắng cảnh nổi tiếng ở khu vực miền bắc, hồ Ba Bể tại Bắc Kạn là một trong số các hồ nước ngọt lớn nhất trên thế giới hiện nay. Hồ đã có lịch sử hình thành cách nay hơn 200 triệu năm và là điểm du lịch thu hút rất nhiều du khách. Nằm ở độ cao khoảng 145m so với mực nước biển, tổng diện tích của hồ đạt hơn 650ha, dài gần 8000m, độ sâu trung bình từ 20 đến 25m. Giữa hồ có 2 đảo nhỏ gọi là An Mã và Bà Góa. Hàng năm, hồ Ba Bể đều là nơi tổ chức lễ hội Lòng tồng theo văn hóa của người dân sống quanh khu vực hồ."));
        list1.add(new Place(R.drawable.a3, "Vịnh Hạ Long", "Là danh lam thắng cảnh quá nổi tiếng tại Việt Nam, vịnh Hạ Long là cái tên quen thuộc mà ai cũng biết đến dù chưa từng một lần được đến với Hạ Long. Là một danh lam thắng cảnh đẹp mê hoặc được UNESCO công nhận, vịnh Hạ Long với màu nước xanh ngắt, hệ thống các đảo, các hang động độc đáo, kỳ ảo luôn có một sức hút mãnh liệt đối với khách du lịch. Vẻ đẹp mà mẹ thiên nhiên ban tặng cho Hạ Long chính là niềm tự hào to lớn của người dân Quảng Ninh và toàn bộ người dân Việt Nam."));
        list1.add(new Place(R.drawable.a4, "Tam Cốc", "Nằm ở mảnh đất Ninh Bình với vô số các địa danh tham quan du lịch nổi tiếng, Tam Cốc là 3 hang động có cảnh quan bắt mắt nhất tại Ninh Bình với các khối nhũ đá cực kỳ lấp lánh. Khung cảnh Tam Cốc hài hòa giữa các hang động, núi đá vôi và dòng nước. Nằm cách thành phố Ninh Bình chỉ khoảng 7km, Tam Cốc đưa du khách đến với các tuyến tham quan bằng thuyền, xe đạp và cả đi bộ, khám phá vẻ đẹp sơn thủy hữu tình, cảnh sắc đẹp tựa trong tranh."));
        list1.add(new Place(R.drawable.a5, "Sapa", "Luôn chiếm một tình cảm lớn lao bất diệt với bất cứ ai đã từng đặt chân đến vùng đất Tây Bắc này. Là một thị trấn nhỏ nằm gần với khu vực biên giới của Trung Quốc, Sapa là nơi tập trung rất nhiều khách du lịch cả trong và ngoài nước. Khách du lịch lên Sapa suốt quanh năm bốn mùa vì mùa nào Sapa cũng đẹp. Khung cảnh thị trấn mơ màng, những thửa ruộng bậc thang chín vàng màu lúa, những biển mây trắng mịn như bông lững lờ giữa lưng chừng thung lũng, hay khoảnh khắc tuyệt vời khi chinh phục Fansipan khiến Sapa hấp dẫn hơn cả. Nếu bạn đang có ý định lên Sapa thì hãy xách balo lên và đi ngay nhé, đảm bảo Sapa sẽ không làm bạn phải thất vọng."));
        list1.add(new Place(R.drawable.a6, "Cao nguyên đá Đồng Văn", "Là một cao nguyên đá nằm ở địa phận của 4 huyện Hà Giang gồm: Quản Bạ, Yên Minh, Mèo Vạc và Đồng văn, cao nguyên đá Đồng Văn là điểm đến quen thuộc của những bạn trẻ đam mê phượt. Chính bởi địa hình hiểm trở, không gian mênh mông hùng vĩ, những cung đường đèo uốn lượn nằm sát bờ vực sâu thẳm càng làm tăng sự phấn khích của khách du lịch khi đến Hà Giang. Nếu bạn là người yêu thích sự mạo hiểm thì cao nguyên đá Đồng Văn nhất định phải xuất hiện trong list các điểm đến mà bạn cần đặt chân. Tới cao nguyên đá Đồng Văn, du khách còn có cơ hội tiếp xúc, khám phá cuộc sống của người dân tộc nơi đây, bắt trọn những khoảnh khắc yên bình nhất của mảnh đất Hà Giang."));
        list1.add(new Place(R.drawable.a7, "Thác Bản Giốc", "Có thể nói rằng, thác Bản Giốc chính là con thác nổi tiếng nhất ở tỉnh Cao Bằng. Nằm trong số các danh lam thắng cảnh đẹp Việt Nam, thác Bản Giốc có làn nước xanh ngắt với từng tầng thác đổ xuống chân đầy ấn tượng. Với những du khách luôn tìm kiếm cho mình một không gian núi rừng hòa quyện, non xanh nước biếc thì không đâu khác, hãy tới thác Bản Giốc. Đảm bảo rằng, bất cứ ai đến với thác Bản Giốc cũng đều cảm thấy choáng ngợp bởi không gian đẹp mê li, từng dòng nước đổ trên thác xuống tung bọt trắng xóa càng khiến thác trở thanh lộng lẫy, tuyệt vời hơn."));
        list2.add(new Place(R.drawable.a8, "Tràng An", "Trong thời gian gần đây, Tràng An Ninh Bình là điểm check in của lượng lớn các bạn trẻ, không gian sống động, hùng vĩ trong từng khung hình khiến Tràng An chưa bao giờ hết hot. Hầu hết khách du lịch đều mong muốn được trải nghiệm cảm giác ngồi trên thuyền và chiêm ngưỡng vẻ đẹp đôi bờ tại Tràng An. Dòng nước trong xanh, êm dịu được bao bọc bởi những dãy núi nhấp nhô, những đầm lầy rộng lớn. Với các tín đồ sống ảo thì Tràng An thực sự là điểm check in “ti tỉ” góc sống ảo đẹp miễn chê."));
        list2.add(new Place(R.drawable.a9, "Cố đô Huế", "Nếu nhắc đến các danh lam thắng cảnh nổi tiếng ở Việt Nam mà bỏ qua cố đô Huế thì sẽ là một thiếu sót lớn. Cố đô Huế ngày nay vẫn giữ được những giá trị lịch sử to lớn, là niềm tự hào của người dân xứ Huế mộng mơ. Vẻ đẹp hoành tráng, ma mị của kiến trúc cố đô Huế chỉ có thể cảm nhận hết bằng cái nhìn trực tiếp, đó là cả một nền lịch sử phong kiến Việt Nam mà không chỉ với người dân Việt Nam, ngay cả khách du lịch nước ngoài cũng có sự tò mò thích thú. Đặc biệt, khi tới cố đô Huế, du khách đừng quên thưởng thức Nhã nhạc cung đình Huế - Di sản văn hóa phi vật thể nhân loại nhé."));
        list2.add(new Place(R.drawable.a10, "Ngũ hành sơn", "Ở phía nam của Đà Nẵng, ngũ hành sơn là 5 đỉnh núi: Mộc, Thủy, Thổ, Kim, Hỏa cách trung tâm thành phố Đà Nẵng chỉ khoảng 8km. Ngũ hành sơn là danh thắng đã được nhắc đến rất nhiều trong thơ ca Việt Nam và gắn liền với một truyền thuyết của người Chăm về sự hình thành của 5 ngọn núi. Tại ngũ hành sơn, phong cảnh hữu tình, bình yên, nhiều hang động lớn với các ngôi chùa Phật Giáo. Đây cũng là nơi được quân đội Việt Nam sử dụng nhiều hang động làm bệnh viện phục vụ bộ đội trong những năm tháng chiến tranh. Nếu bạn đang tìm kiếm một trong số các danh lam thắng cảnh nổi tiếng ở Việt Nam thì hãy thêm ngũ hành sơn vào sổ tay nhé."));
        list2.add(new Place(R.drawable.a11, "Phố cổ Hội An", "Cổ kính, yên bình, đẹp bình dị là những điều bạn dễ dàng cảm nhận được khi tới du lịch Phố cổ Hội An. Nằm ở gần dòng sông Thu Bồn, phố Cổ Hội An mang nét kiến trúc độc đáo, chịu ảnh hưởng từ Nhật Bản, Trung Quốc và cho đến nay vẫn giữ nguyên những nét đẹp cổ kính. Khách du lịch tới phố cổ Hội An du lịch hàng năm rất đông, đặc biệt là vào những dịp hè. Hội An lúc nào cũng đẹp thơ mộng và khi đêm về thì vẻ đẹp đó càng trở nên lộng lẫy hơn. Khung cảnh lung linh, huyền ảo, những mái nhà san sát với tường vàng đặc trưng, Hội An là điểm dừng chân tiếp theo mà chúng ta không thể bỏ lỡ trong hành trình khám phá một Việt Nam xinh tươi."));
        list2.add(new Place(R.drawable.a12, "Phong Nha Kẻ Bàng", "Với diện tích lên đến hơn 300.000ha, Phong Nha Kẻ Bàng của tỉnh Quảng Bình là địa danh nằm trong top các phong cảnh đẹp nhất Việt Nam. Hấp dẫn du khách bởi quang cảnh thiên nhiên rộng lớn, hùng vĩ, hệ thống các hang động hoành tráng. Thảm thực vật và động vật ở Phong Nha Kẻ Bàng cũng hết sức đa dạng, phong phú, rất thích hợp để chúng ta tổ chức các chuyến tham quan khám phá. Nổi bật trong hệ thống hang động của Phong Nha Kẻ Bàng đó chính là hang động Sơn Đoòng -  Một hang động tự nhiên lớn nhất trên thế giới, là điểm chinh phục của bao du khách có niềm đam mê chinh phục những cảnh quan thiên nhiên kỳ vĩ."));
        list2.add(new Place(R.drawable.a13, "Nhà thờ Đức Bà", "Nổi bật ngay giữa trung tâm của thành phố Hồ Chí Minh, nhà thờ Đức Bà là công trình kiến trúc mang ý nghĩa tôn giáo to lớn và đó cũng là biểu tượng của Sài Gòn. Nhà thờ có chiều cao khoảng 60m, mang nét kiến trúc đặc trưng của thời tân La Mã, có 2 tháp chuông khổng lồ và trang trí bằng cửa sổ kính nhiều màu sắc, phía chính diện của nhà thờ là màu đỏ nổi bật của các lớp gạch được nhập khẩu từ Pháp. Nhà thờ là nơi tụ họp quen thuộc của các bạn trẻ và khách du lịch ngoại quốc. Nếu có cơ hội đến với thành phố mang tên Bác, bạn đừng quên ghé qua check in tại nhà thờ nhé."));
        list2.add(new Place(R.drawable.a14, "Côn Đảo", "Bàn về các cảnh đẹp Việt Nam từ Bắc vào Nam thì Côn Đảo chính là một trong số các cảnh đẹp đó. Côn Đảo là khu du lịch nghỉ dưỡng tuyệt vời với những bãi biển xanh ngắt, cát mịn trải trắng xóa khắp các bờ biển và bầu không khí trong lành thoáng đãng. Cũng không có gì khó hiểu khi Côn Đảo chính là một trong số các danh lam thắng cảnh nổi tiếng ở Việt Nam và Côn Đảo cũng là nơi có những nhà tù - Nơi mà biết bao con người Việt Nam đã phải hứng chịu những trận tra tấn dã man nhất"));
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