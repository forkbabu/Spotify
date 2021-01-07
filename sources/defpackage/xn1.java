package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: xn1  reason: default package */
public class xn1<T> implements w<T, T> {
    private final yn1 a;

    public xn1(yn1 yn1) {
        this.a = yn1;
    }

    @Override // io.reactivex.w
    public v<T> apply(s<T> sVar) {
        g<SessionState> a2 = this.a.a();
        a2.getClass();
        return s.b1(new io.reactivex.internal.operators.observable.v(a2).Q(wn1.a).N0(1).j0(vn1.a).J0(new un1(sVar)));
    }
}
