package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.List;
import kotlin.jvm.internal.h;

public final class DevicesListProviderImpl implements m, ru0.a {
    private final a<List<GaiaDevice>> a;
    private final p b = new p();
    private final j c;

    public DevicesListProviderImpl(j jVar) {
        h.e(jVar, "connectCore");
        this.c = jVar;
        a<List<GaiaDevice>> h1 = a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.providers.m
    public s<List<GaiaDevice>> a() {
        return this.a;
    }

    @Override // com.spotify.libs.connect.providers.m
    public List<GaiaDevice> b() {
        return this.a.j1();
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.m(DevicesListProviderImpl.class.getSimpleName()).subscribe(new n(new DevicesListProviderImpl$onStart$1(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
