package com.example.hihib.fleaaflea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hihib.fleaaflea.Bazzar.BazzarInfoActivity;
import com.example.hihib.fleaaflea.ChangDong.ChangDongInfoActivity;
import com.example.hihib.fleaaflea.ChunHo.ChunHoInfoActivity;
import com.example.hihib.fleaaflea.CityMarket.CityMarketInfoActivity;
import com.example.hihib.fleaaflea.Dessert.DessertInfoActvitiy;
import com.example.hihib.fleaaflea.DessertFare.DessertFareInfoActvitiy;
import com.example.hihib.fleaaflea.Donong.DonongInfoActvitiy;
import com.example.hihib.fleaaflea.Dope.DopeInfoActvitiy;
import com.example.hihib.fleaaflea.Flower.FlowerInfoActvitiy;
import com.example.hihib.fleaaflea.LotteTower.LotteTowerInfoActivity;
import com.example.hihib.fleaaflea.MainStreet.StreetInfoActvitiy;
import com.example.hihib.fleaaflea.Mom.MomInfoActivity;
import com.example.hihib.fleaaflea.RainBow.RainBowInfoActvitiy;
import com.example.hihib.fleaaflea.Respace.RespaceInfoActvitiy;
import com.example.hihib.fleaaflea.Yg.YgInfoActivity;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;

/**
 * Created by hihib on 2017-10-20.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{
    ImageView flower , street, donong, dope, rainbow , dessert , dessertfare ;
    ImageView respace, lottetower, bazzar, citymarket, yg, mom , chunho ,changdong;
    String userName;
    Intent it;
    TextView kakao_username;
    public HomeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);

        respace = (ImageView) layout.findViewById(R.id.respace);
        lottetower = (ImageView) layout.findViewById(R.id.lottetower);
        bazzar = (ImageView) layout.findViewById(R.id.bazzar);
        citymarket = (ImageView) layout.findViewById(R.id.citymarket);
        yg = (ImageView) layout.findViewById(R.id.yg);
        mom = (ImageView) layout.findViewById(R.id.mom);
        chunho = (ImageView) layout.findViewById(R.id.chunho);
        changdong = (ImageView) layout.findViewById(R.id.changdong);
        kakao_username = (TextView) layout.findViewById(R.id.kakao_username);

        flower = (ImageView) layout.findViewById(R.id.flower);
        street = (ImageView) layout.findViewById(R.id.street);
        donong = (ImageView) layout.findViewById(R.id.donong);
        dope = (ImageView) layout.findViewById(R.id.dope);
        rainbow = (ImageView) layout.findViewById(R.id.rainbow);
        dessert = (ImageView) layout.findViewById(R.id.dessert);
        dessertfare = (ImageView) layout.findViewById(R.id.dessertfare);

        respace.setOnClickListener(this);
        lottetower.setOnClickListener(this);
        bazzar.setOnClickListener(this);
        citymarket.setOnClickListener(this);
        yg.setOnClickListener(this);
        mom.setOnClickListener(this);
        chunho.setOnClickListener(this);
        changdong.setOnClickListener(this);

        flower.setOnClickListener(this);
        street.setOnClickListener(this);
        donong.setOnClickListener(this);
        dope.setOnClickListener(this);
        dessert.setOnClickListener(this);
        rainbow.setOnClickListener(this);
        dessertfare.setOnClickListener(this);


        KakaorequestMe();
        return layout;
    }
    protected void KakaorequestMe() {
        UserManagement.requestMe(new MeResponseCallback() {
            @Override
            public void onSessionClosed(ErrorResult errorResult) {

            }

            @Override
            public void onNotSignedUp() {

            }

            @Override
            public void onSuccess(UserProfile result) {
                userName = result.getNickname();
                Log.d("카카오톡아이디@@@@", userName + "");
                kakao_username.setText(userName + "님 환영합니다 ! 오늘의 플리마켓 추천은 다음과 같습니다.");
            }
        });
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
//            case R.id.figure:
//                Intent it = new Intent(getActivity() , MarketInfoActvitiy.class);
//                startActivity(it);
//                break;
            case R.id.respace:
                it = new Intent(getActivity() , RespaceInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.lottetower:
                it = new Intent(getActivity() , LotteTowerInfoActivity.class);
                startActivity(it);
                break;
            case R.id.bazzar:
                it = new Intent(getActivity() , BazzarInfoActivity.class);
                startActivity(it);
                break;
            case R.id.citymarket:
                it = new Intent(getActivity() , CityMarketInfoActivity.class);
                startActivity(it);
                break;
            case R.id.yg:
                it = new Intent(getActivity() , YgInfoActivity.class);
                startActivity(it);
                break;
            case R.id.mom:
                it = new Intent(getActivity() , MomInfoActivity.class);
                startActivity(it);
                break;
            case R.id.chunho:
                it = new Intent(getActivity() , ChunHoInfoActivity.class);
                startActivity(it);
                break;
            case R.id.changdong:
                it = new Intent(getActivity() , ChangDongInfoActivity.class);
                startActivity(it);
                break;

            case R.id.flower:
                it = new Intent(getActivity() , FlowerInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.street:
                it = new Intent(getActivity() , StreetInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.donong:
                it = new Intent(getActivity() , DonongInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dope:
                it = new Intent(getActivity() , DopeInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dessert:
                it = new Intent(getActivity() , DessertInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.dessertfare:
                it = new Intent(getActivity() , DessertFareInfoActvitiy.class);
                startActivity(it);
                break;
            case R.id.rainbow:
                it = new Intent(getActivity() , RainBowInfoActvitiy.class);
                startActivity(it);
                break;
        }

    }
}
