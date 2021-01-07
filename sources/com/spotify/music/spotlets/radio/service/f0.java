package com.spotify.music.spotlets.radio.service;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.b;

public class f0 implements b {
    private final Context a;

    public f0(Context context) {
        this.a = context;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        Context context = this.a;
        int i = RadioActionsService.u;
        context.stopService(new Intent(context, RadioActionsService.class));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "RadioActionsService";
    }
}
