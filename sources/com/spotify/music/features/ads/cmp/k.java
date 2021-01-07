package com.spotify.music.features.ads.cmp;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import com.spotify.rxjava2.p;
import io.reactivex.y;

public class k implements d {
    protected static final SpSharedPreferences.b<Object, String> o = SpSharedPreferences.b.e("one_trust_partner_id");
    private final p a = new p();
    private final PartnerUserIdEndpoint b;
    private final i c;
    private final y f;
    private final SpSharedPreferences<Object> n;

    public k(i iVar, PartnerUserIdEndpoint partnerUserIdEndpoint, SpSharedPreferences<Object> spSharedPreferences, y yVar) {
        this.c = iVar;
        this.b = partnerUserIdEndpoint;
        this.f = yVar;
        this.n = spSharedPreferences;
    }

    public static void a(k kVar, String str) {
        SpSharedPreferences.a<Object> b2 = kVar.n.b();
        b2.f(o, str);
        b2.i();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.c.a()) {
            this.a.b(this.b.a(PartnerUserIdEndpoint.Vendor.ONETRUST).H(this.f).subscribe(new e(this), d.a));
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "OneTrustLogin";
    }
}
