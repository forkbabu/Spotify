package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowDescription extends Element<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowDescription episodeRowDescription, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(episodeRowDescription, nmf);
        }
    }

    public enum Events {
        OnTagLineClick
    }

    public static final class Model {
        private final String description;
        private final String tagLineLabel;
        private final TagLineType tagLineType;

        public Model(String str, String str2, TagLineType tagLineType2) {
            h.e(str, "description");
            h.e(tagLineType2, "tagLineType");
            this.description = str;
            this.tagLineLabel = str2;
            this.tagLineType = tagLineType2;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTagLineLabel() {
            return this.tagLineLabel;
        }

        public final TagLineType getTagLineType() {
            return this.tagLineType;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, TagLineType tagLineType2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? TagLineType.None : tagLineType2);
        }
    }

    public enum TagLineType {
        Music,
        None
    }
}
