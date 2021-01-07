package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.datasource.p3;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class v4 {
    private final e1 a;
    private final t4 b;
    private final d5 c;
    private final a5 d;
    private final wlf<h5> e;
    private final wlf<jf9> f;
    private final yd9 g;
    private final q3 h;
    private final wlf<j3> i;
    private final wlf<n3> j;
    private final wlf<l3> k;
    private final wlf<o4> l;
    private final m5 m;
    private final hb9 n;
    private final m o;
    private final g<SessionState> p;
    private final s<Boolean> q;
    private final s<Boolean> r;
    private final s<Boolean> s;
    private final Context t;
    private final h69 u;
    private final String v;

    public v4(Context context, e1 e1Var, t4 t4Var, d5 d5Var, a5 a5Var, wlf<h5> wlf, wlf<jf9> wlf2, yd9 yd9, q3 q3Var, wlf<j3> wlf3, wlf<n3> wlf4, wlf<l3> wlf5, wlf<o4> wlf6, m5 m5Var, hb9 hb9, m mVar, h69 h69, g<SessionState> gVar, s<Boolean> sVar, s<Boolean> sVar2, s<Boolean> sVar3, String str) {
        this.t = context;
        this.a = e1Var;
        this.b = t4Var;
        this.c = d5Var;
        this.d = a5Var;
        this.e = wlf;
        this.f = wlf2;
        this.g = yd9;
        this.h = q3Var;
        this.i = wlf3;
        this.j = wlf4;
        this.k = wlf5;
        this.l = wlf6;
        this.m = m5Var;
        this.n = hb9;
        this.o = mVar;
        this.u = h69;
        this.p = gVar;
        this.q = sVar;
        this.r = sVar2;
        this.s = sVar3;
        this.v = str;
    }

    private static w3 a(w3 w3Var, w3 w3Var2) {
        return new l4(z3.e(w3Var2.b(), z3.l(ImmutableList.copyOf(new w3[]{w3Var, new g4(i2.a, w3Var2)}))));
    }

    private w3 d() {
        ImmutableList copyOf = ImmutableList.copyOf(new MusicItem[]{this.o.f()});
        return new g4(d2.a, new j4(copyOf, z3.i(copyOf)));
    }

    private w3 e() {
        return new g4(new c2(this), this.n.b(this.e.get(), this.v, new v(this.p.O(h3.a))));
    }

    private w3 i() {
        return z3.e(this.a.o(), z3.h(this.f.get().c().j0(new v1(this))));
    }

    public static MusicItem j(v4 v4Var, SongsMetadataFromTracks songsMetadataFromTracks) {
        return v4Var.o.d(songsMetadataFromTracks.offlineState(), v4Var.v);
    }

    public static MusicItem k(v4 v4Var, eg9 eg9) {
        v4Var.getClass();
        SongsMetadataFromTracks songsMetadataFromTracks = (SongsMetadataFromTracks) eg9.b();
        return v4Var.o.p(v4Var.v, songsMetadataFromTracks.length(), songsMetadataFromTracks.isLoading(), songsMetadataFromTracks.offlineState(), ((Boolean) eg9.c()).booleanValue());
    }

    public w3 b() {
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo60add((Object[]) new w3[]{this.l.get(), this.k.get()});
        if (this.a.j()) {
            j3 j3Var = this.i.get();
            builder.mo53add((ImmutableList.Builder) z3.c(new l4(z3.e(j3Var.b(), z3.l(ImmutableList.copyOf(new w3[]{new a4(new e2(this)), j3Var}))))));
        }
        return new l4(z3.l(builder.build()));
    }

    public w3 c() {
        w3 w3Var;
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        q3 q3Var = this.h;
        p3.a aVar = p3.a.a;
        p3 b2 = q3Var.b(aVar);
        builder.mo53add((ImmutableList.Builder) b2);
        s<Boolean> a2 = this.u.a();
        s n2 = s.n(b2.b(), a2, x1.a);
        g2 g2Var = g2.a;
        ImmutableList copyOf = ImmutableList.copyOf(new MusicItem[]{this.o.c()});
        builder.mo53add((ImmutableList.Builder) z3.f(n2, g2Var, new j4(copyOf, z3.i(copyOf))));
        ImmutableList copyOf2 = ImmutableList.copyOf(new MusicItem[]{this.o.a()});
        builder.mo53add((ImmutableList.Builder) z3.f(a2, g2Var, new j4(copyOf2, z3.i(copyOf2))));
        if (this.a.q()) {
            a4 a4Var = new a4(new z1(this));
            if (this.a.r()) {
                w3Var = a(a4Var, this.j.get());
            } else {
                q3 q3Var2 = this.h;
                p3.a.AbstractC0261a e2 = aVar.e();
                e2.c(false);
                e2.d(true);
                e2.a(true);
                e2.e(Optional.of(SortOrder.RECENTLY_PLAYED));
                w3Var = a(a4Var, q3Var2.b(e2.b()));
            }
            builder.mo53add((ImmutableList.Builder) w3Var);
        }
        return new l4(z3.l(builder.build()));
    }

    public w3 f(String str) {
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        z4 b2 = this.d.b(l0.z(str).g());
        builder.mo53add((ImmutableList.Builder) b2);
        s<Boolean> b3 = b2.b();
        ImmutableList copyOf = ImmutableList.copyOf(new MusicItem[]{this.o.h(str)});
        return new l4(z3.l(ImmutableList.copyOf(new w3[]{z3.d(z3.e(b3, new j4(copyOf, z3.i(copyOf)))), z3.l(builder.build())})));
    }

    public w3 g() {
        s<Boolean> sVar = this.r;
        s4 b2 = this.b.b();
        w3 e2 = z3.e(sVar, z3.e(b2.b(), b2));
        w3 e3 = z3.e(this.s, this.c.b());
        jf9 jf9 = this.f.get();
        s<Boolean> b3 = this.u.b();
        ImmutableList copyOf = ImmutableList.copyOf(new MusicItem[]{this.o.b()});
        w3 l2 = z3.l(ImmutableList.copyOf(new w3[]{z3.e(jf9.c().j0(df9.a), new h4(z3.h(s.n(jf9.c(), this.q, f.a).j0(new a2(this))), b2.a)), this.m.b(), e2, e3, this.d.b(null), z3.b(z3.e(b3, new j4(copyOf, z3.i(copyOf))))}));
        s sVar2 = ((i4) l2).a;
        ImmutableList copyOf2 = ImmutableList.copyOf(new MusicItem[]{this.o.h(null)});
        return new l4(z3.l(ImmutableList.copyOf(new w3[]{this.l.get(), z3.e(sVar2, z3.b(new j4(copyOf2, z3.i(copyOf2)))), l2})));
    }

    public w3 h() {
        s<Boolean> p2 = this.a.p();
        h5 h5Var = this.e.get();
        s<Boolean> b2 = h5Var.b();
        g2 g2Var = g2.a;
        w3 f2 = z3.f(b2, g2Var, i());
        w3 e2 = e();
        w3 d2 = d();
        ImmutableList copyOf = ImmutableList.copyOf(new MusicItem[]{this.o.r("recs-section-header", this.t.getString(C0707R.string.your_library_music_pages_row_section_header_songs_recs_title), this.t.getString(C0707R.string.your_library_music_pages_row_section_header_songs_recs_info_button_text), this.t.getString(C0707R.string.your_library_music_pages_info_dialog_songs_extra_songs_title), this.t.getString(C0707R.string.your_library_music_pages_info_dialog_songs_extra_songs_text), this.t.getString(C0707R.string.your_library_music_pages_info_dialog_songs_extra_songs_dismiss))});
        j4 j4Var = new j4(copyOf, z3.i(copyOf));
        yd9 yd9 = this.g;
        String str = this.v;
        this.a.getClass();
        xd9 b3 = yd9.b(h5Var, str, 15);
        w3 l2 = z3.l(ImmutableList.copyOf(new w3[]{f2, e2, h5Var, d2, z3.f(b3.b(), g2Var, j4Var, b3)}));
        h5 h5Var2 = this.e.get();
        return new l4(new e4(p2.E().v0(1).h1(), l2, z3.l(ImmutableList.copyOf(new w3[]{z3.f(h5Var2.b(), g2Var, i()), e(), h5Var2, d()}))));
    }

    public boolean l(x3 x3Var) {
        if (!this.a.g() || (!(!x3Var.c().f()) && !x3Var.e())) {
            return false;
        }
        return true;
    }

    public /* synthetic */ y3 m(Boolean bool) {
        return z3.i(ImmutableList.of(this.o.q("recommended-artists", this.t.getString(C0707R.string.your_library_music_pages_row_section_header_recommended_artists_title), this.t.getString(C0707R.string.your_library_music_pages_row_section_header_recommended_artists_subtitle), false, bool.booleanValue(), "collapse_recommended_artists_section")));
    }

    public /* synthetic */ y3 n(Boolean bool) {
        return z3.i(ImmutableList.of(this.o.q("recommended-albums", this.t.getString(C0707R.string.your_library_music_pages_row_section_header_recommended_albums_title), this.t.getString(C0707R.string.your_library_music_pages_row_section_header_recommended_albums_subtitle), false, bool.booleanValue(), "collapse_recommended_albums_section")));
    }
}
