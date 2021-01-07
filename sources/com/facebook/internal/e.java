package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.k;
import com.facebook.login.b;
import defpackage.i1;

public class e {
    private Uri a;

    public e(String str, Bundle bundle) {
        this.a = a(str, bundle == null ? new Bundle() : bundle);
    }

    public static Uri a(String str, Bundle bundle) {
        String a2 = d0.a();
        return f0.c(a2, k.n() + "/dialog/" + str, bundle);
    }

    public void b(Activity activity, String str) {
        i1 a2 = new i1.a(b.c()).a();
        a2.a.setPackage(str);
        a2.a.addFlags(1073741824);
        a2.a(activity, this.a);
    }
}
