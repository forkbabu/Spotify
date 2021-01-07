package com.spotify.encore.consumer.yourepisodes;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.impl.EncoreConsumerYourEpisodesComponentBindingsModule;
import com.spotify.encore.consumer.components.yourepisodes.impl.EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.DefaultYourEpisodesHeader;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.DefaultYourEpisodesHeader_Factory;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.YourEpisodesHeaderFactory;
import com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader.YourEpisodesHeaderFactory_Factory;
import com.spotify.encore.consumer.yourepisodes.YourEpisodesEncoreConsumerComponent;

public final class DaggerYourEpisodesEncoreConsumerComponent implements YourEpisodesEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<DefaultYourEpisodesHeader> defaultYourEpisodesHeaderProvider;
    private wlf<ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration>> providesYourEpisodesHeaderFactoryProvider;
    private wlf<YourEpisodesHeaderFactory> yourEpisodesHeaderFactoryProvider;

    private static final class Factory implements YourEpisodesEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.yourepisodes.YourEpisodesEncoreConsumerComponent.Factory
        public YourEpisodesEncoreConsumerComponent create(Activity activity) {
            activity.getClass();
            return new DaggerYourEpisodesEncoreConsumerComponent(new EncoreConsumerYourEpisodesComponentBindingsModule(), activity);
        }
    }

    public static YourEpisodesEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(EncoreConsumerYourEpisodesComponentBindingsModule encoreConsumerYourEpisodesComponentBindingsModule, Activity activity) {
        fjf a = gjf.a(activity);
        this.activityProvider = a;
        DefaultYourEpisodesHeader_Factory create = DefaultYourEpisodesHeader_Factory.create(a);
        this.defaultYourEpisodesHeaderProvider = create;
        YourEpisodesHeaderFactory_Factory create2 = YourEpisodesHeaderFactory_Factory.create(create);
        this.yourEpisodesHeaderFactoryProvider = create2;
        this.providesYourEpisodesHeaderFactoryProvider = ljf.a(EncoreConsumerYourEpisodesComponentBindingsModule_ProvidesYourEpisodesHeaderFactoryFactory.create(encoreConsumerYourEpisodesComponentBindingsModule, create2));
    }

    @Override // com.spotify.encore.consumer.yourepisodes.YourEpisodesEncoreConsumerComponent
    public ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> yourEpisodesHeaderFactory() {
        return this.providesYourEpisodesHeaderFactoryProvider.get();
    }

    private DaggerYourEpisodesEncoreConsumerComponent(EncoreConsumerYourEpisodesComponentBindingsModule encoreConsumerYourEpisodesComponentBindingsModule, Activity activity) {
        initialize(encoreConsumerYourEpisodesComponentBindingsModule, activity);
    }
}
