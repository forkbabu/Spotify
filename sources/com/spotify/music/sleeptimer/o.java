package com.spotify.music.sleeptimer;

import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.TimeUnit;

public class o implements n {
    private final u a;
    private final l b;

    public o(u uVar, l lVar) {
        this.a = uVar;
        this.b = lVar;
    }

    @Override // com.spotify.music.sleeptimer.n
    public void a() {
        if (this.a.d()) {
            this.a.a();
        } else if (this.b.c()) {
            this.b.a();
        }
    }

    @Override // com.spotify.music.sleeptimer.n
    public void b(String str) {
        a();
        this.b.i(str);
    }

    @Override // com.spotify.music.sleeptimer.n
    public void c(TimeUnit timeUnit, long j) {
        a();
        this.a.h(timeUnit, j);
    }

    @Override // com.spotify.music.sleeptimer.n
    public void d(SleepTimerStatusHandler sleepTimerStatusHandler) {
        this.a.g(sleepTimerStatusHandler);
        this.b.h(sleepTimerStatusHandler);
    }

    @Override // com.spotify.music.sleeptimer.n
    public boolean e() {
        return this.b.c() || this.a.d();
    }

    @Override // com.spotify.music.sleeptimer.n
    public s<Boolean> f() {
        return s.B(new e(this));
    }

    @Override // com.spotify.music.sleeptimer.n
    public long g() {
        if (this.a.d()) {
            return this.a.c();
        }
        return -1;
    }

    public v h() {
        s<Boolean> d = this.b.d();
        u uVar = this.a;
        uVar.getClass();
        return s.n(d, s.y(new g(uVar)).G0(Boolean.valueOf(uVar.d())), f.a);
    }
}
