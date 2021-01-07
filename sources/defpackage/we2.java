package defpackage;

import com.spotify.mobile.android.sso.k;
import io.reactivex.functions.l;
import java.net.HttpCookie;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: we2  reason: default package */
final class we2<T, R> implements l<k, Pair<? extends k, ? extends HttpCookie>> {
    final /* synthetic */ HttpCookie a;

    we2(HttpCookie httpCookie) {
        this.a = httpCookie;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Pair<? extends k, ? extends HttpCookie> apply(k kVar) {
        k kVar2 = kVar;
        h.e(kVar2, "it");
        return new Pair<>(kVar2, this.a);
    }
}
