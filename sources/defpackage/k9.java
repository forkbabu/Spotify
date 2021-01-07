package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.j;

/* renamed from: k9  reason: default package */
public class k9 extends m9<Boolean> {
    private static final String i = j.f("BatteryChrgTracker");

    public k9(Context context, na naVar) {
        super(context, naVar);
    }

    @Override // defpackage.n9
    public Object b() {
        int intExtra;
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            j.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.m9
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r9.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L_0x0055;
     */
    @Override // defpackage.m9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r9 = r9.getAction()
            if (r9 != 0) goto L_0x000b
            return
        L_0x000b:
            androidx.work.j r1 = androidx.work.j.c()
            java.lang.String r2 = defpackage.k9.i
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r9
            java.lang.String r6 = "Received %s"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.a(r2, r4, r6)
            int r1 = r9.hashCode()
            r2 = 3
            r4 = 2
            switch(r1) {
                case -1886648615: goto L_0x004d;
                case -54942926: goto L_0x0042;
                case 948344062: goto L_0x0037;
                case 1019184907: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0035
            goto L_0x0055
        L_0x0035:
            r5 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0040
            goto L_0x0055
        L_0x0040:
            r5 = 2
            goto L_0x0056
        L_0x0042:
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            r5 = 1
            goto L_0x0056
        L_0x004d:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0056
        L_0x0055:
            r5 = -1
        L_0x0056:
            if (r5 == 0) goto L_0x006b
            if (r5 == r3) goto L_0x0067
            if (r5 == r4) goto L_0x0063
            if (r5 == r2) goto L_0x005f
            goto L_0x006e
        L_0x005f:
            r7.d(r0)
            goto L_0x006e
        L_0x0063:
            r7.d(r0)
            goto L_0x006e
        L_0x0067:
            r7.d(r8)
            goto L_0x006e
        L_0x006b:
            r7.d(r8)
        L_0x006e:
            return
            switch-data {-1886648615->0x004d, -54942926->0x0042, 948344062->0x0037, 1019184907->0x002c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9.h(android.content.Context, android.content.Intent):void");
    }
}
