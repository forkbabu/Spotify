package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.cast.internal.b;

public final class p5 {
    private static final b f = new b("ApplicationAnalyticsSession");
    public static long g = System.currentTimeMillis();
    public String a;
    public String b;
    public long c = g;
    public int d = 1;
    public String e;

    private p5() {
    }

    public static p5 a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        p5 p5Var = new p5();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        p5Var.a = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        p5Var.b = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        p5Var.c = sharedPreferences.getLong("analytics_session_id", 0);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        p5Var.d = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        p5Var.e = sharedPreferences.getString("receiver_session_id", "");
        return p5Var;
    }

    public static p5 c() {
        p5 p5Var = new p5();
        g++;
        return p5Var;
    }

    public final void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            f.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", this.a);
            edit.putString("receiver_metrics_id", this.b);
            edit.putLong("analytics_session_id", this.c);
            edit.putInt("event_sequence_number", this.d);
            edit.putString("receiver_session_id", this.e);
            edit.apply();
        }
    }
}
