package defpackage;

import com.spotify.mobile.android.sso.AuthorizationActivity;
import defpackage.qv1;
import io.reactivex.functions.g;

/* renamed from: kw1  reason: default package */
public final /* synthetic */ class kw1 implements g {
    public final /* synthetic */ uw1 a;

    public /* synthetic */ kw1(uw1 uw1) {
        this.a = uw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qv1.g gVar = (qv1.g) obj;
        ((AuthorizationActivity) this.a).n1(gVar.b(), gVar.a(), gVar.c());
    }
}
