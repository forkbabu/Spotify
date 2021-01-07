package com.spotify.encore.consumer.components.listeninghistory.api.artistcollectionrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ArtistCollectionRowListeningHistory extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(ArtistCollectionRowListeningHistory artistCollectionRowListeningHistory, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(artistCollectionRowListeningHistory, nmf);
        }
    }

    public static final class Model {
        private final String artistName;
        private final String contentType;
        private final String image;

        public Model(String str, String str2, String str3) {
            je.x(str, "artistName", str2, "contentType", str3, "image");
            this.artistName = str;
            this.contentType = str2;
            this.image = str3;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.artistName;
            }
            if ((i & 2) != 0) {
                str2 = model.contentType;
            }
            if ((i & 4) != 0) {
                str3 = model.image;
            }
            return model.copy(str, str2, str3);
        }

        public final String component1() {
            return this.artistName;
        }

        public final String component2() {
            return this.contentType;
        }

        public final String component3() {
            return this.image;
        }

        public final Model copy(String str, String str2, String str3) {
            h.e(str, "artistName");
            h.e(str2, "contentType");
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
            return h.a(this.artistName, model.artistName) && h.a(this.contentType, model.contentType) && h.a(this.image, model.image);
        }

        public final String getArtistName() {
            return this.artistName;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            String str = this.artistName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.contentType;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.image;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(artistName=");
            V0.append(this.artistName);
            V0.append(", contentType=");
            V0.append(this.contentType);
            V0.append(", image=");
            return je.I0(V0, this.image, ")");
        }
    }
}
