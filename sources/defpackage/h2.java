package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;

/* renamed from: h2  reason: default package */
public class h2 {

    /* access modifiers changed from: package-private */
    /* renamed from: h2$a */
    public class a extends BroadcastReceiver {
        final /* synthetic */ IntentSender a;

        a(IntentSender intentSender) {
            this.a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0032 A[EDGE_INSN: B:29:0x0032->B:9:0x0032 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r13, defpackage.g2 r14, android.content.IntentSender r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0017
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r13 = r13.getSystemService(r0)
            android.content.pm.ShortcutManager r13 = (android.content.pm.ShortcutManager) r13
            android.content.pm.ShortcutInfo r14 = r14.a()
            boolean r13 = r13.requestPinShortcut(r14, r15)
            return r13
        L_0x0017:
            java.lang.String r2 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r3 = 0
            r4 = 1
            if (r0 < r1) goto L_0x002a
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r13.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            goto L_0x0062
        L_0x002a:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.a.a(r13, r0)
            if (r1 == 0) goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0062
        L_0x0034:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r2)
            java.util.List r1 = r1.queryBroadcastReceivers(r5, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0045:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r1.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.permission
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0061
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0045
        L_0x0061:
            r0 = 1
        L_0x0062:
            if (r0 != 0) goto L_0x0065
            return r3
        L_0x0065:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r2)
            android.content.Intent[] r0 = r14.c
            int r1 = r0.length
            int r1 = r1 + -1
            r0 = r0[r1]
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r0 = r6.putExtra(r1, r0)
            java.lang.CharSequence r1 = r14.d
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.extra.shortcut.NAME"
            r0.putExtra(r2, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r14.e
            if (r0 == 0) goto L_0x008c
            r1 = 0
            android.content.Context r14 = r14.a
            r0.a(r6, r1, r14)
        L_0x008c:
            if (r15 != 0) goto L_0x0092
            r13.sendBroadcast(r6)
            return r4
        L_0x0092:
            r7 = 0
            h2$a r8 = new h2$a
            r8.<init>(r15)
            r9 = 0
            r10 = -1
            r11 = 0
            r12 = 0
            r5 = r13
            r5.sendOrderedBroadcast(r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.a(android.content.Context, g2, android.content.IntentSender):boolean");
    }
}
