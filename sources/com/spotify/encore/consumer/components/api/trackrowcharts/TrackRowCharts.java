package com.spotify.encore.consumer.components.api.trackrowcharts;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.quickactions.Action;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface TrackRowCharts extends Component<Model, Events> {

    public enum ChartEntryStatus {
        UP,
        DOWN,
        NEW,
        NONE
    }

    public static final class DefaultImpls {
        public static void onEvent(TrackRowCharts trackRowCharts, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(trackRowCharts, nmf);
        }
    }

    public enum Events {
        RowClicked,
        RowLongClicked,
        ContextMenuClicked,
        HeartClicked,
        HideClicked,
        BanClicked
    }

    public static final class Model {
        private final Action action;
        private final List<String> artistNames;
        private final Artwork.ImageData artwork;
        private final ChartEntryStatus chartEntryStatus;
        private final ContentRestriction contentRestriction;
        private final DownloadState downloadState;
        private final boolean hasLyrics;
        private final boolean isPlayable;
        private final boolean isPlaying;
        private final boolean isPremium;
        private final int rowNumber;
        private final String trackName;

        public Model(int i, String str, List<String> list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2, ChartEntryStatus chartEntryStatus2, Action action2) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(contentRestriction2, "contentRestriction");
            h.e(downloadState2, "downloadState");
            h.e(chartEntryStatus2, "chartEntryStatus");
            h.e(action2, "action");
            this.rowNumber = i;
            this.trackName = str;
            this.artistNames = list;
            this.artwork = imageData;
            this.contentRestriction = contentRestriction2;
            this.isPlaying = z;
            this.isPlayable = z2;
            this.isPremium = z3;
            this.hasLyrics = z4;
            this.downloadState = downloadState2;
            this.chartEntryStatus = chartEntryStatus2;
            this.action = action2;
        }

        public static /* synthetic */ Model copy$default(Model model, int i, String str, List list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2, ChartEntryStatus chartEntryStatus2, Action action2, int i2, Object obj) {
            return model.copy((i2 & 1) != 0 ? model.rowNumber : i, (i2 & 2) != 0 ? model.trackName : str, (i2 & 4) != 0 ? model.artistNames : list, (i2 & 8) != 0 ? model.artwork : imageData, (i2 & 16) != 0 ? model.contentRestriction : contentRestriction2, (i2 & 32) != 0 ? model.isPlaying : z, (i2 & 64) != 0 ? model.isPlayable : z2, (i2 & 128) != 0 ? model.isPremium : z3, (i2 & 256) != 0 ? model.hasLyrics : z4, (i2 & 512) != 0 ? model.downloadState : downloadState2, (i2 & 1024) != 0 ? model.chartEntryStatus : chartEntryStatus2, (i2 & 2048) != 0 ? model.action : action2);
        }

        public final int component1() {
            return this.rowNumber;
        }

        public final DownloadState component10() {
            return this.downloadState;
        }

        public final ChartEntryStatus component11() {
            return this.chartEntryStatus;
        }

        public final Action component12() {
            return this.action;
        }

        public final String component2() {
            return this.trackName;
        }

        public final List<String> component3() {
            return this.artistNames;
        }

        public final Artwork.ImageData component4() {
            return this.artwork;
        }

        public final ContentRestriction component5() {
            return this.contentRestriction;
        }

        public final boolean component6() {
            return this.isPlaying;
        }

        public final boolean component7() {
            return this.isPlayable;
        }

        public final boolean component8() {
            return this.isPremium;
        }

        public final boolean component9() {
            return this.hasLyrics;
        }

        public final Model copy(int i, String str, List<String> list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2, ChartEntryStatus chartEntryStatus2, Action action2) {
            h.e(str, "trackName");
            h.e(list, "artistNames");
            h.e(imageData, "artwork");
            h.e(contentRestriction2, "contentRestriction");
            h.e(downloadState2, "downloadState");
            h.e(chartEntryStatus2, "chartEntryStatus");
            h.e(action2, "action");
            return new Model(i, str, list, imageData, contentRestriction2, z, z2, z3, z4, downloadState2, chartEntryStatus2, action2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.rowNumber == model.rowNumber && h.a(this.trackName, model.trackName) && h.a(this.artistNames, model.artistNames) && h.a(this.artwork, model.artwork) && h.a(this.contentRestriction, model.contentRestriction) && this.isPlaying == model.isPlaying && this.isPlayable == model.isPlayable && this.isPremium == model.isPremium && this.hasLyrics == model.hasLyrics && h.a(this.downloadState, model.downloadState) && h.a(this.chartEntryStatus, model.chartEntryStatus) && h.a(this.action, model.action);
        }

        public final Action getAction() {
            return this.action;
        }

        public final List<String> getArtistNames() {
            return this.artistNames;
        }

        public final Artwork.ImageData getArtwork() {
            return this.artwork;
        }

        public final ChartEntryStatus getChartEntryStatus() {
            return this.chartEntryStatus;
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

        public final int getRowNumber() {
            return this.rowNumber;
        }

        public final String getTrackName() {
            return this.trackName;
        }

        public int hashCode() {
            int i = this.rowNumber * 31;
            String str = this.trackName;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            List<String> list = this.artistNames;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            Artwork.ImageData imageData = this.artwork;
            int hashCode3 = (hashCode2 + (imageData != null ? imageData.hashCode() : 0)) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode4 = (hashCode3 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            boolean z = this.isPlaying;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (hashCode4 + i4) * 31;
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
            int i16 = (i15 + i3) * 31;
            DownloadState downloadState2 = this.downloadState;
            int hashCode5 = (i16 + (downloadState2 != null ? downloadState2.hashCode() : 0)) * 31;
            ChartEntryStatus chartEntryStatus2 = this.chartEntryStatus;
            int hashCode6 = (hashCode5 + (chartEntryStatus2 != null ? chartEntryStatus2.hashCode() : 0)) * 31;
            Action action2 = this.action;
            if (action2 != null) {
                i2 = action2.hashCode();
            }
            return hashCode6 + i2;
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
            StringBuilder V0 = je.V0("Model(rowNumber=");
            V0.append(this.rowNumber);
            V0.append(", trackName=");
            V0.append(this.trackName);
            V0.append(", artistNames=");
            V0.append(this.artistNames);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isPremium=");
            V0.append(this.isPremium);
            V0.append(", hasLyrics=");
            V0.append(this.hasLyrics);
            V0.append(", downloadState=");
            V0.append(this.downloadState);
            V0.append(", chartEntryStatus=");
            V0.append(this.chartEntryStatus);
            V0.append(", action=");
            V0.append(this.action);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(int i, String str, List list, Artwork.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2, ChartEntryStatus chartEntryStatus2, Action action2, int i2, kotlin.jvm.internal.f fVar) {
            this(i, str, (i2 & 4) != 0 ? EmptyList.a : list, (i2 & 8) != 0 ? new Artwork.ImageData(null) : imageData, (i2 & 16) != 0 ? ContentRestriction.None : contentRestriction2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? DownloadState.Empty : downloadState2, (i2 & 1024) != 0 ? ChartEntryStatus.NONE : chartEntryStatus2, (i2 & 2048) != 0 ? Action.None.INSTANCE : action2);
        }
    }
}
