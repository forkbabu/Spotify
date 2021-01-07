package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.coremedia.iso.boxes.UserBox;
import com.google.android.play.core.missingsplits.b;
import com.google.common.collect.ImmutableMap;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.messages.ViewLoadSequence;
import com.spotify.mobile.android.service.feature.q;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.v;
import com.spotify.mobile.android.util.x;
import com.spotify.music.internal.crashes.report.CrashReport$Architecture;
import com.spotify.music.internal.crashes.report.CrashReport$Lifecycle;
import java.util.Locale;
import java.util.UUID;

/* renamed from: zw9  reason: default package */
public class zw9 {
    private final v a;
    private final t b;
    private final String c;
    private final Context d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n = "unknown";
    private CrashReport$Lifecycle o = CrashReport$Lifecycle.startup;
    private final SpSharedPreferences<Object> p;
    private final q q;

    public zw9(Context context, r rVar, v vVar, t tVar, String str, SpSharedPreferences<Object> spSharedPreferences, q qVar) {
        this.d = context.getApplicationContext();
        this.a = vVar;
        this.b = tVar;
        this.c = str;
        this.p = spSharedPreferences;
        rVar.a(new ew9(this));
        this.q = qVar;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0026: APUT  
      (r2v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.String : 0x0021: INVOKE  (r3v2 java.lang.String) = (r3v1 java.lang.StringBuilder) type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String)
     */
    public vw9 a() {
        String str;
        CrashReport$Architecture crashReport$Architecture;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        StringBuilder V0 = je.V0("Android");
        V0.append(x.g(this.d) ? "-tablet" : "");
        objArr[0] = V0.toString();
        String str2 = Build.VERSION.RELEASE;
        objArr[1] = str2;
        int i2 = Build.VERSION.SDK_INT;
        objArr[2] = Integer.valueOf(i2);
        String str3 = Build.MANUFACTURER;
        objArr[3] = str3;
        String str4 = Build.MODEL;
        objArr[4] = str4;
        builder.mo51put("raw_platform", String.format(locale, "%s OS %s API %d (%s, %s)", objArr));
        builder.mo51put("product", "com.spotify.music");
        builder.mo51put("version", this.c);
        builder.mo51put("revision", Integer.toString(this.b.h()));
        builder.mo51put("uptime", Long.toString(SystemClock.elapsedRealtime() - this.e));
        builder.mo51put("device_id", this.a.b());
        int identifier = this.d.getResources().getIdentifier("com.crashlytics.android.build_id", "string", this.d.getPackageName());
        if (identifier == 0) {
            str = UUID.randomUUID().toString().toUpperCase(locale);
        } else {
            str = this.d.getResources().getString(identifier);
        }
        builder.mo51put(UserBox.TYPE, str);
        builder.mo51put("hardware_model", str4);
        builder.mo51put("hardware_vendor", str3);
        builder.mo51put("os", str2);
        String str5 = Build.CPU_ABI;
        if (i2 >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                str5 = strArr[0];
            }
        }
        if ("x86".equals(str5)) {
            crashReport$Architecture = CrashReport$Architecture.i386;
        } else if ("x86_64".equals(str5)) {
            crashReport$Architecture = CrashReport$Architecture.x64;
        } else if ("armeabi-v7a".equals(str5)) {
            crashReport$Architecture = CrashReport$Architecture.armv7;
        } else if ("arm64-v8a".equals(str5)) {
            crashReport$Architecture = CrashReport$Architecture.arm64;
        } else {
            crashReport$Architecture = CrashReport$Architecture.unknown;
        }
        builder.mo51put("architecture", crashReport$Architecture.name());
        builder.mo51put("client_build_type", "");
        builder.mo51put("signature", this.b.g());
        builder.mo51put("free_memory", Long.toString(Runtime.getRuntime().freeMemory()));
        builder.mo51put("lifecycle", this.o.name());
        builder.mo51put("missing_splits", String.valueOf(b.a(this.d).b()));
        builder.mo51put("local_playback", String.valueOf(this.f));
        builder.mo51put("remote_playback", String.valueOf(this.g));
        builder.mo51put("foreground", String.valueOf(this.h));
        builder.mo51put("spotify_service_started", String.valueOf(this.i));
        builder.mo51put("spotify_service_bound", String.valueOf(this.j));
        builder.mo51put("car_detected", String.valueOf(this.k));
        builder.mo51put("headset_connected", String.valueOf(this.l));
        builder.mo51put("bluetooth_connected", String.valueOf(this.m));
        builder.mo51put("flash_enabled", String.valueOf(this.q.a()));
        builder.mo51put("core_state", this.n);
        String m2 = this.p.m(fx9.e, null);
        if (m2 != null) {
            builder.mo51put("username", m2);
        }
        return new vw9(builder.build());
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public long h() {
        return SystemClock.elapsedRealtime() - this.e;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.l;
    }

    public void l(ViewLoadSequence viewLoadSequence) {
        this.o = CrashReport$Lifecycle.operational;
    }

    public void m() {
        this.o = CrashReport$Lifecycle.authentication;
    }

    public void n(boolean z) {
        this.m = z;
    }

    public void o(boolean z) {
        this.k = z;
    }

    public void p(String str) {
        this.n = str;
    }

    public void q(boolean z) {
        this.l = z;
    }

    public void r(boolean z) {
        this.h = z;
    }

    public void s(boolean z) {
        this.f = z;
    }

    public void t(boolean z) {
        this.g = z;
    }

    public void u() {
        this.o = CrashReport$Lifecycle.shutdown;
    }

    public void v(boolean z) {
        this.j = z;
    }

    public void w(boolean z) {
        this.i = z;
    }

    public void x() {
        this.e = SystemClock.elapsedRealtime();
    }
}
