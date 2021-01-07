package com.spotify.encore.consumer.components.playlist.api.participantrow;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.quickactions.Initials;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ParticipantRowPlaylist extends Component<Model, Event> {

    public static final class DefaultImpls {
        public static void onEvent(ParticipantRowPlaylist participantRowPlaylist, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(participantRowPlaylist, nmf);
        }
    }

    public static abstract class Event {

        public static final class RowClicked extends Event {
            public static final RowClicked INSTANCE = new RowClicked();

            private RowClicked() {
                super(null);
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final String addedItems;
        private final String imageUri;
        private final Initials initials;
        private final String name;

        public Model(String str, String str2, String str3, Initials initials2) {
            h.e(str, "name");
            h.e(str2, "addedItems");
            h.e(initials2, "initials");
            this.name = str;
            this.addedItems = str2;
            this.imageUri = str3;
            this.initials = initials2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, Initials initials2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.name;
            }
            if ((i & 2) != 0) {
                str2 = model.addedItems;
            }
            if ((i & 4) != 0) {
                str3 = model.imageUri;
            }
            if ((i & 8) != 0) {
                initials2 = model.initials;
            }
            return model.copy(str, str2, str3, initials2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.addedItems;
        }

        public final String component3() {
            return this.imageUri;
        }

        public final Initials component4() {
            return this.initials;
        }

        public final Model copy(String str, String str2, String str3, Initials initials2) {
            h.e(str, "name");
            h.e(str2, "addedItems");
            h.e(initials2, "initials");
            return new Model(str, str2, str3, initials2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.name, model.name) && h.a(this.addedItems, model.addedItems) && h.a(this.imageUri, model.imageUri) && h.a(this.initials, model.initials);
        }

        public final String getAddedItems() {
            return this.addedItems;
        }

        public final String getImageUri() {
            return this.imageUri;
        }

        public final Initials getInitials() {
            return this.initials;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.addedItems;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.imageUri;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Initials initials2 = this.initials;
            if (initials2 != null) {
                i = initials2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(name=");
            V0.append(this.name);
            V0.append(", addedItems=");
            V0.append(this.addedItems);
            V0.append(", imageUri=");
            V0.append(this.imageUri);
            V0.append(", initials=");
            V0.append(this.initials);
            V0.append(")");
            return V0.toString();
        }
    }
}
