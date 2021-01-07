package defpackage;

import com.spotify.player.options.d;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: kaf  reason: default package */
public final /* synthetic */ class kaf implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ kaf(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        z<zwd> a2 = this.a.a(((kef.s) obj).t());
        a2.getClass();
        return new i(a2).N();
    }
}
