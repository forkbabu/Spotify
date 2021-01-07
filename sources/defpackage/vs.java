package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.auth.api.credentials.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

/* access modifiers changed from: package-private */
/* renamed from: vs  reason: default package */
public final class vs extends bt<c> {
    private final /* synthetic */ a n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    vs(com.google.android.gms.common.api.c cVar, a aVar) {
        super(cVar);
        this.n = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final i f(Status status) {
        return new ts(status, null);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bt
    public final void q(Context context, jt jtVar) {
        jtVar.X(new ys(this), this.n);
    }
}
