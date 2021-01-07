package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.z1;

final class u4 implements Runnable {
    private final /* synthetic */ z1 a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ v4 c;

    u4(v4 v4Var, z1 z1Var, ServiceConnection serviceConnection) {
        this.c = v4Var;
        this.a = z1Var;
        this.b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4 v4Var = this.c;
        s4 s4Var = v4Var.b;
        String str = v4Var.a;
        z1 z1Var = this.a;
        ServiceConnection serviceConnection = this.b;
        s4Var.a.k().b();
        Bundle bundle = null;
        if (z1Var == null) {
            s4Var.a.l().H().a("Attempting to use Install Referrer Service while it is not initialized");
        } else {
            try {
                Bundle m = z1Var.m(je.E("package_name", str));
                if (m == null) {
                    s4Var.a.l().E().a("Install Referrer Service returned a null response");
                } else {
                    bundle = m;
                }
            } catch (Exception e) {
                s4Var.a.l().E().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            }
        }
        s4Var.a.k().b();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                s4Var.a.l().H().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    s4Var.a.l().E().a("No referrer defined in Install Referrer response");
                } else {
                    s4Var.a.l().M().b("InstallReferrer API result", string);
                    Bundle A = s4Var.a.F().A(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (A == null) {
                        s4Var.a.l().E().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = A.getString(Constants.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                s4Var.a.l().E().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                A.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == s4Var.a.w().k.a()) {
                            s4Var.a.l().M().a("Install Referrer campaign has already been logged");
                        } else if (!i8.b() || !s4Var.a.b().r(t.v0) || s4Var.a.n()) {
                            s4Var.a.w().k.b(j);
                            s4Var.a.l().M().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            A.putString("_cis", "referrer API");
                            s4Var.a.E().W("auto", "_cmp", A);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            sr.b().c(s4Var.a.i(), serviceConnection);
        }
    }
}
