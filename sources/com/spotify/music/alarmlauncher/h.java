package com.spotify.music.alarmlauncher;

import com.spotify.mobile.android.service.plugininterfaces.d;
import io.reactivex.a0;
import kotlin.f;

public final class h implements d, cmf<Boolean> {
    private a0<f> a;
    private boolean b;

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.b = true;
        a0<f> a0Var = this.a;
        if (a0Var != null) {
            a0Var.onSuccess(f.a);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b = false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Boolean invoke() {
        return Boolean.valueOf(this.b);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SpotifyServiceMonitorPlugin";
    }
}
