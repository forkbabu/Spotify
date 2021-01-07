package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;

/* access modifiers changed from: package-private */
/* renamed from: zs  reason: default package */
public final class zs extends bt<Status> {
    zs(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ i f(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bt
    public final void q(Context context, jt jtVar) {
        jtVar.E0(new ct(this));
    }
}
