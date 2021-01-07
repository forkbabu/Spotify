package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: ys  reason: default package */
final class ys extends us {
    private final /* synthetic */ vs a;

    ys(vs vsVar) {
        this.a = vsVar;
    }

    @Override // defpackage.us, defpackage.ht
    public final void G0(Status status, Credential credential) {
        this.a.a(new ts(status, credential));
    }

    @Override // defpackage.ht
    public final void O1(Status status) {
        this.a.a(new ts(status, null));
    }
}
