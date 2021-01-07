package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import java.util.List;

public class UserToggleDialogActivity extends ss2 implements mfd, u, c.a {
    public static final /* synthetic */ int M = 0;
    l G;
    v H;
    me6 I;
    o0 J;
    String K;
    private t L;

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.u
    public void I(List<HomeMixUser> list) {
        this.L.c(list);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.u
    public void dismiss() {
        finish();
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.HOMEMIX_USERTOGGLE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.G0.b(this.K);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.u
    public void j() {
        this.J.d(C0707R.string.home_mix_user_toggle_rejected_notification, new Object[0]);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L = this.H.b(this.G.b(this, this.I), LayoutInflater.from(this));
        requestWindowFeature(1);
        setContentView(this.L.a());
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.HOMEMIX_USERTOGGLE, null);
    }
}
