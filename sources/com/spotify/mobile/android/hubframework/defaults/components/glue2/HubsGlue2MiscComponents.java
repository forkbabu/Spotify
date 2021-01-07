package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.k;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
public enum HubsGlue2MiscComponents implements q81, v51 {
    CAROUSEL("glue2:carousel", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlue2MiscComponents.n;
        }
    },
    EMPTY_STATE("glue2:emptyState", HubsComponentCategory.CARD) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            String string = s81.custom().string("style");
            if (AppProtocol.LogMessage.SEVERITY_ERROR.equals(string)) {
                return HubsGlue2MiscComponents.o;
            }
            if ("noResults".equals(string)) {
                return HubsGlue2MiscComponents.p;
            }
            je.p("Unsupported empty state style: ", string);
            return HubsGlue2MiscComponents.p;
        }
    },
    GRADIENT("glue2:gradient", r1) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlue2MiscComponents.q;
        }
    },
    SIMPLE_HEADER("glue2:simpleHeader", HubsComponentCategory.HEADER) {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlue2MiscComponents.r;
        }
    };
    
    private static final int n = C0707R.id.hub_glue2_carousel;
    private static final int o = C0707R.id.hub_glue2_empty_state_error;
    private static final int p = C0707R.id.hub_glue2_empty_state_no_result;
    private static final int q = C0707R.id.hub_glue2_gradient;
    private static final int r = C0707R.id.hub_glue2_simple_header;
    private final String mCategory;
    private final String mComponentId;

    public static class a implements u51 {
        final SparseArray<s51<?>> a;

        public a(f fVar, k.a aVar, k.b bVar, n nVar, d0 d0Var) {
            SparseArray<s51<?>> sparseArray = new SparseArray<>();
            this.a = sparseArray;
            sparseArray.append(HubsGlue2MiscComponents.n, fVar);
            sparseArray.append(HubsGlue2MiscComponents.o, aVar);
            sparseArray.append(HubsGlue2MiscComponents.p, bVar);
            sparseArray.append(HubsGlue2MiscComponents.q, nVar);
            sparseArray.append(HubsGlue2MiscComponents.r, d0Var);
        }

        @Override // defpackage.u51
        public s51<?> a(int i) {
            return this.a.get(i);
        }
    }

    static {
        HubsComponentCategory hubsComponentCategory = HubsComponentCategory.ROW;
    }

    HubsGlue2MiscComponents(String str, HubsComponentCategory hubsComponentCategory, AnonymousClass1 r5) {
        str.getClass();
        this.mComponentId = str;
        hubsComponentCategory.getClass();
        this.mCategory = hubsComponentCategory.d();
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
