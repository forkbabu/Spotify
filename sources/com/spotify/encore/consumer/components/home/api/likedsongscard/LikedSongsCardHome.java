package com.spotify.encore.consumer.components.home.api.likedsongscard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface LikedSongsCardHome extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultLikedSongsCardHomeConfiguration implements Configuration {
            public static final DefaultLikedSongsCardHomeConfiguration INSTANCE = new DefaultLikedSongsCardHomeConfiguration();

            private DefaultLikedSongsCardHomeConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(LikedSongsCardHome likedSongsCardHome, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(likedSongsCardHome, nmf);
        }
    }

    public enum Events {
        CardClicked
    }

    public static final class Model {
        private final boolean downloaded;
        private final String subTitle;
        private final String title;

        public Model(String str, String str2, boolean z) {
            h.e(str, "title");
            h.e(str2, "subTitle");
            this.title = str;
            this.subTitle = str2;
            this.downloaded = z;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                str2 = model.subTitle;
            }
            if ((i & 4) != 0) {
                z = model.downloaded;
            }
            return model.copy(str, str2, z);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subTitle;
        }

        public final boolean component3() {
            return this.downloaded;
        }

        public final Model copy(String str, String str2, boolean z) {
            h.e(str, "title");
            h.e(str2, "subTitle");
            return new Model(str, str2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.subTitle, model.subTitle) && this.downloaded == model.downloaded;
        }

        public final boolean getDownloaded() {
            return this.downloaded;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.subTitle;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.downloaded;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", subTitle=");
            V0.append(this.subTitle);
            V0.append(", downloaded=");
            return je.P0(V0, this.downloaded, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }
    }
}
