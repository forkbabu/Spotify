package com.spotify.encore.consumer.components.api.sectionheading;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface SectionHeading1 extends Component<Model, f> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultSectionHeading1Configuration implements Configuration {
            public static final DefaultSectionHeading1Configuration INSTANCE = new DefaultSectionHeading1Configuration();

            private DefaultSectionHeading1Configuration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(SectionHeading1 sectionHeading1, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(sectionHeading1, nmf);
        }
    }

    public static final class Model {
        private final String title;

        public Model(String str) {
            h.e(str, "title");
            this.title = str;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            return model.copy(str);
        }

        public final String component1() {
            return this.title;
        }

        public final Model copy(String str) {
            h.e(str, "title");
            return new Model(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Model) && h.a(this.title, ((Model) obj).title);
            }
            return true;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Model(title="), this.title, ")");
        }
    }
}
