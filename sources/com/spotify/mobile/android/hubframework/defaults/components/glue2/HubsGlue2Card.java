package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.e;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlue2Card implements q81, v51 {
    CATEGORY("glue2:categoryCard") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.CATEGORY.getId();
        }
    },
    LARGE("glue2:cardLarge") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            s81.getClass();
            if (TextUtils.isEmpty(s81.text().title()) && TextUtils.isEmpty(s81.text().subtitle())) {
                return Impl.LARGE_NO_TEXT.getId();
            }
            return Impl.LARGE_DESCRIPTION_ONLY.getId();
        }
    },
    REGULAR("glue2:card") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            Impl impl;
            s81.getClass();
            if ((s81.text().title() == null || s81.text().subtitle() == null) ? false : true) {
                if (rw.equal(s81.custom().string("subtitleStyle", ""), "metadata")) {
                    impl = Impl.TITLE_METADATA;
                } else {
                    impl = Impl.TITLE_SUBTITLE;
                }
            } else if (rw.equal("description", s81.custom().string("titleStyle"))) {
                impl = Impl.DESCRIPTION_ONLY;
            } else {
                impl = Impl.TITLE;
            }
            return impl.getId();
        }
    };
    
    private final String mComponentId;

    private enum Impl implements g {
        CATEGORY(C0707R.id.hub_glue2_card_category) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new h(hubsGlueImageDelegate);
            }
        },
        DESCRIPTION_ONLY(C0707R.id.hub_glue2_regular_card_description_only) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.c(hubsGlueImageDelegate);
            }
        },
        LARGE_DESCRIPTION_ONLY(C0707R.id.hub_glue2_regular_card_large_description_only) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.d(hubsGlueImageDelegate);
            }
        },
        LARGE_NO_TEXT(C0707R.id.hub_glue2_regular_card_large_no_text) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.C0180e(hubsGlueImageDelegate);
            }
        },
        TITLE(C0707R.id.hub_glue2_regular_card_title) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.f(hubsGlueImageDelegate);
            }
        },
        TITLE_METADATA(C0707R.id.hub_glue2_regular_card_title_metadata) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.g(hubsGlueImageDelegate);
            }
        },
        TITLE_SUBTITLE(C0707R.id.hub_glue2_regular_card_title_subtitle) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new e.h(hubsGlueImageDelegate);
            }
        };
        
        private static final Impl[] q = values();
        private final int mId;

        Impl(int i, AnonymousClass1 r4) {
            this.mId = i;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public final int getId() {
            return this.mId;
        }
    }

    HubsGlue2Card(String str, AnonymousClass1 r4) {
        str.getClass();
        this.mComponentId = str;
    }

    public static u51 g(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.q);
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
