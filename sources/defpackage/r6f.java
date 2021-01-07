package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

/* renamed from: r6f  reason: default package */
public final /* synthetic */ class r6f implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ d b;
    public final /* synthetic */ a8f c;

    public /* synthetic */ r6f(f fVar, d dVar, a8f a8f) {
        this.a = fVar;
        this.b = dVar;
        this.c = a8f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.j jVar;
        return k7f.i(b.a, this.a, this.b, jVar.a(), 0, ((p2f.j) obj).b(), this.c);
    }
}
