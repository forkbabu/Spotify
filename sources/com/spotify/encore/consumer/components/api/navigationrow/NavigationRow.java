package com.spotify.encore.consumer.components.api.navigationrow;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface NavigationRow extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultNavigationRowConfiguration implements Configuration {
            public static final DefaultNavigationRowConfiguration INSTANCE = new DefaultNavigationRowConfiguration();

            private DefaultNavigationRowConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(NavigationRow navigationRow, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(navigationRow, nmf);
        }
    }

    public enum Events {
        RowClicked
    }

    public static final class Model {
        private final boolean isNavigatable;
        private final String title;

        public Model(String str, boolean z) {
            h.e(str, "title");
            this.title = str;
            this.isNavigatable = z;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                z = model.isNavigatable;
            }
            return model.copy(str, z);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isNavigatable;
        }

        public final Model copy(String str, boolean z) {
            h.e(str, "title");
            return new Model(str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && this.isNavigatable == model.isNavigatable;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.isNavigatable;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final boolean isNavigatable() {
            return this.isNavigatable;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", isNavigatable=");
            return je.P0(V0, this.isNavigatable, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(str, (i & 2) != 0 ? true : z);
        }
    }
}
