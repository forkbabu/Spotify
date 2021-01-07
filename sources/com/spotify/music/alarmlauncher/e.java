package com.spotify.music.alarmlauncher;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final b a;
    private final cqe b;
    private final cmf<Boolean> c;
    private final rmf<Long, Long, Long> d;

    public e(b bVar, cqe cqe, cmf cmf, rmf rmf, int i) {
        SpotifyServiceLaunchManagerImpl$1 spotifyServiceLaunchManagerImpl$1 = (i & 8) != 0 ? SpotifyServiceLaunchManagerImpl$1.a : null;
        h.e(bVar, "serviceScheduler");
        h.e(cqe, "clock");
        h.e(cmf, "isSpotifyServiceRunningProvider");
        h.e(spotifyServiceLaunchManagerImpl$1, "delayProvider");
        this.a = bVar;
        this.b = cqe;
        this.c = cmf;
        this.d = spotifyServiceLaunchManagerImpl$1;
    }

    @Override // com.spotify.music.alarmlauncher.d
    public void a(Bundle bundle) {
        h.e(bundle, "extras");
        long j = bundle.getLong("com.spotify.music.EXTRA_START_TIME", -1);
        Long l = null;
        String format = j > 0 ? new SimpleDateFormat("HH:mm", Locale.US).format(new Date(j)) : null;
        if (format == null) {
            Logger.n("Timestamp not valid: %d", Long.valueOf(bundle.getLong("com.spotify.music.EXTRA_START_TIME")));
        } else if (!this.c.invoke().booleanValue()) {
            Logger.g("Spotify alarm scheduled for %s", format);
            long j2 = bundle.getLong("com.spotify.music.EXTRA_START_TIME");
            long d2 = this.b.d();
            if (d2 < j2) {
                if (j2 - d2 > 600000) {
                    l = this.d.invoke(Long.valueOf(j2 - 600000), Long.valueOf(j2));
                } else {
                    l = this.d.invoke(Long.valueOf(d2), Long.valueOf(j2));
                }
            }
            if (l != null) {
                this.a.a(l.longValue());
            }
        }
    }
}
