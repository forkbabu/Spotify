package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

/* renamed from: kr1  reason: default package */
public final /* synthetic */ class kr1 implements g {
    public final /* synthetic */ hs1 a;

    public /* synthetic */ kr1(hs1 hs1) {
        this.a = hs1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.l((SessionState) obj);
    }
}
