package com.spotify.encore.consumer.components.podcast.api.episoderow.continuelistening;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EpisodeRowContinueListening extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultEpisodeRowContinueListeningConfiguration implements Configuration {
            public static final DefaultEpisodeRowContinueListeningConfiguration INSTANCE = new DefaultEpisodeRowContinueListeningConfiguration();

            private DefaultEpisodeRowContinueListeningConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(EpisodeRowContinueListening episodeRowContinueListening, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(episodeRowContinueListening, nmf);
        }
    }

    public static abstract class Events {

        public static final class PrimaryActionClicked extends Events {
            public static final PrimaryActionClicked INSTANCE = new PrimaryActionClicked();

            private PrimaryActionClicked() {
                super(null);
            }
        }

        public static final class RowClicked extends Events {
            public static final RowClicked INSTANCE = new RowClicked();

            private RowClicked() {
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
        private final ContentRestriction contentRestriction;
        private final String episodeName;
        private final float progress;
        private final String showName;
        private final String thumbnailImage;

        public Model(String str, String str2, String str3, float f, ContentRestriction contentRestriction2) {
            h.e(str2, "showName");
            h.e(str3, "episodeName");
            h.e(contentRestriction2, "contentRestriction");
            this.thumbnailImage = str;
            this.showName = str2;
            this.episodeName = str3;
            this.progress = f;
            this.contentRestriction = contentRestriction2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, float f, ContentRestriction contentRestriction2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.thumbnailImage;
            }
            if ((i & 2) != 0) {
                str2 = model.showName;
            }
            if ((i & 4) != 0) {
                str3 = model.episodeName;
            }
            if ((i & 8) != 0) {
                f = model.progress;
            }
            if ((i & 16) != 0) {
                contentRestriction2 = model.contentRestriction;
            }
            return model.copy(str, str2, str3, f, contentRestriction2);
        }

        public final String component1() {
            return this.thumbnailImage;
        }

        public final String component2() {
            return this.showName;
        }

        public final String component3() {
            return this.episodeName;
        }

        public final float component4() {
            return this.progress;
        }

        public final ContentRestriction component5() {
            return this.contentRestriction;
        }

        public final Model copy(String str, String str2, String str3, float f, ContentRestriction contentRestriction2) {
            h.e(str2, "showName");
            h.e(str3, "episodeName");
            h.e(contentRestriction2, "contentRestriction");
            return new Model(str, str2, str3, f, contentRestriction2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.thumbnailImage, model.thumbnailImage) && h.a(this.showName, model.showName) && h.a(this.episodeName, model.episodeName) && Float.compare(this.progress, model.progress) == 0 && h.a(this.contentRestriction, model.contentRestriction);
        }

        public final ContentRestriction getContentRestriction() {
            return this.contentRestriction;
        }

        public final String getEpisodeName() {
            return this.episodeName;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final String getShowName() {
            return this.showName;
        }

        public final String getThumbnailImage() {
            return this.thumbnailImage;
        }

        public int hashCode() {
            String str = this.thumbnailImage;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.showName;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.episodeName;
            int floatToIntBits = (Float.floatToIntBits(this.progress) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31;
            ContentRestriction contentRestriction2 = this.contentRestriction;
            if (contentRestriction2 != null) {
                i = contentRestriction2.hashCode();
            }
            return floatToIntBits + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(thumbnailImage=");
            V0.append(this.thumbnailImage);
            V0.append(", showName=");
            V0.append(this.showName);
            V0.append(", episodeName=");
            V0.append(this.episodeName);
            V0.append(", progress=");
            V0.append(this.progress);
            V0.append(", contentRestriction=");
            V0.append(this.contentRestriction);
            V0.append(")");
            return V0.toString();
        }
    }
}
