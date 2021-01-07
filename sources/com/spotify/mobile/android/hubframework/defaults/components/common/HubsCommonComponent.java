package com.spotify.mobile.android.hubframework.defaults.components.common;

import android.util.SparseArray;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;

public enum HubsCommonComponent implements q81, z71 {
    LOADING_SPINNER(C0707R.id.hub_common_loading_view, "app:loading_spinner", HubsComponentCategory.SPINNER, new b());
    
    private static final mg0<SparseArray<s51<?>>> b = mg0.b(new y71(HubsCommonComponent.class));
    private static final v51 c = a81.a(HubsCommonComponent.class);
    private final d<?> mBinder;
    private final int mBinderId;
    private final String mCategory;
    private final String mComponentId;

    static {
        int i = a81.a;
    }

    private HubsCommonComponent(int i, String str, HubsComponentCategory hubsComponentCategory, d dVar) {
        this.mBinderId = i;
        this.mComponentId = str;
        hubsComponentCategory.getClass();
        this.mCategory = hubsComponentCategory.d();
        this.mBinder = dVar;
    }

    public static SparseArray<s51<?>> h() {
        return b.a();
    }

    public static v51 i() {
        return c;
    }

    @Override // defpackage.q81
    public String category() {
        return this.mCategory;
    }

    @Override // defpackage.z71
    public int d() {
        return this.mBinderId;
    }

    @Override // defpackage.z71
    public d<?> g() {
        return this.mBinder;
    }

    @Override // defpackage.q81
    public String id() {
        return this.mComponentId;
    }
}
