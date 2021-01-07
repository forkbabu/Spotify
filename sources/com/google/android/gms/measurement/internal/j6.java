package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.internal.measurement.f;

public final class j6 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    f g;
    boolean h = true;
    Long i;

    public j6(Context context, f fVar, Long l) {
        Context applicationContext = context.getApplicationContext();
        g.l(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (fVar != null) {
            this.g = fVar;
            this.b = fVar.o;
            this.c = fVar.n;
            this.d = fVar.f;
            this.h = fVar.c;
            this.f = fVar.b;
            Bundle bundle = fVar.p;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
