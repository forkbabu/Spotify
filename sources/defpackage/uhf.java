package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties;
import io.reactivex.y;

/* renamed from: uhf  reason: default package */
public final class uhf implements fjf<thf> {
    private final wlf<y> a;
    private final wlf<j4a> b;
    private final wlf<AndroidMusicLibsVoiceAssistantFlagsProperties> c;

    public uhf(wlf<y> wlf, wlf<j4a> wlf2, wlf<AndroidMusicLibsVoiceAssistantFlagsProperties> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static thf a(y yVar, j4a j4a, AndroidMusicLibsVoiceAssistantFlagsProperties androidMusicLibsVoiceAssistantFlagsProperties) {
        return new thf(yVar, j4a, androidMusicLibsVoiceAssistantFlagsProperties);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new thf(this.a.get(), this.b.get(), this.c.get());
    }
}
