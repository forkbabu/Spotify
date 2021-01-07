package com.spotify.encore.consumer.components.artist.impl.trackrow;

import com.spotify.encore.consumer.components.artist.impl.trackrow.DefaultTrackRowArtist;
import kotlin.jvm.internal.h;

public interface TrackRowArtistModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DefaultTrackRowArtistViewBinder provideTrackRowArtistViewBinder(DefaultTrackRowArtist.ViewContext viewContext) {
            h.e(viewContext, "context");
            return new DefaultTrackRowArtistViewBinder(viewContext.getContext(), viewContext.getCoverArtContext());
        }
    }
}
