package defpackage;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

/* renamed from: nj9  reason: default package */
public final /* synthetic */ class nj9 implements g {
    public final /* synthetic */ bk9 a;

    public /* synthetic */ nj9(bk9 bk9) {
        this.a = bk9;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.getClass();
        Assertion.w("Premium Badge Helper", (Throwable) obj);
    }
}
