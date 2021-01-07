package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.v;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.hubframework.defaults.g;
import com.spotify.music.C0707R;

public enum HubsGlueRow implements q81, v51 {
    ENTITY("glue:entityRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueRow.NORMAL.d(s81);
        }
    },
    MULTILINE("glue:text") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.MULTILINE.getId();
        }
    },
    MULTILINE_CAPPED("glue:textRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.MULTILINE_CAPPED.getId();
        }
    },
    NAVIGATION("glue:navigationRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return (HubsGlueCard.Settings.f(s81) ? Impl.SINGLE_LINE_IMAGE_SMALL : Impl.SINGLE_LINE_SMALL).getId();
        }
    },
    NORMAL("glue:row") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            Impl impl;
            s81.getClass();
            if (HubsGlueCard.Settings.h(s81)) {
                if (HubsGlueCard.Settings.g(s81)) {
                    int i = t.c;
                    impl = s81.custom().boolValue("hubs:glue:muted", false) ? Impl.TWO_LINE_IMAGE_MUTED : Impl.TWO_LINE_IMAGE;
                } else {
                    if (s81.custom().intValue("row_number") != null) {
                        int i2 = t.c;
                        impl = s81.custom().boolValue("hubs:glue:muted", false) ? Impl.TWO_LINE_NUMBER_MUTED : Impl.TWO_LINE_NUMBER;
                    } else {
                        int i3 = t.c;
                        impl = s81.custom().boolValue("hubs:glue:muted", false) ? Impl.TWO_LINE_MUTED : Impl.TWO_LINE;
                    }
                }
            } else if (s81.text().description() != null) {
                impl = Impl.MULTILINE;
            } else if (HubsGlueCard.Settings.g(s81)) {
                impl = Impl.SINGLE_LINE_IMAGE;
            } else {
                impl = Impl.SINGLE_LINE;
            }
            return impl.getId();
        }
    },
    SMALL("glue:smallRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return (HubsGlueCard.Settings.g(s81) ? Impl.SINGLE_LINE_IMAGE_SMALL : Impl.SINGLE_LINE_SMALL).getId();
        }
    },
    VIDEO("glue:videoRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return Impl.TWO_LINE_LANDSCAPE_IMAGE.getId();
        }
    };
    
    private final String mComponentId;

    private enum Impl implements g {
        MULTILINE(C0707R.id.hub_glue_row_multiline) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.b(hubsGlueImageDelegate);
            }
        },
        MULTILINE_CAPPED(C0707R.id.hub_glue_row_multiline_capped) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.b.a(hubsGlueImageDelegate);
            }
        },
        SINGLE_LINE(C0707R.id.hub_glue_row_single_line) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.c(hubsGlueImageDelegate);
            }
        },
        SINGLE_LINE_IMAGE(C0707R.id.hub_glue_row_single_line_image) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.c.b(hubsGlueImageDelegate);
            }
        },
        SINGLE_LINE_IMAGE_SMALL(C0707R.id.hub_glue_row_single_line_image_small) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.c.a.C0177a(hubsGlueImageDelegate);
            }
        },
        SINGLE_LINE_SMALL(C0707R.id.hub_glue_row_single_line_small) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.c.a(hubsGlueImageDelegate);
            }
        },
        TWO_LINE(C0707R.id.hub_glue_row_two_line) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d(hubsGlueImageDelegate, false);
            }
        },
        TWO_LINE_IMAGE(C0707R.id.hub_glue_row_two_line_image) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d.a(hubsGlueImageDelegate, false);
            }
        },
        TWO_LINE_IMAGE_MUTED(C0707R.id.hub_glue_row_two_line_image_muted) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d.a(hubsGlueImageDelegate, true);
            }
        },
        TWO_LINE_LANDSCAPE_IMAGE(C0707R.id.hub_glue_row_two_line_landscape_image) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d.a.C0178a(hubsGlueImageDelegate, false);
            }
        },
        TWO_LINE_MUTED(C0707R.id.hub_glue_row_two_line_muted) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d(hubsGlueImageDelegate, true);
            }
        },
        TWO_LINE_NUMBER(C0707R.id.hub_glue_row_two_line_number) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d.b(hubsGlueImageDelegate, false);
            }
        },
        TWO_LINE_NUMBER_MUTED(C0707R.id.hub_glue_row_two_line_number_muted) {
            @Override // com.spotify.mobile.android.hubframework.defaults.g
            public d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate) {
                return new v.d.b(hubsGlueImageDelegate, true);
            }
        };
        
        private static final Impl[] w = values();
        private final int mId;

        Impl(int i, AnonymousClass1 r4) {
            this.mId = i;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.g
        public int getId() {
            return this.mId;
        }
    }

    HubsGlueRow(String str, AnonymousClass1 r4) {
        str.getClass();
        this.mComponentId = str;
    }

    public static int g() {
        return Impl.TWO_LINE.getId();
    }

    public static u51 h(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return g.a.b(hubsGlueImageDelegate, Impl.w);
    }

    @Override // defpackage.q81
    public final String category() {
        return HubsComponentCategory.ROW.d();
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
