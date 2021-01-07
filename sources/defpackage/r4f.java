package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;

/* renamed from: r4f  reason: default package */
public final /* synthetic */ class r4f implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ r4f(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.b0 b0Var = (p2f.b0) obj;
        return new i(this.a.a(c.c()).E(a5f.a)).N();
    }
}
