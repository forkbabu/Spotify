package com.spotify.encore.consumer.components.api.trackrowplaylistextender;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface TrackRowPlaylistExtender extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(TrackRowPlaylistExtender trackRowPlaylistExtender, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(trackRowPlaylistExtender, nmf);
        }
    }

    public static final class Model {
        private final String addedBy;
        private final List<String> artistNames;
        private final Artwork.ImageData artwork;
        private final ContentRestriction contentRestriction;
        private final boolean isAddedToPlaylist;
        private final boolean isOffline;
        private final boolean isPlayable;
        private final boolean isPlaying;
        private final String trackName;

        public Model(String str, List<String> list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(contentRestriction2, "contentRestriction");
            this.trackName = str;
            this.artistNames = list;
            this.artwork = imageData;
            this.contentRestriction = contentRestriction2;
            this.addedBy = str2;
            this.isAddedToPlaylist = z;
            this.isPlaying = z2;
            this.isPlayable = z3;
            this.isOffline = z4;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, List list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            return model.copy((i & 1) != 0 ? model.trackName : str, (i & 2) != 0 ? model.artistNames : list, (i & 4) != 0 ? model.artwork : imageData, (i & 8) != 0 ? model.contentRestriction : contentRestriction2, (i & 16) != 0 ? model.addedBy : str2, (i & 32) != 0 ? model.isAddedToPlaylist : z, (i & 64) != 0 ? model.isPlaying : z2, (i & 128) != 0 ? model.isPlayable : z3, (i & 256) != 0 ? model.isOffline : z4);
        }

        public final String component1() {
            return this.trackName;
        }

        public final List<String> component2() {
            return this.artistNames;
        }

        public final Artwork.ImageData component3() {
            return this.artwork;
        }

        public final ContentRestriction component4() {
            return this.contentRestriction;
        }

        public final String component5() {
            return this.addedBy;
        }

        public final boolean component6() {
            return this.isAddedToPlaylist;
        }

        public final boolean component7() {
            return this.isPlaying;
        }

        public final boolean component8() {
            return this.isPlayable;
        }

        public final boolean component9() {
            return this.isOffline;
        }

        public final Model copy(String str, List<String> list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(contentRestriction2, "contentRestriction");
            return new Model(str, list, imageData, contentRestriction2, str2, z, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.trackName, model.trackName) && h.a(this.artistNames, model.artistNames) && h.a(this.artwork, model.artwork) && h.a(this.contentRestriction, model.contentRestriction) && h.a(this.addedBy, model.addedBy) && this.isAddedToPlaylist == model.isAddedToPlaylist && this.isPlaying == model.isPlaying && this.isPlayable == model.isPlayable && this.isOffline == model.isOffline;
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
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode4 = (hashCode3 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            String str2 = this.addedBy;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode4 + i) * 31;
            boolean z = this.isAddedToPlaylist;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPlaying;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (i7 + i8) * 31;
            boolean z3 = this.isPlayable;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z4 = this.isOffline;
            if (!z4) {
                i3 = z4 ? 1 : 0;
            }
            return i15 + i3;
        }

        public final boolean isAddedToPlaylist() {
            return this.isAddedToPlaylist;
        }

        public final boolean isOffline() {
            return this.isOffline;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(trackName=");
            V0.append(this.trackName);
            V0.append(", artistNames=");
            V0.append(this.artistNames);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", addedBy=");
            V0.append(this.addedBy);
            V0.append(", isAddedToPlaylist=");
            V0.append(this.isAddedToPlaylist);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isOffline=");
            return je.P0(V0, this.isOffline, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, List list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? EmptyList.a : list, (i & 4) != 0 ? new Artwork.ImageData(null) : imageData, (i & 8) != 0 ? ContentRestriction.None : contentRestriction2, (i & 16) == 0 ? str2 : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? true : z3, (i & 256) == 0 ? z4 : false);
        }
    }
}
