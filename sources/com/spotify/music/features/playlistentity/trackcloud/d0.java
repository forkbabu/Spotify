package com.spotify.music.features.playlistentity.trackcloud;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.spotify.android.glue.components.trackcloud.a;
import com.spotify.android.glue.components.trackcloud.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.trackcloud.p;
import com.spotify.music.features.playlistentity.trackcloud.w;
import com.spotify.playlist.models.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d0 implements c0, b0 {
    private static final int s = d0.class.hashCode();
    private static final int t = (d0.class.hashCode() + 1);
    private static final int u = (d0.class.hashCode() + 2);
    private static final Function<l, a.C0145a> v = m.a;
    public static final /* synthetic */ int w = 0;
    private final w a;
    private final Context b;
    private final q c;
    private twd f;
    private c n;
    private c o;
    private a p;
    private a q;
    private TextView r;

    public d0(w.a aVar, Context context, q qVar, i iVar, com.spotify.music.features.playlistallsongs.c cVar) {
        this.a = aVar.a(iVar, cVar);
        this.c = qVar;
        this.b = context;
    }

    public void A(boolean z) {
        this.q.m(z);
    }

    public void B(p pVar) {
        if (!(pVar instanceof p.a)) {
            this.q.o((String) pVar.a(k.a, new h(this), new i(this), new j(this)));
            this.q.f(3);
        } else {
            this.q.o("");
            this.q.f(4);
        }
        this.o.c2(this.q);
    }

    public /* synthetic */ void b(View view) {
        ((x) this.a).e();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        ((x) this.a).a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return ((x) this.a).b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        ((x) this.a).a(this);
    }

    public /* synthetic */ void i(View view) {
        ((x) this.a).e();
    }

    public /* synthetic */ String j(p.b bVar) {
        return this.b.getString(C0707R.string.playlist_trackcloud_featuring);
    }

    public /* synthetic */ String k(p.c cVar) {
        return this.b.getString(C0707R.string.playlist_trackcloud_user_added, cVar.b());
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        ((x) this.a).f(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        ((x) this.a).g();
    }

    @Override // com.spotify.music.features.playlistentity.trackcloud.b0
    public void t(LayoutInflater layoutInflater, ViewGroup viewGroup, RecyclerView recyclerView, twd twd) {
        this.f = twd;
        c a2 = e90.f().a(this.b, recyclerView);
        this.o = a2;
        a2.getView().setId(C0707R.id.main_track_cloud);
        a a3 = a.a();
        a3.b(this.b.getString(C0707R.string.free_tier_cloud_and_more_text));
        this.q = a3;
        a3.f(4);
        this.q.o("");
        this.o.getView().setOnClickListener(new l(this));
        v02 v02 = new v02(this.o.getView(), true);
        int i = s;
        twd.Z(v02, i);
        TextView textView = new TextView(this.b);
        this.r = textView;
        textView.setId(C0707R.id.include_label);
        androidx.core.widget.c.n(this.r, R.style.TextAppearance_Encore_Minuet);
        this.r.setTextColor(androidx.core.content.a.b(this.b, R.color.gray_70));
        this.r.setPadding(0, 0, 0, nud.g(16.0f, this.b.getResources()));
        this.r.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.r.setGravity(1);
        v02 v022 = new v02(this.r, false);
        int i2 = u;
        twd.Z(v022, i2);
        c a4 = e90.f().a(this.b, recyclerView);
        this.n = a4;
        a4.getView().setId(C0707R.id.recs_track_cloud);
        a a5 = a.a();
        a5.b(this.b.getString(C0707R.string.free_tier_cloud_and_more_text));
        this.p = a5;
        a5.f(3);
        this.p.o(this.b.getString(C0707R.string.playlist_trackcloud_we_added));
        this.n.getView().setOnClickListener(new n(this));
        v02 v023 = new v02(this.n.getView(), true);
        int i3 = t;
        twd.Z(v023, i3);
        twd.i0(i, i2, i3);
    }

    public /* synthetic */ String u(p.d dVar) {
        return this.b.getString(C0707R.string.playlist_trackcloud_you_added);
    }

    public void w(List<l> list) {
        this.q.q(Collections2.transform((List) list, (Function) v));
        this.o.c2(this.q);
        if (!list.isEmpty()) {
            this.f.l0(s);
        } else {
            this.f.i0(s);
        }
    }

    public void y(List<l> list) {
        this.p.q(Collections2.transform((List) list, (Function) v));
        this.n.c2(this.p);
        if (!list.isEmpty()) {
            this.f.l0(t);
        } else {
            this.f.i0(t);
        }
    }

    public void z(boolean z, int i, int i2) {
        this.r.setText(this.c.a(i, i2));
        if (z) {
            this.f.l0(u);
        } else {
            this.f.i0(u);
        }
    }
}
