package com.spotify.android.recaptcha;

import android.app.Activity;
import com.google.android.gms.internal.recaptcha.d3;
import com.google.android.gms.internal.recaptcha.e;
import com.google.android.gms.recaptcha.c;
import java.util.concurrent.ExecutorService;

public class k {
    private final c a;

    public k(Activity activity) {
        ExecutorService executorService = e.a;
        this.a = new d3(activity);
    }

    /* access modifiers changed from: protected */
    public c a() {
        return this.a;
    }
}
