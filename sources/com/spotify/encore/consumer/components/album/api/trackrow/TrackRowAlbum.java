package com.spotify.encore.consumer.components.album.api.trackrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface TrackRowAlbum extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(TrackRowAlbum trackRowAlbum, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(trackRowAlbum, nmf);
        }
    }

    public static abstract class Events {

        public static final class ContextMenuClicked extends Events {
            public static final ContextMenuClicked INSTANCE = new ContextMenuClicked();

            private ContextMenuClicked() {
                super(null);
            }
        }

        public static final class RowClicked extends Events {
            public static final RowClicked INSTANCE = new RowClicked();

            private RowClicked() {
                super(null);
            }
        }

        public static final class RowLongClicked extends Events {
            public static final RowLongClicked INSTANCE = new RowLongClicked();

            private RowLongClicked() {
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
        private final List<String> artistNames;
        private final ContentRestriction contentRestriction;
        private final DownloadState downloadState;
        private final boolean hasLyrics;
        private final boolean isActive;
        private final boolean isPlayable;
        private final boolean isPremium;
        private final boolean shouldAppearDisabled;
        private final String trackName;

        public Model(String str, List<String> list, DownloadState downloadState2, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(downloadState2, "downloadState");
            h.e(contentRestriction2, "contentRestriction");
            this.trackName = str;
            this.artistNames = list;
            this.downloadState = downloadState2;
            this.contentRestriction = contentRestriction2;
            this.isActive = z;
            this.isPlayable = z2;
            this.shouldAppearDisabled = z3;
            this.isPremium = z4;
            this.hasLyrics = z5;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, List list, DownloadState downloadState2, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            return model.copy((i & 1) != 0 ? model.trackName : str, (i & 2) != 0 ? model.artistNames : list, (i & 4) != 0 ? model.downloadState : downloadState2, (i & 8) != 0 ? model.contentRestriction : contentRestriction2, (i & 16) != 0 ? model.isActive : z, (i & 32) != 0 ? model.isPlayable : z2, (i & 64) != 0 ? model.shouldAppearDisabled : z3, (i & 128) != 0 ? model.isPremium : z4, (i & 256) != 0 ? model.hasLyrics : z5);
        }

        public final String component1() {
            return this.trackName;
        }

        public final List<String> component2() {
            return this.artistNames;
        }

        public final DownloadState component3() {
            return this.downloadState;
        }

        public final ContentRestriction component4() {
            return this.contentRestriction;
        }

        public final boolean component5() {
            return this.isActive;
        }

        public final boolean component6() {
            return this.isPlayable;
        }

        public final boolean component7() {
            return this.shouldAppearDisabled;
        }

        public final boolean component8() {
            return this.isPremium;
        }

        public final boolean component9() {
            return this.hasLyrics;
        }

        public final Model copy(String str, List<String> list, DownloadState downloadState2, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(downloadState2, "downloadState");
            h.e(contentRestriction2, "contentRestriction");
            return new Model(str, list, downloadState2, contentRestriction2, z, z2, z3, z4, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.trackName, model.trackName) && h.a(this.artistNames, model.artistNames) && h.a(this.downloadState, model.downloadState) && h.a(this.contentRestriction, model.contentRestriction) && this.isActive == model.isActive && this.isPlayable == model.isPlayable && this.shouldAppearDisabled == model.shouldAppearDisabled && this.isPremium == model.isPremium && this.hasLyrics == model.hasLyrics;
        }

        public final List<String> getArtistNames() {
            return this.artistNames;
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final DownloadState getDownloadState() {
            return this.downloadState;
        }

        public final boolean getHasLyrics() {
            return this.hasLyrics;
        }

        public final boolean getShouldAppearDisabled() {
            return this.shouldAppearDisabled;
        }

        public final String getTrackName() {
            return this.trackName;
        }

        public int hashCode() {
            String str = this.trackName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.artistNames;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            DownloadState downloadState2 = this.downloadState;
            int hashCode3 = (hashCode2 + (downloadState2 != null ? downloadState2.hashCode() : 0)) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            if (contentRestriction2 != null) {
                i = contentRestriction2.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.isActive;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPlayable;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (i7 + i8) * 31;
            boolean z3 = this.shouldAppearDisabled;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z4 = this.isPremium;
            if (z4) {
                z4 = true;
            }
            int i16 = z4 ? 1 : 0;
            int i17 = z4 ? 1 : 0;
            int i18 = z4 ? 1 : 0;
            int i19 = (i15 + i16) * 31;
            boolean z5 = this.hasLyrics;
            if (!z5) {
                i3 = z5 ? 1 : 0;
            }
            return i19 + i3;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public final boolean isPremium() {
            return this.isPremium;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(trackName=");
            V0.append(this.trackName);
            V0.append(", artistNames=");
            V0.append(this.artistNames);
            V0.append(", downloadState=");
            V0.append(this.downloadState);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", isActive=");
            V0.append(this.isActive);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", shouldAppearDisabled=");
            V0.append(this.shouldAppearDisabled);
            V0.append(", isPremium=");
            V0.append(this.isPremium);
            V0.append(", hasLyrics=");
            return je.P0(V0, this.hasLyrics, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, List list, DownloadState downloadState2, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.f fVar) {
            this(str, list, (i & 4) != 0 ? DownloadState.Empty : downloadState2, (i & 8) != 0 ? ContentRestriction.None : contentRestriction2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5);
        }
    }
}
