package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import io.reactivex.disposables.a;
import io.reactivex.y;

/* renamed from: n3a  reason: default package */
public class n3a implements d {
    private static final SpSharedPreferences.b<Object, String> q = SpSharedPreferences.b.c("branch_partner_id");
    private static final SpSharedPreferences.b<Object, Long> r = SpSharedPreferences.b.c("branch_partner_id_cache_time_key");
    public static final /* synthetic */ int s = 0;
    private final z70 a;
    private final PartnerUserIdEndpoint b;
    private final a c = new a();
    private final SpSharedPreferences<Object> f;
    private final cqe n;
    private final m3a o;
    private final y p;

    n3a(z70 z70, PartnerUserIdEndpoint partnerUserIdEndpoint, SpSharedPreferences<Object> spSharedPreferences, cqe cqe, m3a m3a, y yVar) {
        this.a = z70;
        this.b = partnerUserIdEndpoint;
        this.f = spSharedPreferences;
        this.n = cqe;
        this.o = m3a;
        this.p = yVar;
    }

    public static void b(n3a n3a, String str) {
        n3a.getClass();
        Logger.b("Branch partner-id %s fetched", str);
        n3a.a.a(str);
        SpSharedPreferences.a<Object> b2 = n3a.f.b();
        b2.f(q, str);
        b2.i();
        SpSharedPreferences.a<Object> b3 = n3a.f.b();
        b3.e(r, n3a.n.d());
        b3.i();
    }

    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            String m = this.f.m(q, null);
            long j = this.f.j(r, -1);
            long d = this.n.d();
            if (m == null || j == -1 || d - j >= 300000) {
                this.c.b(this.b.a(PartnerUserIdEndpoint.Vendor.BRANCH).subscribe(new f3a(this), e3a.a));
            } else {
                this.a.a(m);
            }
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.c.b(this.o.a().I0(this.p).N0(1).subscribe(new d3a(this), c3a.a));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "BranchLogin";
    }
}
