package com.spotify.music.container.app.foregroundstate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import io.reactivex.s;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

public final class AppUiForegroundState implements d, m {
    private final a<Boolean> a;
    private final Lifecycle b;

    public AppUiForegroundState(Lifecycle lifecycle) {
        h.e(lifecycle, "lifecycle");
        this.b = lifecycle;
        a<Boolean> i1 = a.i1(Boolean.FALSE);
        h.d(i1, "BehaviorSubject.createDefault(false)");
        this.a = i1;
    }

    @Override // com.spotify.music.container.app.foregroundstate.d
    public boolean a() {
        Boolean j1 = this.a.j1();
        h.c(j1);
        return j1.booleanValue();
    }

    public final s<Boolean> b() {
        return this.a;
    }

    public final synchronized void c() {
        this.b.a(this);
    }

    @w(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.a.onNext(Boolean.TRUE);
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.a.onNext(Boolean.FALSE);
    }
}
