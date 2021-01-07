package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import retrofit2.v;

public class k {
    private static final d.b k;
    public static final /* synthetic */ int l = 0;
    private final i a;
    private final wb6 b;
    private final HomeMixFormatListAttributesHelper c;
    private final io.reactivex.disposables.a d = new io.reactivex.disposables.a();
    private final ye6<v<Void>> e;
    private final String f;
    private final u g;
    private final me6 h;
    private HomeMix i;
    private final Set<String> j = new HashSet();

    class a extends m {
        final /* synthetic */ d a;
        final /* synthetic */ String b;
        final /* synthetic */ com.spotify.mobile.android.util.ui.k c;

        a(d dVar, String str, com.spotify.mobile.android.util.ui.k kVar) {
            this.a = dVar;
            this.b = str;
            this.c = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.c.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            k.this.d.b(this.a.a(this.b, k.k).o0(io.reactivex.android.schedulers.a.b()).subscribe(new b(this)));
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            k.this.d.f();
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
        k = b3.b();
    }

    public k(d dVar, i iVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, wb6 wb6, String str, l lVar, com.spotify.mobile.android.util.ui.k kVar, u uVar, me6 me6) {
        this.a = iVar;
        this.c = homeMixFormatListAttributesHelper;
        this.b = wb6;
        this.f = str;
        this.e = new ye6<>(lVar, d.a);
        this.g = uVar;
        this.h = me6;
        kVar.y0(new a(dVar, str, kVar));
    }

    static void c(k kVar, j jVar) {
        HomeMix c2 = kVar.c.c(jVar);
        kVar.i = c2;
        if (c2 != null) {
            ArrayList arrayList = new ArrayList();
            for (HomeMixUser homeMixUser : kVar.i.users()) {
                if (homeMixUser.isEnabled()) {
                    arrayList.add(homeMixUser);
                }
                if (!homeMixUser.isPresent()) {
                    kVar.j.add(homeMixUser.getUsername());
                }
            }
            kVar.g.I(arrayList);
        }
    }

    public static s e(k kVar, HomeMixTuning homeMixTuning) {
        return kVar.b.a(kVar.f, homeMixTuning).f(kVar.e).s(new g(kVar, homeMixTuning)).P();
    }

    public boolean d(int i2) {
        return this.j.size() < i2 - 1;
    }

    public /* synthetic */ d0 f(HomeMixTuning homeMixTuning, xe6 xe6) {
        if (xe6.i()) {
            return this.a.d(this.f).h(z.z(xe6.k(homeMixTuning)));
        }
        return z.z(xe6.b(xe6.e()));
    }

    public void g() {
        this.g.j();
    }

    public void h() {
        io.reactivex.disposables.a aVar = this.d;
        s v = z.z(HomeMixTuning.create(this.i.style(), new ArrayList(this.j))).v(new c(this));
        u uVar = this.g;
        uVar.getClass();
        aVar.b(v.J(new a(uVar)).subscribe(f.a, e.a));
    }

    public void i(HomeMixUser homeMixUser, int i2, boolean z) {
        this.j.add(homeMixUser.getUsername());
        this.h.h();
    }

    public void j(HomeMixUser homeMixUser, int i2, boolean z) {
        this.j.remove(homeMixUser.getUsername());
        this.h.h();
    }
}
