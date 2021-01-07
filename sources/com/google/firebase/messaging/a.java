package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.k;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    public static class C0135a {
        public final k a;
        public final String b;

        C0135a(k kVar, String str, int i) {
            this.a = kVar;
            this.b = str;
        }
    }

    private static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x036c: APUT  (r1v8 int[]), (0 ??[int, short, byte, char]), (r2v23 int) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0322 A[SYNTHETIC, Splitter:B:149:0x0322] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.messaging.a.C0135a b(android.content.Context r13, com.google.firebase.messaging.o r14) {
        /*
        // Method dump skipped, instructions count: 1017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a.b(android.content.Context, com.google.firebase.messaging.o):com.google.firebase.messaging.a$a");
    }

    private static boolean c(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}
