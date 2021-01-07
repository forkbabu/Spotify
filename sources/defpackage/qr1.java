package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: qr1  reason: default package */
public final /* synthetic */ class qr1 implements l {
    public final /* synthetic */ js1 a;

    public /* synthetic */ qr1(js1 js1) {
        this.a = js1;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.k((SessionState) obj);
    }
}
