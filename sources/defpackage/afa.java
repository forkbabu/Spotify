package defpackage;

import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;

/* renamed from: afa  reason: default package */
public class afa {
    private final ajf<AudioManager> a;

    public afa(ajf<AudioManager> ajf) {
        this.a = ajf;
    }

    public int a(boolean z) {
        int streamMaxVolume = this.a.get().getStreamMaxVolume(3) / 5;
        int streamVolume = this.a.get().getStreamVolume(3);
        int i = z ? streamVolume + streamMaxVolume : streamVolume - streamMaxVolume;
        Logger.b("Adjusting volume with factor %s to %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(i));
        return i;
    }
}
