package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.measurement.AppMeasurementReceiver;

public final class x4 {
    private final w4 a;

    public x4(w4 w4Var) {
        this.a = w4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void a(Context context, Intent intent) {
        a4 l = f5.a(context, null, null).l();
        if (intent == null) {
            l.H().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        l.M().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            l.M().a("Starting wakeful intent.");
            ((AppMeasurementReceiver) this.a).getClass();
            b6.b(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            l.H().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
