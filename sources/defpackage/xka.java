package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.libs.otp.session.d;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: xka  reason: default package */
public class xka extends m {
    private final d<? extends Parcelable> a;
    private k b;

    public xka(d<? extends Parcelable> dVar) {
        this.a = dVar;
    }

    public void E2(k kVar) {
        MoreObjects.checkState(this.b == null);
        this.b = kVar;
        kVar.y0(this);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void b1(Bundle bundle) {
        this.a.getClass();
        this.a.p(bundle);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        this.a.r(bundle);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void d(Bundle bundle) {
        this.a.p(bundle);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.a.m();
        k kVar = this.b;
        kVar.getClass();
        kVar.e1(this);
        this.b = null;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onPause() {
        this.a.o();
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onResume() {
        this.a.q();
    }
}
