package com.spotify.encore.consumer.components.artist.api.header;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ArtistHeader extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultArtistHeaderConfiguration implements Configuration {
            public static final DefaultArtistHeaderConfiguration INSTANCE = new DefaultArtistHeaderConfiguration();

            private DefaultArtistHeaderConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ArtistHeader artistHeader, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(artistHeader, nmf);
        }
    }

    public enum Events {
        BackButtonClicked,
        ContextMenuClicked,
        FollowButtonClicked,
        PlayButtonClicked
    }

    public static final class Model {
        private final int artworkColor;
        private final String artworkUri;
        private final boolean isFollowed;
        private final boolean isPlaying;
        private final String monthlyListeners;
        private final String name;

        public Model(String str, String str2, String str3, int i, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(str2, "monthlyListeners");
            this.name = str;
            this.monthlyListeners = str2;
            this.artworkUri = str3;
            this.artworkColor = i;
            this.isFollowed = z;
            this.isPlaying = z2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = model.name;
            }
            if ((i2 & 2) != 0) {
                str2 = model.monthlyListeners;
            }
            if ((i2 & 4) != 0) {
                str3 = model.artworkUri;
            }
            if ((i2 & 8) != 0) {
                i = model.artworkColor;
            }
            if ((i2 & 16) != 0) {
                z = model.isFollowed;
            }
            if ((i2 & 32) != 0) {
                z2 = model.isPlaying;
            }
            return model.copy(str, str2, str3, i, z, z2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.monthlyListeners;
        }

        public final String component3() {
            return this.artworkUri;
        }

        public final int component4() {
            return this.artworkColor;
        }

        public final boolean component5() {
            return this.isFollowed;
        }

        public final boolean component6() {
            return this.isPlaying;
        }

        public final Model copy(String str, String str2, String str3, int i, boolean z, boolean z2) {
            h.e(str, "name");
            h.e(str2, "monthlyListeners");
            return new Model(str, str2, str3, i, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.monthlyListeners, model.monthlyListeners) && h.a(this.artworkUri, model.artworkUri) && this.artworkColor == model.artworkColor && this.isFollowed == model.isFollowed && this.isPlaying == model.isPlaying;
        }

        public final int getArtworkColor() {
            return this.artworkColor;
        }

        public final String getArtworkUri() {
            return this.artworkUri;
        }

        public final String getMonthlyListeners() {
            return this.monthlyListeners;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.monthlyListeners;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.artworkUri;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (((hashCode2 + i) * 31) + this.artworkColor) * 31;
            boolean z = this.isFollowed;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPlaying;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public final boolean isFollowed() {
            return this.isFollowed;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", monthlyListeners=");
            V0.append(this.monthlyListeners);
            V0.append(", artworkUri=");
            V0.append(this.artworkUri);
            V0.append(", artworkColor=");
            V0.append(this.artworkColor);
            V0.append(", isFollowed=");
            V0.append(this.isFollowed);
            V0.append(", isPlaying=");
            return je.P0(V0, this.isPlaying, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, String str3, int i, boolean z, boolean z2, int i2, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, z, z2);
        }
    }
}
