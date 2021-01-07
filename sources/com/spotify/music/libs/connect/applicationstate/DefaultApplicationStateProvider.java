package com.spotify.music.libs.connect.applicationstate;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class DefaultApplicationStateProvider implements com.spotify.libs.connect.instrumentation.a, ru0.a {
    private final io.reactivex.subjects.a<ConnectVolumeControlInstrumentation.ApplicationState> a;
    private final p b = new p();
    private final s<Boolean> c;

    static final class a<T, R> implements l<Boolean, ConnectVolumeControlInstrumentation.ApplicationState> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ConnectVolumeControlInstrumentation.ApplicationState apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "it");
            if (bool2.booleanValue()) {
                return ConnectVolumeControlInstrumentation.ApplicationState.FOREGROUND;
            }
            return ConnectVolumeControlInstrumentation.ApplicationState.BACKGROUND_LOCKSCREEN;
        }
    }

    public DefaultApplicationStateProvider(s<Boolean> sVar) {
        h.e(sVar, "appForegroundObservable");
        this.c = sVar;
        io.reactivex.subjects.a<ConnectVolumeControlInstrumentation.ApplicationState> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.instrumentation.a
    public s<ConnectVolumeControlInstrumentation.ApplicationState> a() {
        return this.a;
    }

    @Override // com.spotify.libs.connect.instrumentation.a
    public ConnectVolumeControlInstrumentation.ApplicationState b() {
        ConnectVolumeControlInstrumentation.ApplicationState j1 = this.a.j1();
        return j1 != null ? j1 : ConnectVolumeControlInstrumentation.ApplicationState.BACKGROUND_LOCKSCREEN;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.j0(a.a).E().subscribe(new a(new DefaultApplicationStateProvider$onStart$2(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
