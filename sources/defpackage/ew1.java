package defpackage;

import com.spotify.mobile.android.sso.AuthorizationActivity;
import com.spotify.mobile.android.sso.ErrorMessage;
import defpackage.qv1;
import io.reactivex.functions.g;

/* renamed from: ew1  reason: default package */
public final /* synthetic */ class ew1 implements g {
    public final /* synthetic */ uw1 a;

    public /* synthetic */ ew1(uw1 uw1) {
        this.a = uw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        uw1 uw1 = this.a;
        qv1.h hVar = (qv1.h) obj;
        ErrorMessage b = hVar.b();
        int a2 = hVar.a();
        AuthorizationActivity authorizationActivity = (AuthorizationActivity) uw1;
        authorizationActivity.n1(b, authorizationActivity.getString(a2), hVar.c());
    }
}
