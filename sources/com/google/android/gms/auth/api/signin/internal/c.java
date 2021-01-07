package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class c {
    private static final Lock c = new ReentrantLock();
    private static c d;
    private final Lock a = new ReentrantLock();
    private final SharedPreferences b;

    private c(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static c b(@RecentlyNonNull Context context) {
        if (context != null) {
            Lock lock = c;
            lock.lock();
            try {
                if (d == null) {
                    d = new c(context.getApplicationContext());
                }
                c cVar = d;
                lock.unlock();
                return cVar;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private final void g(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    private static String h(String str, String str2) {
        return je.j0(je.N0(str2, str.length() + 1), str, ":", str2);
    }

    private final String i(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    @RecentlyNullable
    public GoogleSignInAccount c() {
        String i;
        String i2 = i("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(i2) || (i = i(h("googleSignInAccount", i2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.p2(i);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public GoogleSignInOptions d() {
        String i;
        String i2 = i("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(i2) || (i = i(h("googleSignInOptions", i2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.Q1(i);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public String e() {
        return i("refreshToken");
    }

    public void f(@RecentlyNonNull GoogleSignInAccount googleSignInAccount, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        if (googleSignInAccount == null) {
            throw new NullPointerException("null reference");
        } else if (googleSignInOptions != null) {
            g("defaultGoogleSignInAccount", googleSignInAccount.q2());
            String q2 = googleSignInAccount.q2();
            g(h("googleSignInAccount", q2), googleSignInAccount.r2());
            g(h("googleSignInOptions", q2), googleSignInOptions.o2());
        } else {
            throw new NullPointerException("null reference");
        }
    }
}
