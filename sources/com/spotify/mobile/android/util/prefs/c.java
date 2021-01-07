package com.spotify.mobile.android.util.prefs;

import android.content.SharedPreferences;
import io.reactivex.functions.f;

public final /* synthetic */ class c implements f {
    public final /* synthetic */ h a;
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener b;

    public /* synthetic */ c(h hVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a = hVar;
        this.b = onSharedPreferenceChangeListener;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.b(this.b);
    }
}
