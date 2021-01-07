package defpackage;

import android.app.Activity;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.a;
import com.google.android.gms.auth.api.identity.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.g;

/* renamed from: ls  reason: default package */
public final class ls extends b<c> implements a {
    private static final a.g<fs> l;
    private static final a.AbstractC0094a<fs, c> m;
    private static final com.google.android.gms.common.api.a<c> n;
    private final String k = os.a();

    static {
        a.g<fs> gVar = new a.g<>();
        l = gVar;
        ms msVar = new ms();
        m = msVar;
        n = new com.google.android.gms.common.api.a<>("Auth.Api.Identity.CredentialSaving.API", msVar, gVar);
    }

    public ls(Activity activity, c cVar) {
        super(activity, n, cVar, b.a.c);
    }

    @Override // com.google.android.gms.auth.api.identity.a
    public final g<com.google.android.gms.auth.api.identity.b> a(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        SaveAccountLinkingTokenRequest.a I1 = SaveAccountLinkingTokenRequest.I1(saveAccountLinkingTokenRequest);
        I1.f(this.k);
        SaveAccountLinkingTokenRequest a = I1.a();
        s.a a2 = s.a();
        a2.d(ps.g);
        a2.b(new ks(this, a));
        a2.c(false);
        a2.e(1535);
        return g(a2.a());
    }
}
