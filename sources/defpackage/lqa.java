package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;

/* renamed from: lqa  reason: default package */
public class lqa {
    private static final Object d = new Object();
    private final Context a;
    private final Picasso b;
    private final jqa c;

    public lqa(Context context, Picasso picasso, jqa jqa) {
        this.a = context;
        this.b = picasso;
        this.c = jqa;
    }

    public void a(ImageView imageView, String str, String str2, String str3, boolean z, Integer num) {
        int i;
        pud pud;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.a.getResources().getColor(iqa.b(str2));
        }
        if (!MoreObjects.isNullOrEmpty(str3)) {
            str2 = str3;
        }
        if (MoreObjects.isNullOrEmpty(str)) {
            Object tag = imageView.getTag(C0707R.id.picasso_target);
            if (tag instanceof f0) {
                this.b.c((f0) tag);
            }
            imageView.setImageDrawable(this.c.a(str2, z, i));
            return;
        }
        jqa jqa = this.c;
        jqa.getClass();
        if (z) {
            pud = new gqa(jqa);
        } else {
            pud = b.a();
        }
        Drawable a2 = this.c.a(str2, z, i);
        z m = this.b.m(str);
        m.g(a2);
        m.w(d);
        m.o(rwd.g(imageView, pud, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
