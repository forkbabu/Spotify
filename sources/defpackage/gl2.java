package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.l;
import java.net.HttpCookie;

/* renamed from: gl2  reason: default package */
public final /* synthetic */ class gl2 implements l {
    public final /* synthetic */ hl2 a;
    public final /* synthetic */ AuthorizationRequest b;

    public /* synthetic */ gl2(hl2 hl2, AuthorizationRequest authorizationRequest) {
        this.a = hl2;
        this.b = authorizationRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (HttpCookie) obj);
    }
}
