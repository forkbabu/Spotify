package defpackage;

import com.google.android.exoplayer2.util.g;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.auth.api.credentials.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;

/* renamed from: ws  reason: default package */
public final class ws implements e {
    public final com.google.android.gms.common.api.e<Status> a(c cVar, Credential credential) {
        g.k(cVar, "client must not be null");
        g.k(credential, "credential must not be null");
        return cVar.b(new at(cVar, credential));
    }

    public final com.google.android.gms.common.api.e<Status> b(c cVar) {
        g.k(cVar, "client must not be null");
        return cVar.b(new zs(cVar));
    }

    public final com.google.android.gms.common.api.e<com.google.android.gms.auth.api.credentials.c> c(c cVar, a aVar) {
        g.k(cVar, "client must not be null");
        g.k(aVar, "request must not be null");
        return cVar.a(new vs(cVar, aVar));
    }

    public final com.google.android.gms.common.api.e<Status> d(c cVar, Credential credential) {
        g.k(cVar, "client must not be null");
        g.k(credential, "credential must not be null");
        return cVar.b(new xs(cVar, credential));
    }
}
