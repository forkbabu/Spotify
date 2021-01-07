package defpackage;

import android.app.Activity;
import android.media.AudioManager;

/* renamed from: ka3  reason: default package */
public final class ka3 implements fjf<AudioManager> {
    private final wlf<Activity> a;

    public ka3(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AudioManager audioManager = (AudioManager) this.a.get().getSystemService("audio");
        yif.g(audioManager, "Cannot return null from a non-@Nullable @Provides method");
        return audioManager;
    }
}
