package huakr.sj.com.arouterdemo.Activity;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import huakr.sj.com.arouterdemo.Base.BaseFragment;
import huakr.sj.com.arouterdemo.Mvp.contract.OrdersContract;
import huakr.sj.com.arouterdemo.Mvp.presenter.OrdersPresenterImp;
import huakr.sj.com.arouterdemo.R;

public class OrdersFragment extends BaseFragment implements OrdersContract.View {

    private OrdersPresenterImp<OrdersContract.View> mPresenter;


    @Override
    public void initData(@Nullable Bundle bundle) {
//        mPresenter=new OrdersPresenterImp<>();
//        mPresenter .attachView(this);
//        mPresenter.getOrders();
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_orders;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {

    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
