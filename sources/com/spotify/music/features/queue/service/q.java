package com.spotify.music.features.queue.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

/* access modifiers changed from: package-private */
public class q {
    private final Context a;
    private final SnackbarManager b;

    q(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    public /* synthetic */ void a(View view) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.b1.toString())));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.toast_feature_premium_discovered).actionText(this.a.getString(C0707R.string.premium_signup_title)).onClickListener(new d(this)).build();
        if (this.b.isAttached()) {
            this.b.show(build);
        } else {
            this.b.showOnNextAttach(build);
        }
    }
}
