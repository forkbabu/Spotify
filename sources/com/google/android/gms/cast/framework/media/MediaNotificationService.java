package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.core.app.h;
import androidx.core.app.k;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.List;

public class MediaNotificationService extends Service {
    private static Runnable A;
    private static final com.google.android.gms.cast.internal.b z = new com.google.android.gms.cast.internal.b("MediaNotificationService");
    private g a;
    private c b;
    private ComponentName c;
    private ComponentName f;
    private List<h> n = new ArrayList();
    private int[] o;
    private long p;
    private com.google.android.gms.cast.framework.media.internal.b q;
    private b r;
    private Resources s;
    private b t;
    private a u;
    private NotificationManager v;
    private Notification w;
    private com.google.android.gms.cast.framework.a x;
    private final BroadcastReceiver y = new i0(this);

    /* access modifiers changed from: package-private */
    public static class a {
        public final Uri a;
        public Bitmap b;

        public a(hr hrVar) {
            Uri uri;
            if (hrVar == null) {
                uri = null;
            } else {
                uri = hrVar.I1();
            }
            this.a = uri;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        public final MediaSessionCompat.Token a;
        public final boolean b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public b(boolean z, int i, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
            this.b = z;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.a = token;
            this.f = z2;
            this.g = z3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.cast.framework.b r7) {
        /*
            java.lang.Class<com.google.android.gms.cast.framework.media.f> r0 = com.google.android.gms.cast.framework.media.f.class
            com.google.android.gms.cast.framework.media.a r1 = r7.I1()
            com.google.android.gms.cast.framework.media.g r1 = r1.q2()
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            com.google.android.gms.cast.framework.media.a r7 = r7.I1()
            com.google.android.gms.cast.framework.media.g r7 = r7.q2()
            com.google.android.gms.cast.framework.media.b0 r7 = r7.R2()
            r1 = 1
            if (r7 != 0) goto L_0x001e
            return r1
        L_0x001e:
            java.util.List r3 = e(r7)
            int[] r7 = g(r7)
            if (r3 == 0) goto L_0x004a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x002f
            goto L_0x004a
        L_0x002f:
            int r4 = r3.size()
            r5 = 5
            if (r4 <= r5) goto L_0x0048
            com.google.android.gms.cast.internal.b r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.z
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r6 = " provides more than 5 actions."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
            goto L_0x005b
        L_0x0048:
            r4 = 1
            goto L_0x005c
        L_0x004a:
            com.google.android.gms.cast.internal.b r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.z
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r6 = " doesn't provide any action."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x009f
            int r3 = r3.size()
            if (r7 == 0) goto L_0x008a
            int r4 = r7.length
            if (r4 != 0) goto L_0x0068
            goto L_0x008a
        L_0x0068:
            int r4 = r7.length
            r5 = 0
        L_0x006a:
            if (r5 >= r4) goto L_0x0088
            r6 = r7[r5]
            if (r6 < 0) goto L_0x0076
            if (r6 < r3) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0076:
            com.google.android.gms.cast.internal.b r7 = com.google.android.gms.cast.framework.media.MediaNotificationService.z
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = "provides a compact view action whose index is out of bounds."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
            goto L_0x009b
        L_0x0088:
            r7 = 1
            goto L_0x009c
        L_0x008a:
            com.google.android.gms.cast.internal.b r7 = com.google.android.gms.cast.framework.media.MediaNotificationService.z
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = " doesn't provide any actions for compact view."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
        L_0x009b:
            r7 = 0
        L_0x009c:
            if (r7 == 0) goto L_0x009f
            return r1
        L_0x009f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.a(com.google.android.gms.cast.framework.b):boolean");
    }

    public static void b() {
        Runnable runnable = A;
        if (runnable != null) {
            runnable.run();
        }
    }

    private static List<e> e(b0 b0Var) {
        try {
            return b0Var.X1();
        } catch (RemoteException e) {
            z.d(e, "Unable to call %s on %s.", "getNotificationActions", b0.class.getSimpleName());
            return null;
        }
    }

    private static int[] g(b0 b0Var) {
        try {
            return b0Var.P0();
        } catch (RemoteException e) {
            z.d(e, "Unable to call %s on %s.", "getCompactViewActionIndices", b0.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        h hVar;
        if (this.t != null) {
            a aVar = this.u;
            PendingIntent pendingIntent = null;
            Bitmap bitmap = aVar == null ? null : aVar.b;
            k kVar = new k(this, "cast_media_notification");
            kVar.q(bitmap);
            kVar.z(this.a.B2());
            kVar.j(this.t.d);
            kVar.i(this.s.getString(this.a.Q1(), this.t.e));
            kVar.u(true);
            kVar.y(false);
            kVar.F(1);
            if (this.f != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", this.f);
                intent.setAction(this.f.flattenToString());
                pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 134217728);
            }
            if (pendingIntent != null) {
                kVar.h(pendingIntent);
            }
            b0 R2 = this.a.R2();
            if (R2 != null) {
                z.e("actionsProvider != null", new Object[0]);
                this.o = (int[]) g(R2).clone();
                List<e> e = e(R2);
                this.n = new ArrayList();
                for (e eVar : e) {
                    String I1 = eVar.I1();
                    if (I1.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || I1.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || I1.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || I1.equals(MediaIntentReceiver.ACTION_FORWARD) || I1.equals(MediaIntentReceiver.ACTION_REWIND) || I1.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                        hVar = j(eVar.I1());
                    } else {
                        Intent intent2 = new Intent(eVar.I1());
                        intent2.setComponent(this.c);
                        hVar = new h.a(eVar.o2(), eVar.Q1(), PendingIntent.getBroadcast(this, 0, intent2, 0)).a();
                    }
                    this.n.add(hVar);
                }
            } else {
                z.e("actionsProvider == null", new Object[0]);
                this.n = new ArrayList();
                for (String str : this.a.I1()) {
                    this.n.add(j(str));
                }
                this.o = (int[]) this.a.o2().clone();
            }
            for (h hVar2 : this.n) {
                kVar.b.add(hVar2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                f6 f6Var = new f6();
                f6Var.m(this.o);
                f6Var.l(this.t.a);
                kVar.B(f6Var);
            }
            Notification a2 = kVar.a();
            this.w = a2;
            startForeground(1, a2);
        }
    }

    private final h j(String str) {
        int i;
        int i2;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c2 = 0;
                    break;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c2 = 1;
                    break;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c2 = 2;
                    break;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c2 = 3;
                    break;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c2 = 4;
                    break;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c2 = 5;
                    break;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c2 = 6;
                    break;
                }
                break;
        }
        PendingIntent pendingIntent = null;
        switch (c2) {
            case 0:
                long j = this.p;
                Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent.setComponent(this.c);
                intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 134217728);
                int x2 = this.a.x2();
                int N2 = this.a.N2();
                if (j == 10000) {
                    x2 = this.a.v2();
                    N2 = this.a.O2();
                } else if (j == 30000) {
                    x2 = this.a.w2();
                    N2 = this.a.P2();
                }
                return new h.a(x2, this.s.getString(N2), broadcast).a();
            case 1:
                if (this.t.f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.c);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, 0);
                }
                return new h.a(this.a.y2(), this.s.getString(this.a.I2()), pendingIntent).a();
            case 2:
                if (this.t.g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.c);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent3, 0);
                }
                return new h.a(this.a.z2(), this.s.getString(this.a.J2()), pendingIntent).a();
            case 3:
            case 4:
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent4.setComponent(this.c);
                return new h.a(this.a.p2(), this.s.getString(this.a.Q2()), PendingIntent.getBroadcast(this, 0, intent4, 0)).a();
            case 5:
                b bVar = this.t;
                int i3 = bVar.c;
                boolean z2 = bVar.b;
                if (i3 == 2) {
                    i2 = this.a.C2();
                    i = this.a.D2();
                } else {
                    i2 = this.a.t2();
                    i = this.a.G2();
                }
                if (!z2) {
                    i2 = this.a.u2();
                }
                if (!z2) {
                    i = this.a.H2();
                }
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent5.setComponent(this.c);
                return new h.a(i2, this.s.getString(i), PendingIntent.getBroadcast(this, 0, intent5, 0)).a();
            case 6:
                long j2 = this.p;
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent6.setComponent(this.c);
                intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent6, 134217728);
                int s2 = this.a.s2();
                int K2 = this.a.K2();
                if (j2 == 10000) {
                    s2 = this.a.q2();
                    K2 = this.a.L2();
                } else if (j2 == 30000) {
                    s2 = this.a.r2();
                    K2 = this.a.M2();
                }
                return new h.a(s2, this.s.getString(K2), broadcast2).a();
            default:
                z.c("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.v = (NotificationManager) getSystemService("notification");
        com.google.android.gms.cast.framework.a e = com.google.android.gms.cast.framework.a.e(this);
        this.x = e;
        a I1 = e.b().I1();
        this.a = I1.q2();
        this.b = I1.Q1();
        this.s = getResources();
        this.c = new ComponentName(getApplicationContext(), I1.o2());
        if (!TextUtils.isEmpty(this.a.E2())) {
            this.f = new ComponentName(getApplicationContext(), this.a.E2());
        } else {
            this.f = null;
        }
        this.p = this.a.A2();
        int dimensionPixelSize = this.s.getDimensionPixelSize(this.a.F2());
        this.r = new b(1, dimensionPixelSize, dimensionPixelSize);
        this.q = new com.google.android.gms.cast.framework.media.internal.b(getApplicationContext(), this.r);
        if (this.f != null) {
            registerReceiver(this.y, new IntentFilter(this.f.flattenToString()));
        }
        if (e.c()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.v.createNotificationChannel(notificationChannel);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.b bVar = this.q;
        if (bVar != null) {
            bVar.a();
        }
        if (this.f != null) {
            try {
                unregisterReceiver(this.y);
            } catch (IllegalArgumentException e) {
                z.d(e, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        A = null;
        this.v.cancel(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if ((r1 != null && r15.b == r1.b && r15.c == r1.c && com.google.android.gms.cast.internal.a.d(r15.d, r1.d) && com.google.android.gms.cast.internal.a.d(r15.e, r1.e) && r15.f == r1.f && r15.g == r1.g) == false) goto L_0x0090;
     */
    @Override // android.app.Service
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
