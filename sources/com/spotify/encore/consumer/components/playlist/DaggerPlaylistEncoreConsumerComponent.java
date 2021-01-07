package com.spotify.encore.consumer.components.playlist;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.PlaylistEncoreConsumerComponent;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.spotify.encore.consumer.components.playlist.impl.EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.DefaultParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.DefaultParticipantRowPlaylistViewBinder;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.DefaultParticipantRowPlaylistViewBinder_Factory;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.DefaultParticipantRowPlaylist_Factory;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.ParticipantRowPlaylistFactory;
import com.spotify.encore.consumer.components.playlist.impl.participantrow.ParticipantRowPlaylistFactory_Factory;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.consumer.elements.artwork.ArtworkView_ViewContext_Factory;
import com.squareup.picasso.Picasso;

public final class DaggerPlaylistEncoreConsumerComponent implements PlaylistEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<DefaultParticipantRowPlaylist> defaultParticipantRowPlaylistProvider;
    private wlf<DefaultParticipantRowPlaylistViewBinder> defaultParticipantRowPlaylistViewBinderProvider;
    private wlf<ParticipantRowPlaylistFactory> participantRowPlaylistFactoryProvider;
    private wlf<Picasso> picassoProvider;
    private wlf<ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration>> provideParticipantRowPlaylistFactoryProvider;
    private wlf<ArtworkView.ViewContext> viewContextProvider;

    private static final class Factory implements PlaylistEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.components.playlist.PlaylistEncoreConsumerComponent.Factory
        public PlaylistEncoreConsumerComponent create(Activity activity, Picasso picasso) {
            activity.getClass();
            picasso.getClass();
            return new DaggerPlaylistEncoreConsumerComponent(activity, picasso);
        }
    }

    public static PlaylistEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(Activity activity, Picasso picasso) {
        this.activityProvider = gjf.a(activity);
        fjf a = gjf.a(picasso);
        this.picassoProvider = a;
        ArtworkView_ViewContext_Factory create = ArtworkView_ViewContext_Factory.create(a);
        this.viewContextProvider = create;
        DefaultParticipantRowPlaylistViewBinder_Factory create2 = DefaultParticipantRowPlaylistViewBinder_Factory.create(this.activityProvider, create);
        this.defaultParticipantRowPlaylistViewBinderProvider = create2;
        DefaultParticipantRowPlaylist_Factory create3 = DefaultParticipantRowPlaylist_Factory.create(create2);
        this.defaultParticipantRowPlaylistProvider = create3;
        ParticipantRowPlaylistFactory_Factory create4 = ParticipantRowPlaylistFactory_Factory.create(create3);
        this.participantRowPlaylistFactoryProvider = create4;
        this.provideParticipantRowPlaylistFactoryProvider = ljf.a(EncoreConsumerPlaylistComponentBindingsModule_ProvideParticipantRowPlaylistFactoryFactory.create(create4));
    }

    @Override // com.spotify.encore.consumer.components.playlist.PlaylistEncoreConsumerComponent
    public ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> participantRowPlaylistFactory() {
        return this.provideParticipantRowPlaylistFactoryProvider.get();
    }

    private DaggerPlaylistEncoreConsumerComponent(Activity activity, Picasso picasso) {
        initialize(activity, picasso);
    }
}
