package com.spotify.music.features.playlistentity.viewbinder;

import android.os.Bundle;
import com.spotify.music.features.playlistentity.t;
import defpackage.as6;
import io.reactivex.a;

/* access modifiers changed from: package-private */
public class t0 implements t {
    final /* synthetic */ po6 a;
    final /* synthetic */ b76 b;
    final /* synthetic */ as6.a c;
    final /* synthetic */ q0 f;

    t0(q0 q0Var, po6 po6, b76 b76, as6.a aVar) {
        this.f = q0Var;
        this.a = po6;
        this.b = b76;
        this.c = aVar;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.b.c(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.b.d(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return this.a.g();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.f.b.c(this.c.g());
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.i(this.b);
        this.b.onStart();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.onStop();
    }
}
