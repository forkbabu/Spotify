package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: pve  reason: default package */
public final /* synthetic */ class pve implements w {
    public final /* synthetic */ hze a;
    public final /* synthetic */ f b;
    public final /* synthetic */ d c;
    public final /* synthetic */ fze d;
    public final /* synthetic */ t0f e;

    public /* synthetic */ pve(hze hze, f fVar, d dVar, fze fze, t0f t0f) {
        this.a = hze;
        this.b = fVar;
        this.c = dVar;
        this.d = fze;
        this.e = t0f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new ewe(this.a, this.b, this.c, this.d, this.e));
    }
}
