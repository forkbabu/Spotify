package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.a;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.m;
import com.facebook.p;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    private static volatile d f;
    private final e6 a;
    private final b b;
    private a c;
    private AtomicBoolean d = new AtomicBoolean(false);
    private Date e = new Date(0);

    /* access modifiers changed from: package-private */
    public class a implements m.c {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ Set b;
        final /* synthetic */ Set c;
        final /* synthetic */ Set d;

        a(d dVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.a = atomicBoolean;
            this.b = set;
            this.c = set2;
            this.d = set3;
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            JSONArray optJSONArray;
            JSONObject f = qVar.f();
            if (!(f == null || (optJSONArray = f.optJSONArray("data")) == null)) {
                this.a.set(true);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        if (!f0.C(optString) && !f0.C(optString2)) {
                            String lowerCase = optString2.toLowerCase(Locale.US);
                            if (lowerCase.equals("granted")) {
                                this.b.add(optString);
                            } else if (lowerCase.equals("declined")) {
                                this.c.add(optString);
                            } else if (lowerCase.equals("expired")) {
                                this.d.add(optString);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements m.c {
        final /* synthetic */ C0069d a;

        b(d dVar, C0069d dVar2) {
            this.a = dVar2;
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            JSONObject f = qVar.f();
            if (f != null) {
                this.a.a = f.optString("access_token");
                this.a.b = f.optInt("expires_at");
                this.a.c = Long.valueOf(f.optLong("data_access_expiration_time"));
                this.a.d = f.optString("graph_domain", null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements p.a {
        final /* synthetic */ a a;
        final /* synthetic */ a.b b;
        final /* synthetic */ AtomicBoolean c;
        final /* synthetic */ C0069d d;
        final /* synthetic */ Set e;
        final /* synthetic */ Set f;
        final /* synthetic */ Set g;

        c(a aVar, a.b bVar, AtomicBoolean atomicBoolean, C0069d dVar, Set set, Set set2, Set set3) {
            this.a = aVar;
            this.b = bVar;
            this.c = atomicBoolean;
            this.d = dVar;
            this.e = set;
            this.f = set2;
            this.g = set3;
        }

        @Override // com.facebook.p.a
        public void a(p pVar) {
            a aVar;
            Throwable th;
            a.b bVar;
            Set<String> set;
            Set<String> set2;
            Date date;
            Date date2;
            try {
                if (d.f().e() != null) {
                    if (d.f().e().o() == this.a.o()) {
                        if (!this.c.get()) {
                            C0069d dVar = this.d;
                            if (dVar.a == null && dVar.b == 0) {
                                a.b bVar2 = this.b;
                                if (bVar2 != null) {
                                    bVar2.a(new FacebookException("Failed to refresh access token"));
                                }
                                d.this.d.set(false);
                                a.b bVar3 = this.b;
                                return;
                            }
                        }
                        String str = this.d.a;
                        if (str == null) {
                            str = this.a.n();
                        }
                        String c2 = this.a.c();
                        String o = this.a.o();
                        Set<String> l = this.c.get() ? this.e : this.a.l();
                        if (this.c.get()) {
                            set = this.f;
                        } else {
                            set = this.a.g();
                        }
                        if (this.c.get()) {
                            set2 = this.g;
                        } else {
                            set2 = this.a.h();
                        }
                        AccessTokenSource m = this.a.m();
                        if (this.d.b != 0) {
                            date = new Date(((long) this.d.b) * 1000);
                        } else {
                            date = this.a.i();
                        }
                        Date date3 = new Date();
                        if (this.d.c != null) {
                            date2 = new Date(1000 * this.d.c.longValue());
                        } else {
                            date2 = this.a.f();
                        }
                        aVar = r15;
                        a aVar2 = new a(str, c2, o, l, set, set2, m, date, date3, date2, this.d.d);
                        try {
                            d.f().j(aVar);
                            d.this.d.set(false);
                            a.b bVar4 = this.b;
                            if (bVar4 != null) {
                                bVar4.b(aVar);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            d.this.d.set(false);
                            bVar = this.b;
                            bVar.b(aVar);
                            throw th;
                        }
                    }
                }
                a.b bVar5 = this.b;
                if (bVar5 != null) {
                    bVar5.a(new FacebookException("No current access token to refresh"));
                }
                d.this.d.set(false);
                a.b bVar6 = this.b;
            } catch (Throwable th3) {
                th = th3;
                aVar = null;
                d.this.d.set(false);
                bVar = this.b;
                if (!(bVar == null || aVar == null)) {
                    bVar.b(aVar);
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.d$d  reason: collision with other inner class name */
    public static class C0069d {
        public String a;
        public int b;
        public Long c;
        public String d;

        C0069d(c cVar) {
        }
    }

    d(e6 e6Var, b bVar) {
        h0.f(e6Var, "localBroadcastManager");
        h0.f(bVar, "accessTokenCache");
        this.a = e6Var;
        this.b = bVar;
    }

    static d f() {
        if (f == null) {
            synchronized (d.class) {
                if (f == null) {
                    f = new d(e6.b(k.d()), new b());
                }
            }
        }
        return f;
    }

    /* access modifiers changed from: private */
    public void h(a.b bVar) {
        a aVar = this.c;
        if (aVar == null) {
            if (bVar != null) {
                bVar.a(new FacebookException("No current access token to refresh"));
            }
        } else if (this.d.compareAndSet(false, true)) {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C0069d dVar = new C0069d(null);
            a aVar2 = new a(this, atomicBoolean, hashSet, hashSet2, hashSet3);
            Bundle bundle = new Bundle();
            HttpMethod httpMethod = HttpMethod.GET;
            b bVar2 = new b(this, dVar);
            Bundle E = je.E("grant_type", "fb_extend_sso_token");
            E.putString("client_id", aVar.c());
            p pVar = new p(new m(aVar, "me/permissions", bundle, httpMethod, aVar2), new m(aVar, "oauth/access_token", E, httpMethod, bVar2));
            pVar.d(new c(aVar, bVar, atomicBoolean, dVar, hashSet, hashSet2, hashSet3));
            pVar.e();
        } else if (bVar != null) {
            bVar.a(new FacebookException("Refresh already in progress"));
        }
    }

    private void i(a aVar, a aVar2) {
        Intent intent = new Intent(k.d(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.a.d(intent);
    }

    private void k(a aVar, boolean z) {
        a aVar2 = this.c;
        this.c = aVar;
        this.d.set(false);
        this.e = new Date(0);
        if (z) {
            if (aVar != null) {
                this.b.c(aVar);
            } else {
                this.b.a();
                f0.e(k.d());
            }
        }
        if (!f0.b(aVar2, aVar)) {
            i(aVar2, aVar);
            Context d2 = k.d();
            a e2 = a.e();
            AlarmManager alarmManager = (AlarmManager) d2.getSystemService("alarm");
            if (a.p() && e2.i() != null && alarmManager != null) {
                Intent intent = new Intent(d2, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, e2.i().getTime(), PendingIntent.getBroadcast(d2, 0, intent, 0));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a aVar = this.c;
        i(aVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        boolean z = false;
        if (this.c != null) {
            Long valueOf = Long.valueOf(new Date().getTime());
            if (this.c.m().d() && valueOf.longValue() - this.e.getTime() > 3600000 && valueOf.longValue() - this.c.k().getTime() > 86400000) {
                z = true;
            }
        }
        if (z) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                h(null);
            } else {
                new Handler(Looper.getMainLooper()).post(new c(this, null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        a b2 = this.b.b();
        if (b2 == null) {
            return false;
        }
        k(b2, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void j(a aVar) {
        k(aVar, true);
    }
}
