package defpackage;

import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.c;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;
import io.reactivex.s;

/* renamed from: hf4  reason: default package */
public class hf4 {
    private final l a;
    private final s<we4> b;
    private final he4 c;
    private final k<b91, b91> d;
    private final c<b91, b91, b91> e;

    hf4(l lVar, s<we4> sVar, he4 he4, k<b91, b91> kVar, c<b91, b91, b91> cVar) {
        this.a = lVar;
        this.b = sVar;
        this.c = he4;
        this.d = kVar;
        this.e = cVar;
    }

    public /* synthetic */ g a(de4 de4, g.c cVar) {
        return this.c.a(de4.c()).T(hd4.a).O(new kd4(this));
    }

    public io.reactivex.g<b91> b(io.reactivex.g<ff4> gVar, b91 b91) {
        io.reactivex.g<com.spotify.music.connection.g> Y0 = this.a.a().Y0(BackpressureStrategy.BUFFER);
        s<we4> sVar = this.b;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        io.reactivex.g l = io.reactivex.g.j(Y0, sVar.Y0(backpressureStrategy), gVar, xc4.a).F(new ld4(this)).Y(b91, this.e).l(this.d);
        l.getClass();
        return new v(l).Y0(backpressureStrategy).s();
    }
}
