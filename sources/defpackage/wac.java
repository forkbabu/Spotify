package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: wac  reason: default package */
public final /* synthetic */ class wac implements Runnable {
    public final /* synthetic */ Context a;

    public /* synthetic */ wac(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
    }
}
