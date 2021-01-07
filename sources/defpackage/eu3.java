package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.squareup.picasso.Picasso;

/* renamed from: eu3  reason: default package */
public class eu3 {
    private final qt3 a;
    private final pt3 b;
    private final Picasso c;

    public eu3(qt3 qt3, pt3 pt3, Picasso picasso) {
        this.a = qt3;
        this.b = pt3;
        this.c = picasso;
    }

    public View a(Context context, boolean z, String str) {
        boolean f = this.b.f();
        pt3 pt3 = this.b;
        pt3.getClass();
        if ((!(!TextUtils.isEmpty(str) && pt3.e(str) != null) && !f) || !z) {
            return null;
        }
        du3 du3 = new du3(context);
        this.a.g(str);
        du3.setPicasso(this.c);
        du3.setListener(this.a);
        return du3;
    }
}
