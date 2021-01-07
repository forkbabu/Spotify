package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* access modifiers changed from: package-private */
/* renamed from: gr9  reason: default package */
public class gr9 {
    private final Picasso a;
    private final int b;
    private final int c;
    private final int d;

    public gr9(Picasso picasso, Context context) {
        this.a = picasso;
        this.d = nud.g(180.0f, context.getResources());
        this.b = a.b(context, R.color.gray_7);
        this.c = a.b(context, R.color.black);
    }

    /* access modifiers changed from: private */
    public void c(View view, int i, float f, int i2) {
        er9 er9 = new er9(this.d, i, this.b, f, i2);
        int i3 = q4.g;
        int i4 = Build.VERSION.SDK_INT;
        view.setBackground(er9);
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        c(view, this.c, 0.7f, 1);
    }

    /* access modifiers changed from: package-private */
    public void e(View view, p81 p81, int i) {
        String string = p81.string("startColor");
        String string2 = p81.string("startColorFromImage");
        float floatValue = p81.floatValue("overlayDarkness", 0.7f);
        if (!TextUtils.isEmpty(string)) {
            int i2 = this.c;
            try {
                i2 = Color.parseColor(string);
            } catch (IllegalArgumentException unused) {
                c(view, this.c, floatValue, i);
            }
            c(view, i2, floatValue, i);
        } else if (!TextUtils.isEmpty(string2)) {
            owd owd = new owd(new fr9(this, view, floatValue, i));
            view.setTag(owd);
            z l = this.a.l(!TextUtils.isEmpty(string2) ? Uri.parse(string2) : Uri.EMPTY);
            l.x(fwd.b);
            l.o(owd);
        } else {
            c(view, this.c, floatValue, i);
        }
    }
}
