package com.spotify.music.sleeptimer;

import com.spotify.music.sleeptimer.SleepTimerStatusHandler;
import com.spotify.player.model.ContextTrack;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.y;

class l {
    private final y a;
    private final s<u3<String, ContextTrack>> b;
    private b c = EmptyDisposable.INSTANCE;
    private String d = "";
    private boolean e;
    private boolean f;
    private t<Boolean> g;
    private SleepTimerStatusHandler h;

    l(y yVar, s<u3<String, ContextTrack>> sVar) {
        this.a = yVar;
        this.b = sVar;
    }

    private void b(Boolean bool) {
        t<Boolean> tVar = this.g;
        if (tVar != null) {
            tVar.onNext(bool);
        }
    }

    private void g() {
        this.f = false;
        this.e = false;
        this.c.dispose();
    }

    public void a() {
        SleepTimerStatusHandler sleepTimerStatusHandler = this.h;
        if (sleepTimerStatusHandler != null) {
            ((q) sleepTimerStatusHandler).a(SleepTimerStatusHandler.State.b);
            g();
            b(Boolean.FALSE);
            return;
        }
        throw new IllegalStateException("SleepTimerStatusHandler not set. setSleepTimerStatusHandler should be called before setting a timer");
    }

    public boolean c() {
        return this.f;
    }

    public s<Boolean> d() {
        return s.y(new c(this)).G0(Boolean.valueOf(this.f));
    }

    public /* synthetic */ void e(t tVar) {
        this.g = tVar;
    }

    public void f(String str, u3 u3Var) {
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        boolean z = true;
        if (!this.e || !(!this.d.equals(f3))) {
            z = false;
        }
        if (z) {
            SleepTimerStatusHandler sleepTimerStatusHandler = this.h;
            if (sleepTimerStatusHandler != null) {
                ((q) sleepTimerStatusHandler).a(SleepTimerStatusHandler.State.a);
                g();
                b(Boolean.FALSE);
            } else {
                throw new IllegalStateException("SleepTimerStatusHandler not set. setSleepTimerStatusHandler should be called before setting a timer");
            }
        }
        this.e = s2.uri().equals(str);
        this.d = f3;
    }

    public void h(SleepTimerStatusHandler sleepTimerStatusHandler) {
        this.h = sleepTimerStatusHandler;
    }

    public void i(String str) {
        g();
        b(Boolean.TRUE);
        this.f = true;
        this.c = this.b.E().Q(a.a).o0(this.a).subscribe(new b(this, str), d.a);
    }
}
