package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;

/* renamed from: fi8  reason: default package */
public class fi8 implements c {
    private ei8 a;

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
    }

    public ei8 a() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        ei8 ei8 = new ei8(anchorBar);
        this.a = ei8;
        anchorBar.e(ei8);
    }
}
