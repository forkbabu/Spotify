package com.spotify.music.autoplay;

import android.content.Context;
import com.spotify.mobile.android.service.plugininterfaces.d;

public class d0 implements d {
    private final Context a;
    private final z b;

    public d0(Context context, z zVar) {
        this.a = context;
        this.b = zVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.b.d(this.a);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.b.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AutoPlay";
    }
}
