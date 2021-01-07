package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import io.reactivex.d0;
import io.reactivex.functions.l;
import java.net.HttpCookie;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: xe2  reason: default package */
public final class xe2<T, R> implements l<HttpCookie, d0<? extends Pair<? extends k, ? extends HttpCookie>>> {
    final /* synthetic */ ve2 a;
    final /* synthetic */ AuthorizationRequest b;

    xe2(ve2 ve2, AuthorizationRequest authorizationRequest) {
        this.a = ve2;
        this.b = authorizationRequest;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends Pair<? extends k, ? extends HttpCookie>> apply(HttpCookie httpCookie) {
        HttpCookie httpCookie2 = httpCookie;
        h.e(httpCookie2, "cookie");
        return this.a.a.c(this.b, httpCookie2).A(new we2(httpCookie2));
    }
}
