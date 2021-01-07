package com.spotify.music.homething.settings.adapter;

import com.google.common.base.Predicate;
import com.spotify.music.homething.settings.adapter.HomethingSettingsAdapter;

public final /* synthetic */ class c implements Predicate {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        ft9 ft9 = (ft9) obj;
        int i = HomethingSettingsAdapter.r;
        return ft9.visibility() && HomethingSettingsAdapter.Type.h(ft9.type());
    }
}
