package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: kt3  reason: default package */
public final /* synthetic */ class kt3 implements g {
    public static final /* synthetic */ kt3 a = new kt3();

    private /* synthetic */ kt3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Cosmos: Ads ServerTimeProvider Request Failed: serverTimeUnavailable", (Throwable) obj);
    }
}
