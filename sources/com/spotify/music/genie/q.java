package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.genie.Wish;
import com.spotify.player.model.PlayerState;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class q implements o {
    private final vm9 a;
    private final mn9 b;
    private final y c;
    private final y d;
    private final g<SessionState> e;
    private final g<PlayerState> f;
    private final ik1 g;
    private final s h;

    /* access modifiers changed from: private */
    public static class a {
        final boolean a;
        final PlayerState b;

        public a(boolean z, PlayerState playerState) {
            this.a = z;
            this.b = playerState;
        }
    }

    q(vm9 vm9, mn9 mn9, y yVar, y yVar2, g<SessionState> gVar, g<PlayerState> gVar2, ik1 ik1, s sVar) {
        this.a = vm9;
        this.b = mn9;
        this.c = yVar;
        this.d = yVar2;
        this.e = gVar;
        this.f = gVar2;
        this.g = ik1;
        this.h = sVar;
    }

    public /* synthetic */ Boolean a(Boolean bool) {
        boolean z = !bool.booleanValue();
        if (z) {
            this.g.h();
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ Boolean b(Throwable th) {
        this.g.h();
        return Boolean.FALSE;
    }

    public d0 c(SessionState sessionState) {
        if (!sessionState.connected()) {
            return new MaybeFlatMapSingleElement(new i(f()).f(this.a.a()), d.a).r(z.z(new n(null, null, Wish.Action.DO_NOTHING))).H(this.c).f(this.h);
        }
        l<mm9> t = this.b.a().t(5, TimeUnit.SECONDS, this.d);
        y yVar = this.c;
        if (yVar != null) {
            return new MaybeFlatMapSingleElement(new MaybeObserveOn(t, yVar), c.a).m().r(z.h(new a(this))).H(this.c);
        }
        throw new NullPointerException("scheduler is null");
    }

    public z<Wish> d() {
        return z.R(f(), this.f.k0(5, TimeUnit.SECONDS, this.d).E(), i.a).s(new g(this)).f(this.h);
    }

    public z<Wish> e() {
        return new i(f()).e(this.e).E().A(m.a).A(new e(this)).f(this.h);
    }

    /* access modifiers changed from: package-private */
    public z<Boolean> f() {
        return this.g.j().T().J(5, TimeUnit.SECONDS, this.d).A(new f(this)).E(new b(this));
    }

    public z<Wish> g() {
        return new i(f()).e(this.e).E().s(new h(this)).f(this.h);
    }
}
