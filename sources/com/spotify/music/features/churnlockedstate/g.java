package com.spotify.music.features.churnlockedstate;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = u.e;
        return (Boolean) ((Optional) obj).transform(h.a).or((Optional) Boolean.FALSE);
    }
}
