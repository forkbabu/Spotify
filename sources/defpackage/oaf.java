package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: oaf  reason: default package */
public final /* synthetic */ class oaf implements w {
    public final /* synthetic */ j a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ f c;

    public /* synthetic */ oaf(j jVar, zr0 zr0, f fVar) {
        this.a = jVar;
        this.b = zr0;
        this.c = fVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new lcf(this.a, this.b, this.c));
    }
}
