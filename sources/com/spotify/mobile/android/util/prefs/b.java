package com.spotify.mobile.android.util.prefs;

import android.content.SharedPreferences;
import io.reactivex.t;

public final /* synthetic */ class b implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(h hVar, t tVar, String str) {
        this.a = hVar;
        this.b = tVar;
        this.c = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.a(this.b, this.c, sharedPreferences, str);
    }
}
