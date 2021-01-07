package com.spotify.music.carmode.navigation;

import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.z;

public class t implements s {
    public static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("com.spotify.music.KEY_CARMODE_VOICE_FIRST_TIME_USER");
    public static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("com.spotify.music.KEY_CARMODE_HOME_FIRST_TIME_USER");
    private final z<SpSharedPreferences<Object>> a;
    private final q b;

    t(i iVar, Context context, g<SessionState> gVar, q qVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = qVar;
        this.a = gVar.E().A(n.a).A(new h(iVar, applicationContext));
    }

    public s<Boolean> a() {
        return this.a.v(k.a);
    }

    public s<Boolean> b() {
        return this.a.v(g.a);
    }

    public void c() {
        this.b.a(this.a.subscribe(i.a));
    }

    public void d() {
        this.b.a(this.a.subscribe(j.a));
    }
}
