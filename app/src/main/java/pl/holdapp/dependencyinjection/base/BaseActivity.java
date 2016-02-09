package pl.holdapp.dependencyinjection.base;

import android.app.Activity;

import pl.holdapp.dependencyinjection.MyApp;
import pl.holdapp.dependencyinjection.di.components.ActivityComponent;
import pl.holdapp.dependencyinjection.di.components.DaggerActivityComponent;
import pl.holdapp.dependencyinjection.di.modules.ActivityModule;

public abstract class BaseActivity extends Activity {
    private static final String TAG = "BaseActivity";
    private ActivityComponent activityComponent;

    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(MyApp.get(this).getComponent())
                    .activityModule(new ActivityModule(this)).build();

        }
        return activityComponent;
    }
}
