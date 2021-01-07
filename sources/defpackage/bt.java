package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;

/* renamed from: bt  reason: default package */
abstract class bt<R extends i> extends d<R, dt> {
    bt(c cVar) {
        super(oq.e, cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.d
    public /* synthetic */ void o(dt dtVar) {
        dt dtVar2 = dtVar;
        q(dtVar2.v(), (jt) dtVar2.z());
    }

    /* access modifiers changed from: protected */
    public abstract void q(Context context, jt jtVar);
}
