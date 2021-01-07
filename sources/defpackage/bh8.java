package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.libs.search.transition.l;
import com.spotify.music.libs.search.transition.n;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;
import defpackage.yg8;

/* renamed from: bh8  reason: default package */
public class bh8 implements xg8 {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<String> c;
    private final wlf<zab> d;
    private final wlf<Boolean> e;
    private final wlf<l> f;
    private final wlf<yg8.e> g;
    private final wlf<l.c> h;
    private final wlf<s98> i;
    private final wlf<Picasso> j;
    private final wlf<n> k;
    private final wlf<ic8> l;
    private final wlf<m> m;
    private final wlf<RecyclerView.q> n;
    private final wlf<Boolean> o;

    public bh8(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<String> wlf3, wlf<zab> wlf4, wlf<Boolean> wlf5, wlf<com.spotify.music.libs.search.transition.l> wlf6, wlf<yg8.e> wlf7, wlf<l.c> wlf8, wlf<s98> wlf9, wlf<Picasso> wlf10, wlf<n> wlf11, wlf<ic8> wlf12, wlf<m> wlf13, wlf<RecyclerView.q> wlf14, wlf<Boolean> wlf15) {
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
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
        a(wlf12, 12);
        this.l = wlf12;
        a(wlf13, 13);
        this.m = wlf13;
        a(wlf14, 14);
        this.n = wlf14;
        a(wlf15, 15);
        this.o = wlf15;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public wg8 b(ViewGroup viewGroup) {
        Activity activity = this.a.get();
        a(activity, 1);
        c.a aVar = this.b.get();
        a(aVar, 2);
        String str = this.c.get();
        a(str, 3);
        zab zab = this.d.get();
        a(zab, 4);
        Boolean bool = this.e.get();
        a(bool, 5);
        yg8.e eVar = this.g.get();
        a(eVar, 7);
        l.c cVar = this.h.get();
        a(cVar, 8);
        s98 s98 = this.i.get();
        a(s98, 9);
        Picasso picasso = this.j.get();
        a(picasso, 10);
        n nVar = this.k.get();
        a(nVar, 11);
        ic8 ic8 = this.l.get();
        a(ic8, 12);
        m mVar = this.m.get();
        a(mVar, 13);
        RecyclerView.q qVar = this.n.get();
        a(qVar, 14);
        Boolean bool2 = this.o.get();
        a(bool2, 15);
        return new yg8(activity, aVar, str, zab, bool.booleanValue(), this.f.get(), eVar, cVar, s98, picasso, nVar, ic8, mVar, qVar, bool2.booleanValue(), viewGroup);
    }
}
