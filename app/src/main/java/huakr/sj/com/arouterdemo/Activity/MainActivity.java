package huakr.sj.com.arouterdemo.Activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.FragmentUtils;
import com.blankj.utilcode.util.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import huakr.sj.com.arouterdemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.app_home_img)
    ImageView appHomeImg;
    @BindView(R.id.app_home_tv)
    TextView appHomeTv;
    @BindView(R.id.app_orders_img)
    ImageView appOrdersImg;
    @BindView(R.id.app_orders_tv)
    TextView appOrdersTv;
    @BindView(R.id.app_my_img)
    ImageView appMyImg;
    @BindView(R.id.app_my_tv)
    TextView appMyTv;

    ImageView[] mMeunImg;
    TextView[] mMeunTv ;

    @BindView(R.id.home_item)
    LinearLayout homeItem;
    @BindView(R.id.orders_item)
    LinearLayout ordersItem;
    @BindView(R.id.my_item)
    LinearLayout myItem;



    Fragment [] mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        homeItem.setOnClickListener(this);
        ordersItem.setOnClickListener(this);
        myItem.setOnClickListener(this);
        mMeunTv= new TextView[]{appHomeTv, appOrdersTv, appMyTv};

          mFragments=new Fragment[]{new HomeFragment(),new OrdersFragment(),new MyFragment()};
           FragmentUtils.add(getSupportFragmentManager(), mFragments, R.id.contentView,1);

    }

    protected void setImmerseLayout(View view) {// view为标题栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            int statusBarHeight = getStatusBarHeight(this.getBaseContext());
            view.setPadding(0, statusBarHeight, 0, 0);
        }
    }

    public int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen",
                "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public void SelectedMeun(int index) {
        if (index < mMeunTv.length)
            for (int i = 0; i < mMeunTv.length; i++) {
                if (i == index) {
                    mMeunTv[i].setTextColor(getResources().getColor(R.color.md_grey_800));
                    FragmentUtils.show(mFragments[i]);
                } else {
                    mMeunTv[i].setTextColor(getResources().getColor(R.color.md_grey_400));
                    FragmentUtils.hide(mFragments[i]);
                }
            }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_item:
                SelectedMeun(0);
                break;
            case R.id.orders_item:
                SelectedMeun(1);
                break;
            case R.id.my_item:
                SelectedMeun(2);
                break;
        }
    }
}
