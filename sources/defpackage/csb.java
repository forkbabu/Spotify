package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: csb  reason: default package */
public class csb extends m {
    private boolean a;
    private final Activity b;

    public csb(Activity activity, k kVar) {
        this.b = activity;
        kVar.y0(this);
    }

    /* access modifiers changed from: package-private */
    public boolean E2() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        bundle.putBoolean("is_changing_configurations", this.b.isChangingConfigurations());
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void d(Bundle bundle) {
        this.a = bundle != null && bundle.getBoolean("is_changing_configurations");
    }
}
