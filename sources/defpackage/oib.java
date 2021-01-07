package defpackage;

import android.view.ViewGroup;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: oib  reason: default package */
public final class oib {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<Picasso> d;
    private final wlf<thb> e;
    private final wlf<dib> f;
    private final wlf<mhb> g;

    public oib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<Picasso> wlf4, wlf<thb> wlf5, wlf<dib> wlf6, wlf<mhb> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public nib b(ViewGroup viewGroup) {
        a(viewGroup, 1);
        s sVar = this.a.get();
        a(sVar, 2);
        s sVar2 = sVar;
        q qVar = this.b.get();
        a(qVar, 3);
        q qVar2 = qVar;
        sda sda = this.c.get();
        a(sda, 4);
        sda sda2 = sda;
        Picasso picasso = this.d.get();
        a(picasso, 5);
        Picasso picasso2 = picasso;
        thb thb = this.e.get();
        a(thb, 6);
        thb thb2 = thb;
        dib dib = this.f.get();
        a(dib, 7);
        dib dib2 = dib;
        mhb mhb = this.g.get();
        a(mhb, 8);
        return new nib(viewGroup, sVar2, qVar2, sda2, picasso2, thb2, dib2, mhb);
    }
}
