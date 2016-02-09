package pl.holdapp.dependencyinjection;

import android.app.Application;
import android.content.Context;

import pl.holdapp.dependencyinjection.di.components.ApplicationComponent;
import pl.holdapp.dependencyinjection.di.components.DaggerApplicationComponent;
import pl.holdapp.dependencyinjection.di.modules.ApplicationModule;

public class MyApp extends Application {
    private static final String TAG = "TimeApp";
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }


    public ApplicationComponent getComponent() {
        if (applicationComponent == null) {
            applicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return applicationComponent;
    }

    public static MyApp get(Context context) {
        return ((MyApp) context.getApplicationContext());
    }
}
