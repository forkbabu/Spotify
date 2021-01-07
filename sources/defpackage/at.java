package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;

/* renamed from: at  reason: default package */
final class at extends bt<Status> {
    private final /* synthetic */ Credential n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    at(c cVar, Credential credential) {
        super(cVar);
        this.n = credential;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ i f(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bt
    public final void q(Context context, jt jtVar) {
        jtVar.H2(new ct(this), new ft(this.n));
    }
}
