package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Map;

/* renamed from: fa9  reason: default package */
public class fa9 implements z99 {
    private final rpd a;
    private final MusicPagesFiltering b;
    private final e1 c;
    private final y d;

    public fa9(rpd rpd, MusicPagesFiltering musicPagesFiltering, e1 e1Var, y yVar) {
        this.a = rpd;
        this.b = musicPagesFiltering;
        this.c = e1Var;
        this.d = yVar;
    }

    public static ImmutableMap b(fa9 fa9, r0.k0 k0Var, ImmutableMap immutableMap) {
        boolean z;
        fa9.getClass();
        if (fa9.c.g() && k0Var.c() == MusicPageId.SONGS) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!str.equals("available_offline_only")) {
                    builder.mo51put(str, entry.getValue());
                }
            }
            return builder.build();
        }
        ImmutableList<String> a2 = k0Var.a();
        ImmutableMap<String, Boolean> b2 = k0Var.b();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        UnmodifiableListIterator<String> listIterator = a2.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            Boolean[] boolArr = {(Boolean) immutableMap.get(next), b2.get(next)};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = false;
                    break;
                }
                Boolean bool = boolArr[i];
                if (bool != null) {
                    z = bool.booleanValue();
                    break;
                }
                i++;
            }
            builder2.mo51put(next, Boolean.valueOf(z));
        }
        return builder2.build();
    }

    public static s c(fa9 fa9, r0.k0 k0Var) {
        fa9.getClass();
        return s.n(s.i0(k0Var), fa9.b.g(k0Var.d()), new b99(fa9));
    }

    public static s0 i(fa9 fa9, r0.d dVar) {
        rpd rpd = fa9.a;
        l0 z = l0.z(dVar.c());
        qpd b2 = dVar.b();
        ImmutableList<qpd> a2 = dVar.a();
        rpd.getClass();
        return s0.F(qpd.b(rpd.a(z.B(), b2.a(), ImmutableList.copyOf(Collections2.transform((Iterable) a2, (Function) ppd.a)))));
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.h(r0.d.class, new e99(this));
        mVar.h(r0.k0.class, new d99(this));
        mVar.e(r0.b.class, new a99(this), this.d);
        mVar.e(r0.t0.class, new f99(this), this.d);
        mVar.e(r0.s0.class, new g99(this), this.d);
    }

    public /* synthetic */ void d(r0.b bVar) {
        this.b.a(bVar.a());
    }

    public /* synthetic */ v e(s sVar) {
        return sVar.o0(this.d).j0(new h99(this));
    }

    public /* synthetic */ v f(s sVar) {
        return sVar.o0(this.d).J0(new c99(this)).E().j0(t99.a).o0(this.d);
    }

    public /* synthetic */ void g(r0.s0 s0Var) {
        this.b.i(s0Var.c(), s0Var.a(), s0Var.b());
    }

    public void h(r0.t0 t0Var) {
        rpd rpd = this.a;
        l0 z = l0.z(t0Var.b());
        qpd a2 = t0Var.a();
        rpd.getClass();
        rpd.d(z.B(), a2.a().b());
    }
}
