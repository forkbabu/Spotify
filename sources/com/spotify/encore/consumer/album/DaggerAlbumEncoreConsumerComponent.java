package com.spotify.encore.consumer.album;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.album.AlbumEncoreConsumerComponent;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;
import com.spotify.encore.consumer.components.album.impl.EncoreConsumerAlbumComponentBindingsModule;
import com.spotify.encore.consumer.components.album.impl.EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory;
import com.spotify.encore.consumer.components.album.impl.trackrow.DefaultTrackRowAlbum;
import com.spotify.encore.consumer.components.album.impl.trackrow.DefaultTrackRowAlbumViewBinder;
import com.spotify.encore.consumer.components.album.impl.trackrow.DefaultTrackRowAlbumViewBinder_Factory;
import com.spotify.encore.consumer.components.album.impl.trackrow.DefaultTrackRowAlbum_Factory;
import com.spotify.encore.consumer.components.album.impl.trackrow.TrackRowAlbumFactory;
import com.spotify.encore.consumer.components.album.impl.trackrow.TrackRowAlbumFactory_Factory;

public final class DaggerAlbumEncoreConsumerComponent implements AlbumEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<DefaultTrackRowAlbum> defaultTrackRowAlbumProvider;
    private wlf<DefaultTrackRowAlbumViewBinder> defaultTrackRowAlbumViewBinderProvider;
    private wlf<ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration>> providesTrackRowAlbumFactoryProvider;
    private wlf<TrackRowAlbumFactory> trackRowAlbumFactoryProvider;

    private static final class Factory implements AlbumEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.album.AlbumEncoreConsumerComponent.Factory
        public AlbumEncoreConsumerComponent create(Activity activity) {
            activity.getClass();
            return new DaggerAlbumEncoreConsumerComponent(new EncoreConsumerAlbumComponentBindingsModule(), activity);
        }
    }

    public static AlbumEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(EncoreConsumerAlbumComponentBindingsModule encoreConsumerAlbumComponentBindingsModule, Activity activity) {
        fjf a = gjf.a(activity);
        this.activityProvider = a;
        DefaultTrackRowAlbumViewBinder_Factory create = DefaultTrackRowAlbumViewBinder_Factory.create(a);
        this.defaultTrackRowAlbumViewBinderProvider = create;
        DefaultTrackRowAlbum_Factory create2 = DefaultTrackRowAlbum_Factory.create(create);
        this.defaultTrackRowAlbumProvider = create2;
        TrackRowAlbumFactory_Factory create3 = TrackRowAlbumFactory_Factory.create(create2);
        this.trackRowAlbumFactoryProvider = create3;
        this.providesTrackRowAlbumFactoryProvider = ljf.a(EncoreConsumerAlbumComponentBindingsModule_ProvidesTrackRowAlbumFactoryFactory.create(encoreConsumerAlbumComponentBindingsModule, create3));
    }

    @Override // com.spotify.encore.consumer.album.AlbumEncoreConsumerComponent
    public ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> trackRowAlbumFactory() {
        return this.providesTrackRowAlbumFactoryProvider.get();
    }

    private DaggerAlbumEncoreConsumerComponent(EncoreConsumerAlbumComponentBindingsModule encoreConsumerAlbumComponentBindingsModule, Activity activity) {
        initialize(encoreConsumerAlbumComponentBindingsModule, activity);
    }
}
