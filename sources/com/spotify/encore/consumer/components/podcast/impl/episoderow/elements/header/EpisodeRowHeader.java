package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.header;

import com.spotify.encore.Element;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowHeader extends Element {

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowHeader episodeRowHeader, nmf<?, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(episodeRowHeader, nmf);
        }
    }

    public static final class Model {
        private final String artworkUri;
        private final ContentRestriction contentRestriction;
        private final String subtitle;
        private final String title;

        public Model(String str, String str2, String str3, ContentRestriction contentRestriction2) {
            h.e(str, "title");
            h.e(contentRestriction2, "contentRestriction");
            this.title = str;
            this.subtitle = str2;
            this.artworkUri = str3;
            this.contentRestriction = contentRestriction2;
        }

        public final String getArtworkUri() {
            return this.artworkUri;
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, String str3, ContentRestriction contentRestriction2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ContentRestriction.None : contentRestriction2);
        }
    }
}
