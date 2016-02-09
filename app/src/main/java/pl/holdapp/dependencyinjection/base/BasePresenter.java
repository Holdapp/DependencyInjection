package pl.holdapp.dependencyinjection.base;

import android.support.annotation.CallSuper;

public class BasePresenter<T extends MvpView> implements Presenter<T> {
    private static final String TAG = "BasePresenter";
    T view;

    @CallSuper
    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @CallSuper
    @Override
    public void detachView() {
        this.view = null;
    }

    public final boolean isViewAttached() {
        return view == null;
    }

    public final T getView() {
        return view;
    }

    public final void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
