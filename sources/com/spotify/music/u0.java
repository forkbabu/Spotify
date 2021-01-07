package com.spotify.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;
import com.spotify.music.navigation.t;

public class u0 implements t {
    private final Activity a;
    private final o b;
    private final b c;
    private final m d;
    private final String e;

    public u0(Activity activity, b bVar, o oVar, m mVar, String str) {
        this.a = activity;
        this.c = bVar;
        this.b = oVar;
        this.d = mVar;
        this.e = str;
    }

    private void h(n nVar, Optional<Bundle> optional) {
        Intent b2 = this.b.b(nVar);
        if (optional.isPresent()) {
            b2.putExtras(optional.get());
        }
        b2.putExtra("is_internal_navigation", true);
        this.d.g(o.a(b2));
        this.c.b(b2);
    }

    @Override // com.spotify.music.navigation.t
    public void a() {
        this.d.g(f.a.a);
        this.c.b(new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI").setClassName(this.a, this.e).setFlags(67108864));
    }

    @Override // com.spotify.music.navigation.t
    public void b(String str, String str2) {
        n.a a2 = n.a(str);
        a2.i(str2);
        h(a2.a(), Optional.absent());
    }

    @Override // com.spotify.music.navigation.t
    public void c(String str, String str2, Bundle bundle) {
        n.a a2 = n.a(str);
        a2.i(str2);
        h(a2.a(), Optional.of(bundle));
    }

    @Override // com.spotify.music.navigation.t
    public void d(String str) {
        n.a a2 = n.a(str);
        a2.i(null);
        h(a2.a(), Optional.absent());
    }

    @Override // com.spotify.music.navigation.t
    public void e(n nVar) {
        h(nVar, Optional.absent());
    }

    @Override // com.spotify.music.navigation.t
    public void f(String str, Bundle bundle) {
        n.a a2 = n.a(str);
        a2.i(null);
        h(a2.a(), Optional.of(bundle));
    }

    @Override // com.spotify.music.navigation.t
    public void g(n nVar, Optional<Bundle> optional) {
        h(nVar, optional);
    }
}
