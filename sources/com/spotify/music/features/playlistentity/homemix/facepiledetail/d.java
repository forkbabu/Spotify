package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.g;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import java.util.HashMap;
import java.util.List;

public class d {
    private static final d.b f;
    private final HomeMixFormatListAttributesHelper a;
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    private final String c;
    private final l d;
    private final ke6 e;

    class a extends m {
        final /* synthetic */ com.spotify.playlist.endpoints.d a;
        final /* synthetic */ String b;
        final /* synthetic */ k c;

        a(com.spotify.playlist.endpoints.d dVar, String str, k kVar) {
            this.a = dVar;
            this.b = str;
            this.c = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b1(Bundle bundle) {
            d.this.e.a();
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.c.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            d.this.b.b(this.a.a(this.b, d.f).E().o0(io.reactivex.android.schedulers.a.b()).subscribe(new a(this)));
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            d.this.b.f();
        }
    }

    static {
        HeaderPolicy.a builder = HeaderPolicy.builder();
        Boolean bool = Boolean.TRUE;
        builder.a(ImmutableMap.of("formatListAttributes", bool));
        builder.d(ImmutableMap.of());
        builder.e(ImmutableMap.of());
        HeaderPolicy b2 = builder.b();
        ListPolicy.a builder2 = ListPolicy.builder();
        builder2.d(ImmutableMap.of("link", bool, "name", bool, "description", bool, "covers", bool, "formatListAttributes", bool));
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("covers", bool);
        builder2.b(builder3.build());
        ListPolicy e2 = builder2.e();
        DecorationPolicy.a builder4 = DecorationPolicy.builder();
        builder4.b(b2);
        builder4.c(e2);
        DecorationPolicy a2 = builder4.a();
        Policy.a builder5 = Policy.builder();
        builder5.b(a2);
        Policy a3 = builder5.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        f = b3.b();
    }

    public d(com.spotify.playlist.endpoints.d dVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, k kVar, String str, String str2, l lVar, ke6 ke6) {
        this.c = str2;
        this.a = homeMixFormatListAttributesHelper;
        this.d = lVar;
        this.e = ke6;
        kVar.y0(new a(dVar, str, kVar));
    }

    static void d(d dVar, j jVar, List list) {
        HomeMix c2 = dVar.a.c(jVar);
        g gVar = (g) ((HashMap) dVar.a.e(list)).get(dVar.c);
        if (c2 != null && gVar != null) {
            dVar.d.q(gVar.c());
            dVar.d.c0(c2.homeMixUsersMap(), gVar.a());
        }
    }

    public void e() {
        this.d.dismiss();
    }
}
