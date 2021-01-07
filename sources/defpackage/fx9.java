package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: fx9  reason: default package */
public class fx9 {
    static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.c("crashlytics_user_id");
    private static final SpSharedPreferences.b<Object, String> f = SpSharedPreferences.b.c("crashlytics_partner_id");
    private final SpSharedPreferences<Object> a;
    private final PartnerUserIdEndpoint b;
    private final y c;
    private b d = EmptyDisposable.INSTANCE;

    public fx9(SpSharedPreferences<Object> spSharedPreferences, PartnerUserIdEndpoint partnerUserIdEndpoint, y yVar) {
        spSharedPreferences.getClass();
        this.a = spSharedPreferences;
        partnerUserIdEndpoint.getClass();
        this.b = partnerUserIdEndpoint;
        yVar.getClass();
        this.c = yVar;
    }

    public void a(String str, qg0<String> qg0) {
        String m = this.a.m(e, null);
        String m2 = this.a.m(f, null);
        if (m2 == null || !rw.equal(str, m)) {
            if (!this.d.d()) {
                this.d.dispose();
            }
            this.d = this.b.a(PartnerUserIdEndpoint.Vendor.CRASHLYTICS).B(this.c).subscribe(new jw9(this, str, qg0), iw9.a);
            return;
        }
        Logger.b("Cached partner ID %s for Crashlytics fetched", m2);
        ((nw9) qg0).a.b(m2);
    }

    public /* synthetic */ void b(String str, qg0 qg0, String str2) {
        Logger.b("Partner-id %s for %s fetched", str2, str);
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(e, str);
        b2.f(f, str2);
        b2.i();
        qg0.accept(str2);
    }
}
