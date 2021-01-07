package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.e;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.features.ads.model.Ad;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    private com.google.android.gms.common.a a;
    private cs b;
    private boolean c;
    private final Object d = new Object();
    private a e;
    private final Context f;
    private final boolean g;
    private final long h;

    public static final class Info {
        private final String a;
        private final boolean b;

        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String getId() {
            return this.a;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends Thread {
        private WeakReference<AdvertisingIdClient> a;
        private long b;
        CountDownLatch c = new CountDownLatch(1);
        boolean f = false;

        public a(AdvertisingIdClient advertisingIdClient, long j) {
            this.a = new WeakReference<>(advertisingIdClient);
            this.b = j;
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AdvertisingIdClient advertisingIdClient;
            try {
                if (!this.c.await(this.b, TimeUnit.MILLISECONDS) && (advertisingIdClient = this.a.get()) != null) {
                    advertisingIdClient.a();
                    this.f = true;
                }
            } catch (InterruptedException unused) {
                AdvertisingIdClient advertisingIdClient2 = this.a.get();
                if (advertisingIdClient2 != null) {
                    advertisingIdClient2.a();
                    this.f = true;
                }
            }
        }
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        if (context != null) {
            if (z && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            this.f = context;
            this.c = false;
            this.h = j;
            this.g = z2;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private static com.google.android.gms.common.a c(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int c2 = e.b().c(context, 12451000);
            if (c2 == 0 || c2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (sr.b().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private final void d() {
        synchronized (this.d) {
            a aVar = this.e;
            if (aVar != null) {
                aVar.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.h > 0) {
                this.e = new a(this, this.h);
            }
        }
    }

    private final void e(boolean z) {
        g.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            com.google.android.gms.common.a c2 = c(this.f, this.g);
            this.a = c2;
            try {
                this.b = ds.C3(c2.a(10000, TimeUnit.MILLISECONDS));
                this.c = true;
                if (z) {
                    d();
                }
            } catch (InterruptedException unused) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    private final boolean f(Info info, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put(AppProtocol.LogMessage.SEVERITY_ERROR, th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new a(hashMap).start();
        return true;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        b bVar = new b(context);
        boolean a2 = bVar.a("gads:ad_id_app_context:enabled");
        float b2 = bVar.b("gads:ad_id_app_context:ping_ratio");
        String c2 = bVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, a2, bVar.a("gads:ad_id_use_persistent_service:enabled"));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.e(false);
            Info b3 = advertisingIdClient.b();
            advertisingIdClient.f(b3, a2, b2, SystemClock.elapsedRealtime() - elapsedRealtime, c2, null);
            advertisingIdClient.a();
            return b3;
        } catch (Throwable th) {
            advertisingIdClient.a();
            throw th;
        }
    }

    public final void a() {
        g.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f != null && this.a != null) {
                try {
                    if (this.c) {
                        sr.b().c(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            }
        }
    }

    public Info b() {
        Info info;
        g.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    a aVar = this.e;
                    if (aVar == null || !aVar.f) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    e(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            g.l(this.a);
            g.l(this.b);
            try {
                info = new Info(this.b.getId(), this.b.q0(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        d();
        return info;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }
}
