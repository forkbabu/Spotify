package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: sq8  reason: default package */
public final /* synthetic */ class sq8 implements g {
    public static final /* synthetic */ sq8 a = new sq8();

    private /* synthetic */ sq8() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Failed to complete taste onboarding complete request", new Object[0]);
        Assertion.i("Failed to complete artist onboarding request", th);
    }
}
