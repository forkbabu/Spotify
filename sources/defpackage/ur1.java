package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.g;

/* renamed from: ur1  reason: default package */
public final /* synthetic */ class ur1 implements g {
    public final /* synthetic */ os1 a;
    public final /* synthetic */ AuthorizationRequest b;
    public final /* synthetic */ int c;

    public /* synthetic */ ur1(os1 os1, AuthorizationRequest authorizationRequest, int i) {
        this.a = os1;
        this.b = authorizationRequest;
        this.c = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.n(this.b, this.c, (u3) obj);
    }
}
