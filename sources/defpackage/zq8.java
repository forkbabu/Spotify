package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: zq8  reason: default package */
public final /* synthetic */ class zq8 implements g {
    public static final /* synthetic */ zq8 a = new zq8();

    private /* synthetic */ zq8() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Failed to complete taste onboarding complete request", (Throwable) obj);
    }
}
