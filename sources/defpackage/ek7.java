package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: ek7  reason: default package */
public class ek7 extends RecyclerView.e<f> {
    private final h c;
    private final lqa f;
    private final gk7 n;
    private String o = "";
    private String p;
    private ImmutableList<ProfileListItem> q = ImmutableList.of();
    private int r = Integer.MAX_VALUE;
    private Optional<Integer> s = Optional.absent();
    private a t = yj7.a;
    private d u = zj7.a;

    /* renamed from: ek7$a */
    public interface a {
        void a(ProfileListItem profileListItem, int i);
    }

    /* renamed from: ek7$b */
    public class b extends f {
        public b(ViewGroup viewGroup) {
            super(e90.d().i(viewGroup.getContext(), viewGroup).getView());
        }

        @Override // defpackage.ek7.f
        public void h0(ProfileListItem profileListItem, int i) {
            String str;
            y90 y90 = (y90) l70.o(this.a, y90.class);
            y90.setTitle(profileListItem.f());
            y90.setSubtitle(profileListItem.e());
            if (MoreObjects.isNullOrEmpty(profileListItem.c())) {
                str = null;
            } else {
                str = profileListItem.c();
            }
            int ordinal = profileListItem.h().ordinal();
            if (ordinal == 0) {
                ek7.this.f.a(y90.getImageView(), str, l0.z(profileListItem.i()).r(), profileListItem.f(), false, null);
            } else if (ordinal == 1 || ordinal == 2) {
                ek7.this.c.i(y90.getImageView(), str);
            } else if (ordinal == 3) {
                ek7.this.c.j(y90.getImageView(), str);
            }
            int ordinal2 = profileListItem.h().ordinal();
            if (ordinal2 != 0 && ordinal2 != 1) {
                y90.z0(null);
            } else if (!rw.equal(ek7.this.p, profileListItem.i())) {
                ek7.this.n.Y0(y90, profileListItem);
            } else {
                y90.z0(null);
            }
            int ordinal3 = profileListItem.h().ordinal();
            if (ordinal3 == 1 || ordinal3 == 2 || ordinal3 == 3) {
                ek7.this.n.Q0(y90, profileListItem);
            } else {
                ek7.this.n.Z0(y90);
            }
            y90.getView().setOnClickListener(new ak7(this, profileListItem, i));
            ek7 ek7 = ek7.this;
            profileListItem.i();
            profileListItem.h();
            ek7.getClass();
        }
    }

    /* renamed from: ek7$c */
    public static class c extends f {
        public c(ViewGroup viewGroup) {
            super(e90.e().a(viewGroup.getContext(), viewGroup).getView());
        }
    }

    /* renamed from: ek7$d */
    public interface d {
        void a();
    }

    /* renamed from: ek7$e */
    public class e extends f {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(android.view.ViewGroup r3) {
            /*
                r1 = this;
                defpackage.ek7.this = r2
                ga0 r2 = defpackage.e90.d()
                android.content.Context r0 = r3.getContext()
                t90 r2 = r2.c(r0, r3)
                android.view.View r2 = r2.getView()
                r1.<init>(r2)
                java.lang.Class<t90> r0 = defpackage.t90.class
                g90 r2 = defpackage.l70.o(r2, r0)
                t90 r2 = (defpackage.t90) r2
                android.content.Context r3 = r3.getContext()
                r0 = 2132019350(0x7f140896, float:1.9677032E38)
                java.lang.String r3 = r3.getString(r0)
                r2.setText(r3)
                android.view.View r3 = r2.getView()
                bk7 r0 = new bk7
                r0.<init>(r1)
                r3.setOnClickListener(r0)
                r2.getView()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ek7.e.<init>(ek7, android.view.ViewGroup):void");
        }
    }

    /* renamed from: ek7$f */
    public static class f extends RecyclerView.b0 {
        public f(View view) {
            super(view);
        }

        public void h0(ProfileListItem profileListItem, int i) {
        }
    }

    public ek7(h hVar, lqa lqa, gk7 gk7) {
        this.c = hVar;
        this.f = lqa;
        this.n = gk7;
    }

    private boolean g0() {
        return !this.o.isEmpty();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(f fVar, int i) {
        f fVar2 = fVar;
        int w = w(i);
        if (w == 0) {
            ((ia0) l70.o(((c) fVar2).a, ia0.class)).setTitle(this.o);
        } else if (w == 1) {
            fVar2.h0(this.q.get(g0() ? i - 1 : i), i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public f M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new c(viewGroup);
        }
        if (i == 1) {
            return new b(viewGroup);
        }
        if (i == 2) {
            return new e(viewGroup);
        }
        throw new AssertionError("View type not supported");
    }

    public void i0(String str) {
        if (!rw.equal(this.p, str)) {
            this.p = str;
            z();
        }
    }

    public void j0(int i) {
        this.r = i;
        z();
    }

    public void k0(a aVar) {
        this.t = aVar;
    }

    public void l0(ImmutableList<ProfileListItem> immutableList) {
        if (!immutableList.equals(this.q)) {
            this.q = immutableList;
            z();
        }
    }

    public void m0(String str) {
        if (!rw.equal(this.o, str)) {
            this.o = str;
            z();
        }
    }

    public void n0(d dVar) {
        this.u = dVar;
    }

    public void p0(int i) {
        this.s = Optional.of(Integer.valueOf(i));
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        int i;
        int i2;
        if (this.r != Integer.MAX_VALUE && this.q.size() > (i2 = this.r)) {
            i = i2 + 1;
        } else if (this.q.isEmpty() || ((this.r == Integer.MAX_VALUE || this.s.isPresent()) && (!this.s.isPresent() || this.s.get().intValue() <= this.q.size()))) {
            i = this.q.size();
        } else {
            i = this.q.size() + 1;
        }
        return (i <= 0 || !g0()) ? i : i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        boolean z = false;
        if (i == 0 && g0()) {
            return 0;
        }
        int i2 = g0() ? i - 1 : i;
        int i3 = this.r;
        if ((i3 != Integer.MAX_VALUE && i2 >= i3) || i2 >= this.q.size()) {
            z = true;
        }
        if (z) {
            return 2;
        }
        ImmutableList<ProfileListItem> immutableList = this.q;
        if (g0()) {
            i--;
        }
        int ordinal = immutableList.get(i).h().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return 1;
        }
        throw new AssertionError("Type not supported");
    }
}
