package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: vq1  reason: default package */
public final /* synthetic */ class vq1 implements g {
    public static final /* synthetic */ vq1 a = new vq1();

    private /* synthetic */ vq1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = zr1.h;
        Assertion.i("Cannot receive value from RxFlags", (Throwable) obj);
    }
}
