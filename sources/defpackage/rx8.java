package defpackage;

import android.app.Application;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.voiceassistant.voice.results.o;

/* renamed from: rx8  reason: default package */
public final class rx8 implements fjf<qx8> {
    private final wlf<Application> a;
    private final wlf<MediaSessionCompat> b;
    private final wlf<vja> c;
    private final wlf<o> d;

    public rx8(wlf<Application> wlf, wlf<MediaSessionCompat> wlf2, wlf<vja> wlf3, wlf<o> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qx8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
