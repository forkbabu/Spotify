package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: r7f  reason: default package */
public final /* synthetic */ class r7f implements g {
    public static final /* synthetic */ r7f a = new r7f();

    private /* synthetic */ r7f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.g(((Throwable) obj).toString());
    }
}
