package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PlayElement extends Element<Model, f> {

    public static final class DefaultImpls {
        public static void onEvent(PlayElement playElement, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(playElement, nmf);
        }
    }

    public static final class Model {
        private final boolean isPlaying;
        private final String title;

        public Model() {
            this(null, false, 3, null);
        }

        public Model(String str, boolean z) {
            h.e(str, "title");
            this.title = str;
            this.isPlaying = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }
    }
}
