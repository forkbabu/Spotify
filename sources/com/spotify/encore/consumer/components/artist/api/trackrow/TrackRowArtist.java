package com.spotify.encore.consumer.components.artist.api.trackrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface TrackRowArtist extends Component<Model, Event> {

    public static final class DefaultImpls {
        public static void onEvent(TrackRowArtist trackRowArtist, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(trackRowArtist, nmf);
        }
    }

    public static final class Model {
        private final ContentRestriction contentRestriction;
        private final CoverArt.ImageData coverArt;
        private final DownloadState downloadState;
        private final boolean hasLyrics;
        private final boolean isActive;
        private final boolean isPlayable;
        private final boolean isPremium;
        private final String numListeners;
        private final int rowNumber;
        private final String trackName;

        public Model(int i, String str, String str2, CoverArt.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2) {
            h.e(str, "trackName");
            h.e(str2, "numListeners");
            h.e(imageData, "coverArt");
            h.e(contentRestriction2, "contentRestriction");
            h.e(downloadState2, "downloadState");
            this.rowNumber = i;
            this.trackName = str;
            this.numListeners = str2;
            this.coverArt = imageData;
            this.contentRestriction = contentRestriction2;
            this.isActive = z;
            this.isPlayable = z2;
            this.isPremium = z3;
            this.hasLyrics = z4;
            this.downloadState = downloadState2;
        }

        public static /* synthetic */ Model copy$default(Model model, int i, String str, String str2, CoverArt.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2, int i2, Object obj) {
            return model.copy((i2 & 1) != 0 ? model.rowNumber : i, (i2 & 2) != 0 ? model.trackName : str, (i2 & 4) != 0 ? model.numListeners : str2, (i2 & 8) != 0 ? model.coverArt : imageData, (i2 & 16) != 0 ? model.contentRestriction : contentRestriction2, (i2 & 32) != 0 ? model.isActive : z, (i2 & 64) != 0 ? model.isPlayable : z2, (i2 & 128) != 0 ? model.isPremium : z3, (i2 & 256) != 0 ? model.hasLyrics : z4, (i2 & 512) != 0 ? model.downloadState : downloadState2);
        }

        public final int component1() {
            return this.rowNumber;
        }

        public final DownloadState component10() {
            return this.downloadState;
        }

        public final String component2() {
            return this.trackName;
        }

        public final String component3() {
            return this.numListeners;
        }

        public final CoverArt.ImageData component4() {
            return this.coverArt;
        }

        public final ContentRestriction component5() {
            return this.contentRestriction;
        }

        public final boolean component6() {
            return this.isActive;
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

        public final Model copy(int i, String str, String str2, CoverArt.ImageData imageData, ContentRestriction contentRestriction2, boolean z, boolean z2, boolean z3, boolean z4, DownloadState downloadState2) {
            h.e(str, "trackName");
            h.e(str2, "numListeners");
            h.e(imageData, "coverArt");
            h.e(contentRestriction2, "contentRestriction");
            h.e(downloadState2, "downloadState");
            return new Model(i, str, str2, imageData, contentRestriction2, z, z2, z3, z4, downloadState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.rowNumber == model.rowNumber && h.a(this.trackName, model.trackName) && h.a(this.numListeners, model.numListeners) && h.a(this.coverArt, model.coverArt) && h.a(this.contentRestriction, model.contentRestriction) && this.isActive == model.isActive && this.isPlayable == model.isPlayable && this.isPremium == model.isPremium && this.hasLyrics == model.hasLyrics && h.a(this.downloadState, model.downloadState);
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final CoverArt.ImageData getCoverArt() {
            return this.coverArt;
        }

        public final DownloadState getDownloadState() {
            return this.downloadState;
        }

        public final boolean getHasLyrics() {
            return this.hasLyrics;
        }

        public final String getNumListeners() {
            return this.numListeners;
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
            String str2 = this.numListeners;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            CoverArt.ImageData imageData = this.coverArt;
            int hashCode3 = (hashCode2 + (imageData != null ? imageData.hashCode() : 0)) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode4 = (hashCode3 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            boolean z = this.isActive;
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
            if (downloadState2 != null) {
                i2 = downloadState2.hashCode();
            }
            return i16 + i2;
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
            StringBuilder V0 = je.V0("Model(rowNumber=");
            V0.append(this.rowNumber);
            V0.append(", trackName=");
            V0.append(this.trackName);
            V0.append(", numListeners=");
            V0.append(this.numListeners);
            V0.append(", coverArt=");
            V0.append(this.coverArt);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", isActive=");
            V0.append(this.isActive);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isPremium=");
            V0.append(this.isPremium);
            V0.append(", hasLyrics=");
            V0.append(this.hasLyrics);
            V0.append(", downloadState=");
            V0.append(this.downloadState);
            V0.append(")");
            return V0.toString();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Model(int r15, java.lang.String r16, java.lang.String r17, com.spotify.encore.consumer.elements.coverart.CoverArt.ImageData r18, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r19, boolean r20, boolean r21, boolean r22, boolean r23, com.spotify.encore.consumer.elements.badge.download.DownloadState r24, int r25, kotlin.jvm.internal.f r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 8
                if (r1 == 0) goto L_0x000f
                com.spotify.encore.consumer.elements.coverart.CoverArt$ImageData r1 = com.spotify.encore.consumer.elements.coverart.CoverArt.NO_IMAGE
                java.lang.String r2 = "CoverArt.NO_IMAGE"
                kotlin.jvm.internal.h.d(r1, r2)
                r7 = r1
                goto L_0x0011
            L_0x000f:
                r7 = r18
            L_0x0011:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r1 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.None
                r8 = r1
                goto L_0x001b
            L_0x0019:
                r8 = r19
            L_0x001b:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L_0x0022
                r9 = 0
                goto L_0x0024
            L_0x0022:
                r9 = r20
            L_0x0024:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002b
                r1 = 1
                r10 = 1
                goto L_0x002d
            L_0x002b:
                r10 = r21
            L_0x002d:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0033
                r11 = 0
                goto L_0x0035
            L_0x0033:
                r11 = r22
            L_0x0035:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003b
                r12 = 0
                goto L_0x003d
            L_0x003b:
                r12 = r23
            L_0x003d:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0045
                com.spotify.encore.consumer.elements.badge.download.DownloadState r0 = com.spotify.encore.consumer.elements.badge.download.DownloadState.Empty
                r13 = r0
                goto L_0x0047
            L_0x0045:
                r13 = r24
            L_0x0047:
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist.Model.<init>(int, java.lang.String, java.lang.String, com.spotify.encore.consumer.elements.coverart.CoverArt$ImageData, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction, boolean, boolean, boolean, boolean, com.spotify.encore.consumer.elements.badge.download.DownloadState, int, kotlin.jvm.internal.f):void");
        }
    }
}
