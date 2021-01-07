package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

/* renamed from: hu1  reason: default package */
public final /* synthetic */ class hu1 implements n {
    public static final /* synthetic */ hu1 a = new hu1();

    private /* synthetic */ hu1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return !sessionState.loggingIn() && !sessionState.loggingOut();
    }
}
