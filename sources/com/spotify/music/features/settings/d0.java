package com.spotify.music.features.settings;

import com.google.common.base.Optional;
import io.reactivex.functions.c;

public final /* synthetic */ class d0 implements c {
    public static final /* synthetic */ d0 a = new d0();

    private /* synthetic */ d0() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Optional optional = (Optional) obj;
        Optional optional2 = (Optional) obj2;
        int i = SettingsFragment.m1;
        return optional.isPresent() ? optional : optional2;
    }
}
