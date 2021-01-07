package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.k;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class l {
    private Long a;
    private Long b;
    private int c;
    private Long d;
    private n e;
    private UUID f;

    public l(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        this.a = l;
        this.b = l2;
        this.f = randomUUID;
    }

    public static void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(k.d()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(k.d()).edit();
        edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit2.apply();
    }

    public static l h() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k.d());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        l lVar = new l(Long.valueOf(j), Long.valueOf(j2));
        lVar.c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        lVar.e = n.a();
        lVar.d = Long.valueOf(System.currentTimeMillis());
        lVar.f = UUID.fromString(string);
        return lVar;
    }

    public long b() {
        Long l = this.d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public int c() {
        return this.c;
    }

    public UUID d() {
        return this.f;
    }

    public Long e() {
        return this.b;
    }

    public long f() {
        Long l;
        if (this.a == null || (l = this.b) == null) {
            return 0;
        }
        return l.longValue() - this.a.longValue();
    }

    public n g() {
        return this.e;
    }

    public void i() {
        this.c++;
    }

    public void j(Long l) {
        this.b = l;
    }

    public void k() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(k.d()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
        edit.apply();
        n nVar = this.e;
        if (nVar != null) {
            nVar.b();
        }
    }
}
