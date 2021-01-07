package com.spotify.encore.consumer.components.playlist.impl.participantrow;

import android.app.Activity;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;

public final class DefaultParticipantRowPlaylistViewBinder_Factory implements fjf<DefaultParticipantRowPlaylistViewBinder> {
    private final wlf<Activity> activityProvider;
    private final wlf<ArtworkView.ViewContext> artWorkContextProvider;

    public DefaultParticipantRowPlaylistViewBinder_Factory(wlf<Activity> wlf, wlf<ArtworkView.ViewContext> wlf2) {
        this.activityProvider = wlf;
        this.artWorkContextProvider = wlf2;
    }

    public static DefaultParticipantRowPlaylistViewBinder_Factory create(wlf<Activity> wlf, wlf<ArtworkView.ViewContext> wlf2) {
        return new DefaultParticipantRowPlaylistViewBinder_Factory(wlf, wlf2);
    }

    public static DefaultParticipantRowPlaylistViewBinder newInstance(Activity activity, ArtworkView.ViewContext viewContext) {
        return new DefaultParticipantRowPlaylistViewBinder(activity, viewContext);
    }

    @Override // defpackage.wlf
    public DefaultParticipantRowPlaylistViewBinder get() {
        return newInstance(this.activityProvider.get(), this.artWorkContextProvider.get());
    }
}
