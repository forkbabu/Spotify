package com.spotify.encore.consumer.components.artist.api.playlistcard;

import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PlaylistCardArtist extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(PlaylistCardArtist playlistCardArtist, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(playlistCardArtist, nmf);
        }
    }

    public static abstract class Events {

        public static final class CardClicked extends Events {
            public static final CardClicked INSTANCE = new CardClicked();

            private CardClicked() {
                super(null);
            }
        }

        private Events() {
        }

        public /* synthetic */ Events(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final String coverArtUri;
        private final String playlistName;

        public Model(String str, String str2) {
            h.e(str2, "coverArtUri");
            this.playlistName = str;
            this.coverArtUri = str2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.playlistName;
            }
            if ((i & 2) != 0) {
                str2 = model.coverArtUri;
            }
            return model.copy(str, str2);
        }

        public final String component1() {
            return this.playlistName;
        }

        public final String component2() {
            return this.coverArtUri;
        }

        public final Model copy(String str, String str2) {
            h.e(str2, "coverArtUri");
            return new Model(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.playlistName, model.playlistName) && h.a(this.coverArtUri, model.coverArtUri);
        }

        public final String getCoverArtUri() {
            return this.coverArtUri;
        }

        public final String getPlaylistName() {
            return this.playlistName;
        }

        public int hashCode() {
            String str = this.playlistName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.coverArtUri;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(playlistName=");
            V0.append(this.playlistName);
            V0.append(", coverArtUri=");
            return je.I0(V0, this.coverArtUri, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, int i, kotlin.jvm.internal.f fVar) {
            this((i & 1) != 0 ? null : str, str2);
        }
    }
}
