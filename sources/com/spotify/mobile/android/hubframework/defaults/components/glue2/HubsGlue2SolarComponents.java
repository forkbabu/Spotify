package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.f0;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
@Deprecated
public enum HubsGlue2SolarComponents implements q81, v51 {
    SECTION_HEADER("glue2:solarSectionHeader", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER.getId();
        }
    },
    SECTION_HEADER_LARGE("glue2:solarSectionHeaderLarge", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_LARGE.getId();
        }
    },
    SECTION_HEADER_SMALL("glue2:solarSectionHeaderSmall", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_SMALL.getId();
        }
    },
    SECTION_HEADER_WITH_DESCRIPTION("glue2:solarSectionHeaderWithDescription", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_WITH_DESCRIPTION.getId();
        }
    },
    SECTION_HEADER_WITH_RECOMMENDATION("glue2:solarSectionHeaderWithRecommendation", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.SECTION_HEADER_WITH_RECOMMENDATION.getId();
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    private enum Impl implements g {
        SECTION_HEADER(C0707R.id.hub_glue2_solar_section_header) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f0.c();
            }
        },
        SECTION_HEADER_LARGE(C0707R.id.hub_glue2_solar_section_header_large) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f0.a();
            }
        },
        SECTION_HEADER_SMALL(C0707R.id.hub_glue2_solar_section_header_small) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f0.b();
            }
        },
        SECTION_HEADER_WITH_DESCRIPTION(C0707R.id.hub_glue2_solar_section_header_with_subtitle) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f0.d();
            }
        },
        SECTION_HEADER_WITH_RECOMMENDATION(C0707R.id.hub_glue2_solar_section_header_with_metadata) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new f0.e();
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

    static {
        HubsComponentCategory hubsComponentCategory = HubsComponentCategory.SECTION_HEADER;
    }

    HubsGlue2SolarComponents(String str, HubsComponentCategory hubsComponentCategory, AnonymousClass1 r5) {
        str.getClass();
        this.mComponentId = str;
        hubsComponentCategory.getClass();
        this.mCategory = hubsComponentCategory.d();
    }

    public static u51 g(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.o);
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
