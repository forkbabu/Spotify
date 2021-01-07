package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final m1<b<?>, ConnectionResult> zaa;

    public AvailabilityException(@RecentlyNonNull m1<b<?>, ConnectionResult> m1Var) {
        this.zaa = m1Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b<?> bVar : this.zaa.keySet()) {
            ConnectionResult connectionResult = this.zaa.get(bVar);
            g.l(connectionResult);
            ConnectionResult connectionResult2 = connectionResult;
            if (connectionResult2.q2()) {
                z = false;
            }
            String b = bVar.b();
            String valueOf = String.valueOf(connectionResult2);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(b).length() + 2);
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
