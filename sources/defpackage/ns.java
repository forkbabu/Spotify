package defpackage;

import com.google.android.gms.auth.api.identity.b;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.h;

/* renamed from: ns  reason: default package */
final class ns extends is {
    private final /* synthetic */ h a;

    ns(h hVar) {
        this.a = hVar;
    }

    public final void D3(Status status, b bVar) {
        if (status.r2()) {
            this.a.c(bVar);
        } else {
            this.a.b(f.c(status));
        }
    }
}
