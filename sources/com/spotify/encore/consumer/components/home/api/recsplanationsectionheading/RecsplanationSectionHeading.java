package com.spotify.encore.consumer.components.home.api.recsplanationsectionheading;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface RecsplanationSectionHeading extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultRecsplanationSectionHeadingConfiguration implements Configuration {
            public static final DefaultRecsplanationSectionHeadingConfiguration INSTANCE = new DefaultRecsplanationSectionHeadingConfiguration();

            private DefaultRecsplanationSectionHeadingConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(RecsplanationSectionHeading recsplanationSectionHeading, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(recsplanationSectionHeading, nmf);
        }
    }

    public enum Events {
        Clicked
    }

    public static final class Model {
        private final Artwork.Model artwork;
        private final String subTitle;
        private final String title;

        public Model(String str, String str2, Artwork.Model model) {
            h.e(str, "title");
            h.e(str2, "subTitle");
            h.e(model, "artwork");
            this.title = str;
            this.subTitle = str2;
            this.artwork = model;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, Artwork.Model model2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.title;
            }
            if ((i & 2) != 0) {
                str2 = model.subTitle;
            }
            if ((i & 4) != 0) {
                model2 = model.artwork;
            }
            return model.copy(str, str2, model2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subTitle;
        }

        public final Artwork.Model component3() {
            return this.artwork;
        }

        public final Model copy(String str, String str2, Artwork.Model model) {
            h.e(str, "title");
            h.e(str2, "subTitle");
            h.e(model, "artwork");
            return new Model(str, str2, model);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.title, model.title) && h.a(this.subTitle, model.subTitle) && h.a(this.artwork, model.artwork);
        }

        public final Artwork.Model getArtwork() {
            return this.artwork;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.subTitle;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Artwork.Model model = this.artwork;
            if (model != null) {
                i = model.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(title=");
            V0.append(this.title);
            V0.append(", subTitle=");
            V0.append(this.subTitle);
            V0.append(", artwork=");
            V0.append(this.artwork);
            V0.append(")");
            return V0.toString();
        }
    }
}
