package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.g;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import defpackage.a07;
import defpackage.a2a;

/* renamed from: c07  reason: default package */
public final class c07 implements a07.b {
    private final wlf<Context> a;
    private final wlf<e07> b;
    private final wlf<a2a.a> c;
    private final wlf<sa0> d;
    private final wlf<g> e;
    private final wlf<Fragment> f;
    private final wlf<a> g;
    private final wlf<x1a> h;
    private final wlf<wec> i;

    public c07(wlf<Context> wlf, wlf<e07> wlf2, wlf<a2a.a> wlf3, wlf<sa0> wlf4, wlf<g> wlf5, wlf<Fragment> wlf6, wlf<a> wlf7, wlf<x1a> wlf8, wlf<wec> wlf9) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
        b(wlf8, 8);
        this.h = wlf8;
        b(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T b(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.a07.b
    public a07 a(FooterConfiguration footerConfiguration) {
        Context context = this.a.get();
        b(context, 1);
        Context context2 = context;
        e07 e07 = this.b.get();
        b(e07, 2);
        e07 e072 = e07;
        a2a.a aVar = this.c.get();
        b(aVar, 3);
        a2a.a aVar2 = aVar;
        sa0 sa0 = this.d.get();
        b(sa0, 4);
        sa0 sa02 = sa0;
        g gVar = this.e.get();
        b(gVar, 5);
        g gVar2 = gVar;
        Fragment fragment = this.f.get();
        b(fragment, 6);
        Fragment fragment2 = fragment;
        a aVar3 = this.g.get();
        b(aVar3, 7);
        a aVar4 = aVar3;
        x1a x1a = this.h.get();
        b(x1a, 8);
        x1a x1a2 = x1a;
        wec wec = this.i.get();
        b(wec, 9);
        b(footerConfiguration, 10);
        return new a07(context2, e072, aVar2, sa02, gVar2, fragment2, aVar4, x1a2, wec, footerConfiguration);
    }
}
