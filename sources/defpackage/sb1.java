package defpackage;

import com.google.protobuf.u;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.music.navigation.o;
import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;

/* renamed from: sb1  reason: default package */
public final class sb1 implements fjf<y01<? extends Destination>> {
    private final wlf<AndroidFeatureAllboardingProperties> a;
    private final wlf<o> b;
    private final wlf<gl0<u>> c;

    public sb1(wlf<AndroidFeatureAllboardingProperties> wlf, wlf<o> wlf2, wlf<gl0<u>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<AndroidFeatureAllboardingProperties> wlf = this.a;
        this.b.get();
        return new rb1(wlf, this.c.get());
    }
}
