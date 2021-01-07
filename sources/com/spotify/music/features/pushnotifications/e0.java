package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.CategorySection;
import io.reactivex.functions.l;

public final /* synthetic */ class e0 implements l {
    public static final /* synthetic */ e0 a = new e0();

    private /* synthetic */ e0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((CategorySection) obj).getPreferences();
    }
}
