package defpackage;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.volume.controllers.k;

/* renamed from: vca  reason: default package */
public final class vca {
    private final wlf<k> a;
    private final wlf<dda> b;
    private final wlf<g> c;
    private final wlf<ConnectVolumeControlInstrumentation> d;

    public vca(wlf<k> wlf, wlf<dda> wlf2, wlf<g> wlf3, wlf<ConnectVolumeControlInstrumentation> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public uca b(String str, float f, int i) {
        k kVar = this.a.get();
        a(kVar, 1);
        k kVar2 = kVar;
        dda dda = this.b.get();
        a(dda, 2);
        dda dda2 = dda;
        g gVar = this.c.get();
        a(gVar, 3);
        g gVar2 = gVar;
        ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation = this.d.get();
        a(connectVolumeControlInstrumentation, 4);
        a(str, 5);
        return new uca(kVar2, dda2, gVar2, connectVolumeControlInstrumentation, str, f, i);
    }
}
