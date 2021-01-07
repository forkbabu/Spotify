package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.a0;
import io.reactivex.c0;
import java.net.HttpCookie;

/* renamed from: vu1  reason: default package */
public final /* synthetic */ class vu1 implements c0 {
    public final /* synthetic */ av1 a;
    public final /* synthetic */ AuthorizationRequest b;
    public final /* synthetic */ HttpCookie c;

    public /* synthetic */ vu1(av1 av1, AuthorizationRequest authorizationRequest, HttpCookie httpCookie) {
        this.a = av1;
        this.b = authorizationRequest;
        this.c = httpCookie;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        this.a.b(this.b, this.c, a0Var);
    }
}
