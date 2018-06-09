package huakr.sj.com.arouterdemo.Mvp.Base;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {
    /**
     * 防止内存泄漏
     * 1.弱应用
     * 2.手动绑定and解绑
     */

  protected   WeakReference<T> mView;

  public void attachView(T view){
    this.mView=new WeakReference<>(view);
  }
  public void detachView(){
      this.mView.clear();
  }

}
