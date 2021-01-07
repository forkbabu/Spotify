package defpackage;

import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import com.spotify.http.u;
import defpackage.q21;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: e31  reason: default package */
public final /* synthetic */ class e31 implements l {
    public final /* synthetic */ u a;
    public final /* synthetic */ s b;

    public /* synthetic */ e31(u uVar, s sVar) {
        this.a = uVar;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u uVar = this.a;
        q21.a aVar = (q21.a) obj;
        return s.d1(((k70) uVar.c(k70.class)).b(new SetPasswordRequestBody(aVar.b(), aVar.a())).P(), this.b, u21.a).j0(new c31(aVar)).r0(new z21(aVar));
    }
}
