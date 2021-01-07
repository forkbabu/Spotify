package com.spotify.encore.consumer.components.api.trackrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.quickactions.Action;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface TrackRow extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(TrackRow trackRow, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(trackRow, nmf);
        }
    }

    public enum Events {
        RowClicked,
        RowLongClicked,
        ContextMenuClicked,
        HeartClicked,
        HideClicked,
        BanClicked,
        ProfileClicked
    }

    public static final class Model {
        private final Action action;
        private final String addedBy;
        private final List<String> artistNames;
        private final Artwork.ImageData artwork;
        private final ContentRestriction contentRestriction;
        private final DownloadState downloadState;
        private final boolean hasLyrics;
        private final boolean isPlayable;
        private final boolean isPlaying;
        private final boolean isPremium;
        private final String trackName;

        public Model(String str, List<String> list, Artwork.ImageData imageData, DownloadState downloadState2, ContentRestriction contentRestriction2, String str2, Action action2, boolean z, boolean z2, boolean z3, boolean z4) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(downloadState2, "downloadState");
            h.e(contentRestriction2, "contentRestriction");
            h.e(action2, "action");
            this.trackName = str;
            this.artistNames = list;
            this.artwork = imageData;
            this.downloadState = downloadState2;
            this.contentRestriction = contentRestriction2;
            this.addedBy = str2;
            this.action = action2;
            this.isPlaying = z;
            this.isPlayable = z2;
            this.isPremium = z3;
            this.hasLyrics = z4;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, List list, Artwork.ImageData imageData, DownloadState downloadState2, ContentRestriction contentRestriction2, String str2, Action action2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            return model.copy((i & 1) != 0 ? model.trackName : str, (i & 2) != 0 ? model.artistNames : list, (i & 4) != 0 ? model.artwork : imageData, (i & 8) != 0 ? model.downloadState : downloadState2, (i & 16) != 0 ? model.contentRestriction : contentRestriction2, (i & 32) != 0 ? model.addedBy : str2, (i & 64) != 0 ? model.action : action2, (i & 128) != 0 ? model.isPlaying : z, (i & 256) != 0 ? model.isPlayable : z2, (i & 512) != 0 ? model.isPremium : z3, (i & 1024) != 0 ? model.hasLyrics : z4);
        }

        public final String component1() {
            return this.trackName;
        }

        public final boolean component10() {
            return this.isPremium;
        }

        public final boolean component11() {
            return this.hasLyrics;
        }

        public final List<String> component2() {
            return this.artistNames;
        }

        public final Artwork.ImageData component3() {
            return this.artwork;
        }

        public final DownloadState component4() {
            return this.downloadState;
        }

        public final ContentRestriction component5() {
            return this.contentRestriction;
        }

        public final String component6() {
            return this.addedBy;
        }

        public final Action component7() {
            return this.action;
        }

        public final boolean component8() {
            return this.isPlaying;
        }

        public final boolean component9() {
            return this.isPlayable;
        }

        public final Model copy(String str, List<String> list, Artwork.ImageData imageData, DownloadState downloadState2, ContentRestriction contentRestriction2, String str2, Action action2, boolean z, boolean z2, boolean z3, boolean z4) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(downloadState2, "downloadState");
            h.e(contentRestriction2, "contentRestriction");
            h.e(action2, "action");
            return new Model(str, list, imageData, downloadState2, contentRestriction2, str2, action2, z, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.trackName, model.trackName) && h.a(this.artistNames, model.artistNames) && h.a(this.artwork, model.artwork) && h.a(this.downloadState, model.downloadState) && h.a(this.contentRestriction, model.contentRestriction) && h.a(this.addedBy, model.addedBy) && h.a(this.action, model.action) && this.isPlaying == model.isPlaying && this.isPlayable == model.isPlayable && this.isPremium == model.isPremium && this.hasLyrics == model.hasLyrics;
        }

        public final Action getAction() {
            return this.action;
        }

        public final String getAddedBy() {
            return this.addedBy;
        }

        public final List<String> getArtistNames() {
            return this.artistNames;
        }

        public final Artwork.ImageData getArtwork() {
            return this.artwork;
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

        public final String getTrackName() {
            return this.trackName;
        }

        public int hashCode() {
            String str = this.trackName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.artistNames;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            Artwork.ImageData imageData = this.artwork;
            int hashCode3 = (hashCode2 + (imageData != null ? imageData.hashCode() : 0)) * 31;
            DownloadState downloadState2 = this.downloadState;
            int hashCode4 = (hashCode3 + (downloadState2 != null ? downloadState2.hashCode() : 0)) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode5 = (hashCode4 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            String str2 = this.addedBy;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Action action2 = this.action;
            if (action2 != null) {
                i = action2.hashCode();
            }
            int i2 = (hashCode6 + i) * 31;
            boolean z = this.isPlaying;
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
            boolean z3 = this.isPremium;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z4 = this.hasLyrics;
            if (!z4) {
                i3 = z4 ? 1 : 0;
            }
            return i15 + i3;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public final boolean isPremium() {
            return this.isPremium;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(trackName=");
            V0.append(this.trackName);
            V0.append(", artistNames=");
            V0.append(this.artistNames);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(", downloadState=");
            V0.append(this.downloadState);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", addedBy=");
            V0.append(this.addedBy);
            V0.append(", action=");
            V0.append(this.action);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isPremium=");
            V0.append(this.isPremium);
            V0.append(", hasLyrics=");
            return je.P0(V0, this.hasLyrics, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, List list, Artwork.ImageData imageData, DownloadState downloadState2, ContentRestriction contentRestriction2, String str2, Action action2, boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? new Artwork.ImageData(null) : imageData, (i & 8) != 0 ? DownloadState.Empty : downloadState2, (i & 16) != 0 ? ContentRestriction.None : contentRestriction2, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? Action.None.INSTANCE : action2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? false : z3, (i & 1024) == 0 ? z4 : false);
        }
    }
}
