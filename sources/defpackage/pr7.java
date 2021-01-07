package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.mobile.android.util.x;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.entity.i;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist;
import defpackage.gs7;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

/* renamed from: pr7  reason: default package */
public class pr7 implements g<hs7, gs7> {
    private final ToggleButton A;
    private final RecyclerView B;
    private final ek7 C;
    private final ek7 D;
    private final twd E;
    private final gk7 F;
    private final il7 G;
    private final boolean H;
    private final ViewGroup a;
    private final Activity b;
    private final ViewGroup c;
    private final ImageView f;
    private final d n;
    private final u o;
    private final lqa p;
    private final i q;
    private mr7 r;
    private final hq7 s;
    private final View t;
    private final View u;
    private final View v;
    private final TextView w;
    private final TextView x;
    private final TextView y;
    private final Button z;

    /* renamed from: pr7$a */
    class a implements h<hs7> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ io.reactivex.disposables.a b;

        a(PublishSubject publishSubject, io.reactivex.disposables.a aVar) {
            this.a = publishSubject;
            this.b = aVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            this.a.onNext((hs7) obj);
            pr7.this.n.P();
            if (pr7.this.B.getAdapter() == null) {
                pr7.this.B.setAdapter(pr7.this.E);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.f();
            pr7.d(pr7.this);
        }
    }

    public pr7(LayoutInflater layoutInflater, ViewGroup viewGroup, Activity activity, d dVar, lqa lqa, wlf<ek7> wlf, i iVar, hq7 hq7, gk7 gk7, il7 il7, boolean z2) {
        this.b = activity;
        this.p = lqa;
        this.q = iVar;
        this.s = hq7;
        this.F = gk7;
        this.G = il7;
        this.H = z2;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(!z2 && x.f(activity) ? C0707R.layout.fragment_profile_split : C0707R.layout.fragment_profile, viewGroup, false);
        this.a = viewGroup2;
        this.n = dVar;
        u R = dVar.R();
        this.o = R;
        R.setTitle(activity.getString(C0707R.string.profile_title));
        if (!z2 && x.f(activity)) {
            this.c = (ViewGroup) viewGroup2.findViewById(C0707R.id.header_view_split);
            this.f = (ImageView) viewGroup2.findViewById(C0707R.id.profile_image);
        } else {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.header_view_portrait);
            this.c = viewGroup3;
            viewGroup3.setPadding(0, com.spotify.android.paste.app.d.b(activity) + com.spotify.android.goldenpath.a.e(activity.getResources()), 0, 0);
            View findViewById = viewGroup2.findViewById(C0707R.id.header_content);
            mr7 mr7 = new mr7(findViewById);
            this.r = mr7;
            this.f = mr7.getImageView();
            ((AppBarLayout) viewGroup3).a(new vq7(this, findViewById, mr7));
        }
        twd twd = new twd(false);
        this.E = twd;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(C0707R.id.recycler_view);
        this.B = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        View inflate = layoutInflater.inflate(C0707R.layout.profile_tabs, (ViewGroup) recyclerView, false);
        inflate.setBackgroundColor(0);
        twd.Z(new v02(inflate, false), 0);
        View findViewById2 = inflate.findViewById(C0707R.id.playlists_layout);
        this.t = findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.followers_layout);
        this.u = findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.following_layout);
        this.v = findViewById4;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.playlists_count);
        this.w = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.followers_count);
        this.x = textView2;
        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.following_count);
        this.y = textView3;
        bvd a2 = dvd.a(findViewById2);
        a2.g(textView, inflate.findViewById(C0707R.id.playlists_label));
        a2.a();
        bvd a3 = dvd.a(findViewById3);
        a3.g(textView2, inflate.findViewById(C0707R.id.followers_label));
        a3.a();
        bvd a4 = dvd.a(findViewById4);
        a4.g(textView3, inflate.findViewById(C0707R.id.following_label));
        a4.a();
        this.z = (Button) viewGroup2.findViewById(C0707R.id.edit_button);
        this.A = (ToggleButton) viewGroup2.findViewById(C0707R.id.follow_button);
        ek7 ek7 = wlf.get();
        this.C = ek7;
        ek7.m0(activity.getString(C0707R.string.profile_list_recently_played_artists_title));
        ek7.j0(3);
        twd.Z(ek7, 1);
        ek7 ek72 = wlf.get();
        this.D = ek72;
        ek72.m0(activity.getString(C0707R.string.profile_list_public_playlists_title));
        ek72.j0(3);
        twd.Z(ek72, 2);
        nb0 b2 = pb0.b(activity, viewGroup);
        b2.setTitle(C0707R.string.profile_empty_view);
        b2.getView().setPadding(0, nud.g(24.0f, activity.getResources()), 0, 0);
        b2.getView().setBackground(null);
        twd.Z(new v02(b2.getView(), false), 3);
        twd.i0(3);
    }

    static void d(pr7 pr7) {
        pr7.o.u(null);
    }

    public static void f(pr7 pr7, hs7 hs7) {
        pr7.A.setVisibility(hs7.h() ? 0 : 8);
        pr7.A.setChecked(hs7.g());
    }

    public static void g(pr7 pr7, hs7 hs7) {
        pr7.getClass();
        int a2 = hs7.c().a() - 16777216;
        pr7.p.a(pr7.f, hs7.c().g(), hs7.c().o(), hs7.c().c(), hs7.c().p(), Integer.valueOf(a2));
        int a3 = ovd.a(a2, 0.4f);
        ViewGroup viewGroup = pr7.c;
        mc0 a4 = lc0.a(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a3, 0}), new kc0(pr7.b));
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        viewGroup.setBackground(a4);
        pr7.o.u(new ColorDrawable(a3));
    }

    public static void r(pr7 pr7, String str) {
        mr7 mr7 = pr7.r;
        if (mr7 != null) {
            mr7.setTitle(str);
        }
        pr7.o.setTitle(str);
    }

    public static void u(pr7 pr7, hs7 hs7) {
        pr7.getClass();
        ct7 ct7 = (ct7) MoreObjects.firstNonNull(hs7.c().e(), ct7.a);
        x(pr7.t, pr7.w, hs7.c().j());
        x(pr7.u, pr7.x, ct7.c());
        x(pr7.v, pr7.y, ct7.f());
    }

    public static void w(pr7 pr7, hs7 hs7) {
        ek7 ek7 = pr7.C;
        List<ArtistlistResponse$Artist> k = hs7.c().k();
        il7 il7 = pr7.G;
        il7.getClass();
        ek7.l0(ImmutableList.copyOf(Collections2.transform((Iterable) k, (Function) new iq7(il7))));
        ek7 ek72 = pr7.D;
        List<PlaylistlistResponse$Playlist> i = hs7.c().i();
        il7 il72 = pr7.G;
        il72.getClass();
        ek72.l0(ImmutableList.copyOf(Collections2.transform((Iterable) i, (Function) new kr7(il72))));
        pr7.D.p0(hs7.c().j());
        pr7.E.n0(1);
        pr7.E.n0(2);
        if (hs7.i()) {
            pr7.E.l0(3);
        } else {
            pr7.E.i0(3);
        }
    }

    private static void x(View view, TextView textView, int i) {
        textView.setText(String.valueOf(i));
        boolean z2 = true;
        if (i < 1) {
            z2 = false;
        }
        view.setClickable(z2);
    }

    public View e() {
        return this.a;
    }

    public void h(da2 da2, hs7 hs7) {
        this.z.setVisibility(hs7.e() ? 0 : 8);
        if (this.r == null) {
            return;
        }
        if (hs7.e()) {
            this.r.E2(new xq7(this, da2));
        } else {
            this.r.E2(null);
        }
    }

    public /* synthetic */ void i(da2 da2, View view) {
        da2.accept(gs7.g.a);
        this.q.b();
    }

    public void j(da2 da2, ProfileListItem profileListItem, int i) {
        kotlin.jvm.internal.h.e(profileListItem, "profileListItem");
        da2.accept(new gs7.a(profileListItem));
        this.q.i(profileListItem.i(), i);
    }

    public /* synthetic */ void k(da2 da2) {
        da2.accept(gs7.l.a);
        this.q.j();
    }

    public void l(da2 da2, ProfileListItem profileListItem, int i) {
        kotlin.jvm.internal.h.e(profileListItem, "profileListItem");
        da2.accept(new gs7.h(profileListItem));
        this.q.g(profileListItem.i(), i);
    }

    public /* synthetic */ void m(da2 da2) {
        da2.accept(gs7.k.a);
        this.q.h();
    }

    public /* synthetic */ void n(da2 da2, View view) {
        da2.accept(gs7.d.a);
        this.q.d();
    }

    public /* synthetic */ void o(da2 da2, View view) {
        da2.accept(gs7.e.a);
        this.q.e(this.A.isChecked());
    }

    public /* synthetic */ void p(da2 da2, View view) {
        da2.accept(gs7.j.a);
        this.q.c();
    }

    public /* synthetic */ void q(da2 da2, View view) {
        da2.accept(gs7.f.a);
        this.q.a();
    }

    public /* synthetic */ void s(View view, mr7 mr7, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        mr7.e0(abs, height);
        view.setTranslationY(f2);
        this.o.o(height);
        this.o.c(height);
    }

    @Override // com.spotify.mobius.g
    public h<hs7> t(da2<gs7> da2) {
        this.C.k0(new hr7(this, da2));
        this.C.n0(new yq7(this, da2));
        this.D.k0(new tq7(this, da2));
        this.D.n0(new wq7(this, da2));
        this.z.setOnClickListener(new br7(this, da2));
        this.A.setOnClickListener(new rq7(this, da2));
        this.t.setOnClickListener(new pq7(this, da2));
        this.u.setOnClickListener(new gr7(this, da2));
        this.v.setOnClickListener(new nq7(this, da2));
        PublishSubject h1 = PublishSubject.h1();
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        s E2 = h1.j0(lr7.a).E();
        gk7 gk7 = this.F;
        gk7.getClass();
        aVar.e(h1.F(uq7.a).subscribe(new sq7(this)), h1.j0(jq7.a).E().subscribe(new cr7(this)), h1.F(oq7.a).subscribe(new dr7(this)), h1.F(qq7.a).subscribe(new er7(this, da2)), h1.F(ar7.a).subscribe(new mq7(this)), h1.F(zq7.a).subscribe(new fr7(this)), E2.subscribe(new jr7(gk7)));
        return new a(h1, aVar);
    }

    public /* synthetic */ void v(da2 da2, View view) {
        da2.accept(gs7.i.a);
        this.q.f();
    }
}
