package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;

/* renamed from: i84  reason: default package */
public class i84 implements h84 {
    private final y74 a;

    public i84(y74 y74) {
        this.a = y74;
    }

    @Override // defpackage.h84
    public void a(View view, String str) {
        int i;
        Context context = view.getContext();
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
        mc0 a2 = lc0.a(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, 0}), new kc0(context));
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.setBackground(a2);
    }
}
