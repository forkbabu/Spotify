package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.adjust.sdk.Constants;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlue2SectionHeader implements q81, v51 {
    SECTION_HEADER("glue2:sectionHeader", HubsComponentCategory.SECTION_HEADER) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            String string = s81.custom().string("style");
            if (!MoreObjects.isNullOrEmpty(string)) {
                return Impl.g(string).getId();
            }
            if (!MoreObjects.isNullOrEmpty(s81.text().subtitle())) {
                return Impl.DEFAULT_WITH_SUBTITLE.getId();
            }
            return Impl.DEFAULT.getId();
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    private enum Impl implements g {
        DEFAULT(C0707R.id.hub_glue2_section_header, "default") {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new w();
            }
        },
        DEFAULT_WITH_SUBTITLE(C0707R.id.hub_glue2_section_header_with_subtitle, "defaultWithSubtitle") {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new y();
            }
        },
        DEFAULT_WITH_METADATA(C0707R.id.hub_glue2_section_header_with_metadata, "defaultWithMetadata") {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new x();
            }
        },
        LARGE(C0707R.id.hub_glue2_section_header_large, Constants.LARGE) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new a0();
            }
        },
        SMALL(C0707R.id.hub_glue2_section_header_small, Constants.SMALL) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new b0();
            }
        },
        EXTRA_SMALL(C0707R.id.hub_glue2_section_header_extra_small, "extraSmall") {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new z();
            }
        };
        
        private static final Impl[] p = values();
        private final int mId;
        private final String mStyle;

        Impl(int i, String str, AnonymousClass1 r5) {
            this.mId = i;
            this.mStyle = str;
        }

        static Impl g(String str) {
            Impl[] values = values();
            for (int i = 0; i < 6; i++) {
                Impl impl = values[i];
                if (impl.mStyle.equals(str)) {
                    return impl;
                }
            }
            throw new IllegalArgumentException(je.x0("Unknown style: ", str));
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public final int getId() {
            return this.mId;
        }
    }

    HubsGlue2SectionHeader(String str, HubsComponentCategory hubsComponentCategory, AnonymousClass1 r5) {
        str.getClass();
        this.mComponentId = str;
        hubsComponentCategory.getClass();
        this.mCategory = hubsComponentCategory.d();
    }

    public static u51 g(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.p);
    }

    @Override // defpackage.q81
    public String category() {
        return this.mCategory;
    }

    @Override // defpackage.q81
    public String id() {
        return this.mComponentId;
    }
}
