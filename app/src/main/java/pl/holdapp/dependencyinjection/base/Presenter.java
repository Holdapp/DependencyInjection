package pl.holdapp.dependencyinjection.base;

public interface Presenter<V extends MvpView> {
    void attachView(V view);

    void detachView();
}
