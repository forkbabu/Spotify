package com.squareup.picasso;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

public class r {
    private final c0 a;
    private final Context b;
    private final Set<String> c = new HashSet();
    private boolean d;

    public r(c0 c0Var, Context context) {
        this.a = c0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public static void a(r rVar) {
        for (String str : rVar.c) {
            rVar.d("uri_timeout", str);
        }
    }

    /* access modifiers changed from: private */
    public Void d(String str, String str2) {
        Intent intent = new Intent("image-load-event");
        intent.putExtra("event", str);
        intent.putExtra("uri", str2);
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1670636944:
                if (str.equals("uri_failed")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1060732754:
                if (str.equals("uri_started")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1617603406:
                if (str.equals("uri_succeeded")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 2:
                this.c.remove(str2);
                break;
            case 1:
                this.c.add(str2);
                break;
        }
        e6.b(this.b).d(intent);
        return null;
    }

    public z c(Uri uri) {
        if (uri != null) {
            d("uri_started", uri.toString());
        }
        z b2 = this.a.b(uri);
        if (!this.d) {
            this.d = new Handler().postDelayed(new a(this), 120000);
        }
        return new q(this.a.a(), new b(this), b2, uri);
    }
}
