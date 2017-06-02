package com.wolf.first.ui.presenter;

import com.wolf.first.api.ResultObserver;
import com.wolf.first.base.BaseBean;
import com.wolf.first.bean.CategoryBean;
import com.wolf.first.bean.TestBean;
import com.wolf.first.ui.contract.CookContract;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by W.J on 2017/6/2.
 */

public class CookPresenter extends CookContract.Presenter {
    @Override
    public void getCategory() {
        mModel.getCategory().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ResultObserver<BaseBean<CategoryBean>>(mView){
            @Override
            public void onSubscribe(Disposable d) {
                super.onSubscribe(d);
            }

            @Override
            public void onNext(BaseBean<CategoryBean> categoryBeanBaseBean) {
                super.onNext(categoryBeanBaseBean);
                mView.onSuccess(categoryBeanBaseBean.getMsg());
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onComplete() {
                super.onComplete();
            }
        });
    }
}
