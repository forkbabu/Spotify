package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: qc3  reason: default package */
public final /* synthetic */ class qc3 implements n {
    public static final /* synthetic */ qc3 a = new qc3();

    private /* synthetic */ qc3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((SessionState) obj).loggedIn();
    }
}
