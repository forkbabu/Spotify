package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

/* renamed from: ou1  reason: default package */
public final /* synthetic */ class ou1 implements l {
    public static final /* synthetic */ ou1 a = new ou1();

    private /* synthetic */ ou1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).loggedIn());
    }
}
