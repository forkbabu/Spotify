package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.instrumentation.a;
import com.spotify.instrumentation.navigation.logger.f;
import java.util.Map;

public final class q3<T> extends y3<T> {
    private final T i;

    q3(a aVar, String str, String str2, String str3, boolean z, Map<String, String> map, T t) {
        super(aVar, str, str2, str3, z, f.C0160f.a, map);
        this.i = t;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.y3
    public T f() {
        return this.i;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.y3
    public boolean m() {
        return true;
    }
}
