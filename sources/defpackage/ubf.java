package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.player.controls.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ubf  reason: default package */
public final /* synthetic */ class ubf implements w {
    public final /* synthetic */ j a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ d c;

    public /* synthetic */ ubf(j jVar, zr0 zr0, d dVar) {
        this.a = jVar;
        this.b = zr0;
        this.c = dVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new cbf(this.a, this.b, this.c));
    }
}
