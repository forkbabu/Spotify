package com.google.android.gms.internal.measurement;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class f2 extends b2<Boolean> {
    f2(k2 k2Var, String str, Boolean bool) {
        super(k2Var, str, bool, true, null);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.b2
    public final /* synthetic */ Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (k1.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (k1.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String e = e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(e).length() + 28);
        sb.append("Invalid boolean value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
