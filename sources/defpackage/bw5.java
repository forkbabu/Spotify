package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: bw5  reason: default package */
public final /* synthetic */ class bw5 implements g {
    public static final /* synthetic */ bw5 a = new bw5();

    private /* synthetic */ bw5() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.w("Could not load signup configuration, fallback to default", (Throwable) obj);
    }
}
