package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.view.m0;
import com.spotify.music.features.yourlibrary.musicpages.view.n0;
import defpackage.d39;

/* renamed from: c69  reason: default package */
public class c69 implements d39.h<MusicItem.Type, MusicItem> {
    private final n0 a;
    private h b = f59.b;
    private g c;
    private c f;
    private a n;
    private e o;
    private f p;
    private d q;
    private b r;

    /* renamed from: c69$a */
    public interface a {
        public static final /* synthetic */ int a = 0;

        void a();
    }

    /* renamed from: c69$b */
    public interface b {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    /* renamed from: c69$c */
    public interface c {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i, boolean z);
    }

    /* renamed from: c69$d */
    public interface d {
        public static final /* synthetic */ int a = 0;

        void a();
    }

    /* renamed from: c69$e */
    public interface e {
        public static final /* synthetic */ int a = 0;

        void a(va9 va9);
    }

    /* renamed from: c69$f */
    public interface f {
        public static final /* synthetic */ int a = 0;

        void a(String str, String str2, boolean z, int i);
    }

    /* renamed from: c69$g */
    public interface g {
        public static final /* synthetic */ int a = 0;

        void a();
    }

    /* renamed from: c69$h */
    public interface h {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    public c69(n0 n0Var) {
        int i = h.a;
        int i2 = g.a;
        this.c = e59.b;
        int i3 = c.a;
        this.f = a59.b;
        int i4 = a.a;
        this.n = y49.b;
        int i5 = e.a;
        this.o = c59.b;
        int i6 = f.a;
        this.p = d59.b;
        int i7 = d.a;
        this.q = b59.b;
        int i8 = b.a;
        this.r = z49.b;
        this.a = n0Var;
    }

    public static void g(c69 c69, ViewProvider viewProvider, MusicItem musicItem, int i) {
        n0 n0Var = c69.a;
        View view = viewProvider.getView();
        n0Var.getClass();
        xa9 xa9 = (xa9) l70.o(view, xa9.class);
        if (!(musicItem.type() == MusicItem.Type.FILTER_INDICATOR) || musicItem.g() == null) {
            Assertion.n();
        }
        xa9.d(((MusicItem.e) musicItem.g()).a());
        xa9.g(new o49(c69));
    }

    public static g90 h(c69 c69, ViewGroup viewGroup) {
        return c69.a.f(viewGroup.getContext(), viewGroup);
    }

    public static g90 i(c69 c69, ViewGroup viewGroup) {
        return c69.a.d(viewGroup);
    }

    public static g90 j(c69 c69, ViewGroup viewGroup) {
        return c69.a.e(viewGroup.getContext(), viewGroup);
    }

    public static g90 k(c69 c69, ViewGroup viewGroup) {
        c69.a.getClass();
        xa9 b2 = xa9.b(viewGroup);
        b2.getView().setTag(C0707R.id.glue_viewholder_tag, b2);
        return b2;
    }

    public static void n(c69 c69, ViewProvider viewProvider, MusicItem musicItem, int i) {
        n0 n0Var = c69.a;
        View view = viewProvider.getView();
        n0Var.getClass();
        m0 m0Var = (m0) l70.o(view, m0.class);
        m0Var.n2().setText(musicItem.w());
        if (musicItem.u().isEmpty()) {
            m0Var.l().setVisibility(8);
        } else {
            m0Var.l().setVisibility(0);
            m0Var.l().setText(musicItem.u());
        }
        m0Var.l().setOnClickListener(new x49(c69));
    }

    @Override // defpackage.d39.h
    public ImmutableList<d39.d<MusicItem.Type, MusicItem>> a() {
        return ImmutableList.of(d39.d.a(ImmutableSet.of(MusicItem.Type.FILTER_INDICATOR), new l59(this), new r49(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.DOWNLOAD_TOGGLE), new i59(this), new p59(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.LOADING_INDICATOR), new o59(this), null), d39.d.a(ImmutableSet.of(MusicItem.Type.PLACEHOLDER), new h59(this), null), d39.d.a(ImmutableSet.of(MusicItem.Type.SECTION_HEADER), new s59(this), new q59(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.SECTION_HEADER_WITH_BUTTON), new t49(this), new r59(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.SECTION_HEADER_CUSTOM), new k59(this), new q49(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.FILTER_INFO), new v49(this), new n59(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.FILTER_TAGS), new w49(this), new g59(this)));
    }

    public /* synthetic */ void l(va9 va9) {
        this.o.a(va9);
    }

    public /* synthetic */ void m(View view) {
        this.n.a();
    }

    public /* synthetic */ void o(MusicItem musicItem, int i) {
        this.r.a(musicItem, i);
    }

    public /* synthetic */ void p(MusicItem musicItem, int i, View view) {
        this.b.a(musicItem, i);
    }

    public void q(a aVar) {
        int i = a.a;
        this.n = (a) x.n(aVar, y49.b);
    }

    public void r(b bVar) {
        int i = b.a;
        this.r = (b) x.n(bVar, z49.b);
    }

    public void s(c cVar) {
        int i = c.a;
        this.f = (c) x.n(cVar, a59.b);
    }

    public void t(d dVar) {
        int i = d.a;
        this.q = (d) x.n(dVar, b59.b);
    }

    public void u(e eVar) {
        int i = e.a;
        this.o = (e) x.n(eVar, c59.b);
    }

    public void v(f fVar) {
        int i = f.a;
        this.p = (f) x.n(fVar, d59.b);
    }

    public void w(g gVar) {
        int i = g.a;
        this.c = (g) x.n(gVar, e59.b);
    }

    public void x(h hVar) {
        int i = h.a;
        this.b = (h) x.n(hVar, f59.b);
    }
}
