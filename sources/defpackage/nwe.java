package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: nwe  reason: default package */
public final /* synthetic */ class nwe implements w {
    public final /* synthetic */ f a;
    public final /* synthetic */ d b;
    public final /* synthetic */ fze c;
    public final /* synthetic */ t0f d;

    public /* synthetic */ nwe(f fVar, d dVar, fze fze, t0f t0f) {
        this.a = fVar;
        this.b = dVar;
        this.c = fze;
        this.d = t0f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new gxe(this.a, this.b, this.c, this.d));
    }
}
