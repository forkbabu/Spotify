package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: zxe  reason: default package */
public final /* synthetic */ class zxe implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ zxe(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.z zVar = (uue.z) obj;
        return new i(this.a.a(c.c()).E(lxe.a)).N();
    }
}
