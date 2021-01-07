package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.l;

/* renamed from: pg5  reason: default package */
public final /* synthetic */ class pg5 implements l {
    public static final /* synthetic */ pg5 a = new pg5();

    private /* synthetic */ pg5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Assertion.i("Could not observe liked songs offline state", (Throwable) obj);
        return Boolean.FALSE;
    }
}
