package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: ow9  reason: default package */
public final /* synthetic */ class ow9 implements n {
    public static final /* synthetic */ ow9 a = new ow9();

    private /* synthetic */ ow9() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return sessionState.loggedIn() && !sessionState.loggingOut();
    }
}
