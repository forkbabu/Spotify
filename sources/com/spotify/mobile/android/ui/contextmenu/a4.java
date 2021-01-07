package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.instrumentation.a;
import com.spotify.instrumentation.navigation.logger.f;
import java.util.Map;

public final class a4<T> extends y3<T> {
    a4(a aVar, String str, String str2) {
        super(aVar, str, str2, null, false, f.C0160f.a, null);
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.y3
    public T f() {
        throw new IllegalStateException();
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.y3
    public boolean m() {
        return false;
    }

    a4(a aVar, String str, String str2, String str3, boolean z, Map<String, String> map) {
        super(aVar, str, str2, str3, z, f.C0160f.a, map);
    }
}
