package defpackage;

import com.spotify.player.options.d;
import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: iye  reason: default package */
public final /* synthetic */ class iye implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ iye(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new i(this.a.a(((uue.u) obj).a()).E(hxe.a)).N();
    }
}
