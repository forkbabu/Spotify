package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.r;

/* renamed from: jr  reason: default package */
public final class jr extends nt implements kr {
    jr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.kr
    public final void n3(r rVar) {
        Parcel T = T();
        ot.b(T, rVar);
        K0(T);
    }
}
