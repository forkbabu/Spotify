package defpackage;

import com.spotify.mobile.android.sso.AuthorizationActivity;
import defpackage.qv1;
import io.reactivex.functions.g;

/* renamed from: jw1  reason: default package */
public final /* synthetic */ class jw1 implements g {
    public final /* synthetic */ uw1 a;

    public /* synthetic */ jw1(uw1 uw1) {
        this.a = uw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((AuthorizationActivity) this.a).c1(((qv1.b) obj).a());
    }
}
