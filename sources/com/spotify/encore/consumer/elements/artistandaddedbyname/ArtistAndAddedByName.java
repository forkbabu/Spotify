package com.spotify.encore.consumer.elements.artistandaddedbyname;

import com.spotify.encore.Element;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ArtistAndAddedByName extends Element {

    public static final class DefaultImpls {
        public static void onEvent(ArtistAndAddedByName artistAndAddedByName, nmf<?, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(artistAndAddedByName, nmf);
        }
    }

    public static final class Model {
        private final String addedBy;
        private final List<String> artistName;

        public Model(List<String> list, String str) {
            h.e(list, "artistName");
            this.artistName = list;
            this.addedBy = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.elements.artistandaddedbyname.ArtistAndAddedByName$Model */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = model.artistName;
            }
            if ((i & 2) != 0) {
                str = model.addedBy;
            }
            return model.copy(list, str);
        }

        public final List<String> component1() {
            return this.artistName;
        }

        public final String component2() {
            return this.addedBy;
        }

        public final Model copy(List<String> list, String str) {
            h.e(list, "artistName");
            return new Model(list, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.artistName, model.artistName) && h.a(this.addedBy, model.addedBy);
        }

        public final String getAddedBy() {
            return this.addedBy;
        }

        public final List<String> getArtistName() {
            return this.artistName;
        }

        public int hashCode() {
            List<String> list = this.artistName;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.addedBy;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(artistName=");
            V0.append(this.artistName);
            V0.append(", addedBy=");
            return je.I0(V0, this.addedBy, ")");
        }
    }
}
