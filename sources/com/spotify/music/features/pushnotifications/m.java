package com.spotify.music.features.pushnotifications;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.a;

public final /* synthetic */ class m implements a {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ SpSharedPreferences b;
    public final /* synthetic */ SpSharedPreferences.b c;
    public final /* synthetic */ p0 d;

    public /* synthetic */ m(o0 o0Var, SpSharedPreferences spSharedPreferences, SpSharedPreferences.b bVar, p0 p0Var) {
        this.a = o0Var;
        this.b = spSharedPreferences;
        this.c = bVar;
        this.d = p0Var;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b, this.c, this.d);
    }
}
