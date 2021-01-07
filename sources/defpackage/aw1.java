package defpackage;

import com.spotify.mobile.android.sso.AuthorizationActivity;
import defpackage.qv1;
import io.reactivex.functions.g;

/* renamed from: aw1  reason: default package */
public final /* synthetic */ class aw1 implements g {
    public final /* synthetic */ uw1 a;

    public /* synthetic */ aw1(uw1 uw1) {
        this.a = uw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qv1.c cVar = (qv1.c) obj;
        ((AuthorizationActivity) this.a).o1(cVar.b().g(), cVar.a(), cVar.c());
    }
}
