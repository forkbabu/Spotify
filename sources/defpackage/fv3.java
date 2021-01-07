package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.google.common.base.MoreObjects;

/* renamed from: fv3  reason: default package */
public class fv3 extends ContentObserver {
    private final AudioManager a;
    private final dv3 b;
    public boolean c;
    public String d;
    public String e;
    public int f;

    public fv3(Handler handler, AudioManager audioManager, dv3 dv3) {
        super(handler);
        this.a = audioManager;
        this.b = dv3;
        int streamVolume = audioManager.getStreamVolume(3);
        this.f = streamVolume;
        this.c = streamVolume == 0;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (!MoreObjects.isNullOrEmpty(this.d)) {
            int streamVolume = this.a.getStreamVolume(3);
            if (streamVolume != this.f) {
                this.b.b("volume_change", this.d, this.e);
                this.f = streamVolume;
            }
            boolean z2 = this.c;
            if (z2 && streamVolume > 0) {
                this.c = false;
                this.b.b("unmuted", this.d, this.e);
            } else if (!z2 && streamVolume == 0) {
                this.c = true;
                this.b.b("muted", this.d, this.e);
            }
        }
    }
}
