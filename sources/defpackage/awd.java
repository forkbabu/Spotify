package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: awd  reason: default package */
public final class awd extends m {
    private final zvd a;

    private awd(zvd zvd) {
        zvd.getClass();
        this.a = zvd;
    }

    public static zvd E2(zvd zvd, k kVar) {
        kVar.y0(new awd(zvd));
        return zvd;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.a.c();
    }
}
