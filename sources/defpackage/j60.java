package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;

/* renamed from: j60  reason: default package */
public class j60 {
    public static boolean b = false;
    public Context a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com.samsung.android.rubin.app"
            boolean r1 = defpackage.j60.b
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r7 == 0) goto L_0x0068
            boolean r1 = com.samsung.android.sdk.a.a()
            r2 = 0
            if (r1 == 0) goto L_0x0060
            r1 = 1
            java.lang.String r3 = defpackage.i.b(r7, r0)     // Catch:{ Exception -> 0x0029 }
            if (r3 == 0) goto L_0x002d
            java.lang.String r4 = "android"
            java.lang.String r4 = defpackage.i.b(r7, r4)     // Catch:{ Exception -> 0x0029 }
            if (r4 == 0) goto L_0x0024
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r3 == 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x0029:
            r3 = move-exception
            r3.printStackTrace()
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 == 0) goto L_0x0058
            java.lang.String r3 = "SupportCustomizationServiceSDK"
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ Exception -> 0x004d }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo(r0, r5)     // Catch:{ Exception -> 0x004d }
            if (r0 == 0) goto L_0x0051
            android.os.Bundle r0 = r0.metaData     // Catch:{ Exception -> 0x004d }
            if (r0 == 0) goto L_0x0051
            boolean r4 = r0.containsKey(r3)     // Catch:{ Exception -> 0x004d }
            if (r4 == 0) goto L_0x0051
            boolean r2 = r0.getBoolean(r3, r2)     // Catch:{ Exception -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0051:
            if (r2 == 0) goto L_0x0058
            defpackage.j60.b = r1
            r6.a = r7
            return
        L_0x0058:
            com.samsung.android.sdk.SsdkUnsupportedException r7 = new com.samsung.android.sdk.SsdkUnsupportedException
            java.lang.String r0 = "This device is not support customizationService."
            r7.<init>(r0, r1)
            throw r7
        L_0x0060:
            com.samsung.android.sdk.SsdkUnsupportedException r7 = new com.samsung.android.sdk.SsdkUnsupportedException
            java.lang.String r0 = "This device is not samsung product."
            r7.<init>(r0, r2)
            throw r7
        L_0x0068:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context is invalid"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j60.a(android.content.Context):void");
    }

    public boolean b(int i) {
        if (i == 1) {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.samsung.android.rubin.app", 8);
                if (packageInfo != null) {
                    ProviderInfo[] providerInfoArr = packageInfo.providers;
                    if (providerInfoArr != null) {
                        for (ProviderInfo providerInfo : providerInfoArr) {
                            if ("com.samsung.android.customizationservice.context.tpocontext".equals(providerInfo.authority)) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }
}
