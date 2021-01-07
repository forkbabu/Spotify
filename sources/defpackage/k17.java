package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import defpackage.j17;

/* renamed from: k17  reason: default package */
public final class k17 implements j17.b {
    private final wlf<i61> a;
    private final wlf<o17> b;
    private final wlf<Context> c;
    private final wlf<ifd> d;

    public k17(wlf<i61> wlf, wlf<o17> wlf2, wlf<Context> wlf3, wlf<ifd> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.j17.b
    public j17 a(FooterConfiguration footerConfiguration) {
        i61 i61 = this.a.get();
        b(i61, 1);
        i61 i612 = i61;
        o17 o17 = this.b.get();
        b(o17, 2);
        o17 o172 = o17;
        Context context = this.c.get();
        b(context, 3);
        Context context2 = context;
        ifd ifd = this.d.get();
        b(ifd, 4);
        b(footerConfiguration, 5);
        return new j17(i612, o172, context2, ifd, footerConfiguration);
    }
}
