package com.spotify.music.libs.bluetooth;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import java.util.Set;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        CategorizerResponse categorizerResponse = (CategorizerResponse) obj;
        SpSharedPreferences.b<Object, Set<String>> bVar = j.e;
        Logger.b("Categorized as %s", categorizerResponse.category());
        return categorizerResponse.category();
    }
}
