package com.spotify.encore.consumer.components.artist;

import android.app.Activity;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.ArtistEncoreConsumerComponent;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.impl.EncoreConsumerArtistComponentBindingsModule;
import com.spotify.encore.consumer.components.artist.impl.EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory;
import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist;
import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtistViewBinder;
import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist_Factory;
import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist_ViewContext_Factory;
import com.spotify.encore.consumer.components.artist.impl.trackrow.TrackRowArtistFactory;
import com.spotify.encore.consumer.components.artist.impl.trackrow.TrackRowArtistFactory_Factory;
import com.spotify.encore.consumer.components.artist.impl.trackrow.TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import com.spotify.encore.consumer.elements.coverart.CoverArtView_ViewContext_Factory;
import com.squareup.picasso.Picasso;

public final class DaggerArtistEncoreConsumerComponent implements ArtistEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<DefaultTrackRowArtist> defaultTrackRowArtistProvider;
    private wlf<Picasso> picassoProvider;
    private wlf<ComponentFactory<TrackRowArtist, ComponentConfiguration>> provideTrackRowArtistFactoryProvider;
    private wlf<DefaultTrackRowArtistViewBinder> provideTrackRowArtistViewBinderProvider;
    private wlf<TrackRowArtistFactory> trackRowArtistFactoryProvider;
    private wlf<CoverArtView.ViewContext> viewContextProvider;
    private wlf<DefaultTrackRowArtist.ViewContext> viewContextProvider2;

    private static final class Factory implements ArtistEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.components.artist.ArtistEncoreConsumerComponent.Factory
        public ArtistEncoreConsumerComponent create(Activity activity, Picasso picasso) {
            activity.getClass();
            picasso.getClass();
            return new DaggerArtistEncoreConsumerComponent(new EncoreConsumerArtistComponentBindingsModule(), activity, picasso);
        }
    }

    public static ArtistEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(EncoreConsumerArtistComponentBindingsModule encoreConsumerArtistComponentBindingsModule, Activity activity, Picasso picasso) {
        this.activityProvider = gjf.a(activity);
        fjf a = gjf.a(picasso);
        this.picassoProvider = a;
        CoverArtView_ViewContext_Factory create = CoverArtView_ViewContext_Factory.create(a);
        this.viewContextProvider = create;
        DefaultTrackRowArtist_ViewContext_Factory create2 = DefaultTrackRowArtist_ViewContext_Factory.create(this.activityProvider, create);
        this.viewContextProvider2 = create2;
        TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory create3 = TrackRowArtistModule_ProvideTrackRowArtistViewBinderFactory.create(create2);
        this.provideTrackRowArtistViewBinderProvider = create3;
        DefaultTrackRowArtist_Factory create4 = DefaultTrackRowArtist_Factory.create(create3);
        this.defaultTrackRowArtistProvider = create4;
        TrackRowArtistFactory_Factory create5 = TrackRowArtistFactory_Factory.create(create4);
        this.trackRowArtistFactoryProvider = create5;
        this.provideTrackRowArtistFactoryProvider = ljf.a(EncoreConsumerArtistComponentBindingsModule_ProvideTrackRowArtistFactoryFactory.create(encoreConsumerArtistComponentBindingsModule, create5));
    }

    @Override // com.spotify.encore.consumer.components.artist.ArtistEncoreConsumerComponent
    public ComponentFactory<TrackRowArtist, ComponentConfiguration> trackRowArtistFactory() {
        return this.provideTrackRowArtistFactoryProvider.get();
    }

    private DaggerArtistEncoreConsumerComponent(EncoreConsumerArtistComponentBindingsModule encoreConsumerArtistComponentBindingsModule, Activity activity, Picasso picasso) {
        initialize(encoreConsumerArtistComponentBindingsModule, activity, picasso);
    }
}
