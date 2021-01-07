package com.spotify.encore.consumer.components.album.impl.trackrow;

import android.view.View;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowAlbum implements TrackRowAlbum {
    private final View view;
    private final DefaultTrackRowAlbumViewBinder viewBinder;

    public DefaultTrackRowAlbum(DefaultTrackRowAlbumViewBinder defaultTrackRowAlbumViewBinder) {
        h.e(defaultTrackRowAlbumViewBinder, "viewBinder");
        this.viewBinder = defaultTrackRowAlbumViewBinder;
        this.view = defaultTrackRowAlbumViewBinder.getView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.view;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super TrackRowAlbum.Events, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.setOnTrackClickListener(nmf);
        this.viewBinder.setOnTrackLongClickListener(nmf);
        this.viewBinder.setOnContextMenuClickedListener(nmf);
    }

    public void render(TrackRowAlbum.Model model) {
        h.e(model, "model");
        this.viewBinder.render(model);
    }
}
