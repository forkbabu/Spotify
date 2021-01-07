package com.spotify.music.alarmlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.h;

public final class a implements b {
    private final Context a;
    private final h2e b;

    public a(Context context, h2e h2e) {
        h.e(context, "context");
        h.e(h2e, "serviceStarter");
        this.a = context;
        this.b = h2e;
    }

    @Override // com.spotify.music.alarmlauncher.b
    public void a(long j) {
        Context context = this.a;
        h.e(context, "context");
        Intent intent = new Intent(context, SpotifyServiceLauncherService.class);
        intent.putExtra("com.spotify.music.EXTRA_SCHEDULED_LAUNCH", j);
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.b(this.a, intent, "SpotifyServiceLauncherService", new Object[0]);
        } else {
            this.a.startService(intent);
        }
    }
}
