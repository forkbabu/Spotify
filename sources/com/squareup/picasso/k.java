package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class k {
    final b a;
    final Context b;
    final ExecutorService c;
    final l d;
    final Map<String, e> e = new LinkedHashMap();
    final Map<Object, c> f = new WeakHashMap();
    final Map<Object, c> g = new WeakHashMap();
    final Set<Object> h = new LinkedHashSet();
    final Handler i;
    final Handler j;
    final f k;
    final d0 l;
    final List<e> m;
    final c n;
    final boolean o;
    boolean p;

    private static class a extends Handler {
        private final k a;

        /* renamed from: com.squareup.picasso.k$a$a  reason: collision with other inner class name */
        class RunnableC0583a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0583a(a aVar, Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder V0 = je.V0("Unknown handler message received: ");
                V0.append(this.a.what);
                throw new AssertionError(V0.toString());
            }
        }

        a(Looper looper, k kVar) {
            super(looper);
            this.a = kVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:171:0x0034 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:173:0x0034 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v38, types: [android.os.Handler] */
        /* JADX WARN: Type inference failed for: r3v58 */
        /* JADX WARN: Type inference failed for: r3v59, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v62 */
        /* JADX WARN: Type inference failed for: r3v63 */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // android.os.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r17) {
            /*
            // Method dump skipped, instructions count: 996
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.k.a.handleMessage(android.os.Message):void");
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {
        private final k a;

        c(k kVar) {
            this.a = kVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        k kVar = this.a;
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        Handler handler = kVar.i;
                        handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    StringBuilder sb = j0.a;
                    k kVar2 = this.a;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    Handler handler2 = kVar2.i;
                    handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0075, code lost:
        if (android.provider.Settings.Global.getInt(r7, "airplane_mode_on", 0) != 0) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    k(android.content.Context r6, java.util.concurrent.ExecutorService r7, android.os.Handler r8, com.squareup.picasso.l r9, com.squareup.picasso.f r10, com.squareup.picasso.d0 r11) {
        /*
            r5 = this;
            r5.<init>()
            com.squareup.picasso.k$b r0 = new com.squareup.picasso.k$b
            r0.<init>()
            r5.a = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            java.lang.StringBuilder r2 = com.squareup.picasso.j0.a
            com.squareup.picasso.i0 r2 = new com.squareup.picasso.i0
            r2.<init>(r1)
            android.os.Message r1 = r2.obtainMessage()
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r1, r3)
            r5.b = r6
            r5.c = r7
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.e = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.g = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r5.h = r7
            com.squareup.picasso.k$a r7 = new com.squareup.picasso.k$a
            android.os.Looper r0 = r0.getLooper()
            r7.<init>(r0, r5)
            r5.i = r7
            r5.d = r9
            r5.j = r8
            r5.k = r10
            r5.l = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 4
            r7.<init>(r8)
            r5.m = r7
            android.content.ContentResolver r7 = r6.getContentResolver()
            r8 = 1
            r9 = 0
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 17
            java.lang.String r0 = "airplane_mode_on"
            if (r10 >= r11) goto L_0x0071
            int r7 = android.provider.Settings.System.getInt(r7, r0, r9)     // Catch:{ NullPointerException | SecurityException -> 0x0079 }
            if (r7 == 0) goto L_0x0079
            goto L_0x0077
        L_0x0071:
            int r7 = android.provider.Settings.Global.getInt(r7, r0, r9)     // Catch:{ NullPointerException | SecurityException -> 0x0079 }
            if (r7 == 0) goto L_0x0079
        L_0x0077:
            r7 = 1
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            r5.p = r7
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)
            if (r6 != 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            r5.o = r8
            com.squareup.picasso.k$c r6 = new com.squareup.picasso.k$c
            r6.<init>(r5)
            r5.n = r6
            r6.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.k.<init>(android.content.Context, java.util.concurrent.ExecutorService, android.os.Handler, com.squareup.picasso.l, com.squareup.picasso.f, com.squareup.picasso.d0):void");
    }

    private void a(e eVar) {
        Future<?> future = eVar.w;
        if (!(future != null && future.isCancelled())) {
            Bitmap bitmap = eVar.v;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.m.add(eVar);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e eVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, eVar));
    }

    /* access modifiers changed from: package-private */
    public void c(e eVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, eVar));
    }

    /* access modifiers changed from: package-private */
    public void d(e eVar) {
        if ((eVar.q & MemoryPolicy.NO_STORE.index) == 0) {
            this.k.b(eVar.o, eVar.v);
        }
        this.e.remove(eVar.o);
        a(eVar);
        if (eVar.b.n) {
            j0.h("Dispatcher", "batched", j0.d(eVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    public void e(e eVar, boolean z) {
        if (eVar.b.n) {
            String d2 = j0.d(eVar);
            StringBuilder V0 = je.V0("for error");
            V0.append(z ? " (will replay)" : "");
            j0.h("Dispatcher", "batched", d2, V0.toString());
        }
        this.e.remove(eVar.o);
        a(eVar);
    }

    /* access modifiers changed from: package-private */
    public void f(c cVar, boolean z) {
        if (this.h.contains(cVar.j)) {
            this.g.put(cVar.d(), cVar);
            if (cVar.a.n) {
                j0.h("Dispatcher", "paused", cVar.b.b(), je.G0(je.V0("because tag '"), cVar.j, "' is paused"));
                return;
            }
            return;
        }
        e eVar = this.e.get(cVar.i);
        if (eVar != null) {
            boolean z2 = eVar.b.n;
            y yVar = cVar.b;
            if (eVar.t == null) {
                eVar.t = cVar;
                if (z2) {
                    List<c> list = eVar.u;
                    if (list == null || list.isEmpty()) {
                        j0.h("Hunter", "joined", yVar.b(), "to empty hunter");
                    } else {
                        j0.h("Hunter", "joined", yVar.b(), j0.e(eVar, "to "));
                    }
                }
            } else {
                if (eVar.u == null) {
                    eVar.u = new ArrayList(3);
                }
                eVar.u.add(cVar);
                if (z2) {
                    j0.h("Hunter", "joined", yVar.b(), j0.e(eVar, "to "));
                }
                Picasso.Priority priority = cVar.b.r;
                if (priority.ordinal() > eVar.B.ordinal()) {
                    eVar.B = priority;
                }
            }
        } else if (!this.c.isShutdown()) {
            e e2 = e.e(cVar.a, this, this.k, this.l, cVar);
            e2.w = this.c.submit(e2);
            this.e.put(cVar.i, e2);
            if (z) {
                this.f.remove(cVar.d());
            }
            if (cVar.a.n) {
                j0.h("Dispatcher", "enqueued", cVar.b.b(), "");
            }
        } else if (cVar.a.n) {
            j0.h("Dispatcher", "ignored", cVar.b.b(), "because shut down");
        }
    }
}
