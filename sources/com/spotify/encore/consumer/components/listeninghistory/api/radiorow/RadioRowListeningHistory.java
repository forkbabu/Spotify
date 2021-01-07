package com.spotify.encore.consumer.components.listeninghistory.api.radiorow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.player.model.ContextTrack;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface RadioRowListeningHistory extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(RadioRowListeningHistory radioRowListeningHistory, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(radioRowListeningHistory, nmf);
        }
    }

    public static final class Model {
        private final String image;
        private final String subtitle;
        private final String title;

        public Model(String str, String str2, String str3) {
            je.x(str, "title", str2, ContextTrack.Metadata.KEY_SUBTITLE, str3, "image");
            this.title = str;
            this.subtitle = str2;
            this.image = str3;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                str2 = model.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = model.image;
            }
            return model.copy(str, str2, str3);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.image;
        }

        public final Model copy(String str, String str2, String str3) {
            h.e(str, "title");
            h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
            h.e(str3, "image");
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
            return h.a(this.title, model.title) && h.a(this.subtitle, model.subtitle) && h.a(this.image, model.image);
        }

        public final String getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.image;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", subtitle=");
            V0.append(this.subtitle);
            V0.append(", image=");
            return je.I0(V0, this.image, ")");
        }
    }
}
