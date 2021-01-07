package com.spotify.encore.consumer.components.genrehub.api.genrehubheader;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface GenreHubHeader extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultGenreHubHeaderConfiguration implements Configuration {
            public static final DefaultGenreHubHeaderConfiguration INSTANCE = new DefaultGenreHubHeaderConfiguration();

            private DefaultGenreHubHeaderConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(GenreHubHeader genreHubHeader, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(genreHubHeader, nmf);
        }
    }

    public enum Events {
        BackButtonClicked
    }

    public static final class Model {
        private final int sampleTint;
        private final String title;

        public Model(String str, int i) {
            h.e(str, "title");
            this.title = str;
            this.sampleTint = i;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = model.title;
            }
            if ((i2 & 2) != 0) {
                i = model.sampleTint;
            }
            return model.copy(str, i);
        }

        public final String component1() {
            return this.title;
        }

        public final int component2() {
            return this.sampleTint;
        }

        public final Model copy(String str, int i) {
            h.e(str, "title");
            return new Model(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && this.sampleTint == model.sampleTint;
        }

        public final int getSampleTint() {
            return this.sampleTint;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return ((str != null ? str.hashCode() : 0) * 31) + this.sampleTint;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", sampleTint=");
            return je.B0(V0, this.sampleTint, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, int i, int i2, kotlin.jvm.internal.f fVar) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }
    }
}
