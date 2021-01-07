package com.spotify.mobile.android.hubframework.defaults;

import android.util.SparseArray;

public interface g {

    public static final class a implements u51 {
        private final HubsGlueImageDelegate a;
        private final SparseArray<g> b;

        private a(HubsGlueImageDelegate hubsGlueImageDelegate, g[] gVarArr) {
            hubsGlueImageDelegate.getClass();
            this.a = hubsGlueImageDelegate;
            this.b = new SparseArray<>(gVarArr.length);
            for (g gVar : gVarArr) {
                this.b.append(gVar.getId(), gVar);
            }
        }

        @SafeVarargs
        public static <T extends g> a b(HubsGlueImageDelegate hubsGlueImageDelegate, T... tArr) {
            return new a(hubsGlueImageDelegate, tArr);
        }

        @Override // defpackage.u51
        public s51<?> a(int i) {
            g gVar = this.b.get(i);
            if (gVar != null) {
                return gVar.d(this.a);
            }
            return null;
        }
    }

    d<?> d(HubsGlueImageDelegate hubsGlueImageDelegate);

    int getId();
}
