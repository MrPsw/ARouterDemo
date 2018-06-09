package huakr.sj.com.arouterdemo.Mvp.presenter;

import huakr.sj.com.arouterdemo.Mvp.Base.BasePresenter;
import huakr.sj.com.arouterdemo.Mvp.contract.OrdersContract;
import huakr.sj.com.arouterdemo.Mvp.model.OrdersModelImp;

public class OrdersPresenterImp<T extends OrdersContract.View> extends BasePresenter<T> implements OrdersContract.Presenter {
    OrdersModelImp mModelImp=new OrdersModelImp();
    @Override
    public void getOrders() {
       mModelImp.getOrders(new OrdersContract.Model.OrdersCallback() {
           @Override
           public void onSucceed() {

           }

           @Override
           public void onFailure() {

           }
       });
    }
}
