package defpackage;

import com.spotify.mobile.android.sso.AuthorizationActivity;
import defpackage.qv1;
import io.reactivex.functions.g;

/* renamed from: zv1  reason: default package */
public final /* synthetic */ class zv1 implements g {
    public final /* synthetic */ uw1 a;

    public /* synthetic */ zv1(uw1 uw1) {
        this.a = uw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qv1.f fVar = (qv1.f) obj;
        ((AuthorizationActivity) this.a).n1(fVar.a(), null, fVar.b());
    }
}
