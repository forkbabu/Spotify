package com.spotify.encore.consumer.components.listeninghistory.api.podcastrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PodcastRowListeningHistory extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(PodcastRowListeningHistory podcastRowListeningHistory, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(podcastRowListeningHistory, nmf);
        }
    }

    public static final class Model {
        private final String imageUri;
        private final String podcastOwnerTitle;
        private final String podcastTitle;

        public Model(String str, String str2, String str3) {
            je.x(str, "podcastTitle", str2, "podcastOwnerTitle", str3, "imageUri");
            this.podcastTitle = str;
            this.podcastOwnerTitle = str2;
            this.imageUri = str3;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.podcastTitle;
            }
            if ((i & 2) != 0) {
                str2 = model.podcastOwnerTitle;
            }
            if ((i & 4) != 0) {
                str3 = model.imageUri;
            }
            return model.copy(str, str2, str3);
        }

        public final String component1() {
            return this.podcastTitle;
        }

        public final String component2() {
            return this.podcastOwnerTitle;
        }

        public final String component3() {
            return this.imageUri;
        }

        public final Model copy(String str, String str2, String str3) {
            h.e(str, "podcastTitle");
            h.e(str2, "podcastOwnerTitle");
            h.e(str3, "imageUri");
            return new Model(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.podcastTitle, model.podcastTitle) && h.a(this.podcastOwnerTitle, model.podcastOwnerTitle) && h.a(this.imageUri, model.imageUri);
        }

        public final String getImageUri() {
            return this.imageUri;
        }

        public final String getPodcastOwnerTitle() {
            return this.podcastOwnerTitle;
        }

        public final String getPodcastTitle() {
            return this.podcastTitle;
        }

        public int hashCode() {
            String str = this.podcastTitle;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.podcastOwnerTitle;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.imageUri;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(podcastTitle=");
            V0.append(this.podcastTitle);
            V0.append(", podcastOwnerTitle=");
            V0.append(this.podcastOwnerTitle);
            V0.append(", imageUri=");
            return je.I0(V0, this.imageUri, ")");
        }
    }
}
