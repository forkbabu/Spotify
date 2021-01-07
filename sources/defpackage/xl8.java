package defpackage;

import com.google.protobuf.u;
import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: xl8  reason: default package */
public final class xl8 implements fjf<wl8> {
    private final wlf<InteractionLogger> a;
    private final wlf<ImpressionLogger> b;
    private final wlf<gl0<u>> c;
    private final wlf<b> d;

    public xl8(wlf<InteractionLogger> wlf, wlf<ImpressionLogger> wlf2, wlf<gl0<u>> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static wl8 a(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, gl0<u> gl0, b bVar) {
        return new wl8(interactionLogger, impressionLogger, gl0, bVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wl8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
