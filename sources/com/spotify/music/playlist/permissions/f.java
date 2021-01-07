package com.spotify.music.playlist.permissions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

public final class f implements s0 {
    private View a;
    private final SnackbarManager b;
    private final cmf<kotlin.f> c;

    public interface a {
    }

    public f(SnackbarManager snackbarManager, cmf<kotlin.f> cmf) {
        h.e(snackbarManager, "snackbarManager");
        h.e(cmf, "dismissDialog");
        this.b = snackbarManager;
        this.c = cmf;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a = new FrameLayout(context);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        SnackbarManager snackbarManager = this.b;
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.not_translated_playlist_permissions_failed_to_load).build();
        h.d(build, "SnackbarConfiguration.bu…s_failed_to_load).build()");
        snackbarManager.show(build);
        this.c.invoke();
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
