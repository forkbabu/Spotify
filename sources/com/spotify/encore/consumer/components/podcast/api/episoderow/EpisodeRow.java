package com.spotify.encore.consumer.components.podcast.api.episoderow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRow extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultEpisodeRowConfiguration implements Configuration {
            public static final DefaultEpisodeRowConfiguration INSTANCE = new DefaultEpisodeRowConfiguration();

            private DefaultEpisodeRowConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRow episodeRow, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(episodeRow, nmf);
        }
    }

    public static abstract class Events {

        public static final class PlayClicked extends Events {
            public static final PlayClicked INSTANCE = new PlayClicked();

            private PlayClicked() {
                super(null);
            }
        }

        public static final class QuickActionClicked extends Events {
            private final EpisodeRowQuickAction quickAction;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public QuickActionClicked(EpisodeRowQuickAction episodeRowQuickAction) {
                super(null);
                h.e(episodeRowQuickAction, "quickAction");
                this.quickAction = episodeRowQuickAction;
            }

            public static /* synthetic */ QuickActionClicked copy$default(QuickActionClicked quickActionClicked, EpisodeRowQuickAction episodeRowQuickAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    episodeRowQuickAction = quickActionClicked.quickAction;
                }
                return quickActionClicked.copy(episodeRowQuickAction);
            }

            public final EpisodeRowQuickAction component1() {
                return this.quickAction;
            }

            public final QuickActionClicked copy(EpisodeRowQuickAction episodeRowQuickAction) {
                h.e(episodeRowQuickAction, "quickAction");
                return new QuickActionClicked(episodeRowQuickAction);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof QuickActionClicked) && h.a(this.quickAction, ((QuickActionClicked) obj).quickAction);
                }
                return true;
            }

            public final EpisodeRowQuickAction getQuickAction() {
                return this.quickAction;
            }

            public int hashCode() {
                EpisodeRowQuickAction episodeRowQuickAction = this.quickAction;
                if (episodeRowQuickAction != null) {
                    return episodeRowQuickAction.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder V0 = je.V0("QuickActionClicked(quickAction=");
                V0.append(this.quickAction);
                V0.append(")");
                return V0.toString();
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
        private final String artworkUri;
        private final ContentRestriction contentRestriction;
        private final String description;
        private final EpisodeRowQuickAction endQuickAction;
        private final boolean isPlayable;
        private final boolean isPlayed;
        private final EpisodeRowQuickAction middleQuickAction;
        private final EpisodePlayState playState;
        private final float progress;
        private final String publishDateLabel;
        private final String publisher;
        private final boolean showBottomDivider;
        private final EpisodeRowQuickAction startQuickAction;
        private final String title;

        public Model(String str, String str2, String str3, String str4, float f, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, String str5, boolean z3, EpisodeRowQuickAction episodeRowQuickAction, EpisodeRowQuickAction episodeRowQuickAction2, EpisodeRowQuickAction episodeRowQuickAction3) {
            h.e(str, "title");
            h.e(str3, "description");
            h.e(str4, "publishDateLabel");
            h.e(contentRestriction2, "contentRestriction");
            h.e(episodePlayState, "playState");
            h.e(episodeRowQuickAction, "startQuickAction");
            h.e(episodeRowQuickAction2, "middleQuickAction");
            h.e(episodeRowQuickAction3, "endQuickAction");
            this.title = str;
            this.publisher = str2;
            this.description = str3;
            this.publishDateLabel = str4;
            this.progress = f;
            this.isPlayed = z;
            this.contentRestriction = contentRestriction2;
            this.isPlayable = z2;
            this.playState = episodePlayState;
            this.artworkUri = str5;
            this.showBottomDivider = z3;
            this.startQuickAction = episodeRowQuickAction;
            this.middleQuickAction = episodeRowQuickAction2;
            this.endQuickAction = episodeRowQuickAction3;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, String str4, float f, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, String str5, boolean z3, EpisodeRowQuickAction episodeRowQuickAction, EpisodeRowQuickAction episodeRowQuickAction2, EpisodeRowQuickAction episodeRowQuickAction3, int i, Object obj) {
            return model.copy((i & 1) != 0 ? model.title : str, (i & 2) != 0 ? model.publisher : str2, (i & 4) != 0 ? model.description : str3, (i & 8) != 0 ? model.publishDateLabel : str4, (i & 16) != 0 ? model.progress : f, (i & 32) != 0 ? model.isPlayed : z, (i & 64) != 0 ? model.contentRestriction : contentRestriction2, (i & 128) != 0 ? model.isPlayable : z2, (i & 256) != 0 ? model.playState : episodePlayState, (i & 512) != 0 ? model.artworkUri : str5, (i & 1024) != 0 ? model.showBottomDivider : z3, (i & 2048) != 0 ? model.startQuickAction : episodeRowQuickAction, (i & 4096) != 0 ? model.middleQuickAction : episodeRowQuickAction2, (i & 8192) != 0 ? model.endQuickAction : episodeRowQuickAction3);
        }

        public final String component1() {
            return this.title;
        }

        public final String component10() {
            return this.artworkUri;
        }

        public final boolean component11() {
            return this.showBottomDivider;
        }

        public final EpisodeRowQuickAction component12() {
            return this.startQuickAction;
        }

        public final EpisodeRowQuickAction component13() {
            return this.middleQuickAction;
        }

        public final EpisodeRowQuickAction component14() {
            return this.endQuickAction;
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

        public final float component5() {
            return this.progress;
        }

        public final boolean component6() {
            return this.isPlayed;
        }

        public final ContentRestriction component7() {
            return this.contentRestriction;
        }

        public final boolean component8() {
            return this.isPlayable;
        }

        public final EpisodePlayState component9() {
            return this.playState;
        }

        public final Model copy(String str, String str2, String str3, String str4, float f, boolean z, ContentRestriction contentRestriction2, boolean z2, EpisodePlayState episodePlayState, String str5, boolean z3, EpisodeRowQuickAction episodeRowQuickAction, EpisodeRowQuickAction episodeRowQuickAction2, EpisodeRowQuickAction episodeRowQuickAction3) {
            h.e(str, "title");
            h.e(str3, "description");
            h.e(str4, "publishDateLabel");
            h.e(contentRestriction2, "contentRestriction");
            h.e(episodePlayState, "playState");
            h.e(episodeRowQuickAction, "startQuickAction");
            h.e(episodeRowQuickAction2, "middleQuickAction");
            h.e(episodeRowQuickAction3, "endQuickAction");
            return new Model(str, str2, str3, str4, f, z, contentRestriction2, z2, episodePlayState, str5, z3, episodeRowQuickAction, episodeRowQuickAction2, episodeRowQuickAction3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.publisher, model.publisher) && h.a(this.description, model.description) && h.a(this.publishDateLabel, model.publishDateLabel) && Float.compare(this.progress, model.progress) == 0 && this.isPlayed == model.isPlayed && h.a(this.contentRestriction, model.contentRestriction) && this.isPlayable == model.isPlayable && h.a(this.playState, model.playState) && h.a(this.artworkUri, model.artworkUri) && this.showBottomDivider == model.showBottomDivider && h.a(this.startQuickAction, model.startQuickAction) && h.a(this.middleQuickAction, model.middleQuickAction) && h.a(this.endQuickAction, model.endQuickAction);
        }

        public final String getArtworkUri() {
            return this.artworkUri;
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final String getDescription() {
            return this.description;
        }

        public final EpisodeRowQuickAction getEndQuickAction() {
            return this.endQuickAction;
        }

        public final EpisodeRowQuickAction getMiddleQuickAction() {
            return this.middleQuickAction;
        }

        public final EpisodePlayState getPlayState() {
            return this.playState;
        }

        public final float getProgress() {
            return this.progress;
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

        public final EpisodeRowQuickAction getStartQuickAction() {
            return this.startQuickAction;
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
            int floatToIntBits = (Float.floatToIntBits(this.progress) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31;
            boolean z = this.isPlayed;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (floatToIntBits + i3) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            int hashCode4 = (i6 + (contentRestriction2 != null ? contentRestriction2.hashCode() : 0)) * 31;
            boolean z2 = this.isPlayable;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (hashCode4 + i7) * 31;
            EpisodePlayState episodePlayState = this.playState;
            int hashCode5 = (i10 + (episodePlayState != null ? episodePlayState.hashCode() : 0)) * 31;
            String str5 = this.artworkUri;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            boolean z3 = this.showBottomDivider;
            if (!z3) {
                i2 = z3 ? 1 : 0;
            }
            int i11 = (hashCode6 + i2) * 31;
            EpisodeRowQuickAction episodeRowQuickAction = this.startQuickAction;
            int hashCode7 = (i11 + (episodeRowQuickAction != null ? episodeRowQuickAction.hashCode() : 0)) * 31;
            EpisodeRowQuickAction episodeRowQuickAction2 = this.middleQuickAction;
            int hashCode8 = (hashCode7 + (episodeRowQuickAction2 != null ? episodeRowQuickAction2.hashCode() : 0)) * 31;
            EpisodeRowQuickAction episodeRowQuickAction3 = this.endQuickAction;
            if (episodeRowQuickAction3 != null) {
                i = episodeRowQuickAction3.hashCode();
            }
            return hashCode8 + i;
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
            V0.append(", progress=");
            V0.append(this.progress);
            V0.append(", isPlayed=");
            V0.append(this.isPlayed);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", playState=");
            V0.append(this.playState);
            V0.append(", artworkUri=");
            V0.append(this.artworkUri);
            V0.append(", showBottomDivider=");
            V0.append(this.showBottomDivider);
            V0.append(", startQuickAction=");
            V0.append(this.startQuickAction);
            V0.append(", middleQuickAction=");
            V0.append(this.middleQuickAction);
            V0.append(", endQuickAction=");
            V0.append(this.endQuickAction);
            V0.append(")");
            return V0.toString();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Model(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, float r18, boolean r19, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r20, boolean r21, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState r22, java.lang.String r23, boolean r24, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction r25, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction r26, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction r27, int r28, kotlin.jvm.internal.f r29) {
            /*
                r13 = this;
                r0 = r28
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r15
            L_0x000a:
                r3 = r0 & 4
                java.lang.String r4 = ""
                if (r3 == 0) goto L_0x0012
                r3 = r4
                goto L_0x0014
            L_0x0012:
                r3 = r16
            L_0x0014:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r4 = r17
            L_0x001b:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x0021
                r5 = 0
                goto L_0x0023
            L_0x0021:
                r5 = r18
            L_0x0023:
                r6 = r0 & 32
                r7 = 0
                if (r6 == 0) goto L_0x002a
                r6 = 0
                goto L_0x002c
            L_0x002a:
                r6 = r19
            L_0x002c:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0033
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r8 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.None
                goto L_0x0035
            L_0x0033:
                r8 = r20
            L_0x0035:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003b
                r9 = 1
                goto L_0x003d
            L_0x003b:
                r9 = r21
            L_0x003d:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0044
                com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState r10 = com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState.Paused
                goto L_0x0046
            L_0x0044:
                r10 = r22
            L_0x0046:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = r23
            L_0x004d:
                r11 = r0 & 1024(0x400, float:1.435E-42)
                if (r11 == 0) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                r7 = r24
            L_0x0054:
                r11 = r0 & 2048(0x800, float:2.87E-42)
                if (r11 == 0) goto L_0x005b
                com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction$None r11 = com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction.None.INSTANCE
                goto L_0x005d
            L_0x005b:
                r11 = r25
            L_0x005d:
                r12 = r0 & 4096(0x1000, float:5.74E-42)
                if (r12 == 0) goto L_0x0064
                com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction$None r12 = com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction.None.INSTANCE
                goto L_0x0066
            L_0x0064:
                r12 = r26
            L_0x0066:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x006d
                com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction$None r0 = com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction.None.INSTANCE
                goto L_0x006f
            L_0x006d:
                r0 = r27
            L_0x006f:
                r15 = r13
                r16 = r14
                r17 = r1
                r18 = r3
                r19 = r4
                r20 = r5
                r21 = r6
                r22 = r8
                r23 = r9
                r24 = r10
                r25 = r2
                r26 = r7
                r27 = r11
                r28 = r12
                r29 = r0
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow.Model.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, boolean, com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction, boolean, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodePlayState, java.lang.String, boolean, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction, com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction, int, kotlin.jvm.internal.f):void");
        }
    }
}
