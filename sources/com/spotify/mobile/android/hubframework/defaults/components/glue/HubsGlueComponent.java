package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;
import com.spotify.music.C0707R;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
public enum HubsGlueComponent implements q81, v51 {
    BACKGROUND("glue:gradient", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.r;
        }
    },
    CAROUSEL("glue:carousel", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.s;
        }
    },
    EMPTY_VIEW("glue:emptyview", HubsComponentCategory.CARD) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.t;
        }
    },
    HEADER("glue:header", r7) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return s81.images().main() != null ? HubsGlueComponent.u : HubsGlueComponent.v;
        }
    },
    HEADER_COVER_ART("glue:header:cover", r7) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.u;
        }
    },
    HEADER_LARGE("glue:header:large", r7) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.v;
        }
    },
    HEADER_NEW("glue:header:header", r7) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.w;
        }
    },
    SHUFFLE_BUTTON("glue:shuffleButton", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlueComponent.x;
        }
    };
    
    private static final int r = C0707R.id.hub_glue_background;
    private static final int s = C0707R.id.hub_glue_carousel;
    private static final int t = C0707R.id.hub_glue_empty_view;
    private static final int u = C0707R.id.hub_glue_header_cover_art;
    private static final int v = C0707R.id.hub_glue_header_large;
    private static final int w = C0707R.id.hub_glue_header_header;
    private static final int x = C0707R.id.hub_glue_shuffle_button;
    private final String mCategory;
    private final String mComponentId;

    public static class a implements u51 {
        final SparseArray<s51<?>> a;

        public a(c0 c0Var, c cVar, l lVar, n.b bVar, n.d dVar, n.c cVar2, a0 a0Var) {
            SparseArray<s51<?>> sparseArray = new SparseArray<>();
            this.a = sparseArray;
            sparseArray.append(HubsGlueComponent.r, c0Var);
            sparseArray.append(HubsGlueComponent.s, cVar);
            sparseArray.append(HubsGlueComponent.t, lVar);
            sparseArray.append(HubsGlueComponent.u, bVar);
            sparseArray.append(HubsGlueComponent.v, dVar);
            sparseArray.append(HubsGlueComponent.w, cVar2);
            sparseArray.append(HubsGlueComponent.x, a0Var);
        }

        @Override // defpackage.u51
        public s51<?> a(int i) {
            return this.a.get(i);
        }
    }

    static {
        HubsComponentCategory hubsComponentCategory = HubsComponentCategory.ROW;
        HubsComponentCategory hubsComponentCategory2 = HubsComponentCategory.HEADER;
    }

    HubsGlueComponent(String str, HubsComponentCategory hubsComponentCategory, AnonymousClass1 r5) {
        str.getClass();
        this.mComponentId = str;
        hubsComponentCategory.getClass();
        this.mCategory = hubsComponentCategory.d();
    }

    public static int p() {
        return w;
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
