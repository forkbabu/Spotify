package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.internal.v;
import com.google.android.gms.internal.cast.g;
import com.google.android.gms.internal.cast.h;
import com.google.android.gms.internal.cast.k7;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.w3;
import com.google.android.gms.internal.cast.z1;
import com.google.android.gms.internal.cast.zzkj;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class a {
    private static final b k = new b("CastContext");
    private static a l;
    private static final Object m = new Object();
    private final Context a;
    private final z b;
    private final i c;
    private final y d;
    private final b e;
    private o f;
    private g g;
    private final List<k> h;
    private p0 i;
    private SharedPreferences j;

    private a(Context context, b bVar, List<k> list, o oVar) {
        f0 f0Var;
        k0 k0Var;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.e = bVar;
        this.f = oVar;
        this.h = list;
        i iVar = null;
        if (!TextUtils.isEmpty(bVar.o2())) {
            this.g = new g(applicationContext, bVar, this.f);
        } else {
            this.g = null;
        }
        HashMap hashMap = new HashMap();
        g gVar = this.g;
        if (gVar != null) {
            hashMap.put(gVar.b(), this.g.e());
        }
        if (list != null) {
            for (k kVar : list) {
                com.google.android.exoplayer2.util.g.k(kVar, "Additional SessionProvider must not be null.");
                String b2 = kVar.b();
                com.google.android.exoplayer2.util.g.h(b2, "Category for SessionProvider must not be null or empty string.");
                com.google.android.exoplayer2.util.g.d(!hashMap.containsKey(b2), String.format("SessionProvider for category %s already added", b2));
                hashMap.put(b2, kVar.e());
            }
        }
        z b3 = h.b(this.a, bVar, oVar, hashMap);
        this.b = b3;
        try {
            f0Var = b3.g0();
        } catch (RemoteException e2) {
            k.b(e2, "Unable to call %s on %s.", "getDiscoveryManagerImpl", z.class.getSimpleName());
            f0Var = null;
        }
        this.d = f0Var == null ? null : new y(f0Var);
        try {
            k0Var = this.b.p();
        } catch (RemoteException e3) {
            k.b(e3, "Unable to call %s on %s.", "getSessionManagerImpl", z.class.getSimpleName());
            k0Var = null;
        }
        iVar = k0Var != null ? new i(k0Var, this.a) : iVar;
        this.c = iVar;
        if (iVar != null) {
            new v(this.a);
            new b("PrecacheManager");
        }
        new v(this.a).u(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).h(new l(this));
    }

    public static a d() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return l;
    }

    public static a e(Context context) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (l == null) {
            synchronized (m) {
                if (l == null) {
                    e h2 = h(context.getApplicationContext());
                    try {
                        l = new a(context, h2.getCastOptions(context.getApplicationContext()), h2.getAdditionalSessionProviders(context.getApplicationContext()), new o(n6.f(context)));
                    } catch (zzad e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return l;
    }

    public static a f(Context context) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        try {
            return e(context);
        } catch (RuntimeException e2) {
            k.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e2);
            return null;
        }
    }

    private static e h(Context context) {
        try {
            Bundle bundle = xr.a(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                k.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    public void a(d dVar) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        this.c.a(dVar);
    }

    public b b() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return this.e;
    }

    public i c() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final void g(Bundle bundle) {
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && this.c != null;
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (z || z2) {
            String packageName = this.a.getPackageName();
            this.j = this.a.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", this.a.getPackageName(), "client_cast_analytics_data"), 0);
            yg.c(this.a);
            this.i = p0.a(this.j, yg.a().d(com.google.android.datatransport.cct.a.g).a("CAST_SENDER_SDK", w3.class, s.a), bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"));
            if (z) {
                new v(this.a).v(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}).h(new t(this));
            }
            if (z2) {
                k7.a(this.j, this.i, packageName);
                k7.b(zzkj.CAST_CONTEXT);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Bundle bundle) {
        new z1(this.j, this.i, bundle, this.a.getPackageName()).c(this.c);
    }

    public final boolean j() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        try {
            return this.b.o();
        } catch (RemoteException e2) {
            k.b(e2, "Unable to call %s on %s.", "hasActivityInRecents", z.class.getSimpleName());
            return false;
        }
    }

    public final y k() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return this.d;
    }
}
