package defpackage;

import com.spotify.libs.connect.volume.controllers.p;
import defpackage.p2f;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: v3f  reason: default package */
public final /* synthetic */ class v3f implements l {
    public final /* synthetic */ q7f a;
    public final /* synthetic */ p b;

    public /* synthetic */ v3f(q7f q7f, p pVar) {
        this.a = q7f;
        this.b = pVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q7f q7f = this.a;
        p pVar = this.b;
        p2f.g0 g0Var = (p2f.g0) obj;
        a dismiss = q7f.dismiss();
        pVar.getClass();
        return a.u(new h7f(pVar)).d(dismiss).N();
    }
}
