package huakr.sj.com.arouterdemo.Mvp.contract;

import huakr.sj.com.arouterdemo.Mvp.Base.BasePresenter;

public interface OrdersContract {
    interface Model {
       void getOrders(OrdersCallback callback);
       interface OrdersCallback{
         void onSucceed();
         void onFailure();
        }
    }

    interface View {
    }

    interface Presenter {
      void   getOrders();
    }
}
