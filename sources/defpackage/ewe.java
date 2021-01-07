package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import defpackage.uue;
import io.reactivex.functions.l;

/* renamed from: ewe  reason: default package */
public final /* synthetic */ class ewe implements l {
    public final /* synthetic */ hze a;
    public final /* synthetic */ f b;
    public final /* synthetic */ d c;
    public final /* synthetic */ fze f;
    public final /* synthetic */ t0f n;

    public /* synthetic */ ewe(hze hze, f fVar, d dVar, fze fze, t0f t0f) {
        this.a = hze;
        this.b = fVar;
        this.c = dVar;
        this.f = fze;
        this.n = t0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.k kVar;
        return yye.h(this.a.b(kVar.a()), this.b, this.c, this.f, kVar.b(), ((uue.k) obj).c(), this.n);
    }
}
