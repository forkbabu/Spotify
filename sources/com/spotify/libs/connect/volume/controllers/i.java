package com.spotify.libs.connect.volume.controllers;

import android.content.Context;
import android.media.AudioManager;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.s;
import io.reactivex.subjects.a;

public class i implements p, ru0.a {
    private final AudioManager a;
    private final n b;
    private final gv0 c;
    private final a<Float> d = a.h1();
    private final p e = new p();

    public i(Context context, n nVar, gv0 gv0) {
        this.b = nVar;
        this.c = gv0;
        this.a = (AudioManager) context.getSystemService("audio");
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public s<Float> a() {
        return this.d.E();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float c() {
        this.c.b();
        this.a.adjustStreamVolume(3, -1, 1);
        return f();
    }

    public /* synthetic */ void d(Float f) {
        this.c.b();
        this.d.onNext(f);
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float e() {
        this.c.b();
        this.a.adjustStreamVolume(3, 1, 1);
        return f();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float f() {
        if (this.d.k1()) {
            return this.d.j1().floatValue();
        }
        return this.b.a().floatValue();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public boolean g(Float f) {
        if (Math.abs(f.floatValue() - f()) <= 0.001f) {
            return false;
        }
        this.a.setStreamVolume(3, Math.round(f.floatValue() * ((float) this.b.c())), 1);
        return true;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.e.b(this.b.b().subscribe(new a(this)));
        this.b.d();
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.e();
        this.e.a();
    }
}
