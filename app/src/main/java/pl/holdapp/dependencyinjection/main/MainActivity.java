package pl.holdapp.dependencyinjection.main;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.Bind;
import butterknife.ButterKnife;
import pl.holdapp.dependencyinjection.R;
import pl.holdapp.dependencyinjection.base.BaseActivity;
import pl.holdapp.dependencyinjection.di.annotations.ApplicationContext;

public class MainActivity extends BaseActivity implements MainMvpView {


    @ApplicationContext
    @Inject
    Context context;


    @Inject
    MainPresenter presenter;

    @Bind(R.id.text_view)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInjections();
        presenter.attachView(this);
        textView.setText(String.format(Locale.US, "%d", presenter.getCounter()));
    }

    private void initInjections() {
        getActivityComponent().inject(this);
        ButterKnife.bind(this);
    }
}
