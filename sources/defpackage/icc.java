package defpackage;

import com.spotify.mobile.android.sso.k;
import io.reactivex.functions.l;
import java.net.HttpCookie;

/* renamed from: icc  reason: default package */
public final /* synthetic */ class icc implements l {
    public final /* synthetic */ HttpCookie a;

    public /* synthetic */ icc(HttpCookie httpCookie) {
        this.a = httpCookie;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3((k) obj, this.a);
    }
}
