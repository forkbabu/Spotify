package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: maf  reason: default package */
public final /* synthetic */ class maf implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ maf(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.v vVar = (kef.v) obj;
        z<zwd> a2 = this.a.a(c.c());
        a2.getClass();
        return new i(a2).N();
    }
}
