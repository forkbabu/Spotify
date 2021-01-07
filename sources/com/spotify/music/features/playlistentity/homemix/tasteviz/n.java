package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.graphics.Color;
import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.h;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class n {
    private static final d.b l;
    public static final /* synthetic */ int m = 0;
    private final vb6 a;
    private final i b;
    private final String c;
    private final boolean d;
    private final HomeMixFormatListAttributesHelper e;
    private final io.reactivex.disposables.a f = new io.reactivex.disposables.a();
    private final EnumMap<HomeMixTuning.Style, String> g;
    private final q h;
    private final me6 i;
    private final ke6 j;
    private HomeMix k;

    class a extends m {
        final /* synthetic */ d a;
        final /* synthetic */ k b;

        a(d dVar, k kVar) {
            this.a = dVar;
            this.b = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b1(Bundle bundle) {
            n.this.j.b();
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.b.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            n.this.f.b(this.a.a(n.this.c, n.l).o0(io.reactivex.android.schedulers.a.b()).subscribe(new a(this)));
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            n.this.f.f();
        }
    }

    static {
        HeaderPolicy.a builder = HeaderPolicy.builder();
        builder.a(ImmutableMap.of("formatListAttributes", Boolean.TRUE));
        builder.d(ImmutableMap.of());
        builder.e(ImmutableMap.of());
        HeaderPolicy b2 = builder.b();
        ListPolicy.a builder2 = ListPolicy.builder();
        builder2.a(ImmutableMap.of());
        builder2.b(ImmutableMap.of());
        builder2.c(ImmutableMap.of());
        builder2.g(ImmutableMap.of());
        builder2.d(ImmutableMap.of());
        ListPolicy e2 = builder2.e();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.c(e2);
        builder3.b(b2);
        DecorationPolicy a2 = builder3.a();
        Policy.a builder4 = Policy.builder();
        builder4.b(a2);
        Policy a3 = builder4.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        b3.i(new qxd(0, 0));
        l = b3.b();
    }

    public n(d dVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, k kVar, EnumMap<HomeMixTuning.Style, String> enumMap, vb6 vb6, i iVar, String str, me6 me6, ke6 ke6, Boolean bool, q qVar) {
        this.a = vb6;
        this.b = iVar;
        this.c = str;
        this.d = bool.booleanValue();
        this.e = homeMixFormatListAttributesHelper;
        this.g = enumMap;
        this.h = qVar;
        this.i = me6;
        this.j = ke6;
        kVar.y0(new a(dVar, kVar));
    }

    static void e(n nVar, j jVar) {
        int i2;
        List<h> f2 = nVar.e.f(jVar);
        HomeMix c2 = nVar.e.c(jVar);
        nVar.k = c2;
        Map<String, HomeMixUser> homeMixUsersMap = c2 != null ? c2.homeMixUsersMap() : Collections.emptyMap();
        HomeMix homeMix = nVar.k;
        HomeMixPlanType planType = homeMix != null ? homeMix.planType() : HomeMixPlanType.OTHER;
        HomeMix homeMix2 = nVar.k;
        HomeMixTuning.Style style = homeMix2 != null ? homeMix2.style() : HomeMixTuning.Style.DEFAULT;
        HomeMix homeMix3 = nVar.k;
        int i3 = -1;
        if (homeMix3 != null) {
            try {
                i3 = Color.parseColor(homeMix3.primaryColor());
            } catch (IllegalArgumentException unused) {
            }
            i2 = i3;
        } else {
            i2 = -1;
        }
        q qVar = nVar.h;
        planType.getClass();
        qVar.T(planType, nVar.g.get(style), f2, homeMixUsersMap, i2);
    }

    public boolean f() {
        return this.d;
    }

    public void g() {
        if (this.d) {
            j();
        }
        this.h.dismiss();
    }

    public void h(boolean z) {
        this.i.getClass();
        this.h.q0(this.k.planType());
    }

    public void i() {
        this.i.d();
        if (this.d) {
            j();
        }
        this.h.dismiss();
    }

    public void j() {
        this.f.b(new io.reactivex.internal.operators.completable.i(this.a.b().A(b.a)).d(this.b.d(this.c)).A(io.reactivex.android.schedulers.a.b()).subscribe(d.a, c.a));
    }
}
