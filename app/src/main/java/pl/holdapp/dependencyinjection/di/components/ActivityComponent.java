package pl.holdapp.dependencyinjection.di.components;


import dagger.Component;
import pl.holdapp.dependencyinjection.di.annotations.PerActivity;
import pl.holdapp.dependencyinjection.di.modules.ActivityModule;
import pl.holdapp.dependencyinjection.main.MainActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
