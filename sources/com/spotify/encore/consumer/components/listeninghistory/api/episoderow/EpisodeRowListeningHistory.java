package com.spotify.encore.consumer.components.listeninghistory.api.episoderow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowListeningHistory extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowListeningHistory episodeRowListeningHistory, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(episodeRowListeningHistory, nmf);
        }
    }

    public enum Events {
        RowClicked,
        ContextMenuClicked
    }

    public static final class Model {
        private final CoverArt.ImageData coverArt;
        private final String episodeTitle;
        private final boolean isPlaying;
        private final int progress;
        private final String showTitle;

        public Model(String str, String str2, CoverArt.ImageData imageData, boolean z, int i) {
            h.e(str, "episodeTitle");
            h.e(str2, "showTitle");
            h.e(imageData, "coverArt");
            this.episodeTitle = str;
            this.showTitle = str2;
            this.coverArt = imageData;
            this.isPlaying = z;
            this.progress = i;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, CoverArt.ImageData imageData, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = model.episodeTitle;
            }
            if ((i2 & 2) != 0) {
                str2 = model.showTitle;
            }
            if ((i2 & 4) != 0) {
                imageData = model.coverArt;
            }
            if ((i2 & 8) != 0) {
                z = model.isPlaying;
            }
            if ((i2 & 16) != 0) {
                i = model.progress;
            }
            return model.copy(str, str2, imageData, z, i);
        }

        public final String component1() {
            return this.episodeTitle;
        }

        public final String component2() {
            return this.showTitle;
        }

        public final CoverArt.ImageData component3() {
            return this.coverArt;
        }

        public final boolean component4() {
            return this.isPlaying;
        }

        public final int component5() {
            return this.progress;
        }

        public final Model copy(String str, String str2, CoverArt.ImageData imageData, boolean z, int i) {
            h.e(str, "episodeTitle");
            h.e(str2, "showTitle");
            h.e(imageData, "coverArt");
            return new Model(str, str2, imageData, z, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.episodeTitle, model.episodeTitle) && h.a(this.showTitle, model.showTitle) && h.a(this.coverArt, model.coverArt) && this.isPlaying == model.isPlaying && this.progress == model.progress;
        }

        public final CoverArt.ImageData getCoverArt() {
            return this.coverArt;
        }

        public final String getEpisodeTitle() {
            return this.episodeTitle;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getShowTitle() {
            return this.showTitle;
        }

        public int hashCode() {
            String str = this.episodeTitle;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.showTitle;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            CoverArt.ImageData imageData = this.coverArt;
            if (imageData != null) {
                i = imageData.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.isPlaying;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return ((i2 + i3) * 31) + this.progress;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(episodeTitle=");
            V0.append(this.episodeTitle);
            V0.append(", showTitle=");
            V0.append(this.showTitle);
            V0.append(", coverArt=");
            V0.append(this.coverArt);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", progress=");
            return je.B0(V0, this.progress, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Model(java.lang.String r7, java.lang.String r8, com.spotify.encore.consumer.elements.coverart.CoverArt.ImageData r9, boolean r10, int r11, int r12, kotlin.jvm.internal.f r13) {
            /*
                r6 = this;
                r13 = r12 & 4
                if (r13 == 0) goto L_0x000b
                com.spotify.encore.consumer.elements.coverart.CoverArt$ImageData r9 = com.spotify.encore.consumer.elements.coverart.CoverArt.NO_IMAGE
                java.lang.String r13 = "CoverArt.NO_IMAGE"
                kotlin.jvm.internal.h.d(r9, r13)
            L_0x000b:
                r3 = r9
                r9 = r12 & 8
                r13 = 0
                if (r9 == 0) goto L_0x0013
                r4 = 0
                goto L_0x0014
            L_0x0013:
                r4 = r10
            L_0x0014:
                r9 = r12 & 16
                if (r9 == 0) goto L_0x001a
                r5 = 0
                goto L_0x001b
            L_0x001a:
                r5 = r11
            L_0x001b:
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory.Model.<init>(java.lang.String, java.lang.String, com.spotify.encore.consumer.elements.coverart.CoverArt$ImageData, boolean, int, int, kotlin.jvm.internal.f):void");
        }
    }
}
