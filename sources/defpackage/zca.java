package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.lca;

/* renamed from: zca  reason: default package */
public class zca {
    private final Context a;
    private final lca b;

    public zca(Context context, Handler handler) {
        this.a = context;
        this.b = new lca(a(), handler);
    }

    private AudioManager a() {
        return (AudioManager) this.a.getApplicationContext().getSystemService("audio");
    }

    public float b() {
        AudioManager a2 = a();
        return ((float) a2.getStreamVolume(3)) / ((float) a2.getStreamMaxVolume(3));
    }

    public void c(lca.a aVar) {
        this.a.getContentResolver().registerContentObserver(lca.d, true, this.b);
        this.b.a(aVar);
    }

    public void d() {
        this.a.getContentResolver().unregisterContentObserver(this.b);
        this.b.a(null);
    }

    public void e(float f) {
        AudioManager a2 = a();
        a2.setStreamVolume(3, Math.round(f * ((float) a2.getStreamMaxVolume(3))), 0);
    }
}
