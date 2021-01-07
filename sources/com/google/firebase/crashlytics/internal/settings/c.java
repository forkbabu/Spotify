package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.common.w0;
import com.google.firebase.crashlytics.internal.network.b;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class c implements d {
    private final Context a;
    private final v00 b;
    private final e c;
    private final w0 d;
    private final a e;
    private final z00 f;
    private final i0 g;
    private final AtomicReference<t00> h;
    private final AtomicReference<h<q00>> i = new AtomicReference<>(new h());

    class a implements f<Void, Void> {
        a() {
        }

        /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.tasks.f
        public g<Void> a(Void r5) {
            JSONObject h = ((y00) c.this.f).h(c.this.b, true);
            if (h != null) {
                u00 a2 = c.this.c.a(h);
                c.this.e.b(a2.d, h);
                c.this.n(h, "Loaded settings: ");
                c cVar = c.this;
                c.f(cVar, cVar.b.f);
                c.this.h.set(a2);
                ((h) c.this.i.get()).e(a2.a);
                h hVar = new h();
                hVar.e(a2.a);
                c.this.i.set(hVar);
            }
            return j.e(null);
        }
    }

    c(Context context, v00 v00, w0 w0Var, e eVar, a aVar, z00 z00, i0 i0Var) {
        AtomicReference<t00> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.a = context;
        this.b = v00;
        this.d = w0Var;
        this.c = eVar;
        this.e = aVar;
        this.f = z00;
        this.g = i0Var;
        atomicReference.set(b.b(w0Var));
    }

    static boolean f(c cVar, String str) {
        SharedPreferences.Editor edit = CommonUtils.o(cVar.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public static c i(Context context, String str, n0 n0Var, b bVar, String str2, String str3, String str4, i0 i0Var) {
        String d2 = n0Var.d();
        w0 w0Var = new w0();
        return new c(context, new v00(str, n0Var.e(), n0Var.f(), n0Var.g(), n0Var, CommonUtils.f(CommonUtils.l(context), str, str3, str2), str3, str2, DeliveryMechanism.d(d2).g()), w0Var, new e(w0Var), new a(context), new y00(str4, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), i0Var);
    }

    private u00 k(SettingsCacheBehavior settingsCacheBehavior) {
        Exception e2;
        u00 u00 = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject a2 = this.e.a();
            if (a2 != null) {
                u00 a3 = this.c.a(a2);
                if (a3 != null) {
                    n(a2, "Loaded cached settings: ");
                    this.d.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (a3.d < currentTimeMillis) {
                            ty.f().b("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        ty.f().b("Returning cached settings.");
                        return a3;
                    } catch (Exception e3) {
                        e2 = e3;
                        u00 = a3;
                        ty.f().e("Failed to get cached settings", e2);
                        return u00;
                    }
                } else {
                    ty.f().e("Failed to parse cached settings data.", null);
                    return null;
                }
            } else {
                ty.f().b("No cached settings data found.");
                return null;
            }
        } catch (Exception e4) {
            e2 = e4;
            ty.f().e("Failed to get cached settings", e2);
            return u00;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n(JSONObject jSONObject, String str) {
        ty f2 = ty.f();
        StringBuilder V0 = je.V0(str);
        V0.append(jSONObject.toString());
        f2.b(V0.toString());
    }

    public g<q00> j() {
        return this.i.get().a();
    }

    public t00 l() {
        return this.h.get();
    }

    public g<Void> m(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        u00 k;
        if ((!CommonUtils.o(this.a).getString("existing_instance_identifier", "").equals(this.b.f)) || (k = k(settingsCacheBehavior)) == null) {
            u00 k2 = k(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (k2 != null) {
                this.h.set(k2);
                this.i.get().e(k2.a);
            }
            return this.g.f().t(executor, new a());
        }
        this.h.set(k);
        this.i.get().e(k.a);
        return j.e(null);
    }
}
