package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;

/* renamed from: uk4  reason: default package */
public class uk4 implements tk4 {
    private final kk4 a;

    public uk4(kk4 kk4) {
        this.a = kk4;
    }

    private Drawable b(Context context, String str) {
        int i;
        if (str != null) {
            try {
                i = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                int c = i2.c(context.getResources(), R.color.gray_30, null);
                Logger.h(e, "Not supported color: %s", str);
                i = c;
            }
        } else {
            i = i2.c(context.getResources(), R.color.gray_30, null);
        }
        this.a.getClass();
        return lc0.a(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, 0}), new kc0(context));
    }

    @Override // defpackage.tk4
    public void a(View view, String str, u uVar) {
        Drawable b = b(view.getContext(), str);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(b);
        uVar.o(0.0f);
        uVar.u(b(view.getContext(), str));
    }
}
