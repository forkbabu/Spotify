package com.comscore.android.id;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

public class IdHelperAndroid {
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String NO_ID_AVAILABLE = "none";
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static final boolean h = false;

    /* access modifiers changed from: private */
    public static final class a implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        /* access modifiers changed from: package-private */
        public IBinder a() {
            if (!this.a) {
                this.a = true;
                return this.b.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* access modifiers changed from: private */
    public static final class b implements IInterface {
        private IBinder a;

        b(IBinder iBinder) {
            this.a = iBinder;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() {
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
    }

    private static DeviceId a() {
        return new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
    }

    private static Boolean a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (!z && g) {
            return Boolean.FALSE;
        } else {
            try {
                boolean z2 = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") == 0;
                if (!z && !z2) {
                    g = true;
                }
                return Boolean.valueOf(z2);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static String a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    return new b(aVar.a()).getId();
                } catch (Exception unused) {
                } finally {
                    context.unbindService(aVar);
                }
            }
            return "";
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    private static boolean b(Context context) {
        if (c) {
            return d;
        }
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if ("com.android.vending".equals(installerPackageName) || "com.google.play".equals(installerPackageName)) {
                c = true;
                d = true;
                return true;
            }
        } catch (Exception unused) {
        }
        c = true;
        d = false;
        return false;
    }

    private static boolean c(Context context) {
        if (e) {
            return f;
        }
        try {
            boolean equals = "com.amazon.venezia".equals(context.getPackageManager().getInstallerPackageName(context.getPackageName()));
            e = true;
            if (equals) {
                f = true;
                return true;
            }
            f = false;
            return false;
        } catch (Exception unused) {
            e = true;
            f = false;
            return false;
        }
    }

    public static boolean checkAndroidId(String str) {
        for (String str2 : INVALID_ID_VALUES) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAndroidSerial(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : INVALID_ID_VALUES) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return str.length() > 3 && !str.substring(0, 3).equals("***") && !str.substring(0, 3).equals("000");
    }

    private static boolean d(Context context) {
        return Build.MODEL.matches("AFTN") || context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    private static String e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAmazonAdvertisingId(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Boolean a2 = a(context, z);
            if (a2 == null) {
                return null;
            }
            return a2.booleanValue() ? e(context) : "none";
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static DeviceId getAndroidId(Context context) {
        try {
            String str = (String) Settings.Secure.class.getMethod("getString", ContentResolver.class, String.class).invoke(null, context.getContentResolver(), "android_id");
            if (str == null || str.length() <= 0 || !checkAndroidId(str)) {
                return null;
            }
            return new DeviceId("AndroidId", str, 3, 2, 2);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (checkAndroidSerial(r0) == false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.comscore.android.id.DeviceId getAndroidSerial() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 26
            if (r0 >= r2) goto L_0x0012
            java.lang.String r0 = android.os.Build.SERIAL
            boolean r2 = checkAndroidSerial(r0)
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r4 = r0
            goto L_0x0048
        L_0x0012:
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            java.lang.String r2 = "SERIAL"
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ Exception -> 0x0026 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0026 }
            boolean r2 = checkAndroidSerial(r0)     // Catch:{ Exception -> 0x0028 }
            if (r2 != 0) goto L_0x0029
        L_0x0026:
            r0 = r1
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            if (r0 != 0) goto L_0x0010
            java.lang.Class<android.os.Build> r2 = android.os.Build.class
            java.lang.String r3 = "getSerial"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0010 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x0010 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0010 }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{ Exception -> 0x0010 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0010 }
            boolean r0 = checkAndroidSerial(r2)     // Catch:{ Exception -> 0x0046 }
            if (r0 != 0) goto L_0x0046
            r0 = r1
            goto L_0x0010
        L_0x0046:
            r0 = r2
            goto L_0x0010
        L_0x0048:
            if (r4 != 0) goto L_0x004b
            return r1
        L_0x004b:
            r5 = 3
            r6 = 1
            com.comscore.android.id.DeviceId r0 = new com.comscore.android.id.DeviceId
            r7 = 1
            java.lang.String r3 = "AndroidSerial"
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.id.IdHelperAndroid.getAndroidSerial():com.comscore.android.id.DeviceId");
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        boolean z2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (d(context)) {
                String amazonAdvertisingId = getAmazonAdvertisingId(context, z);
                if (amazonAdvertisingId != null) {
                    return new CrossPublisherId(amazonAdvertisingId, 1);
                }
                z2 = c(context);
            } else {
                DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
                if (googlePlayAdvertisingDeviceId != null) {
                    return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
                }
                z2 = b(context);
            }
            if (!z2) {
                DeviceId androidSerial = getAndroidSerial();
                if (androidSerial != null && androidSerial.getId() != null) {
                    return new CrossPublisherId(androidSerial.getId(), 2);
                }
                DeviceId androidId = getAndroidId(context);
                if (!(androidId == null || androidId.getId() == null)) {
                    return new CrossPublisherId(androidId.getId(), 3);
                }
            }
            return new CrossPublisherId(null, 0);
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static DeviceId getDeviceId(Context context) {
        DeviceId androidSerial = getAndroidSerial();
        if (androidSerial != null && androidSerial.getId() != null) {
            return androidSerial;
        }
        DeviceId androidId = getAndroidId(context);
        return (androidId == null || androidId.getId() == null) ? a() : androidId;
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context) {
        return getGooglePlayAdvertisingDeviceId(context, false);
    }

    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        } else if (!isGooglePlayServicesAvailable(context)) {
            return null;
        } else {
            return new DeviceId("googleplayapp", isAdvertisingIdEnabled(context, z) ? a(context) : "none", 0, 0, -1);
        }
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            boolean z2 = false;
            if (!z && g) {
                return false;
            }
            a aVar = new a();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                try {
                    z2 = !new b(aVar.a()).a(true);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    context.unbindService(aVar);
                    throw th;
                }
                context.unbindService(aVar);
            }
            if (!z && !z2) {
                g = true;
            }
            return z2;
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            int i = Build.VERSION.SDK_INT;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                a aVar = new a();
                Intent intent = new Intent(b);
                intent.setPackage(a);
                if (!context.bindService(intent, aVar, 1)) {
                    return false;
                }
                context.unbindService(aVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    public static String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(Constants.MD5).digest(str.getBytes(Constants.ENCODING));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e3);
        }
    }
}
