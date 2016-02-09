package pl.holdapp.dependencyinjection.di.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import pl.holdapp.dependencyinjection.di.annotations.ApplicationContext;
import pl.holdapp.dependencyinjection.di.modules.ApplicationModule;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();
}
