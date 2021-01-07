package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import com.spotify.music.features.playlistentity.g;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import com.spotify.music.libs.assistedcuration.presenter.s;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.rxjava2.p;
import defpackage.a2a;
import java.util.Set;

/* renamed from: a07  reason: default package */
public class a07 extends t.a implements AdditionalAdapter, g07, g.a {
    private static final int w = a07.class.hashCode();
    private static final int x = (a07.class.hashCode() + 1);
    private static final int y = (a07.class.hashCode() + 2);
    private final Context b;
    private final Fragment c;
    private final x1a f;
    private final sa0 n;
    private final FooterConfiguration o;
    private final e07 p;
    private final g q;
    private final p r = new p();
    private final wec s;
    private final a2a t;
    private final io.reactivex.subjects.a<Integer> u = io.reactivex.subjects.a.h1();
    private twd v;

    /* renamed from: a07$a */
    class a implements AdditionalAdapter.a {
        a() {
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void a(AdditionalAdapter.a.b bVar) {
            l.c(this, bVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void b(AdditionalAdapter.a.AbstractC0240a aVar) {
            l.b(this, aVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public RecyclerView.e<? extends RecyclerView.b0> c(ViewGroup viewGroup) {
            a07.this.v = new twd(true);
            a07.k(a07.this, viewGroup);
            a07.u(a07.this);
            a07 a07 = a07.this;
            a07.y(a07, LayoutInflater.from(a07.b), viewGroup);
            return a07.this.v;
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public io.reactivex.subjects.a<Integer> d() {
            return a07.this.u;
        }
    }

    /* renamed from: a07$b */
    public interface b {
        a07 a(FooterConfiguration footerConfiguration);
    }

    public a07(Context context, e07 e07, a2a.a aVar, sa0 sa0, g gVar, Fragment fragment, com.spotify.instrumentation.a aVar2, x1a x1a, wec wec, FooterConfiguration footerConfiguration) {
        this.b = context;
        this.c = fragment;
        this.f = x1a;
        this.n = sa0;
        this.o = footerConfiguration;
        this.p = e07;
        this.q = gVar;
        this.s = wec;
        this.t = aVar.a(aVar2, x1a);
    }

    static void k(a07 a07, ViewGroup viewGroup) {
        ia0 a2 = a07.n.a(a07.b, viewGroup);
        a2.setTitle(a07.b.getString(C0707R.string.assisted_curation_header_title));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a2.getTitleView().getLayoutParams();
        layoutParams.gravity = 8388627;
        a2.getTitleView().setLayoutParams(layoutParams);
        a07.v.Z(new v02(a2.getView(), false), w);
    }

    static void u(a07 a07) {
        a07.getClass();
        ToolbarSearchFieldView toolbarSearchFieldView = new ToolbarSearchFieldView(a07.b, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int g = nud.g(16.0f, a07.b.getResources());
        layoutParams.setMargins(g, 0, g, nud.g(10.0f, a07.b.getResources()));
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new b07(a07));
        a07.v.Z(new v02(toolbarSearchFieldView, false, layoutParams, 1), x);
    }

    static void y(a07 a07, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a07.getClass();
        FrameLayout frameLayout = new FrameLayout(a07.b);
        frameLayout.post(new sz6(a07, frameLayout));
        frameLayout.addView(a07.t.a(layoutInflater, viewGroup));
        a07.v.Z(new v02(frameLayout, false), y);
    }

    public void B(FrameLayout frameLayout) {
        View view = e90.d().i(this.b, new FrameLayout(this.b)).getView();
        view.measure(0, 0);
        int measuredHeight = view.getMeasuredHeight();
        View view2 = e90.d().i(this.b, new FrameLayout(this.b)).getView();
        view2.measure(0, 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, measuredHeight + (view2.getMeasuredHeight() * 7) + this.b.getResources().getDimensionPixelSize(C0707R.dimen.assisted_curation_dot_decoration_bar_height) + this.b.getResources().getDimensionPixelSize(C0707R.dimen.assisted_curation_footer_content_bottom_padding)));
    }

    public void C(Set<String> set, String str) {
        this.c.H4(this.s.d(set, str), 147, null);
    }

    public void D(s sVar) {
        this.t.n(sVar);
    }

    @Override // com.spotify.music.features.playlistentity.g.a
    public void b(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            this.t.i(intent.getStringArrayListExtra("added_tracks"));
        }
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.t.f(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        if (bundle != null) {
            this.t.d(bundle);
        }
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public AdditionalAdapter.a e() {
        return new a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void f() {
        this.p.a(null);
        this.r.a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void h() {
        this.p.a(this);
        p pVar = this.r;
        io.reactivex.subjects.a<Integer> aVar = this.u;
        e07 e07 = this.p;
        e07.getClass();
        pVar.b(aVar.subscribe(new yz6(e07)));
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.p.f();
        this.q.d(147, this);
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.p.g();
        this.f.stop();
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public boolean v(h76 h76) {
        return this.o.b(h76.a()) == FooterConfiguration.Type.AC;
    }
}
