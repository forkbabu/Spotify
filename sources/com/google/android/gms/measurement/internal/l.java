package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.a;
import com.google.android.gms.common.util.d;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class l extends b6 {
    private long c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    l(f5 f5Var) {
        super(f5Var);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = je.j0(je.N0(lowerCase2, je.N0(lowerCase, 1)), lowerCase, "-", lowerCase2);
        return false;
    }

    public final boolean t(Context context) {
        if (this.e == null) {
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final long u() {
        n();
        return this.c;
    }

    public final String v() {
        n();
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final long w() {
        super.b();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        super.b();
        this.g = null;
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        super.b();
        ((d) super.d()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool3 = this.g;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        if (a.a(super.i(), "android.permission.GET_ACCOUNTS") != 0) {
            super.l().I().a("Permission error checking for dasher/unicorn accounts");
            this.h = currentTimeMillis;
            this.g = bool2;
            return false;
        }
        if (this.f == null) {
            this.f = AccountManager.get(super.i());
        }
        try {
            Account[] result = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = bool;
                    this.h = currentTimeMillis;
                    return true;
                }
                this.h = currentTimeMillis;
                this.g = bool2;
                return false;
            }
            this.g = bool;
            this.h = currentTimeMillis;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            super.l().F().b("Exception checking account types", e2);
        }
    }
}
