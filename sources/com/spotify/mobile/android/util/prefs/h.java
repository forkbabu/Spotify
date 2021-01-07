package com.spotify.mobile.android.util.prefs;

import android.content.SharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.c;
import io.reactivex.t;
import io.reactivex.u;

/* access modifiers changed from: package-private */
public class h<S, T> implements u<SpSharedPreferences.Update<T>> {
    private final SpSharedPreferences<S> a;
    private final SpSharedPreferences.b<S, T> b;
    private final c<SpSharedPreferences<S>, SpSharedPreferences.b<S, T>, T> c;

    public h(SpSharedPreferences<S> spSharedPreferences, SpSharedPreferences.b<S, T> bVar, c<SpSharedPreferences<S>, SpSharedPreferences.b<S, T>, T> cVar) {
        this.a = spSharedPreferences;
        bVar.getClass();
        this.b = bVar;
        this.c = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.t */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(t tVar, String str, SharedPreferences sharedPreferences, String str2) {
        if (tVar.d() || !str.equals(str2)) {
            return;
        }
        if (!sharedPreferences.contains(str2)) {
            tVar.onNext(new SpSharedPreferences.Update(SpSharedPreferences.Update.Type.NOT_IN_PREFS, null));
            return;
        }
        try {
            T a2 = this.c.a(this.a, this.b);
            tVar.onNext(new SpSharedPreferences.Update(a2 == null ? SpSharedPreferences.Update.Type.SET_TO_NULL : SpSharedPreferences.Update.Type.CHANGED, a2));
        } catch (Exception e) {
            tVar.onError(e);
        }
    }

    public /* synthetic */ void b(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.k().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // io.reactivex.u
    public void subscribe(t<SpSharedPreferences.Update<T>> tVar) {
        b bVar = new b(this, tVar, this.b.a());
        this.a.k().registerOnSharedPreferenceChangeListener(bVar);
        tVar.e(new c(this, bVar));
    }
}
