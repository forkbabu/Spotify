package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: gv3  reason: default package */
public final class gv3 implements fjf<AudioManager> {
    private final wlf<Context> a;

    public gv3(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AudioManager audioManager = (AudioManager) this.a.get().getSystemService("audio");
        yif.g(audioManager, "Cannot return null from a non-@Nullable @Provides method");
        return audioManager;
    }
}
