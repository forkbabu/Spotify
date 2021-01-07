package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.kef;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: haf  reason: default package */
public final /* synthetic */ class haf implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ t92 b;
    public final /* synthetic */ wcf c;

    public /* synthetic */ haf(d dVar, t92 t92, wcf wcf) {
        this.a = dVar;
        this.b = t92;
        this.c = wcf;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        a aVar;
        d dVar = this.a;
        t92 t92 = this.b;
        wcf wcf = this.c;
        if (((kef.a) obj).t()) {
            z<zwd> a2 = dVar.a(c.e());
            a2.getClass();
            aVar = new i(a2);
        } else {
            aVar = a.u(new faf(t92)).o(200, TimeUnit.MILLISECONDS);
        }
        zdf zdf = wcf.a;
        y yVar = wcf.b;
        zdf.getClass();
        return aVar.d(a.u(new tcf(zdf)).G(yVar));
    }
}
