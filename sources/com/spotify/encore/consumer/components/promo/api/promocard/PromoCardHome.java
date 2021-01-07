package com.spotify.encore.consumer.components.promo.api.promocard;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PromoCardHome extends Component<Model, Events> {

    public interface Configuration extends ComponentConfiguration {

        public static final class DefaultPromoCardHomeConfiguration implements Configuration {
            public static final DefaultPromoCardHomeConfiguration INSTANCE = new DefaultPromoCardHomeConfiguration();

            private DefaultPromoCardHomeConfiguration() {
            }
        }
    }

    public static final class DefaultImpls {
        public static void onEvent(PromoCardHome promoCardHome, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Component.DefaultImpls.onEvent(promoCardHome, nmf);
        }
    }

    public enum Events {
        CardClicked,
        PlayButtonClicked
    }

    public static abstract class Headline {

        public static final class Logo extends Headline {
            private final String logoImageUri;
            private final String title;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Logo(String str, String str2) {
                super(null);
                h.e(str, "logoImageUri");
                h.e(str2, "title");
                this.logoImageUri = str;
                this.title = str2;
            }

            public static /* synthetic */ Logo copy$default(Logo logo, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = logo.logoImageUri;
                }
                if ((i & 2) != 0) {
                    str2 = logo.title;
                }
                return logo.copy(str, str2);
            }

            public final String component1() {
                return this.logoImageUri;
            }

            public final String component2() {
                return this.title;
            }

            public final Logo copy(String str, String str2) {
                h.e(str, "logoImageUri");
                h.e(str2, "title");
                return new Logo(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Logo)) {
                    return false;
                }
                Logo logo = (Logo) obj;
                return h.a(this.logoImageUri, logo.logoImageUri) && h.a(this.title, logo.title);
            }

            public final String getLogoImageUri() {
                return this.logoImageUri;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.logoImageUri;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.title;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder V0 = je.V0("Logo(logoImageUri=");
                V0.append(this.logoImageUri);
                V0.append(", title=");
                return je.I0(V0, this.title, ")");
            }
        }

        public static final class Text extends Headline {
            private final String title;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Text(String str) {
                super(null);
                h.e(str, "title");
                this.title = str;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = text.title;
                }
                return text.copy(str);
            }

            public final String component1() {
                return this.title;
            }

            public final Text copy(String str) {
                h.e(str, "title");
                return new Text(str);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Text) && h.a(this.title, ((Text) obj).title);
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
                return je.I0(je.V0("Text(title="), this.title, ")");
            }
        }

        private Headline() {
        }

        public /* synthetic */ Headline(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public static final class Model {
        private final int accentColor;
        private final String backgroundImageUri;
        private final Headline headline;
        private final boolean isPlayable;
        private final boolean isPlaying;
        private final String label;
        private final String subTitle;

        public Model(String str, Headline headline2, String str2, String str3, boolean z, boolean z2, int i) {
            h.e(str, "label");
            h.e(headline2, "headline");
            h.e(str2, "subTitle");
            h.e(str3, "backgroundImageUri");
            this.label = str;
            this.headline = headline2;
            this.subTitle = str2;
            this.backgroundImageUri = str3;
            this.isPlayable = z;
            this.isPlaying = z2;
            this.accentColor = i;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, Headline headline2, String str2, String str3, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = model.label;
            }
            if ((i2 & 2) != 0) {
                headline2 = model.headline;
            }
            if ((i2 & 4) != 0) {
                str2 = model.subTitle;
            }
            if ((i2 & 8) != 0) {
                str3 = model.backgroundImageUri;
            }
            if ((i2 & 16) != 0) {
                z = model.isPlayable;
            }
            if ((i2 & 32) != 0) {
                z2 = model.isPlaying;
            }
            if ((i2 & 64) != 0) {
                i = model.accentColor;
            }
            return model.copy(str, headline2, str2, str3, z, z2, i);
        }

        public final String component1() {
            return this.label;
        }

        public final Headline component2() {
            return this.headline;
        }

        public final String component3() {
            return this.subTitle;
        }

        public final String component4() {
            return this.backgroundImageUri;
        }

        public final boolean component5() {
            return this.isPlayable;
        }

        public final boolean component6() {
            return this.isPlaying;
        }

        public final int component7() {
            return this.accentColor;
        }

        public final Model copy(String str, Headline headline2, String str2, String str3, boolean z, boolean z2, int i) {
            h.e(str, "label");
            h.e(headline2, "headline");
            h.e(str2, "subTitle");
            h.e(str3, "backgroundImageUri");
            return new Model(str, headline2, str2, str3, z, z2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return h.a(this.label, model.label) && h.a(this.headline, model.headline) && h.a(this.subTitle, model.subTitle) && h.a(this.backgroundImageUri, model.backgroundImageUri) && this.isPlayable == model.isPlayable && this.isPlaying == model.isPlaying && this.accentColor == model.accentColor;
        }

        public final int getAccentColor() {
            return this.accentColor;
        }

        public final String getBackgroundImageUri() {
            return this.backgroundImageUri;
        }

        public final Headline getHeadline() {
            return this.headline;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public int hashCode() {
            String str = this.label;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Headline headline2 = this.headline;
            int hashCode2 = (hashCode + (headline2 != null ? headline2.hashCode() : 0)) * 31;
            String str2 = this.subTitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.backgroundImageUri;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.isPlayable;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.isPlaying;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return ((i7 + i3) * 31) + this.accentColor;
        }

        public final boolean isPlayable() {
            return this.isPlayable;
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Model(label=");
            V0.append(this.label);
            V0.append(", headline=");
            V0.append(this.headline);
            V0.append(", subTitle=");
            V0.append(this.subTitle);
            V0.append(", backgroundImageUri=");
            V0.append(this.backgroundImageUri);
            V0.append(", isPlayable=");
            V0.append(this.isPlayable);
            V0.append(", isPlaying=");
            V0.append(this.isPlaying);
            V0.append(", accentColor=");
            return je.B0(V0, this.accentColor, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Model(String str, Headline headline2, String str2, String str3, boolean z, boolean z2, int i, int i2, kotlin.jvm.internal.f fVar) {
            this(str, headline2, str2, str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, i);
        }
    }
}
