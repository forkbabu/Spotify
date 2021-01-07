package com.spotify.music.alarmlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.remoteconfig.c5;
import dagger.android.a;
import dagger.android.d;
import kotlin.jvm.internal.h;

public final class SpotifyAlarmLauncherReceiver extends d {
    public c5 a;
    public d b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        h.e(context, "context");
        a.c(this, context);
        c5 c5Var = this.a;
        if (c5Var == null) {
            h.k("properties");
            throw null;
        } else if (c5Var.a() && intent != null && (extras = intent.getExtras()) != null) {
            d dVar = this.b;
            if (dVar != null) {
                h.d(extras, "extras");
                dVar.a(extras);
                return;
            }
            h.k("launcher");
            throw null;
        }
    }
}
