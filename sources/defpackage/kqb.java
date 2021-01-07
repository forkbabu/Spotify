package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.VoiceAdService;

/* renamed from: kqb  reason: default package */
public class kqb {
    private final Context a;
    private final Handler b = new Handler();
    private final gqb c;
    private boolean d;

    public kqb(Context context, gqb gqb) {
        this.a = context;
        this.c = gqb;
    }

    public void a() {
        if (!this.d) {
            Logger.b("[VoiceAd] Service - Binding VoiceAdService", new Object[0]);
            this.d = this.a.getApplicationContext().bindService(new Intent(this.a, VoiceAdService.class), this.c, 1);
        }
    }

    public void b() {
        if (this.d) {
            Logger.b("[VoiceAd] Service - Unbinding VoiceAdService", new Object[0]);
            this.a.getApplicationContext().unbindService(this.c);
            this.c.m();
            this.b.removeCallbacksAndMessages(null);
            this.d = false;
        }
    }
}
