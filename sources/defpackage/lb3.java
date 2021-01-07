package defpackage;

import com.spotify.music.ads.voice.VoiceAdService;
import java.util.Map;

/* renamed from: lb3  reason: default package */
public final class lb3 implements fjf<Map<String, String>> {
    private final wlf<VoiceAdService> a;

    public lb3(wlf<VoiceAdService> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().e().b();
    }
}
