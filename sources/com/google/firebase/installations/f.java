package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.b;
import com.google.firebase.installations.local.c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class f implements g {
    private static final Object l = new Object();
    private static final ThreadFactory m = new a();
    private final c a;
    private final com.google.firebase.installations.remote.c b;
    private final PersistedInstallation c;
    private final n d;
    private final b e;
    private final l f;
    private final Object g = new Object();
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;
    private final List<m> k = new ArrayList();

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    f(c cVar, b20 b20, HeartBeatInfo heartBeatInfo) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = m;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        com.google.firebase.installations.remote.c cVar2 = new com.google.firebase.installations.remote.c(cVar.g(), b20, heartBeatInfo);
        PersistedInstallation persistedInstallation = new PersistedInstallation(cVar);
        n nVar = new n();
        b bVar = new b(cVar);
        l lVar = new l();
        this.a = cVar;
        this.b = cVar2;
        this.c = persistedInstallation;
        this.d = nVar;
        this.e = bVar;
        this.f = lVar;
        this.h = threadPoolExecutor;
        this.i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    /* access modifiers changed from: private */
    public final void b(boolean z) {
        com.google.firebase.installations.local.c b2;
        synchronized (l) {
            b a2 = b.a(this.a.g(), "generatefid.lock");
            try {
                b2 = this.c.b();
                if (b2.i()) {
                    String l2 = l(b2);
                    PersistedInstallation persistedInstallation = this.c;
                    c.a l3 = b2.l();
                    l3.d(l2);
                    l3.g(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                    b2 = l3.a();
                    persistedInstallation.a(b2);
                }
            } finally {
                if (a2 != null) {
                    a2.b();
                }
            }
        }
        if (z) {
            c.a l4 = b2.l();
            l4.b(null);
            b2 = l4.a();
        }
        o(b2);
        this.i.execute(e.a(this, z));
    }

    private com.google.firebase.installations.local.c c(com.google.firebase.installations.local.c cVar) {
        TokenResult b2 = this.b.b(d(), cVar.c(), g(), cVar.e());
        int ordinal = b2.b().ordinal();
        if (ordinal == 0) {
            String c2 = b2.c();
            long d2 = b2.d();
            long a2 = this.d.a();
            c.a l2 = cVar.l();
            l2.b(c2);
            l2.c(d2);
            l2.h(a2);
            return l2.a();
        } else if (ordinal == 1) {
            c.a l3 = cVar.l();
            l3.e("BAD CONFIG");
            l3.g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return l3.a();
        } else if (ordinal == 2) {
            synchronized (this) {
                this.j = null;
            }
            c.a l4 = cVar.l();
            l4.g(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
            return l4.a();
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public static f f() {
        com.google.firebase.c h2 = com.google.firebase.c.h();
        g.d(true, "Null is not a valid value of FirebaseApp.");
        return (f) h2.f(g.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void h(com.google.firebase.installations.f r3, boolean r4) {
        /*
            r3.getClass()
            java.lang.Object r0 = com.google.firebase.installations.f.l
            monitor-enter(r0)
            com.google.firebase.c r1 = r3.a     // Catch:{ all -> 0x00a4 }
            android.content.Context r1 = r1.g()     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "generatefid.lock"
            com.google.firebase.installations.b r1 = com.google.firebase.installations.b.a(r1, r2)     // Catch:{ all -> 0x00a4 }
            com.google.firebase.installations.local.PersistedInstallation r2 = r3.c     // Catch:{ all -> 0x009d }
            com.google.firebase.installations.local.c r2 = r2.b()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x001d
            r1.b()
        L_0x001d:
            monitor-exit(r0)
            boolean r1 = r2.h()     // Catch:{ FirebaseInstallationsException -> 0x0098 }
            if (r1 != 0) goto L_0x003a
            boolean r1 = r2.k()     // Catch:{ FirebaseInstallationsException -> 0x0098 }
            if (r1 == 0) goto L_0x002b
            goto L_0x003a
        L_0x002b:
            if (r4 != 0) goto L_0x0035
            com.google.firebase.installations.n r4 = r3.d     // Catch:{ FirebaseInstallationsException -> 0x0098 }
            boolean r4 = r4.b(r2)     // Catch:{ FirebaseInstallationsException -> 0x0098 }
            if (r4 == 0) goto L_0x009c
        L_0x0035:
            com.google.firebase.installations.local.c r4 = r3.c(r2)     // Catch:{ FirebaseInstallationsException -> 0x0098 }
            goto L_0x003e
        L_0x003a:
            com.google.firebase.installations.local.c r4 = r3.m(r2)     // Catch:{ FirebaseInstallationsException -> 0x0098 }
        L_0x003e:
            monitor-enter(r0)
            com.google.firebase.c r1 = r3.a     // Catch:{ all -> 0x0095 }
            android.content.Context r1 = r1.g()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "generatefid.lock"
            com.google.firebase.installations.b r1 = com.google.firebase.installations.b.a(r1, r2)     // Catch:{ all -> 0x0095 }
            com.google.firebase.installations.local.PersistedInstallation r2 = r3.c     // Catch:{ all -> 0x008e }
            r2.a(r4)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0055
            r1.b()
        L_0x0055:
            monitor-exit(r0)
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r4.c()
            monitor-enter(r3)
            r3.j = r0     // Catch:{ all -> 0x0065 }
            monitor-exit(r3)
            goto L_0x0068
        L_0x0065:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0068:
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0079
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r0.<init>(r1)
            r3.n(r4, r0)
            goto L_0x009c
        L_0x0079:
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x008a
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            r3.n(r4, r0)
            goto L_0x009c
        L_0x008a:
            r3.o(r4)
            goto L_0x009c
        L_0x008e:
            r3 = move-exception
            if (r1 == 0) goto L_0x0094
            r1.b()
        L_0x0094:
            throw r3
        L_0x0095:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0098:
            r4 = move-exception
            r3.n(r2, r4)
        L_0x009c:
            return
        L_0x009d:
            r3 = move-exception
            if (r1 == 0) goto L_0x00a3
            r1.b()
        L_0x00a3:
            throw r3
        L_0x00a4:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.f.h(com.google.firebase.installations.f, boolean):void");
    }

    private void k() {
        g.h(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.h(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.h(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e2 = e();
        int i2 = n.c;
        g.d(e2.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        g.d(n.c(d()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String l(com.google.firebase.installations.local.c cVar) {
        if (this.a.i().equals("CHIME_ANDROID_SDK") || this.a.p()) {
            if (cVar.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                String a2 = this.e.a();
                return TextUtils.isEmpty(a2) ? this.f.a() : a2;
            }
        }
        return this.f.a();
    }

    private com.google.firebase.installations.local.c m(com.google.firebase.installations.local.c cVar) {
        InstallationResponse a2 = this.b.a(d(), cVar.c(), g(), e(), (cVar.c() == null || cVar.c().length() != 11) ? null : this.e.c());
        int ordinal = a2.d().ordinal();
        if (ordinal == 0) {
            String b2 = a2.b();
            String c2 = a2.c();
            long a3 = this.d.a();
            String c3 = a2.a().c();
            long d2 = a2.a().d();
            c.a l2 = cVar.l();
            l2.d(b2);
            l2.g(PersistedInstallation.RegistrationStatus.REGISTERED);
            l2.b(c3);
            l2.f(c2);
            l2.c(d2);
            l2.h(a3);
            return l2.a();
        } else if (ordinal == 1) {
            c.a l3 = cVar.l();
            l3.e("BAD CONFIG");
            l3.g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return l3.a();
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private void n(com.google.firebase.installations.local.c cVar, Exception exc) {
        synchronized (this.g) {
            Iterator<m> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().b(cVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void o(com.google.firebase.installations.local.c cVar) {
        synchronized (this.g) {
            Iterator<m> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(cVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.firebase.installations.g
    public com.google.android.gms.tasks.g<k> a(boolean z) {
        k();
        h hVar = new h();
        i iVar = new i(this.d, hVar);
        synchronized (this.g) {
            this.k.add(iVar);
        }
        com.google.android.gms.tasks.g<k> a2 = hVar.a();
        this.h.execute(d.a(this, z));
        return a2;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.a.j().b();
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.a.j().c();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.a.j().e();
    }

    @Override // com.google.firebase.installations.g
    public com.google.android.gms.tasks.g<String> getId() {
        String str;
        k();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return j.e(str);
        }
        h hVar = new h();
        j jVar = new j(hVar);
        synchronized (this.g) {
            this.k.add(jVar);
        }
        com.google.android.gms.tasks.g<String> a2 = hVar.a();
        this.h.execute(c.a(this));
        return a2;
    }
}
