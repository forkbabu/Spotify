package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior;
import com.spotify.music.features.ads.model.Ad;
import java.util.concurrent.Executor;

/* renamed from: wy  reason: default package */
public class wy {
    private final com.google.firebase.crashlytics.internal.network.b a = new com.google.firebase.crashlytics.internal.network.b();
    private final com.google.firebase.c b;
    private final Context c;
    private PackageManager d;
    private String e;
    private PackageInfo f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private n0 l;
    private i0 m;

    /* access modifiers changed from: package-private */
    /* renamed from: wy$a */
    public class a implements f<q00, Void> {
        final /* synthetic */ String a;
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.c b;
        final /* synthetic */ Executor c;

        a(String str, com.google.firebase.crashlytics.internal.settings.c cVar, Executor executor) {
            this.a = str;
            this.b = cVar;
            this.c = executor;
        }

        /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.tasks.f
        public g<Void> a(q00 q00) {
            try {
                wy.a(wy.this, q00, this.a, this.b, this.c, true);
                return null;
            } catch (Exception e) {
                ty.a.e("Error performing auto configuration.", e);
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wy$b */
    public class b implements f<Void, q00> {
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.c a;

        b(wy wyVar, com.google.firebase.crashlytics.internal.settings.c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.tasks.f
        public g<q00> a(Void r1) {
            return this.a.j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wy$c */
    public class c implements com.google.android.gms.tasks.a<Void, Object> {
        c(wy wyVar) {
        }

        @Override // com.google.android.gms.tasks.a
        public Object a(g<Void> gVar) {
            if (gVar.r()) {
                return null;
            }
            ty.a.e("Error fetching settings.", gVar.m());
            return null;
        }
    }

    public wy(com.google.firebase.c cVar, Context context, n0 n0Var, i0 i0Var) {
        this.b = cVar;
        this.c = context;
        this.l = n0Var;
        this.m = i0Var;
    }

    static void a(wy wyVar, q00 q00, String str, com.google.firebase.crashlytics.internal.settings.c cVar, Executor executor, boolean z) {
        wyVar.getClass();
        ty tyVar = ty.a;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.SKIP_CACHE_LOOKUP;
        if ("new".equals(q00.a)) {
            if (new x00(wyVar.d(), q00.b, wyVar.a, "17.2.1").e(wyVar.b(q00.e, str), z)) {
                cVar.m(settingsCacheBehavior, executor);
            } else {
                tyVar.e("Failed to create app with Crashlytics service.", null);
            }
        } else if ("configured".equals(q00.a)) {
            cVar.m(settingsCacheBehavior, executor);
        } else if (q00.f) {
            tyVar.b("Server says an update is required - forcing a full App update.");
            new a10(wyVar.d(), q00.b, wyVar.a, "17.2.1").e(wyVar.b(q00.e, str), z);
        }
    }

    private p00 b(String str, String str2) {
        return new p00(str, str2, this.l.b(), this.h, this.g, CommonUtils.f(CommonUtils.l(this.c), str2, this.h, this.g), this.j, DeliveryMechanism.d(this.i).g(), this.k, Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    }

    public void c(Executor executor, com.google.firebase.crashlytics.internal.settings.c cVar) {
        this.m.f().t(executor, new b(this, cVar)).t(executor, new a(this.b.j().c(), cVar, executor));
    }

    /* access modifiers changed from: package-private */
    public String d() {
        Context context = this.c;
        int n = CommonUtils.n(context, "com.crashlytics.ApiEndpoint", "string");
        return n > 0 ? context.getString(n) : "";
    }

    public boolean e() {
        try {
            this.i = this.l.d();
            this.d = this.c.getPackageManager();
            String packageName = this.c.getPackageName();
            this.e = packageName;
            PackageInfo packageInfo = this.d.getPackageInfo(packageName, 0);
            this.f = packageInfo;
            this.g = Integer.toString(packageInfo.versionCode);
            String str = this.f.versionName;
            if (str == null) {
                str = "0.0";
            }
            this.h = str;
            this.j = this.d.getApplicationLabel(this.c.getApplicationInfo()).toString();
            this.k = Integer.toString(this.c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            ty.a.e("Failed init", e2);
            return false;
        }
    }

    public com.google.firebase.crashlytics.internal.settings.c f(Context context, com.google.firebase.c cVar, Executor executor) {
        com.google.firebase.crashlytics.internal.settings.c i2 = com.google.firebase.crashlytics.internal.settings.c.i(context, cVar.j().c(), this.l, this.a, this.g, this.h, d(), this.m);
        i2.m(SettingsCacheBehavior.USE_CACHE, executor).k(executor, new c(this));
        return i2;
    }
}
