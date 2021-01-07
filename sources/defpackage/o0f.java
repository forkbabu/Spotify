package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: o0f  reason: default package */
public final /* synthetic */ class o0f implements g {
    public static final /* synthetic */ o0f a = new o0f();

    private /* synthetic */ o0f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.g(((Throwable) obj).toString());
    }
}
