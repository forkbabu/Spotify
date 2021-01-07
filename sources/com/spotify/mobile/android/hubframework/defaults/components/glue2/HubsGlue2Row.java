package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.b;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.p;
import com.spotify.music.C0707R;

public enum HubsGlue2Row implements q81, v51 {
    CALENDAR_ROW("glue2:calendarRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            s81.getClass();
            return s81.text().title() != null && s81.text().subtitle() != null ? HubsGlue2Row.q : HubsGlue2Row.o;
        }
    },
    IMAGE_ROW("glue2:imageRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            s81.getClass();
            return s81.text().title() != null && s81.text().subtitle() != null ? HubsGlue2Row.r : HubsGlue2Row.p;
        }
    },
    MULTILINE("glue2:text") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlue2Row.n;
        }
    },
    VIDEO("glue2:videoRow") {
        @Override // defpackage.v51
        public int d(s81 s81) {
            return HubsGlue2Row.s;
        }
    };
    
    public static final int n = C0707R.id.hub_glue2_row_multiline;
    public static final int o = C0707R.id.hub_glue2_row_single_line_calendar;
    public static final int p = C0707R.id.hub_glue2_row_single_line_image;
    public static final int q = C0707R.id.hub_glue2_row_two_line_calendar;
    public static final int r = C0707R.id.hub_glue2_row_two_line_image;
    public static final int s = C0707R.id.hub_glue2_video_row;
    private final String mComponentId;

    public static class a implements u51 {
        final SparseArray<s51<?>> a;

        public a(t tVar, b.C0179b bVar, p.a aVar, b.c cVar, p.b bVar2, h0 h0Var) {
            SparseArray<s51<?>> sparseArray = new SparseArray<>();
            this.a = sparseArray;
            sparseArray.append(HubsGlue2Row.n, tVar);
            sparseArray.append(HubsGlue2Row.o, bVar);
            sparseArray.append(HubsGlue2Row.p, aVar);
            sparseArray.append(HubsGlue2Row.q, cVar);
            sparseArray.append(HubsGlue2Row.r, bVar2);
            sparseArray.append(HubsGlue2Row.s, h0Var);
        }

        @Override // defpackage.u51
        public s51<?> a(int i) {
            return this.a.get(i);
        }
    }

    HubsGlue2Row(String str, AnonymousClass1 r4) {
        str.getClass();
        this.mComponentId = str;
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
