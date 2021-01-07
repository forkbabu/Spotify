package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.features.playlistentity.z;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.endpoints.d;
import defpackage.di9;
import io.reactivex.internal.operators.completable.b;
import java.util.List;

/* renamed from: g96  reason: default package */
final class g96 implements e96, d96 {
    private static final int r = g96.class.hashCode();
    private static final ImmutableMap<ane, Boolean> s;
    private final Context a;
    private final b96 b;
    private final gi9 c;
    private final w f;
    private final z n;
    private twd o;
    private ViewGroup p;
    private gb0 q;

    static {
        ane ane = d.b.c.g;
        Boolean bool = Boolean.TRUE;
        ane ane2 = d.b.c.h;
        Boolean bool2 = Boolean.FALSE;
        s = ImmutableMap.of(ane, bool, ane2, bool2, d.b.c.e, bool, d.b.c.d, bool, d.b.c.f, bool2);
    }

    g96(Context context, b96 b96, gi9 gi9, w wVar, z zVar) {
        this.a = context;
        this.b = b96;
        this.c = gi9;
        this.f = wVar;
        this.n = zVar;
    }

    /* access modifiers changed from: private */
    public void B(boolean z) {
        if (z) {
            this.p.setVisibility(0);
            this.c.b();
            this.n.a(false);
            return;
        }
        this.p.setVisibility(8);
        this.n.a(true);
    }

    private static di9.d j(int i, ane ane) {
        di9.d.a a2 = di9.d.a();
        a2.d(i);
        String c2 = ane.c();
        ImmutableMap<ane, Boolean> immutableMap = s;
        Optional firstMatch = FluentIterable.from(immutableMap.keySet()).firstMatch(new x86(c2));
        a2.b(firstMatch.isPresent() ? immutableMap.get(firstMatch.get()).booleanValue() : false);
        a2.c(ane);
        return a2.a();
    }

    public void A() {
        this.c.c();
    }

    @Override // defpackage.d96
    public List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.o = twd;
        ImmutableList of = ImmutableList.of(j(C0707R.string.sort_order_title, d.b.c.g), j(C0707R.string.sort_order_recently_added, d.b.c.h), j(C0707R.string.sort_order_artist, d.b.c.e), j(C0707R.string.sort_order_album, d.b.c.d), j(C0707R.string.sort_order_custom, c76.a));
        di9.a a2 = di9.a();
        a2.g(of);
        a2.h(viewGroup.getContext().getString(C0707R.string.playlist_entity_filter_hint));
        a2.d(false);
        a2.c(true);
        di9 a3 = a2.a();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.p = new FrameLayout(viewGroup.getContext());
        this.p.addView(this.c.h(layoutInflater, frameLayout, frameLayout, a3, new f96(this)));
        this.p.setVisibility(8);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C0707R.dimen.playlist_entity_filter_top_padding) + a.f(viewGroup.getContext());
        ViewGroup viewGroup2 = this.p;
        viewGroup2.setPadding(viewGroup2.getPaddingLeft(), dimensionPixelSize, this.p.getPaddingRight(), this.p.getPaddingBottom());
        gb0 a4 = e90.c().a(this.a, viewGroup);
        this.q = a4;
        a4.b2(false);
        this.q.getTitleView().setSingleLine(false);
        this.q.getTitleView().setEllipsize(null);
        this.q.getSubtitleView().setSingleLine(false);
        this.q.getSubtitleView().setEllipsize(null);
        this.q.setSubtitle(this.a.getString(C0707R.string.placeholder_no_result_body));
        Context context = this.a;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.FLAG, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.empty_view_icon_size));
        spotifyIconDrawable.r(nud.h(this.a, C0707R.attr.pasteColorPlaceholder));
        this.q.D2().c(spotifyIconDrawable);
        v02 v02 = new v02(this.q.getView(), false);
        int i = r;
        twd.Z(v02, i);
        twd.i0(i);
        return Collections2.newArrayList(this.p, frameLayout);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        this.b.getClass();
        return b.a;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.a(this);
    }

    public boolean k() {
        if (!(this.p.getVisibility() == 0)) {
            return false;
        }
        B(false);
        this.c.e("");
        return true;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.b.h(bVar);
    }

    @Override // defpackage.d96
    public ws2 m() {
        return new w86(this);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.b.i();
    }

    public void u(String str, ane ane) {
        this.c.e(str);
        this.c.a(ane);
    }

    public void w(String str) {
        this.q.setTitle(this.a.getString(C0707R.string.placeholder_no_result_title, str));
    }

    public void y(boolean z) {
        if (z) {
            this.o.l0(r);
        } else {
            this.o.i0(r);
        }
    }

    public void z(boolean z) {
        B(true);
        if (z) {
            this.f.c(-1, 0);
        }
    }
}
