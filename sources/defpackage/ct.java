package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* renamed from: ct  reason: default package */
final class ct extends us {
    private e<Status> a;

    ct(e<Status> eVar) {
        this.a = eVar;
    }

    @Override // defpackage.ht
    public final void O1(Status status) {
        this.a.a(status);
    }
}
