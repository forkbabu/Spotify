package com.spotify.encore.consumer.components.listeninghistory.api.entityrow;

import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface EntityRowListeningHistory extends Component<Model, Events> {

    public static final class DefaultImpls {
        public static void onEvent(EntityRowListeningHistory entityRowListeningHistory, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(entityRowListeningHistory, nmf);
        }
    }

    public static final class Model {
        private final String entitySubtitle;
        private final String entityTitle;
        private final EntityTypeListeningHistory entityType;
        private final String image;

        public Model(String str, String str2, String str3, EntityTypeListeningHistory entityTypeListeningHistory) {
            h.e(str, "entityTitle");
            h.e(str2, "entitySubtitle");
            h.e(str3, "image");
            h.e(entityTypeListeningHistory, "entityType");
            this.entityTitle = str;
            this.entitySubtitle = str2;
            this.image = str3;
            this.entityType = entityTypeListeningHistory;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, EntityTypeListeningHistory entityTypeListeningHistory, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.entityTitle;
            }
            if ((i & 2) != 0) {
                str2 = model.entitySubtitle;
            }
            if ((i & 4) != 0) {
                str3 = model.image;
            }
            if ((i & 8) != 0) {
                entityTypeListeningHistory = model.entityType;
            }
            return model.copy(str, str2, str3, entityTypeListeningHistory);
        }

        public final String component1() {
            return this.entityTitle;
        }

        public final String component2() {
            return this.entitySubtitle;
        }

        public final String component3() {
            return this.image;
        }

        public final EntityTypeListeningHistory component4() {
            return this.entityType;
        }

        public final Model copy(String str, String str2, String str3, EntityTypeListeningHistory entityTypeListeningHistory) {
            h.e(str, "entityTitle");
            h.e(str2, "entitySubtitle");
            h.e(str3, "image");
            h.e(entityTypeListeningHistory, "entityType");
            return new Model(str, str2, str3, entityTypeListeningHistory);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.entityTitle, model.entityTitle) && h.a(this.entitySubtitle, model.entitySubtitle) && h.a(this.image, model.image) && h.a(this.entityType, model.entityType);
        }

        public final String getEntitySubtitle() {
            return this.entitySubtitle;
        }

        public final String getEntityTitle() {
            return this.entityTitle;
        }

        public final EntityTypeListeningHistory getEntityType() {
            return this.entityType;
        }

        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            String str = this.entityTitle;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.entitySubtitle;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.image;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            EntityTypeListeningHistory entityTypeListeningHistory = this.entityType;
            if (entityTypeListeningHistory != null) {
                i = entityTypeListeningHistory.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(entityTitle=");
            V0.append(this.entityTitle);
            V0.append(", entitySubtitle=");
            V0.append(this.entitySubtitle);
            V0.append(", image=");
            V0.append(this.image);
            V0.append(", entityType=");
            V0.append(this.entityType);
            V0.append(")");
            return V0.toString();
        }
    }
}
