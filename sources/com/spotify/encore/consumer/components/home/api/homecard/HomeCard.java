package com.spotify.encore.consumer.components.home.api.homecard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface HomeCard extends Component<Model, Events> {

    public enum Accessory {
        DOWNLOAD_ICON,
        HEART_ICON,
        HIGHLIGHT_TEXT,
        WHITE_TEXT
    }

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultHomeCardConfiguration implements Configuration {
            public static final DefaultHomeCardConfiguration INSTANCE = new DefaultHomeCardConfiguration();

            private DefaultHomeCardConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(HomeCard homeCard, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(homeCard, nmf);
        }
    }

    public enum Events {
        CardClicked
    }

    public static final class Model {
        private final List<Accessory> accessoryStyle;
        private final String accessoryText;
        private final Artwork.Model artwork;
        private final String contentDescription;
        private final Size size;
        private final String subTitle;
        private final String title;

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.spotify.encore.consumer.components.home.api.homecard.HomeCard$Accessory> */
        /* JADX WARN: Multi-variable type inference failed */
        public Model(Artwork.Model model, String str, String str2, String str3, String str4, List<? extends Accessory> list, Size size2) {
            h.e(model, "artwork");
            h.e(str, "title");
            h.e(list, "accessoryStyle");
            h.e(size2, "size");
            this.artwork = model;
            this.title = str;
            this.subTitle = str2;
            this.contentDescription = str3;
            this.accessoryText = str4;
            this.accessoryStyle = list;
            this.size = size2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.spotify.encore.consumer.components.home.api.homecard.HomeCard$Model */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Model copy$default(Model model, Artwork.Model model2, String str, String str2, String str3, String str4, List list, Size size2, int i, Object obj) {
            if ((i & 1) != 0) {
                model2 = model.artwork;
            }
            if ((i & 2) != 0) {
                str = model.title;
            }
            if ((i & 4) != 0) {
                str2 = model.subTitle;
            }
            if ((i & 8) != 0) {
                str3 = model.contentDescription;
            }
            if ((i & 16) != 0) {
                str4 = model.accessoryText;
            }
            if ((i & 32) != 0) {
                list = model.accessoryStyle;
            }
            if ((i & 64) != 0) {
                size2 = model.size;
            }
            return model.copy(model2, str, str2, str3, str4, list, size2);
        }

        public final Artwork.Model component1() {
            return this.artwork;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subTitle;
        }

        public final String component4() {
            return this.contentDescription;
        }

        public final String component5() {
            return this.accessoryText;
        }

        public final List<Accessory> component6() {
            return this.accessoryStyle;
        }

        public final Size component7() {
            return this.size;
        }

        public final Model copy(Artwork.Model model, String str, String str2, String str3, String str4, List<? extends Accessory> list, Size size2) {
            h.e(model, "artwork");
            h.e(str, "title");
            h.e(list, "accessoryStyle");
            h.e(size2, "size");
            return new Model(model, str, str2, str3, str4, list, size2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.artwork, model.artwork) && h.a(this.title, model.title) && h.a(this.subTitle, model.subTitle) && h.a(this.contentDescription, model.contentDescription) && h.a(this.accessoryText, model.accessoryText) && h.a(this.accessoryStyle, model.accessoryStyle) && h.a(this.size, model.size);
        }

        public final List<Accessory> getAccessoryStyle() {
            return this.accessoryStyle;
        }

        public final String getAccessoryText() {
            return this.accessoryText;
        }

        public final Artwork.Model getArtwork() {
            return this.artwork;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final Size getSize() {
            return this.size;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Artwork.Model model = this.artwork;
            int i = 0;
            int hashCode = (model != null ? model.hashCode() : 0) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.subTitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.contentDescription;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.accessoryText;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<Accessory> list = this.accessoryStyle;
            int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
            Size size2 = this.size;
            if (size2 != null) {
                i = size2.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(artwork=");
            V0.append(this.artwork);
            V0.append(", title=");
            V0.append(this.title);
            V0.append(", subTitle=");
            V0.append(this.subTitle);
            V0.append(", contentDescription=");
            V0.append(this.contentDescription);
            V0.append(", accessoryText=");
            V0.append(this.accessoryText);
            V0.append(", accessoryStyle=");
            V0.append(this.accessoryStyle);
            V0.append(", size=");
            V0.append(this.size);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(Artwork.Model model, String str, String str2, String str3, String str4, List list, Size size2, int i, kotlin.jvm.internal.f fVar) {
            this(model, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? EmptyList.a : list, (i & 64) != 0 ? Size.MEDIUM : size2);
        }
    }

    public enum Size {
        SMALL(0.3f, 144, 7.0f),
        MEDIUM(0.4f, 200, 12.0f),
        LARGE(0.5f, 256, 12.0f);
        
        private final float margin;
        private final int maxWidth;
        private final float percentage;

        private Size(float f, int i, float f2) {
            this.percentage = f;
            this.maxWidth = i;
            this.margin = f2;
        }

        public final float getMargin() {
            return this.margin;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final float getPercentage() {
            return this.percentage;
        }
    }
}
