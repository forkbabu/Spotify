package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.kef;
import io.reactivex.functions.l;

/* renamed from: cbf  reason: default package */
public final /* synthetic */ class cbf implements l {
    public final /* synthetic */ j a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ d c;

    public /* synthetic */ cbf(j jVar, zr0 zr0, d dVar) {
        this.a = jVar;
        this.b = zr0;
        this.c = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.m mVar = (kef.m) obj;
        return vdf.c(this.a, this.b).h(this.c.a(c.e())).t(jcf.a).N();
    }
}
