package com.spotify.glue.dialogs;

import android.app.Activity;
import android.content.Context;
import com.squareup.picasso.z;

public class g {
    private final Context a;

    public g(Activity activity) {
        this.a = activity;
    }

    public f a(String str, String str2, z zVar) {
        Context context = this.a;
        n nVar = new n(false);
        str.getClass();
        nVar.f(str);
        str2.getClass();
        nVar.d(str2);
        nVar.e(zVar);
        return new f(context, nVar);
    }

    public f b(String str) {
        Context context = this.a;
        o oVar = new o();
        str.getClass();
        oVar.d(str);
        return new f(context, oVar);
    }

    public f c(CharSequence charSequence, CharSequence charSequence2) {
        return m.c(this.a, charSequence, charSequence2);
    }

    public g(Context context) {
        this.a = context;
    }
}
