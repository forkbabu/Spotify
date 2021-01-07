package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;

/* renamed from: bw  reason: default package */
public final class bw extends c {
    private final int d;

    public bw(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        String str = b("event_type") == 1 ? "changed" : b("event_type") == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(new dw(this.a, this.b, this.d));
        StringBuilder U0 = je.U0(valueOf.length() + str.length() + 32, "DataEventRef{ type=", str, ", dataitem=", valueOf);
        U0.append(" }");
        return U0.toString();
    }
}
