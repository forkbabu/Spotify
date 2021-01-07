package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: lca  reason: default package */
public class lca extends ContentObserver {
    public static final Uri d = Settings.System.CONTENT_URI;
    private final AudioManager a;
    private int b;
    private a c;

    /* renamed from: lca$a */
    public interface a {
        void a(float f);
    }

    public lca(AudioManager audioManager, Handler handler) {
        super(handler);
        this.a = audioManager;
        this.b = audioManager.getStreamVolume(3);
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.a.getStreamVolume(3);
        if (this.b - streamVolume != 0) {
            this.b = streamVolume;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(((float) streamVolume) / ((float) this.a.getStreamMaxVolume(3)));
            }
        }
    }
}
