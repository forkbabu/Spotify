package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

/* renamed from: gxe  reason: default package */
public final /* synthetic */ class gxe implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ d b;
    public final /* synthetic */ fze c;
    public final /* synthetic */ t0f f;

    public /* synthetic */ gxe(f fVar, d dVar, fze fze, t0f t0f) {
        this.a = fVar;
        this.b = dVar;
        this.c = fze;
        this.f = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.j jVar;
        return yye.h(b.a, this.a, this.b, this.c, jVar.a(), ((uue.j) obj).b(), this.f);
    }
}
