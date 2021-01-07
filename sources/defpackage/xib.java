package defpackage;

import android.view.ViewGroup;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.s;
import com.squareup.picasso.Picasso;

/* renamed from: xib  reason: default package */
public final class xib {
    private final wlf<s> a;
    private final wlf<q> b;
    private final wlf<sda> c;
    private final wlf<mhb> d;
    private final wlf<rhb> e;
    private final wlf<Picasso> f;
    private final wlf<thb> g;
    private final wlf<dib> h;

    public xib(wlf<s> wlf, wlf<q> wlf2, wlf<sda> wlf3, wlf<mhb> wlf4, wlf<rhb> wlf5, wlf<Picasso> wlf6, wlf<thb> wlf7, wlf<dib> wlf8) {
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
        a(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public wib b(ViewGroup viewGroup) {
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
        mhb mhb = this.d.get();
        a(mhb, 5);
        mhb mhb2 = mhb;
        rhb rhb = this.e.get();
        a(rhb, 6);
        rhb rhb2 = rhb;
        Picasso picasso = this.f.get();
        a(picasso, 7);
        Picasso picasso2 = picasso;
        thb thb = this.g.get();
        a(thb, 8);
        thb thb2 = thb;
        dib dib = this.h.get();
        a(dib, 9);
        return new wib(viewGroup, sVar2, qVar2, sda2, mhb2, rhb2, picasso2, thb2, dib);
    }
}
