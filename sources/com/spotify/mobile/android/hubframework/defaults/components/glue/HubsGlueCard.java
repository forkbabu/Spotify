package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.components.card.Card;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.f;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlueCard implements q81, v51 {
    CATEGORY("glue:categoryCard") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.CATEGORY.getId();
        }
    },
    ENTITY("glue:entityCard") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueCard.NORMAL.d(s81);
        }
    },
    NORMAL("glue:card") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            Impl impl;
            s81.getClass();
            if (Settings.h(s81)) {
                if ((s81.text().subtitle() == null || rw.equal(s81.custom().string("glue:subtitleStyle", ""), "metadata")) && s81.text().description() == null) {
                    impl = Impl.TITLE_METADATA;
                } else {
                    impl = Impl.TITLE_SUBTITLE;
                }
            } else if (s81.text().title() != null) {
                impl = Impl.TITLE;
            } else {
                impl = Impl.NO_TEXT;
            }
            return impl.getId();
        }
    };
    
    private final String mComponentId;

    private enum Impl implements g {
        CATEGORY(C0707R.id.hub_glue_card_category) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new g(hubsGlueImageDelegate);
            }
        },
        NO_TEXT(C0707R.id.hub_glue_card_no_text) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f.b(hubsGlueImageDelegate);
            }
        },
        TITLE(C0707R.id.hub_glue_card_title) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f.c(hubsGlueImageDelegate);
            }
        },
        TITLE_METADATA(C0707R.id.hub_glue_card_title_metadata) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f.d(hubsGlueImageDelegate);
            }
        },
        TITLE_SUBTITLE(C0707R.id.hub_glue_card_title_subtitle) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f.e(hubsGlueImageDelegate);
            }
        };
        
        private static final Impl[] o = values();
        private final int mId;

        Impl(int i, AnonymousClass1 r4) {
            this.mId = i;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public final int getId() {
            return this.mId;
        }
    }

    public static final class Settings {

        public enum TextLayout {
            DEFAULT("default", Card.TextLayout.DEFAULT),
            DOUBLE_LINE_TITLE("doubleLineTitle", Card.TextLayout.DOUBLE_LINE_TITLE),
            DOUBLE_LINE_SUBTITLE("doubleLineSubtitle", Card.TextLayout.DOUBLE_LINE_SUBTITLE);
            
            private final p81 mAsBundle;
            private final Card.TextLayout mImplementation;
            private final String mValue;

            /* access modifiers changed from: private */
            public static final class a {
                private static final kg0<TextLayout> a = kg0.b(TextLayout.class, a.a);
                public static final /* synthetic */ int b = 0;
            }

            private TextLayout(String str, Card.TextLayout textLayout) {
                this.mValue = str;
                this.mImplementation = textLayout;
                this.mAsBundle = z81.a().p("textLayout", str).d();
            }

            /* access modifiers changed from: package-private */
            public Card.TextLayout h() {
                return this.mImplementation;
            }
        }

        public static CharSequence a(s81 s81) {
            return i(s81.text().accessory(), s81.custom().boolValue("glue:accessoryAsHtml", false));
        }

        public static CharSequence b(s81 s81) {
            return i(s81.text().description(), s81.custom().boolValue("glue:descriptionAsHtml", false));
        }

        public static CharSequence c(s81 s81) {
            return i(s81.text().subtitle(), s81.custom().boolValue("glue:subtitleAsHtml", false));
        }

        public static CharSequence d(s81 s81) {
            return i(s81.text().title(), s81.custom().boolValue("glue:titleAsHtml", false));
        }

        private static boolean e(s81 s81) {
            return s81.custom().bundle("calendar") != null;
        }

        static boolean f(s81 s81) {
            return s81.images().icon() != null || e(s81);
        }

        static boolean g(s81 s81) {
            return (s81.images().main() == null && s81.images().icon() == null && !e(s81)) ? false : true;
        }

        public static boolean h(s81 s81) {
            w81 text = s81.text();
            return (text.title() == null || (text.subtitle() == null && text.accessory() == null && text.description() == null)) ? false : true;
        }

        private static CharSequence i(String str, boolean z) {
            if (str == null) {
                str = "";
            }
            return (!z || MoreObjects.isNullOrEmpty(str)) ? str : z42.m(str);
        }

        static void j(fa0 fa0, s81 s81, HubsGlueImageDelegate hubsGlueImageDelegate, cqe cqe) {
            if (e(s81)) {
                s42 b = s42.b(fa0.getImageView(), cqe);
                p81 bundle = s81.custom().bundle("calendar");
                if (bundle != null) {
                    b.c(bundle.string("month", "APR"), bundle.intValue("day_of_month", 1));
                    return;
                }
                return;
            }
            ImageView imageView = fa0.getImageView();
            x81 main = s81.images().main();
            String icon = s81.images().icon();
            HubsGlueImageConfig hubsGlueImageConfig = HubsGlueImageConfig.THUMBNAIL;
            if (icon != null) {
                hubsGlueImageDelegate.g(imageView, icon);
            } else {
                hubsGlueImageDelegate.d(imageView, main, hubsGlueImageConfig);
            }
        }

        public static p81 k(TextLayout textLayout) {
            return textLayout.mAsBundle;
        }
    }

    HubsGlueCard(String str, AnonymousClass1 r4) {
        str.getClass();
        this.mComponentId = str;
    }

    public static int g() {
        return Impl.TITLE_SUBTITLE.getId();
    }

    public static u51 h(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.o);
    }

    @Override // defpackage.q81
    public final String category() {
        return HubsComponentCategory.CARD.d();
    }

    @Override // defpackage.q81
    public final String id() {
        return this.mComponentId;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return this.mComponentId;
    }
}
