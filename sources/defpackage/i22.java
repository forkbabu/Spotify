package defpackage;

import android.net.Uri;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.d4;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.connection.g;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.offlinetrials.limited.uicomponents.u;
import com.spotify.music.premiummini.a;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.share.sharedata.r;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.s;
import java.util.Collections;

/* renamed from: i22  reason: default package */
public class i22 implements f42 {
    public static final /* synthetic */ int O = 0;
    private final s<Boolean> A;
    private final a B;
    private final s<g> C;
    private final RxWebToken D;
    private final d E;
    private final d9c F;
    private final Optional<String> G;
    private final fm9 H = new fm9();
    private final jzc I;
    private final ij9.b J;
    private final u K;
    private final boolean L;
    private final v M;
    private final s0 N;
    private final u3 b;
    private final c c;
    private final ifd d;
    private final com.spotify.music.libs.viewuri.c e;
    private final s3 f;
    private final tka g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final Optional<String> l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final Optional<d4> v;
    private final Optional<d4> w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    public i22(u3 u3Var, c cVar, ifd ifd, com.spotify.music.libs.viewuri.c cVar2, tka tka, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Optional<String> optional, boolean z8, s3 s3Var, Optional<String> optional2, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Optional<d4> optional3, Optional<d4> optional4, boolean z15, boolean z16, boolean z17, s<Boolean> sVar, a aVar, RxWebToken rxWebToken, d dVar, d9c d9c, jzc jzc, ij9.b bVar, s<g> sVar2, u uVar, boolean z18, v vVar) {
        this.M = vVar;
        this.b = u3Var;
        cVar.getClass();
        this.c = cVar;
        ifd.getClass();
        this.d = ifd;
        cVar2.getClass();
        this.e = cVar2;
        s3Var.getClass();
        this.f = s3Var;
        tka.getClass();
        this.g = tka;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.n = z6;
        this.o = z7;
        optional.getClass();
        this.l = optional;
        this.m = z8;
        optional2.getClass();
        this.G = optional2;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = z14;
        this.v = optional3;
        this.w = optional4;
        this.x = z15;
        this.y = z16;
        this.D = rxWebToken;
        this.E = dVar;
        this.I = jzc;
        this.z = z17;
        this.A = sVar;
        this.B = aVar;
        this.F = d9c;
        this.J = bVar;
        this.C = sVar2;
        this.K = uVar;
        this.L = z18;
        this.N = new s0(cVar2.toString());
    }

    private void m(o oVar, boolean z2) {
        String uri = oVar.getUri();
        if (z2) {
            this.F.c(uri, null);
        } else {
            this.K.f(s12.a, new v12(this, uri));
        }
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<o> y3Var) {
        s<R> sVar;
        s<R> sVar2;
        MoreObjects.checkArgument(y3Var.m());
        if (y3Var.f() != null) {
            String e2 = y3Var.e();
            LinkType q2 = l0.z(e2).q();
            o f2 = y3Var.f();
            com.spotify.playlist.models.a album = f2.getAlbum();
            ImmutableList<b> artists = f2.getArtists();
            artists.getClass();
            b bVar = artists.get(0);
            LinkType linkType = LinkType.PLAYLIST_V2;
            boolean z2 = true;
            if (q2 == linkType || q2 == LinkType.PROFILE_PLAYLIST) {
                d dVar = this.E;
                ImmutableMap.Builder builder = ImmutableMap.builder();
                Boolean bool = Boolean.TRUE;
                builder.mo51put("ownedBySelf", bool);
                builder.mo51put("collaborative", bool);
                ImmutableMap build = builder.build();
                HeaderPolicy.a builder2 = HeaderPolicy.builder();
                builder2.a(build);
                builder2.e(ImmutableMap.of());
                builder2.d(ImmutableMap.of());
                HeaderPolicy b2 = builder2.b();
                ListPolicy.a builder3 = ListPolicy.builder();
                builder3.d(ImmutableMap.of());
                builder3.b(ImmutableMap.of());
                builder3.c(ImmutableMap.of());
                builder3.a(ImmutableMap.of());
                builder3.g(ImmutableMap.of());
                ListPolicy e3 = builder3.e();
                DecorationPolicy.a builder4 = DecorationPolicy.builder();
                builder4.b(b2);
                builder4.c(e3);
                DecorationPolicy a = builder4.a();
                Policy.a builder5 = Policy.builder();
                builder5.b(a);
                Policy a2 = builder5.a();
                d.b.a b3 = d.b.b();
                b3.c(false);
                b3.g(a2);
                b3.i(new qxd(0, 0));
                sVar = dVar.d(e2, b3.b()).A(y12.a).P();
            } else {
                sVar = s.i0(Optional.absent());
            }
            String uri = f2.getUri();
            if (!(q2 == linkType || q2 == LinkType.PROFILE_PLAYLIST)) {
                z2 = false;
            }
            if (z2) {
                sVar2 = this.E.b(e2, Collections.singletonList(uri)).A(w12.a).P();
            } else {
                sVar2 = s.i0(Optional.absent());
            }
            return s.k(sVar, sVar2, new io.reactivex.internal.operators.observable.v(this.M.b().h0(1)).W(new m12(this, f2.getUri()), false, Integer.MAX_VALUE), new io.reactivex.internal.operators.observable.v(this.M.b().h0(1)), this.A, new u12(this, y3Var, q2, f2, album, artists, bVar));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        c4.a(contextMenuViewModel, z2);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<o> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(y3Var.g(), "", Uri.EMPTY, SpotifyIconV2.TRACK, false));
        return contextMenuViewModel;
    }

    public /* synthetic */ void d(o oVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        m(oVar, true);
    }

    public /* synthetic */ void e(o oVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        m(oVar, false);
    }

    public void f(o oVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.B.a(oVar.getUri());
    }

    public void g(o oVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        this.B.c(oVar.getUri());
    }

    public /* synthetic */ void h(o oVar, String str, String str2, c cVar, b bVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar2) {
        r.a h2 = r.h(oVar.getUri());
        h2.c(str);
        this.I.c(pzc.c(str2, oVar.getName(), cVar.getString(C0707R.string.share_by_artist, new Object[]{bVar.f()}), h2.build()).build(), rzc.a, C0707R.string.integration_id_context_menu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011a, code lost:
        if ((r29.isPresent() && !((com.spotify.playlist.endpoints.d.c) r29.get()).a().isEmpty()) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013c, code lost:
        if ((r23 == com.spotify.mobile.android.util.LinkType.COLLECTION_TRACKS && !r24.isInCollection()) != false) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel i(com.spotify.mobile.android.ui.contextmenu.y3 r22, com.spotify.mobile.android.util.LinkType r23, com.spotify.playlist.models.o r24, com.spotify.playlist.models.a r25, java.util.List r26, com.spotify.playlist.models.b r27, com.google.common.base.Optional r28, com.google.common.base.Optional r29, android.net.Uri r30, com.spotify.android.flags.c r31, java.lang.Boolean r32) {
        /*
        // Method dump skipped, instructions count: 886
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.i(com.spotify.mobile.android.ui.contextmenu.y3, com.spotify.mobile.android.util.LinkType, com.spotify.playlist.models.o, com.spotify.playlist.models.a, java.util.List, com.spotify.playlist.models.b, com.google.common.base.Optional, com.google.common.base.Optional, android.net.Uri, com.spotify.android.flags.c, java.lang.Boolean):com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel");
    }

    public io.reactivex.v j(String str, com.spotify.android.flags.c cVar) {
        return this.C.T().A(i12.a).v(new n12(this, Uri.parse(((String) cVar.M0(y04.c)).replace("{uri}", str))));
    }

    public /* synthetic */ io.reactivex.v k(Uri uri, Boolean bool) {
        if (bool.booleanValue()) {
            return this.D.a(uri);
        }
        return s.i0(uri);
    }

    public void l(String str) {
        this.F.d(str, null);
    }
}
