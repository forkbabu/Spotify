package com.spotify.encore.consumer.components.error.api.errorbanner;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ErrorBanner extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultErrorBannerConfiguration implements Configuration {
            public static final DefaultErrorBannerConfiguration INSTANCE = new DefaultErrorBannerConfiguration();

            private DefaultErrorBannerConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(ErrorBanner errorBanner, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(errorBanner, nmf);
        }
    }

    public static abstract class Events {

        public static final class Clicked extends Events {
            public static final Clicked INSTANCE = new Clicked();

            private Clicked() {
                super(null);
            }
        }

        public static final class CloseButtonClicked extends Events {
            public static final CloseButtonClicked INSTANCE = new CloseButtonClicked();

            private CloseButtonClicked() {
                super(null);
            }
        }

        private Events() {
        }

        public /* synthetic */ Events(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final String buttonTitle;
        private final String content;
        private final boolean isCloseable;
        private final String title;

        public Model(String str, String str2, String str3, boolean z) {
            je.x(str, "title", str2, "content", str3, "buttonTitle");
            this.title = str;
            this.content = str2;
            this.buttonTitle = str3;
            this.isCloseable = z;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                str2 = model.content;
            }
            if ((i & 4) != 0) {
                str3 = model.buttonTitle;
            }
            if ((i & 8) != 0) {
                z = model.isCloseable;
            }
            return model.copy(str, str2, str3, z);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.content;
        }

        public final String component3() {
            return this.buttonTitle;
        }

        public final boolean component4() {
            return this.isCloseable;
        }

        public final Model copy(String str, String str2, String str3, boolean z) {
            h.e(str, "title");
            h.e(str2, "content");
            h.e(str3, "buttonTitle");
            return new Model(str, str2, str3, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.content, model.content) && h.a(this.buttonTitle, model.buttonTitle) && this.isCloseable == model.isCloseable;
        }

        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.content;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.buttonTitle;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.isCloseable;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final boolean isCloseable() {
            return this.isCloseable;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", content=");
            V0.append(this.content);
            V0.append(", buttonTitle=");
            V0.append(this.buttonTitle);
            V0.append(", isCloseable=");
            return je.P0(V0, this.isCloseable, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, String str2, String str3, boolean z, int i, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
        }
    }
}
