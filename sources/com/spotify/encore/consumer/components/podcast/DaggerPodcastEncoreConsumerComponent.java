package com.spotify.encore.consumer.components.podcast;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.PodcastEncoreConsumerComponent;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.DefaultEpisodeRow;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.DefaultEpisodeRow_Factory;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.EpisodeRowFactory;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.EpisodeRowFactory_Factory;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory;
import com.spotify.encore.consumer.elements.downloadbutton.LottieIconStateMachine;
import com.squareup.picasso.Picasso;

public final class DaggerPodcastEncoreConsumerComponent implements PodcastEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<DefaultEpisodeRow> defaultEpisodeRowProvider;
    private wlf<EpisodeRowFactory> episodeRowFactoryProvider;
    private wlf<Picasso> picassoProvider;
    private wlf<ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration>> provideEpisodeRowFactoryProvider;
    private wlf<LottieIconStateMachine> provideLottieIconStateMachineProvider;

    private static final class Factory implements PodcastEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.components.podcast.PodcastEncoreConsumerComponent.Factory
        public PodcastEncoreConsumerComponent create(Activity activity, Picasso picasso) {
            activity.getClass();
            picasso.getClass();
            return new DaggerPodcastEncoreConsumerComponent(activity, picasso);
        }
    }

    public static PodcastEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(Activity activity, Picasso picasso) {
        this.activityProvider = gjf.a(activity);
        this.picassoProvider = gjf.a(picasso);
        wlf<LottieIconStateMachine> a = ljf.a(PodcastComponentBindingsModule_ProvideLottieIconStateMachineFactory.create(this.activityProvider));
        this.provideLottieIconStateMachineProvider = a;
        DefaultEpisodeRow_Factory create = DefaultEpisodeRow_Factory.create(this.activityProvider, this.picassoProvider, a);
        this.defaultEpisodeRowProvider = create;
        EpisodeRowFactory_Factory create2 = EpisodeRowFactory_Factory.create(create);
        this.episodeRowFactoryProvider = create2;
        this.provideEpisodeRowFactoryProvider = ljf.a(PodcastComponentBindingsModule_ProvideEpisodeRowFactoryFactory.create(create2));
    }

    @Override // com.spotify.encore.consumer.components.podcast.PodcastEncoreConsumerComponent
    public ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> episodeRowFactory() {
        return this.provideEpisodeRowFactoryProvider.get();
    }

    private DaggerPodcastEncoreConsumerComponent(Activity activity, Picasso picasso) {
        initialize(activity, picasso);
    }
}
