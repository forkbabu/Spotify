package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: fk3  reason: default package */
public final /* synthetic */ class fk3 implements g {
    public static final /* synthetic */ fk3 a = new fk3();

    private /* synthetic */ fk3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Request failed", (Throwable) obj);
    }
}
