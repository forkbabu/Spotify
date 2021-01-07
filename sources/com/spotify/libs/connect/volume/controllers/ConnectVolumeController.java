package com.spotify.libs.connect.volume.controllers;

import com.google.common.base.Optional;
import com.spotify.googleauth.b;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.l;
import com.spotify.rxjava2.q;
import defpackage.ru0;
import io.reactivex.s;
import kotlin.f;

public final class ConnectVolumeController implements p, k, ru0.a {
    private final q a = new q();
    private int b;
    private float c = -1.0f;
    private float d = -1.0f;
    private final l e;
    private final c f;
    private final h g;
    private final ConnectVolumeControlInstrumentation h;

    public enum Direction {
        UP,
        DOWN
    }

    public ConnectVolumeController(l lVar, c cVar, h hVar, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation) {
        kotlin.jvm.internal.h.e(lVar, "playbackVolumeProvider");
        kotlin.jvm.internal.h.e(cVar, "connectVolumeInteractor");
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(connectVolumeControlInstrumentation, "connectVolumeControlInstrumentation");
        this.e = lVar;
        this.f = cVar;
        this.g = hVar;
        this.h = connectVolumeControlInstrumentation;
    }

    private final float m(Direction direction, float f2, float f3) {
        GaiaDevice b2 = this.g.b();
        if (b2 == null || b2.isSelf() || !n(f2)) {
            return -1.0f;
        }
        return knf.b(Direction.UP == direction ? f2 + f3 : f2 - f3, 0.0f, 1.0f);
    }

    private final boolean n(float f2) {
        return f2 != -1.0f;
    }

    private final boolean o(float f2) {
        float f3 = 0.0f;
        if (!n(f2)) {
            f2 = 0.0f;
        }
        float f4 = this.d;
        if (n(f4)) {
            f3 = f4;
        }
        return Math.abs(f2 - f3) > 0.001f;
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public s<Float> a() {
        return this.e.a();
    }

    @Override // com.spotify.libs.connect.volume.controllers.k
    public void b(float f2, cmf<f> cmf) {
        kotlin.jvm.internal.h.e(cmf, "callback");
        if (o(f2)) {
            this.h.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.c, f2, Float.valueOf(this.d));
            this.f.b(f2, cmf);
        }
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float c() {
        if (n(this.d)) {
            float m = m(Direction.DOWN, this.d, this.c);
            this.h.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.b, m, Float.valueOf(this.d));
            this.d = m;
            b.c(this.f, m, null, 2, null);
        }
        return this.d;
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float e() {
        if (n(this.d)) {
            float m = m(Direction.UP, this.d, this.c);
            this.h.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.a, m, Float.valueOf(this.d));
            this.d = m;
            b.c(this.f, m, null, 2, null);
        }
        return this.d;
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float f() {
        return this.e.b();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public boolean g(Float f2) {
        float floatValue = f2.floatValue();
        if (!o(floatValue)) {
            return false;
        }
        this.h.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.c, floatValue, Float.valueOf(this.d));
        b.c(this.f, floatValue, null, 2, null);
        return true;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        q qVar = this.a;
        io.reactivex.disposables.b subscribe = this.g.a().s0(Optional.absent()).subscribe(new f(this));
        kotlin.jvm.internal.h.d(subscribe, "activeDeviceProvider.get…          }\n            }");
        qVar.a(subscribe);
        q qVar2 = this.a;
        io.reactivex.disposables.b subscribe2 = a().s0(Float.valueOf(0.0f)).subscribe(new g(this));
        kotlin.jvm.internal.h.d(subscribe2, "observable\n        .onEr…subscribe { volume = it }");
        qVar2.a(subscribe2);
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.a.c();
    }
}
