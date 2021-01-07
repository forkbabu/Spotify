package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.l;
import java.net.HttpCookie;

/* renamed from: hcc  reason: default package */
public final /* synthetic */ class hcc implements l {
    public final /* synthetic */ lcc a;
    public final /* synthetic */ AuthorizationRequest b;

    public /* synthetic */ hcc(lcc lcc, AuthorizationRequest authorizationRequest) {
        this.a = lcc;
        this.b = authorizationRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (HttpCookie) obj);
    }
}
