package com.bin.soundcloud.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bin.soundcloud.Adapter.RecycleviewAdapter_1;
import com.bin.soundcloud.Data.SingleItemRecycleview;
import com.bin.soundcloud.R;

import java.util.ArrayList;
import java.util.List;

public class home_fragment extends android.support.v4.app.Fragment {
    View v;

    private RecyclerView myrecycleview;
    private RecyclerView myrecycleview1;
    private RecyclerView myrecycleview2;
    private RecyclerView myrecycleview3;
    private RecyclerView myrecycleview4;
    private List<SingleItemRecycleview> listbaihat;
    private List<SingleItemRecycleview> listbaihat1;
    private List<SingleItemRecycleview> listbaihat2;
    private List<SingleItemRecycleview> listbaihat3;
    private List<SingleItemRecycleview> listbaihat4;

    public home_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home_fragment, container, false);
        //
        myrecycleview= v.findViewById(R.id.Moreofwhatyoulike);
        RecycleviewAdapter_1 recycleviewAdapter1=new RecycleviewAdapter_1(getContext(),listbaihat);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false ));
        myrecycleview.setAdapter(recycleviewAdapter1);
        //
        myrecycleview1= v.findViewById(R.id.Chill);
        RecycleviewAdapter_1 recycleviewAdapter2=new RecycleviewAdapter_1(getContext(),listbaihat1);
        myrecycleview1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false ));
        myrecycleview1.setAdapter(recycleviewAdapter2);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listbaihat=new ArrayList<>();
        listbaihat.add(new SingleItemRecycleview("https://topthuthuat.com/wp/wp-content/uploads/2017/07/9.jpg","Related Tracks","In My Head","https://zmp3-mp3-s1-te-vnso-zn-6.zadn.vn/b439386e3c2ad5748c3b/5843445260147774795?authen=exp=1529048356~acl=/b439386e3c2ad5748c3b/*~hmac=854d2837757066793aa04715c3fbf31e"));
        listbaihat.add(new SingleItemRecycleview("http://1.bp.blogspot.com/-TRXCSsi-9z8/UzBIruZF6_I/AAAAAAAAddE/IyXQgJbZXXQ/s1600/hinh-nen-dep-HD-ve-thien-nhien-1.jpg","Related- Tracks","Wafia-Let Me Love Y..","https://zmp3-mp3-s1-te-vnso-zn-11.zadn.vn/8eb46f3db87951270868/6366243486279198955?authen=exp=1529213599~acl=/8eb46f3db87951270868/*~hmac=46dc7a382c9970b66561eb746edd16b4&filename=Cham-Day-Noi-Dau-ERIK.mp3"));
        listbaihat.add(new SingleItemRecycleview("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9y6UUHABFzJIZgqzmhQjMJpE7OdLdm3DhcOcpcIDJTEGoD1tN","Related- Tracks","Sunday music ann ho..","https://zmp3-mp3-s1-te-vnso-zn-6.zadn.vn/ef88de3a097ee020b96f/8792794279674114302?authen=exp=1529213729~acl=/ef88de3a097ee020b96f/*~hmac=cf1943a3a3e4e3cc7ab1222c4ebcc32b&filename=Nguoi-Am-Phu-OSAD-VRT.mp3"));
        listbaihat.add(new SingleItemRecycleview("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMWSuUix-omWV9c6rwUUDlOmxhaSgRCdu8op5AdgKt5NJonntC","Related- Tracks","Summer 2k17","https://zmp3-mp3-s1-te-vnso-zn-5.zadn.vn/8661cfed19a9f0f7a9b8/2673128015199042442?authen=exp=1529213744~acl=/8661cfed19a9f0f7a9b8/*~hmac=a4283abcf1dbc0e1cc7ec14bde4d2340&filename=Co-Gai-M52-HuyR-Tung-Viu.mp3"));
        //
        listbaihat1=new ArrayList<>();
        listbaihat1.add(new SingleItemRecycleview("http://9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-1.jpg","Lordafj","Acid Jazz","https://zmp3-mp3-s1-te-vnso-zn-5.zadn.vn/03738e675a23b37dea32/2313787426765899173?authen=exp=1529213759~acl=/03738e675a23b37dea32/*~hmac=54442599b45379e00ebe3a24cb8d4fd6&filename=Cung-Anh-Ngoc-Dolil-Hagi-STee.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://taimienphi.vn/tmp/cf/aut/nhung-hinh-anh-dep-2.jpg","dalalmg","Night Cruises","https://zmp3-mp3-s1-te-vnso-zn-11.zadn.vn/58c86f61b925507b0934/4061524407502532887?authen=exp=1529213773~acl=/58c86f61b925507b0934/*~hmac=96f6c6a443f0b713b3cd0fbe35f83473&filename=Hom-Nay-Toi-Buon-Phung-Khanh-Linh.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-3.jpg","Dealer de Musicque","Gentle Dreams","https://zmp3-mp3-s1-te-vnso-zn-15.zadn.vn/ffe961cab58e5cd0059f/68695268730484457?authen=exp=1529213799~acl=/ffe961cab58e5cd0059f/*~hmac=6d43bda2c5081367a3b81b8c2d1029d5&filename=Buon-Cua-Anh-K-ICM-Dat-G-Masew.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-6.jpg","Omar Khlif","Sunday music and hot...","https://zmp3-mp3-s1-te-vnso-zn-5.zadn.vn/7fad6752b01659480007/7105990493802972886?authen=exp=1529213823~acl=/7fad6752b01659480007/*~hmac=a2fb354b4edb649e18bf7aec21058ae5&filename=Tam-Su-Tuoi-30-Ong-Ngoai-Tuoi-30-OST-Trinh-Thang-Binh.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-7.jpg","Fusion Music","Wander|A Chill Mix(...","https://zmp3-mp3-s1-te-vnso-zn-15.zadn.vn/4071419594d17d8f24c0/8580673733891366349?authen=exp=1529214064~acl=/4071419594d17d8f24c0/*~hmac=8a34d1a2c893aa6bf13f2dbc4c396fcd&filename=Sai-Nguoi-Sai-Thoi-Diem-Thanh-Hung.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-8.jpg","Eliana Cogine","musicas relaxantes","https://zmp3-mp3-s1-te-vnso-zn-15.zadn.vn/6602a34f740b9d55c41a/997505828643280960?authen=exp=1529214067~acl=/6602a34f740b9d55c41a/*~hmac=465cde5aa372280d25c44918c3545ba5&filename=Ai-Khoc-Noi-Dau-Nay-Bao-Anh.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-9.jpg","J e z i k a","Chillax Mood","https://zmp3-mp3-s1-te-vnso-zn-15.zadn.vn/de0f10f2c8b621e878a7/8028330437800394190?authen=exp=1529214074~acl=/de0f10f2c8b621e878a7/*~hmac=732317c2c252a229b872e1c26502dd32&filename=Dung-Ai-Nhac-Ve-Anh-Ay-Tra-My-Idol.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-10.jpg","Lordafi","Late Night Drive","https://zmp3-mp3-s1-te-vnso-zn-6.zadn.vn/0c706617b053590d0042/3148227997097792029?authen=exp=1529214077~acl=/0c706617b053590d0042/*~hmac=958c15edbe0e99cd3dc07384c341146c&filename=Cuoc-Song-Em-On-Khong-Anh-Tu-The-Voice.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-11.jpg","Heather","Chill","https://zmp3-mp3-s1-te-vnso-zn-6.zadn.vn/5ee8eed13895d1cb8884/4035341797591617350?authen=exp=1529214087~acl=/5ee8eed13895d1cb8884/*~hmac=82f5408c584215f8d6b458064ff078c8&filename=Quan-Trong-La-Than-Thai-OnlyC-Karik.mp3"));
        listbaihat1.add(new SingleItemRecycleview("http://i.9mobi.vn/cf/images/2015/03/nkk/nhung-hinh-anh-dep-18.jpg","maddxe","Bed Time BLues","https://zmp3-mp3-s1-te-vnso-zn-10.zadn.vn/04012077cf33266d7f22/3177598637209028991?authen=exp=1529214098~acl=/04012077cf33266d7f22/*~hmac=25d15dfe7eda9edb5e8d52b562bb683c&filename=De-Cho-Em-Khoc-Vali-Tinh-Yeu-OST-Vy-Oanh.mp3"));
        //
    }
}

