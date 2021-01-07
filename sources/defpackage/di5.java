package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: di5  reason: default package */
public final /* synthetic */ class di5 implements g {
    public static final /* synthetic */ di5 a = new di5();

    private /* synthetic */ di5() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.w("HomeLoad: onError", (Throwable) obj);
    }
}
