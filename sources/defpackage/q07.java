package defpackage;

import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import defpackage.p07;

/* renamed from: q07  reason: default package */
public final class q07 implements p07.b {
    private final wlf<t07> a;

    public q07(wlf<t07> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.p07.b
    public p07 a(FooterConfiguration footerConfiguration) {
        t07 t07 = this.a.get();
        b(t07, 1);
        b(footerConfiguration, 2);
        return new p07(t07, footerConfiguration);
    }
}
