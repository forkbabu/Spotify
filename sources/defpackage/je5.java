package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: je5  reason: default package */
public final /* synthetic */ class je5 implements g {
    public static final /* synthetic */ je5 a = new je5();

    private /* synthetic */ je5() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Error occurred while finding connected Go devices", (Throwable) obj);
    }
}
