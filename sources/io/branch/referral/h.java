package io.branch.referral;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import io.branch.referral.Branch;
import io.branch.referral.ServerRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

class h {
    private static h i;
    private Object a = null;
    private final Handler b;
    private boolean c = true;
    private boolean d = false;
    private Class<?> e;
    private Class<?> f;
    private Class<?> g;
    private Class<?> h;

    class a implements Runnable {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.k(this.a, hVar.d);
        }
    }

    class b extends d {
        final /* synthetic */ Method b;
        final /* synthetic */ Method c;
        final /* synthetic */ Uri f;
        final /* synthetic */ Method n;
        final /* synthetic */ r o;
        final /* synthetic */ e p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Method method, Method method2, Uri uri, Method method3, r rVar, e eVar) {
            super();
            this.b = method;
            this.c = method2;
            this.f = uri;
            this.n = method3;
            this.o = rVar;
            this.p = eVar;
        }

        @Override // io.branch.referral.h.d
        public void a(ComponentName componentName, Object obj) {
            h hVar = h.this;
            hVar.a = hVar.e.cast(obj);
            if (h.this.a != null) {
                try {
                    this.b.invoke(h.this.a, 0);
                    Object invoke = this.c.invoke(h.this.a, null);
                    if (invoke != null) {
                        String str = "Strong match request " + this.f;
                        this.n.invoke(invoke, this.f, null, null);
                        this.o.M("bnc_branch_strong_match_time", System.currentTimeMillis());
                        h.this.d = true;
                    }
                } catch (Throwable unused) {
                    h.this.a = null;
                    h hVar2 = h.this;
                    hVar2.k(this.p, hVar2.d);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h.this.a = null;
            h hVar = h.this;
            hVar.k(this.p, hVar.d);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        final /* synthetic */ e a;

        c(h hVar, e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Branch.a aVar = (Branch.a) this.a;
            Branch.j(Branch.this).q(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
            Branch.k(Branch.this);
        }
    }

    private abstract class d implements ServiceConnection {
        d() {
        }

        public abstract void a(ComponentName componentName, Object obj);

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Constructor declaredConstructor = h.this.e.getDeclaredConstructor(h.this.h, ComponentName.class);
                declaredConstructor.setAccessible(true);
                a(componentName, declaredConstructor.newInstance(Class.forName("n$a").getMethod("asInterface", IBinder.class).invoke(null, iBinder), componentName));
            } catch (Throwable unused) {
                a(null, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface e {
    }

    private h() {
        try {
            this.e = Class.forName("android.support.customtabs.CustomTabsClient");
            this.f = Class.forName("android.support.customtabs.CustomTabsCallback");
            this.g = Class.forName("android.support.customtabs.CustomTabsSession");
            this.h = Class.forName("n");
        } catch (Throwable unused) {
            this.c = false;
        }
        this.b = new Handler();
    }

    private Uri h(String str, l lVar, r rVar, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder a1 = je.a1("https://", str, "/_strong_match?os=");
        a1.append(lVar.f());
        StringBuilder Z0 = je.Z0(a1.toString(), "&");
        Z0.append(Defines$Jsonkey.HardwareID.d());
        Z0.append("=");
        Z0.append(lVar.c());
        String sb = Z0.toString();
        String d2 = (lVar.c().b() ? Defines$Jsonkey.HardwareIDTypeVendor : Defines$Jsonkey.HardwareIDTypeRandom).d();
        StringBuilder Z02 = je.Z0(sb, "&");
        Z02.append(Defines$Jsonkey.HardwareIDType.d());
        Z02.append("=");
        Z02.append(d2);
        String sb2 = Z02.toString();
        String a2 = lVar.g().a();
        if (a2 != null && !i.a(context)) {
            StringBuilder Z03 = je.Z0(sb2, "&");
            Z03.append(Defines$Jsonkey.GoogleAdvertisingID.d());
            Z03.append("=");
            Z03.append(a2);
            sb2 = Z03.toString();
        }
        if (!rVar.k().equals("bnc_no_value")) {
            StringBuilder Z04 = je.Z0(sb2, "&");
            Z04.append(Defines$Jsonkey.DeviceFingerprintID.d());
            Z04.append("=");
            Z04.append(rVar.k());
            sb2 = Z04.toString();
        }
        if (!lVar.a().equals("bnc_no_value")) {
            StringBuilder Z05 = je.Z0(sb2, "&");
            Z05.append(Defines$Jsonkey.AppVersion.d());
            Z05.append("=");
            Z05.append(lVar.a());
            sb2 = Z05.toString();
        }
        if (rVar.D(rVar.g())) {
            StringBuilder Z06 = je.Z0(sb2, "&");
            Z06.append(Defines$Jsonkey.BranchKey.d());
            Z06.append("=");
            Z06.append(rVar.g());
            sb2 = Z06.toString();
        }
        return Uri.parse(sb2 + "&sdk=android5.0.2");
    }

    public static h j() {
        if (i == null) {
            i = new h();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k(e eVar, boolean z) {
        if (eVar == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new c(this, eVar), (long) 750);
            return;
        }
        Branch.a aVar = (Branch.a) eVar;
        Branch.j(Branch.this).q(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
        Branch.k(Branch.this);
    }

    /* access modifiers changed from: package-private */
    public void i(Context context, String str, l lVar, r rVar, e eVar) {
        this.d = false;
        if (System.currentTimeMillis() - rVar.v("bnc_branch_strong_match_time") < 2592000000L) {
            k(eVar, this.d);
        } else if (!this.c) {
            k(eVar, this.d);
        } else {
            try {
                lVar.c();
                Uri h2 = h(str, lVar, rVar, context);
                if (h2 != null) {
                    this.b.postDelayed(new a(eVar), 500);
                    Method method = this.e.getMethod("warmup", Long.TYPE);
                    Method method2 = this.e.getMethod("newSession", this.f);
                    Method method3 = this.g.getMethod("mayLaunchUrl", Uri.class, Bundle.class, List.class);
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    intent.setPackage("com.android.chrome");
                    context.bindService(intent, new b(method, method2, h2, method3, rVar, eVar), 33);
                    return;
                }
                k(eVar, this.d);
            } catch (Throwable unused) {
                k(eVar, this.d);
            }
        }
    }
}
