package defpackage;

import com.spotify.player.controls.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: naf  reason: default package */
public final /* synthetic */ class naf implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ t92 b;
    public final /* synthetic */ wcf c;

    public /* synthetic */ naf(d dVar, t92 t92, wcf wcf) {
        this.a = dVar;
        this.b = t92;
        this.c = wcf;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.K0(new haf(this.a, this.b, this.c)).N();
    }
}
