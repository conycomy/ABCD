package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{
    LinearLayout baseLayout;
    Button button1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
//super, return: 상위 클래스의 생성자를 실행
//MenuInflater, mInflater: 메뉴 인플레이터 생성, 앞에서 작성한 메뉴xml파일을 등록

        return true;
    }

    //메뉴를 클릭할 때 동작할 메소드 onOptionsItemSelected()를 코딩
//커서를 onCreate()밖에 두고, onOptionsItemSelcted를 자동완성 후 스위치문을 사용
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case R.id.subSize:
                button1.setScaleX(2);
                return true;
        }
        return false; //자동완성된 return문을 false로
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");

        baseLayout=(LinearLayout)findViewById(R.id.baseLayout);
        button1=(Button)findViewById(R.id.button1);


//옵션 메뉴를 등록하는 메소드 onCreateOptionsMenu()를 부모 클래스인
//activity클래스로부터 오버라이딩한다.
//code메뉴의 android.app.activity 하위의 메소드를 선택
    }
}