package com.spotify.encore.consumer.components.podcast.api.episoderow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowYourLibrary extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultEpisodeRowYourLibraryConfiguration implements Configuration {
            public static final DefaultEpisodeRowYourLibraryConfiguration INSTANCE = new DefaultEpisodeRowYourLibraryConfiguration();

            private DefaultEpisodeRowYourLibraryConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowYourLibrary episodeRowYourLibrary, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(episodeRowYourLibrary, nmf);
        }
    }

    public enum Events {
        RowClicked,
        RowLongClicked,
        ContextMenuClicked,
        PlayClicked,
        DownloadClicked,
        MarkAsPlayedClicked
    }

    public static final class Model {
        private final String artworkUri;
        private final boolean canMarkAsPlayed;
        private final ContentRestriction contentRestriction;
        private final String description;
        private final DownloadButton.Model downloadModel;
        private final boolean isPlayable;
        private final boolean isPlayed;
        private final long lengthInMillis;
        private final EpisodePlayState playState;
        private final long progressInMillis;
        private final String publishDateLabel;
        private final String publisher;
        private final boolean showBottomDivider;
        private final String title;

        public Model(String str, String str2, String str3, String str4, long j, long j2, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, DownloadButton.Model model, String str5, boolean z3, boolean z4) {
            h.e(str, "title");
            h.e(str2, "publisher");
            h.e(str3, "description");
            h.e(str4, "publishDateLabel");
            h.e(contentRestriction2, "contentRestriction");
            h.e(episodePlayState, "playState");
            h.e(model, "downloadModel");
            this.title = str;
            this.publisher = str2;
            this.description = str3;
            this.publishDateLabel = str4;
            this.lengthInMillis = j;
            this.progressInMillis = j2;
            this.isPlayed = z;
            this.contentRestriction = contentRestriction2;
            this.isPlayable = z2;
            this.playState = episodePlayState;
            this.downloadModel = model;
            this.artworkUri = str5;
            this.showBottomDivider = z3;
            this.canMarkAsPlayed = z4;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, String str4, long j, long j2, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, DownloadButton.Model model2, String str5, boolean z3, boolean z4, int i, Object obj) {
            return model.copy((i & 1) != 0 ? model.title : str, (i & 2) != 0 ? model.publisher : str2, (i & 4) != 0 ? model.description : str3, (i & 8) != 0 ? model.publishDateLabel : str4, (i & 16) != 0 ? model.lengthInMillis : j, (i & 32) != 0 ? model.progressInMillis : j2, (i & 64) != 0 ? model.isPlayed : z, (i & 128) != 0 ? model.contentRestriction : contentRestriction2, (i & 256) != 0 ? model.isPlayable : z2, (i & 512) != 0 ? model.playState : episodePlayState, (i & 1024) != 0 ? model.downloadModel : model2, (i & 2048) != 0 ? model.artworkUri : str5, (i & 4096) != 0 ? model.showBottomDivider : z3, (i & 8192) != 0 ? model.canMarkAsPlayed : z4);
        }

        public final String component1() {
            return this.title;
        }

        public final EpisodePlayState component10() {
            return this.playState;
        }

        public final DownloadButton.Model component11() {
            return this.downloadModel;
        }

        public final String component12() {
            return this.artworkUri;
        }

        public final boolean component13() {
            return this.showBottomDivider;
        }

        public final boolean component14() {
            return this.canMarkAsPlayed;
        }

        public final String component2() {
            return this.publisher;
        }

        public final String component3() {
            return this.description;
        }

        public final String component4() {
            return this.publishDateLabel;
        }

        public final long component5() {
            return this.lengthInMillis;
        }

        public final long component6() {
            return this.progressInMillis;
        }

        public final boolean component7() {
            return this.isPlayed;
        }

        public final ContentRestriction component8() {
            return this.contentRestriction;
        }

        public final boolean component9() {
            return this.isPlayable;
        }

        public final Model copy(String str, String str2, String str3, String str4, long j, long j2, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, DownloadButton.Model model, String str5, boolean z3, boolean z4) {
            h.e(str, "title");
            h.e(str2, "publisher");
            h.e(str3, "description");
            h.e(str4, "publishDateLabel");
            h.e(contentRestriction2, "contentRestriction");
            h.e(episodePlayState, "playState");
            h.e(model, "downloadModel");
            return new Model(str, str2, str3, str4, j, j2, z, contentRestriction2, z2, episodePlayState, model, str5, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.publisher, model.publisher) && h.a(this.description, model.description) && h.a(this.publishDateLabel, model.publishDateLabel) && this.lengthInMillis == model.lengthInMillis && this.progressInMillis == model.progressInMillis && this.isPlayed == model.isPlayed && h.a(this.contentRestriction, model.contentRestriction) && this.isPlayable == model.isPlayable && h.a(this.playState, model.playState) && h.a(this.downloadModel, model.downloadModel) && h.a(this.artworkUri, model.artworkUri) && this.showBottomDivider == model.showBottomDivider && this.canMarkAsPlayed == model.canMarkAsPlayed;
        }

        public final String getArtworkUri() {
            return this.artworkUri;
        }

        public final boolean getCanMarkAsPlayed() {
            return this.canMarkAsPlayed;
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final String getDescription() {
            return this.description;
        }

        public final DownloadButton.Model getDownloadModel() {
            return this.downloadModel;
        }

        public final long getLengthInMillis() {
            return this.lengthInMillis;
        }

        public final EpisodePlayState getPlayState() {
            return this.playState;
        }

        public final long getProgressInMillis() {
            return this.progressInMillis;
        }

        public final String getPublishDateLabel() {
            return this.publishDateLabel;
        }

        public final String getPublisher() {
            return this.publisher;
        }

        public final boolean getShowBottomDivider() {
            return this.showBottomDivider;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.publisher;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.description;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.publishDateLabel;
            int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + e.a(this.lengthInMillis)) * 31) + e.a(this.progressInMillis)) * 31;
            boolean z = this.isPlayed;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode4 + i3) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode5 = (i6 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            boolean z2 = this.isPlayable;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (hashCode5 + i7) * 31;
            EpisodePlayState episodePlayState = this.playState;
            int hashCode6 = (i10 + (episodePlayState != null ? episodePlayState.hashCode() : 0)) * 31;
            DownloadButton.Model model = this.downloadModel;
            int hashCode7 = (hashCode6 + (model != null ? model.hashCode() : 0)) * 31;
            String str5 = this.artworkUri;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i11 = (hashCode7 + i) * 31;
            boolean z3 = this.showBottomDivider;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z4 = this.canMarkAsPlayed;
            if (!z4) {
                i2 = z4 ? 1 : 0;
            }
            return i15 + i2;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public final boolean isPlayed() {
            return this.isPlayed;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", publisher=");
            V0.append(this.publisher);
            V0.append(", description=");
            V0.append(this.description);
            V0.append(", publishDateLabel=");
            V0.append(this.publishDateLabel);
            V0.append(", lengthInMillis=");
            V0.append(this.lengthInMillis);
            V0.append(", progressInMillis=");
            V0.append(this.progressInMillis);
            V0.append(", isPlayed=");
            V0.append(this.isPlayed);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", playState=");
            V0.append(this.playState);
            V0.append(", downloadModel=");
            V0.append(this.downloadModel);
            V0.append(", artworkUri=");
            V0.append(this.artworkUri);
            V0.append(", showBottomDivider=");
            V0.append(this.showBottomDivider);
            V0.append(", canMarkAsPlayed=");
            return je.P0(V0, this.canMarkAsPlayed, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Model(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, long r23, boolean r25, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r26, boolean r27, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState r28, com.spotify.encore.consumer.elements.downloadbutton.DownloadButton.Model r29, java.lang.String r30, boolean r31, boolean r32, int r33, kotlin.jvm.internal.f r34) {
            /*
                r16 = this;
                r0 = r33
                r1 = r0 & 2
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000c
            L_0x000a:
                r1 = r18
            L_0x000c:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0012
                r3 = r2
                goto L_0x0014
            L_0x0012:
                r3 = r19
            L_0x0014:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = r20
            L_0x001b:
                r4 = r0 & 16
                r5 = 0
                if (r4 == 0) goto L_0x0023
                r7 = r5
                goto L_0x0025
            L_0x0023:
                r7 = r21
            L_0x0025:
                r4 = r0 & 32
                if (r4 == 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = r23
            L_0x002c:
                r4 = r0 & 64
                if (r4 == 0) goto L_0x0032
                r4 = 0
                goto L_0x0034
            L_0x0032:
                r4 = r25
            L_0x0034:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x003b
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r10 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.None
                goto L_0x003d
            L_0x003b:
                r10 = r26
            L_0x003d:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x0043
                r11 = 1
                goto L_0x0045
            L_0x0043:
                r11 = r27
            L_0x0045:
                r13 = r0 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L_0x004c
                com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState r13 = com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState.Paused
                goto L_0x004e
            L_0x004c:
                r13 = r28
            L_0x004e:
                r14 = r0 & 1024(0x400, float:1.435E-42)
                r15 = 0
                if (r14 == 0) goto L_0x005c
                com.spotify.encore.consumer.elements.downloadbutton.DownloadButton$Model r14 = new com.spotify.encore.consumer.elements.downloadbutton.DownloadButton$Model
                com.spotify.encore.consumer.elements.downloadbutton.DownloadState$Downloadable r9 = com.spotify.encore.consumer.elements.downloadbutton.DownloadState.Downloadable.INSTANCE
                r12 = 2
                r14.<init>(r9, r15, r12, r15)
                goto L_0x005e
            L_0x005c:
                r14 = r29
            L_0x005e:
                r9 = r0 & 2048(0x800, float:2.87E-42)
                if (r9 == 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r15 = r30
            L_0x0065:
                r9 = r0 & 4096(0x1000, float:5.74E-42)
                if (r9 == 0) goto L_0x006b
                r9 = 0
                goto L_0x006d
            L_0x006b:
                r9 = r31
            L_0x006d:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x0073
                r0 = 1
                goto L_0x0075
            L_0x0073:
                r0 = r32
            L_0x0075:
                r18 = r16
                r19 = r17
                r20 = r1
                r21 = r3
                r22 = r2
                r23 = r7
                r25 = r5
                r27 = r4
                r28 = r10
                r29 = r11
                r30 = r13
                r31 = r14
                r32 = r15
                r33 = r9
                r34 = r0
                r18.<init>(r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowYourLibrary.Model.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction, boolean, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState, com.spotify.encore.consumer.elements.downloadbutton.DownloadButton$Model, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.f):void");
        }
    }
}
