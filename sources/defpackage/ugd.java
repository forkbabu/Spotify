package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: ugd  reason: default package */
public final /* synthetic */ class ugd implements n {
    public static final /* synthetic */ ugd a = new ugd();

    private /* synthetic */ ugd() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((SessionState) obj).loggedIn();
    }
}
