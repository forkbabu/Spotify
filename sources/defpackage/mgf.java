package defpackage;

import com.spotify.remoteconfig.AndroidLibsVoiceProperties;

/* renamed from: mgf  reason: default package */
public final class mgf implements fjf<Boolean> {
    private final wlf<AndroidLibsVoiceProperties> a;

    public mgf(wlf<AndroidLibsVoiceProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().i());
    }
}
