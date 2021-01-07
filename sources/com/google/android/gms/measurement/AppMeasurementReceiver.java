package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.w4;
import com.google.android.gms.measurement.internal.x4;

public final class AppMeasurementReceiver extends b6 implements w4 {
    private x4 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new x4(this);
        }
        this.c.a(context, intent);
    }
}
