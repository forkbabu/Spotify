package defpackage;

import com.spotify.music.offlinetrials.limited.trackentity.p;
import com.spotify.music.ondemandsharing.shufflebutton.o;
import io.reactivex.s;

/* renamed from: ga5  reason: default package */
public class ga5 {
    private final ea5 a;
    private final zec b;
    private final o c;
    private final kk9 d;
    private final mod e;
    private final p f;

    public ga5(o oVar, ea5 ea5, zec zec, kk9 kk9, mod mod, p pVar) {
        this.c = oVar;
        this.a = ea5;
        this.b = zec;
        this.d = kk9;
        this.e = mod;
        this.f = pVar;
    }

    public static s a(ga5 ga5, s sVar) {
        return sVar.q(ga5.c);
    }

    public static s b(ga5 ga5, s sVar) {
        return sVar.q(ga5.e);
    }

    public static s c(ga5 ga5, s sVar) {
        return sVar.q(ga5.d);
    }

    public static s d(ga5 ga5, s sVar) {
        ga5.getClass();
        s q = sVar.q(new ca5(ga5)).q(ga5.f);
        return ga5.b.d() ? q.q(new da5(ga5)) : q;
    }

    public s<b91> e(String str) {
        return s.b1(d(this, this.a.a(str)));
    }

    public s<b91> f(String str) {
        return s.b1(a(this, s.b1(d(this, this.a.a(str)))));
    }
}
