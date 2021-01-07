package com.spotify.encore.consumer.components.podcast.api.episoderow;

import com.spotify.encore.consumer.elements.addtobutton.AddToButtonState;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class EpisodeRowQuickAction {
    private final boolean isEnabled;

    public static final class AddToYourEpisodes extends EpisodeRowQuickAction {
        private final AddToButtonState data;
        private final boolean isEnabled;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AddToYourEpisodes(AddToButtonState addToButtonState, boolean z, int i, f fVar) {
            this(addToButtonState, (i & 2) != 0 ? true : z);
        }

        public static /* synthetic */ AddToYourEpisodes copy$default(AddToYourEpisodes addToYourEpisodes, AddToButtonState addToButtonState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                addToButtonState = addToYourEpisodes.data;
            }
            if ((i & 2) != 0) {
                z = addToYourEpisodes.isEnabled();
            }
            return addToYourEpisodes.copy(addToButtonState, z);
        }

        public final AddToButtonState component1() {
            return this.data;
        }

        public final boolean component2() {
            return isEnabled();
        }

        public final AddToYourEpisodes copy(AddToButtonState addToButtonState, boolean z) {
            h.e(addToButtonState, "data");
            return new AddToYourEpisodes(addToButtonState, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddToYourEpisodes)) {
                return false;
            }
            AddToYourEpisodes addToYourEpisodes = (AddToYourEpisodes) obj;
            return h.a(this.data, addToYourEpisodes.data) && isEnabled() == addToYourEpisodes.isEnabled();
        }

        public final AddToButtonState getData() {
            return this.data;
        }

        public int hashCode() {
            AddToButtonState addToButtonState = this.data;
            int hashCode = (addToButtonState != null ? addToButtonState.hashCode() : 0) * 31;
            boolean isEnabled2 = isEnabled();
            if (isEnabled2) {
                isEnabled2 = true;
            }
            int i = isEnabled2 ? 1 : 0;
            int i2 = isEnabled2 ? 1 : 0;
            int i3 = isEnabled2 ? 1 : 0;
            return hashCode + i;
        }

        @Override // com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction
        public boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddToYourEpisodes(data=");
            V0.append(this.data);
            V0.append(", isEnabled=");
            V0.append(isEnabled());
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddToYourEpisodes(AddToButtonState addToButtonState, boolean z) {
            super(z, null);
            h.e(addToButtonState, "data");
            this.data = addToButtonState;
            this.isEnabled = z;
        }
    }

    public static final class ContextMenu extends EpisodeRowQuickAction {
        private final String episodeName;
        private final boolean isEnabled;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ContextMenu(String str, boolean z, int i, f fVar) {
            this(str, (i & 2) != 0 ? true : z);
        }

        public static /* synthetic */ ContextMenu copy$default(ContextMenu contextMenu, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contextMenu.episodeName;
            }
            if ((i & 2) != 0) {
                z = contextMenu.isEnabled();
            }
            return contextMenu.copy(str, z);
        }

        public final String component1() {
            return this.episodeName;
        }

        public final boolean component2() {
            return isEnabled();
        }

        public final ContextMenu copy(String str, boolean z) {
            h.e(str, "episodeName");
            return new ContextMenu(str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContextMenu)) {
                return false;
            }
            ContextMenu contextMenu = (ContextMenu) obj;
            return h.a(this.episodeName, contextMenu.episodeName) && isEnabled() == contextMenu.isEnabled();
        }

        public final String getEpisodeName() {
            return this.episodeName;
        }

        public int hashCode() {
            String str = this.episodeName;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean isEnabled2 = isEnabled();
            if (isEnabled2) {
                isEnabled2 = true;
            }
            int i = isEnabled2 ? 1 : 0;
            int i2 = isEnabled2 ? 1 : 0;
            int i3 = isEnabled2 ? 1 : 0;
            return hashCode + i;
        }

        @Override // com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction
        public boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ContextMenu(episodeName=");
            V0.append(this.episodeName);
            V0.append(", isEnabled=");
            V0.append(isEnabled());
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContextMenu(String str, boolean z) {
            super(z, null);
            h.e(str, "episodeName");
            this.episodeName = str;
            this.isEnabled = z;
        }
    }

    public static final class MarkAsPlayed extends EpisodeRowQuickAction {
        private final String episodeName;
        private final boolean isEnabled;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MarkAsPlayed(String str, boolean z, int i, f fVar) {
            this(str, (i & 2) != 0 ? true : z);
        }

        public static /* synthetic */ MarkAsPlayed copy$default(MarkAsPlayed markAsPlayed, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markAsPlayed.episodeName;
            }
            if ((i & 2) != 0) {
                z = markAsPlayed.isEnabled();
            }
            return markAsPlayed.copy(str, z);
        }

        public final String component1() {
            return this.episodeName;
        }

        public final boolean component2() {
            return isEnabled();
        }

        public final MarkAsPlayed copy(String str, boolean z) {
            h.e(str, "episodeName");
            return new MarkAsPlayed(str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarkAsPlayed)) {
                return false;
            }
            MarkAsPlayed markAsPlayed = (MarkAsPlayed) obj;
            return h.a(this.episodeName, markAsPlayed.episodeName) && isEnabled() == markAsPlayed.isEnabled();
        }

        public final String getEpisodeName() {
            return this.episodeName;
        }

        public int hashCode() {
            String str = this.episodeName;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean isEnabled2 = isEnabled();
            if (isEnabled2) {
                isEnabled2 = true;
            }
            int i = isEnabled2 ? 1 : 0;
            int i2 = isEnabled2 ? 1 : 0;
            int i3 = isEnabled2 ? 1 : 0;
            return hashCode + i;
        }

        @Override // com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction
        public boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MarkAsPlayed(episodeName=");
            V0.append(this.episodeName);
            V0.append(", isEnabled=");
            V0.append(isEnabled());
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MarkAsPlayed(String str, boolean z) {
            super(z, null);
            h.e(str, "episodeName");
            this.episodeName = str;
            this.isEnabled = z;
        }
    }

    public static final class None extends EpisodeRowQuickAction {
        public static final None INSTANCE = new None();

        private None() {
            super(false, null);
        }
    }

    private EpisodeRowQuickAction(boolean z) {
        this.isEnabled = z;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public static final class Download extends EpisodeRowQuickAction {
        private final DownloadState data;
        private final boolean isEnabled;

        public Download() {
            this(null, false, 3, null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Download(DownloadState downloadState, boolean z, int i, f fVar) {
            this((i & 1) != 0 ? DownloadState.Downloadable.INSTANCE : downloadState, (i & 2) != 0 ? true : z);
        }

        public static /* synthetic */ Download copy$default(Download download, DownloadState downloadState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadState = download.data;
            }
            if ((i & 2) != 0) {
                z = download.isEnabled();
            }
            return download.copy(downloadState, z);
        }

        public final DownloadState component1() {
            return this.data;
        }

        public final boolean component2() {
            return isEnabled();
        }

        public final Download copy(DownloadState downloadState, boolean z) {
            h.e(downloadState, "data");
            return new Download(downloadState, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Download)) {
                return false;
            }
            Download download = (Download) obj;
            return h.a(this.data, download.data) && isEnabled() == download.isEnabled();
        }

        public final DownloadState getData() {
            return this.data;
        }

        public int hashCode() {
            DownloadState downloadState = this.data;
            int hashCode = (downloadState != null ? downloadState.hashCode() : 0) * 31;
            boolean isEnabled2 = isEnabled();
            if (isEnabled2) {
                isEnabled2 = true;
            }
            int i = isEnabled2 ? 1 : 0;
            int i2 = isEnabled2 ? 1 : 0;
            int i3 = isEnabled2 ? 1 : 0;
            return hashCode + i;
        }

        @Override // com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction
        public boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Download(data=");
            V0.append(this.data);
            V0.append(", isEnabled=");
            V0.append(isEnabled());
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Download(DownloadState downloadState, boolean z) {
            super(z, null);
            h.e(downloadState, "data");
            this.data = downloadState;
            this.isEnabled = z;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ EpisodeRowQuickAction(boolean z, int i, f fVar) {
        this((i & 1) != 0 ? true : z);
    }

    public /* synthetic */ EpisodeRowQuickAction(boolean z, f fVar) {
        this(z);
    }
}
