package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: p60  reason: default package */
public abstract class p60 extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    public abstract void a(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public abstract void b(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public abstract void c(Context context, o60 o60, int i, y60 y60);

    /* access modifiers changed from: protected */
    public abstract void d(Context context, o60 o60, int[] iArr);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y60 c;
        String action = intent.getAction();
        if ("com.samsung.android.app.spage.action.CARD_UPDATE".equals(action)) {
            d(context, o60.a(), intent.getIntArrayExtra("IdNo"));
        } else if ("com.samsung.android.app.spage.action.CARD_ENABLED".equals(action)) {
            b(context, intent.getIntArrayExtra("IdNo"));
        } else if ("com.samsung.android.app.spage.action.CARD_DISABLED".equals(action)) {
            a(context, intent.getIntArrayExtra("IdNo"));
        } else if ("com.samsung.android.app.spage.action.CARD_EVENT".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras != null && (c = y60.c(extras)) != null) {
                c(context, o60.a(), intent.getIntExtra("IdNo", -1), c);
            }
        } else if ("com.samsung.android.app.spage.action.CARD_INSTANT_UPDATE".equals(action)) {
            if (intent.getIntExtra("updateCode", 0) != 0) {
                o60.a();
                intent.getIntExtra("IdNo", -1);
                return;
            }
            Log.e("CardContentProvider", "wrong update code - zero");
        } else if ("com.samsung.android.app.spage.action.MULTI_INSTANCE_PREFERENCE_UPDATE".equals(action)) {
            o60.a();
            intent.getIntExtra("IdNo", -1);
        }
    }
}
