package com.spotify.encore.consumer.components.impl.trackrowplaylistextender;

import android.view.View;
import androidx.fragment.app.c;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowPlaylistExtender implements TrackRowPlaylistExtender {
    private final DefaultTrackRowPlaylistExtenderViewBinder playlistExtenderTrackRowViewBinder;

    public static final class ViewContext {
        private ArtworkView.ViewContext artworkContext;
        private c context;

        public ViewContext(c cVar, ArtworkView.ViewContext viewContext) {
            h.e(cVar, "context");
            h.e(viewContext, "artworkContext");
            this.context = cVar;
            this.artworkContext = viewContext;
        }

        public final ArtworkView.ViewContext getArtworkContext() {
            return this.artworkContext;
        }

        public final c getContext() {
            return this.context;
        }

        public final void setArtworkContext(ArtworkView.ViewContext viewContext) {
            h.e(viewContext, "<set-?>");
            this.artworkContext = viewContext;
        }

        public final void setContext(c cVar) {
            h.e(cVar, "<set-?>");
            this.context = cVar;
        }
    }

    public DefaultTrackRowPlaylistExtender(DefaultTrackRowPlaylistExtenderViewBinder defaultTrackRowPlaylistExtenderViewBinder) {
        h.e(defaultTrackRowPlaylistExtenderViewBinder, "playlistExtenderTrackRowViewBinder");
        this.playlistExtenderTrackRowViewBinder = defaultTrackRowPlaylistExtenderViewBinder;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.playlistExtenderTrackRowViewBinder.getView();
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Events, f> nmf) {
        h.e(nmf, "event");
        DefaultTrackRowPlaylistExtenderViewBinder defaultTrackRowPlaylistExtenderViewBinder = this.playlistExtenderTrackRowViewBinder;
        defaultTrackRowPlaylistExtenderViewBinder.setOnTrackClickListener(new DefaultTrackRowPlaylistExtender$onEvent$1$1(nmf));
        defaultTrackRowPlaylistExtenderViewBinder.setOnTrackLongClickListener(new DefaultTrackRowPlaylistExtender$onEvent$1$2(nmf));
        defaultTrackRowPlaylistExtenderViewBinder.setOnQuickActionListener(nmf);
    }

    public void render(TrackRowPlaylistExtender.Model model) {
        h.e(model, "model");
        this.playlistExtenderTrackRowViewBinder.setTrackName(model.getTrackName());
        this.playlistExtenderTrackRowViewBinder.setArtistsAndAddedByNames(model.getArtistNames(), model.getAddedBy());
        this.playlistExtenderTrackRowViewBinder.updateArtwork(model.getArtwork());
        this.playlistExtenderTrackRowViewBinder.setRestrictionBadge(model.getContentRestriction());
        this.playlistExtenderTrackRowViewBinder.setModelState(model.isOffline(), model.isPlayable(), model.isPlaying());
        this.playlistExtenderTrackRowViewBinder.setActionButtonState(model.isAddedToPlaylist());
    }
}
