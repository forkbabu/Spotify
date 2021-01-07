package com.spotify.encore.consumer.components.artist.impl.trackrow;

import android.app.Activity;
import android.view.View;
import com.spotify.encore.consumer.components.artist.api.trackrow.Event;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.elements.coverart.CoverArtView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultTrackRowArtist implements TrackRowArtist {
    private final DefaultTrackRowArtistViewBinder trackRowArtistViewBinder;
    private final View view;

    public static final class ViewContext {
        private final Activity context;
        private final CoverArtView.ViewContext coverArtContext;

        public ViewContext(Activity activity, CoverArtView.ViewContext viewContext) {
            h.e(activity, "context");
            h.e(viewContext, "coverArtContext");
            this.context = activity;
            this.coverArtContext = viewContext;
        }

        public final Activity getContext() {
            return this.context;
        }

        public final CoverArtView.ViewContext getCoverArtContext() {
            return this.coverArtContext;
        }
    }

    public DefaultTrackRowArtist(DefaultTrackRowArtistViewBinder defaultTrackRowArtistViewBinder) {
        h.e(defaultTrackRowArtistViewBinder, "trackRowArtistViewBinder");
        this.trackRowArtistViewBinder = defaultTrackRowArtistViewBinder;
        this.view = defaultTrackRowArtistViewBinder.getView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.view;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Event, f> nmf) {
        h.e(nmf, "event");
        this.trackRowArtistViewBinder.setOnTrackClickListener(nmf);
        this.trackRowArtistViewBinder.setOnTrackLongClickListener(nmf);
        this.trackRowArtistViewBinder.setOnContextMenuClickedListener(nmf);
    }

    public void render(TrackRowArtist.Model model) {
        h.e(model, "model");
        this.trackRowArtistViewBinder.render(model);
    }
}
