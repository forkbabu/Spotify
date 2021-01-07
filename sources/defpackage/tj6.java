package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.glue.dialogs.f;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import com.spotify.music.features.playlistentity.itemlist.adapter.h;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import defpackage.wh6;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: tj6  reason: default package */
public final class tj6 implements sj6, rj6 {
    private static final int s = tj6.class.hashCode();
    private static final int t = (tj6.class.hashCode() + 1);
    private static final int u = (tj6.class.hashCode() + 2);
    private static final int v = (tj6.class.hashCode() + 3);
    private static final int w = (tj6.class.hashCode() + 4);
    private final g<?> a;
    private final g<?> b;
    private final oj6 c;
    private final w f;
    private final wh6 n;
    private final wh6 o;
    private final com.spotify.glue.dialogs.g p;
    private Resources q;
    private twd r;

    /* renamed from: tj6$a */
    class a implements c0 {
        a(tj6 tj6) {
        }

        @Override // com.spotify.music.features.playlistentity.c0
        public void a(int i) {
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.lang.Integer> */
        @Override // com.spotify.music.features.playlistentity.c0
        public s<Integer> b() {
            return e0.a;
        }
    }

    tj6(pj6 pj6, w wVar, wh6.a aVar, c0 c0Var, com.spotify.glue.dialogs.g gVar, h<d0, ajf<b4<ContextMenuItem>>> hVar, ItemListConfiguration itemListConfiguration) {
        this.p = gVar;
        oj6 b2 = pj6.b(itemListConfiguration);
        this.c = b2;
        g<?> a2 = hVar.a(b2, new ij6(this), c0Var);
        this.a = a2;
        g<?> a3 = hVar.a(b2, new kj6(this), new a(this));
        this.b = a3;
        this.f = wVar;
        this.n = aVar.a(a2);
        this.o = aVar.a(a3);
    }

    public void A(j jVar, List<l> list) {
        this.a.c(jVar, list);
        this.r.l0(s);
    }

    public void B(j jVar, List<l> list) {
        this.b.c(jVar, list);
        if (!list.isEmpty()) {
            this.r.l0(t);
        } else {
            this.r.i0(t);
        }
    }

    public void C(boolean z) {
        if (z) {
            this.r.l0(w);
        } else {
            this.r.i0(w);
        }
    }

    public void D(boolean z) {
        if (z) {
            this.r.l0(v);
        } else {
            this.r.i0(v);
        }
    }

    public void E() {
        f c2 = this.p.c(this.q.getString(C0707R.string.playlist_entity_extra_songs_dialog_title), this.q.getString(C0707R.string.playlist_entity_extra_songs_dialog_body));
        c2.f(this.q.getString(C0707R.string.playlist_entity_extra_songs_dialog_button), new jj6(this));
        c2.b().a();
    }

    public void F(boolean z) {
        if (z) {
            this.r.l0(u);
        } else {
            this.r.i0(u);
        }
    }

    @Override // defpackage.uh6
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.r = twd;
        Context context = viewGroup.getContext();
        this.q = context.getResources();
        r90 a2 = Rows.a(context, viewGroup);
        ImageButton h = z42.h(context, (SpotifyIconDrawable) z42.e(context, SpotifyIconV2.X));
        h.setOnClickListener(new hj6(this));
        a2.z0(h);
        a2.setText(context.getString(C0707R.string.shuffle_onboarding_education_row));
        v02 v02 = new v02(a2.getView(), false);
        int i = u;
        twd.Z(v02, i);
        ia0 d = e90.e().d(context, null);
        d.setTitle(context.getString(C0707R.string.free_tier_section_header_you_added));
        v02 v022 = new v02(d.getView(), true);
        int i2 = v;
        twd.Z(v022, i2);
        RecyclerView.e e = this.a.e();
        int i3 = s;
        twd.Z(e, i3);
        ma0 f2 = e90.e().f(context, null);
        f2.setTitle(context.getString(C0707R.string.free_tier_section_header_we_added));
        f2.Q0(SpotifyIcon.HELPCIRCLE_24);
        f2.u2(new lj6(this));
        twd twd2 = this.r;
        v02 v023 = new v02(f2.getView(), true);
        int i4 = w;
        twd2.Z(v023, i4);
        RecyclerView.e e2 = this.b.e();
        int i5 = t;
        twd.Z(e2, i5);
        twd.i0(i2, i3, i5, i4, i);
    }

    public /* synthetic */ void b(View view) {
        this.c.p();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.c.j(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.c.k();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.c.j(this);
    }

    @Override // defpackage.wh6
    public void i(ItemConfiguration itemConfiguration) {
        this.n.i(itemConfiguration);
        this.o.i(itemConfiguration);
    }

    @Override // defpackage.wh6
    public void j(String str, boolean z) {
        this.n.j(str, z);
        this.o.j(str, z);
    }

    public /* synthetic */ void k(View view) {
        this.c.r();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.c.s(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.c.t();
    }

    public /* synthetic */ b4 u() {
        return this.c;
    }

    public /* synthetic */ b4 w() {
        oj6 oj6 = this.c;
        oj6.getClass();
        return new mj6(oj6);
    }

    public /* synthetic */ void y(DialogInterface dialogInterface, int i) {
        this.c.q();
        dialogInterface.dismiss();
    }

    public void z(int i) {
        this.f.c(s, i);
    }
}
