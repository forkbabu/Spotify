package com.spotify.encore.consumer.components.api.sectionheading;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface SectionHeading2 extends Component<Model, f> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultSectionHeading2Configuration implements Configuration {
            public static final DefaultSectionHeading2Configuration INSTANCE = new DefaultSectionHeading2Configuration();

            private DefaultSectionHeading2Configuration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(SectionHeading2 sectionHeading2, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(sectionHeading2, nmf);
        }
    }

    public static final class Model {
        private final String subtitle;
        private final String title;

        public Model(String str, String str2) {
            h.e(str, "title");
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                str2 = model.subtitle;
            }
            return model.copy(str, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final Model copy(String str, String str2) {
            h.e(str, "title");
            return new Model(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.subtitle, model.subtitle);
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
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", subtitle=");
            return je.I0(V0, this.subtitle, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
