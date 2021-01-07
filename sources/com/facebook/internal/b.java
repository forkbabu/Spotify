package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.k;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class b {
    private static b f;
    private String a;
    private String b;
    private String c;
    private boolean d;
    private long e;

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.internal.b$b  reason: collision with other inner class name */
    public static final class C0070b implements IInterface {
        private IBinder a;

        C0070b(IBinder iBinder) {
            this.a = iBinder;
        }

        public String T() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean a0() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static final class c implements ServiceConnection {
        private AtomicBoolean a = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> b = new LinkedBlockingDeque();

        c(a aVar) {
        }

        public IBinder a() {
            if (!this.a.compareAndSet(true, true)) {
                return this.b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static b a(b bVar) {
        bVar.e = System.currentTimeMillis();
        f = bVar;
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3 A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0150 A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0159 A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015c A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0160 A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0164 A[Catch:{ Exception -> 0x01c1, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.b e(android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.e(android.content.Context):com.facebook.internal.b");
    }

    public static boolean g(Context context) {
        b e2 = e(context);
        return e2 != null && e2.d;
    }

    public String b() {
        if (!k.u() || !k.c()) {
            return null;
        }
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public boolean f() {
        return this.d;
    }
}
