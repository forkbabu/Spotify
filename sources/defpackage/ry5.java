package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.o;
import java.util.Random;

/* renamed from: ry5  reason: default package */
public final class ry5 implements qy5 {
    private final String a;
    private final o b;
    private final Random c;
    private final Context d;

    public ry5(String str, o oVar, Random random, Context context) {
        this.a = str;
        this.b = oVar;
        this.c = random;
        this.d = context;
    }

    private PendingIntent a(String str) {
        Intent c2 = this.b.c(this.d, str);
        c2.putExtra("mode", this.a);
        return PendingIntent.getService(this.d, this.c.nextInt(), c2, 134217728);
    }

    public PendingIntent b() {
        return a("com.spotify.music.features.playbacknotification.SKIP_NEXT");
    }

    public PendingIntent c() {
        return a("com.spotify.music.features.playbacknotification.PAUSE");
    }

    public PendingIntent d() {
        return a("com.spotify.music.features.playbacknotification.SKIP_PREV");
    }

    public PendingIntent e() {
        return a("com.spotify.music.features.playbacknotification.RESUME");
    }

    public PendingIntent f() {
        return a("com.spotify.music.features.playbacknotification.SEEK_BACK_15_SEC");
    }

    public PendingIntent g() {
        return a("com.spotify.music.features.playbacknotification.SEEK_FORWARD_15_SEC");
    }
}
