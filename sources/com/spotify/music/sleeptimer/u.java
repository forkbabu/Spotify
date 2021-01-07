package com.spotify.music.sleeptimer;

import com.spotify.music.sleeptimer.SleepTimerStatusHandler;
import io.reactivex.t;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class u {
    private final cqe a;
    private final i b;
    private Runnable c;
    private SleepTimerStatusHandler d;
    private long e;
    private long f;
    private t<Boolean> g;

    u(cqe cqe, i iVar) {
        this.a = cqe;
        this.b = iVar;
    }

    private void b(Boolean bool) {
        t<Boolean> tVar = this.g;
        if (tVar != null) {
            tVar.onNext(bool);
        }
    }

    public static void f(u uVar) {
        uVar.c = null;
        uVar.f = 0;
        uVar.e = 0;
        SleepTimerStatusHandler sleepTimerStatusHandler = uVar.d;
        if (sleepTimerStatusHandler != null) {
            ((q) sleepTimerStatusHandler).a(SleepTimerStatusHandler.State.a);
            uVar.b(Boolean.FALSE);
            return;
        }
        throw new IllegalStateException("SleepTimerStatusHandler not set. setSleepTimerStatusHandler should be called before setting a timer");
    }

    public void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.b.a(runnable);
            this.c = null;
            this.f = 0;
            this.e = 0;
            SleepTimerStatusHandler sleepTimerStatusHandler = this.d;
            if (sleepTimerStatusHandler != null) {
                ((q) sleepTimerStatusHandler).a(SleepTimerStatusHandler.State.b);
                b(Boolean.FALSE);
                return;
            }
            throw new IllegalStateException("SleepTimerStatusHandler not set. setSleepTimerStatusHandler should be called before setting a timer");
        }
    }

    public long c() {
        return (this.f + this.e) - this.a.b();
    }

    public boolean d() {
        return this.c != null;
    }

    public /* synthetic */ void e(t tVar) {
        this.g = tVar;
    }

    public void g(SleepTimerStatusHandler sleepTimerStatusHandler) {
        this.d = sleepTimerStatusHandler;
    }

    public void h(TimeUnit timeUnit, long j) {
        if (j >= 0) {
            if (d()) {
                a();
            }
            this.e = TimeUnit.MILLISECONDS.convert(j, timeUnit);
            this.f = this.a.b();
            h hVar = new h(this);
            this.b.b(hVar, this.e);
            this.c = hVar;
            b(Boolean.TRUE);
        }
    }
}
