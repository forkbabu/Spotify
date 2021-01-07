package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: pq3  reason: default package */
public final /* synthetic */ class pq3 implements g {
    public static final /* synthetic */ pq3 a = new pq3();

    private /* synthetic */ pq3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.w("[AdBreak] start error %s", (Throwable) obj);
    }
}
