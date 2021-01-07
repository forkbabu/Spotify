package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

@DynamiteApi
public class FlagProviderImpl extends zr {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.yr
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) f.k(new a(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.yr
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) f.k(new b(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.intValue();
    }

    @Override // defpackage.yr
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) f.k(new c(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.longValue();
    }

    @Override // defpackage.yr
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) f.k(new d(this.b, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
                return str2;
            }
            new String("Flag value not available, returning default: ");
            return str2;
        }
    }

    @Override // defpackage.yr
    public void init(a aVar) {
        Context context = (Context) b.E3(aVar);
        if (!this.a) {
            try {
                this.b = e.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
            }
        }
    }
}
