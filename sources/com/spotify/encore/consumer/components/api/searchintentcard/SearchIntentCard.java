package com.spotify.encore.consumer.components.api.searchintentcard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface SearchIntentCard extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultSearchIntentCardConfiguration implements Configuration {
            public static final DefaultSearchIntentCardConfiguration INSTANCE = new DefaultSearchIntentCardConfiguration();

            private DefaultSearchIntentCardConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(SearchIntentCard searchIntentCard, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(searchIntentCard, nmf);
        }
    }

    public enum Events {
        CardClicked
    }

    public static final class Model {
        private final String text;

        public Model(String str) {
            h.e(str, "text");
            this.text = str;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.text;
            }
            return model.copy(str);
        }

        public final String component1() {
            return this.text;
        }

        public final Model copy(String str) {
            h.e(str, "text");
            return new Model(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Model) && h.a(this.text, ((Model) obj).text);
            }
            return true;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Model(text="), this.text, ")");
        }
    }
}
