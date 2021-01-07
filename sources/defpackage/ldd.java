package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: ldd  reason: default package */
public final /* synthetic */ class ldd implements l {
    public static final /* synthetic */ ldd a = new ldd();

    private /* synthetic */ ldd() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
