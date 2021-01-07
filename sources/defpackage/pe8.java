package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.l;

/* renamed from: pe8  reason: default package */
public final /* synthetic */ class pe8 implements l {
    public static final /* synthetic */ pe8 a = new pe8();

    private /* synthetic */ pe8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Assertion.i("Cannot start playing from PlayAction", th);
        return zwd.a("Cannot start playing from PlayAction" + th.getLocalizedMessage());
    }
}
