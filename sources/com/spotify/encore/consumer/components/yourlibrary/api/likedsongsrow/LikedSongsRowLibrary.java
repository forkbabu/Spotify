package com.spotify.encore.consumer.components.yourlibrary.api.likedsongsrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface LikedSongsRowLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultLikedSongsRowLibraryConfiguration implements Configuration {
            public static final DefaultLikedSongsRowLibraryConfiguration INSTANCE = new DefaultLikedSongsRowLibraryConfiguration();

            private DefaultLikedSongsRowLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(LikedSongsRowLibrary likedSongsRowLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(likedSongsRowLibrary, nmf);
        }
    }

    public enum Events {
        RowClicked,
        RowLongClicked,
        DismissClicked
    }

    public static final class Model {
        private final LibraryItemDescription.Model.LikedSongs description;
        private final DownloadState downloadState;
        private final boolean isDismissible;
        private final boolean isPinned;
        private final boolean isPlaying;
        private final String name;

        public Model(String str, LibraryItemDescription.Model.LikedSongs likedSongs, DownloadState downloadState2, boolean z, boolean z2, boolean z3) {
            h.e(str, "name");
            h.e(likedSongs, "description");
            h.e(downloadState2, "downloadState");
            this.name = str;
            this.description = likedSongs;
            this.downloadState = downloadState2;
            this.isPlaying = z;
            this.isDismissible = z2;
            this.isPinned = z3;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, LibraryItemDescription.Model.LikedSongs likedSongs, DownloadState downloadState2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                likedSongs = model.description;
            }
            if ((i & 4) != 0) {
                downloadState2 = model.downloadState;
            }
            if ((i & 8) != 0) {
                z = model.isPlaying;
            }
            if ((i & 16) != 0) {
                z2 = model.isDismissible;
            }
            if ((i & 32) != 0) {
                z3 = model.isPinned;
            }
            return model.copy(str, likedSongs, downloadState2, z, z2, z3);
        }

        public final String component1() {
            return this.name;
        }

        public final LibraryItemDescription.Model.LikedSongs component2() {
            return this.description;
        }

        public final DownloadState component3() {
            return this.downloadState;
        }

        public final boolean component4() {
            return this.isPlaying;
        }

        public final boolean component5() {
            return this.isDismissible;
        }

        public final boolean component6() {
            return this.isPinned;
        }

        public final Model copy(String str, LibraryItemDescription.Model.LikedSongs likedSongs, DownloadState downloadState2, boolean z, boolean z2, boolean z3) {
            h.e(str, "name");
            h.e(likedSongs, "description");
            h.e(downloadState2, "downloadState");
            return new Model(str, likedSongs, downloadState2, z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.description, model.description) && h.a(this.downloadState, model.downloadState) && this.isPlaying == model.isPlaying && this.isDismissible == model.isDismissible && this.isPinned == model.isPinned;
        }

        public final LibraryItemDescription.Model.LikedSongs getDescription() {
            return this.description;
        }

        public final DownloadState getDownloadState() {
            return this.downloadState;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            LibraryItemDescription.Model.LikedSongs likedSongs = this.description;
            int hashCode2 = (hashCode + (likedSongs != null ? likedSongs.hashCode() : 0)) * 31;
            DownloadState downloadState2 = this.downloadState;
            if (downloadState2 != null) {
                i = downloadState2.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.isPlaying;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isDismissible;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (i7 + i8) * 31;
            boolean z3 = this.isPinned;
            if (!z3) {
                i3 = z3 ? 1 : 0;
            }
            return i11 + i3;
        }

        public final boolean isDismissible() {
            return this.isDismissible;
        }

        public final boolean isPinned() {
            return this.isPinned;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", downloadState=");
            V0.append(this.downloadState);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", isDismissible=");
            V0.append(this.isDismissible);
            V0.append(", isPinned=");
            return je.P0(V0, this.isPinned, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, LibraryItemDescription.Model.LikedSongs likedSongs, DownloadState downloadState2, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? new LibraryItemDescription.Model.LikedSongs(0, true) : likedSongs, (i & 4) != 0 ? DownloadState.Empty : downloadState2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false);
        }
    }
}
