package pl.holdapp.dependencyinjection.di.modules;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import pl.holdapp.dependencyinjection.di.annotations.ApplicationContext;


@Module
public class ApplicationModule {
    private static final String TAG = "ApplicationModule";
    protected final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return application;
    }

}
