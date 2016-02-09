package pl.holdapp.dependencyinjection.main;


import javax.inject.Inject;

import pl.holdapp.dependencyinjection.base.BasePresenter;

public class MainPresenter extends BasePresenter<MainMvpView> {
    private static final String TAG = "MainPresenter";
    static int counter = 0;

    @Inject
    public MainPresenter() {
        counter++;
    }


    public int getCounter() {
        return counter;
    }
}
