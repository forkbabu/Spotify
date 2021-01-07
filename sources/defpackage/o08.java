package defpackage;

import android.content.Intent;
import androidx.fragment.app.o;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;

/* renamed from: o08  reason: default package */
public class o08 implements c {
    private final o a;
    private n08 b;

    public o08(o oVar) {
        this.a = oVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public n08 a() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        n08 n08 = new n08(anchorBar, this.a);
        this.b = n08;
        anchorBar.e(n08);
    }
}
