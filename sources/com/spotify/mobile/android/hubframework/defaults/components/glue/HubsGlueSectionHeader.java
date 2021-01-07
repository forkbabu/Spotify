package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.x;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlueSectionHeader implements q81, v51 {
    SECTION_HEADER("glue:sectionHeader") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            if (!MoreObjects.isNullOrEmpty(s81.text().description())) {
                return Impl.SECTION_HEADER_LARGE_WITH_DESCRIPTION.getId();
            }
            return Impl.SECTION_HEADER_LARGE.getId();
        }
    },
    SECTION_HEADER_LARGE("glue:row:sectionHeaderLarge") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_LARGE.getId();
        }
    },
    SECTION_HEADER_LARGE_WITH_DESCRIPTION("glue:row:sectionHeaderLargeWithDescription") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_LARGE_WITH_DESCRIPTION.getId();
        }
    },
    SECTION_HEADER_SMALL("glue:sectionHeaderSmall") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            if (!MoreObjects.isNullOrEmpty(s81.text().description())) {
                return Impl.SECTION_HEADER_SMALL_WITH_DESCRIPTION.getId();
            }
            return Impl.SECTION_HEADER_SMALL.getId();
        }
    },
    SECTION_HEADER_SMALL_NO_DESCRIPTION("glue:row:sectionHeaderSmall") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_SMALL_WITH_DESCRIPTION.getId();
        }
    },
    SECTION_HEADER_SMALL_WITH_DESCRIPTION("glue:row:sectionHeaderSmallWithDescription") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_SMALL_WITH_DESCRIPTION.getId();
        }
    };
    
    private final String mComponentId;

    private enum Impl implements g {
        SECTION_HEADER_LARGE(C0707R.id.hub_glue_section_header_large) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new x.b();
            }
        },
        SECTION_HEADER_LARGE_WITH_DESCRIPTION(C0707R.id.hub_glue_section_header_large_with_description) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new x.c();
            }
        },
        SECTION_HEADER_SMALL(C0707R.id.hub_glue_section_header_small) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new x.d();
            }
        },
        SECTION_HEADER_SMALL_WITH_DESCRIPTION(C0707R.id.hub_glue_section_header_small_with_description) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new x.e();
            }
        };
        
        private static final Impl[] n = values();
        private final int mId;

        Impl(int i, AnonymousClass1 r4) {
            this.mId = i;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public final int getId() {
            return this.mId;
        }
    }

    HubsGlueSectionHeader(String str, AnonymousClass1 r4) {
        str.getClass();
        this.mComponentId = str;
    }

    public static int g() {
        return Impl.SECTION_HEADER_LARGE.getId();
    }

    public static u51 h(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.n);
    }

    @Override // defpackage.q81
    public String category() {
        return HubsComponentCategory.SECTION_HEADER.d();
    }

    @Override // defpackage.q81
    public String id() {
        return this.mComponentId;
    }
}
