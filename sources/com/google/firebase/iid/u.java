package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

final /* synthetic */ class u implements Callable {
    private final Intent a;

    u(Intent intent) {
        this.a = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Intent intent = this.a;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                stringExtra.length();
                valueOf.length();
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.k().w();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.k().g();
            }
        }
        return -1;
    }
}
