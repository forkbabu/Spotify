package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class q0 {
    final SharedPreferences a;
    final Context b;
    private final Map<String, Long> c = new m1();

    /* access modifiers changed from: package-private */
    public static class a {
        private static final long d = TimeUnit.DAYS.toMillis(7);
        public static final /* synthetic */ int e = 0;
        final String a;
        final String b;
        final long c;

        private a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String.valueOf(e2).length();
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            return System.currentTimeMillis() > this.c + d || !str.equals(this.b);
        }
    }

    public q0(Context context) {
        File file;
        boolean isEmpty;
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        int i = androidx.core.content.a.b;
        if (Build.VERSION.SDK_INT >= 21) {
            file = context.getNoBackupFilesDir();
        } else {
            File file2 = new File(context.getApplicationInfo().dataDir, "no_backup");
            synchronized (androidx.core.content.a.class) {
                if (!file2.exists() && !file2.mkdirs()) {
                    if (!file2.exists()) {
                        file2.getPath();
                        file2 = null;
                    }
                }
            }
            file = file2;
        }
        File file3 = new File(file, "com.google.android.gms.appid-no-backup");
        if (!file3.exists()) {
            try {
                if (file3.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        c();
                        FirebaseInstanceId.k().w();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        new String("Error creating file in no backup dir: ");
                    }
                }
            }
        }
    }

    static String a(String str, String str2) {
        return je.j0(str2.length() + je.N0(str, 3), str, "|S|", str2);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder U0 = je.U0(je.N0(str3, je.N0(str2, je.N0(str, 4))), str, "|T|", str2, "|");
        U0.append(str3);
        return U0.toString();
    }

    private long g(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.a.contains(a(str, "cre"))) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        String string = this.a.getString(a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public synchronized void c() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2, String str3) {
        return a.b(this.a.getString(b(str, str2, str3), null));
    }

    public synchronized void e(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long currentTimeMillis = System.currentTimeMillis();
        int i = a.e;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", currentTimeMillis);
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            String.valueOf(e).length();
            str6 = null;
        }
        if (str6 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), str6);
            edit.commit();
        }
    }

    public synchronized long f(String str) {
        long g;
        g = g(str);
        this.c.put(str, Long.valueOf(g));
        return g;
    }
}
