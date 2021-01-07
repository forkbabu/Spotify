package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: t3d  reason: default package */
class t3d extends dwd {
    final /* synthetic */ View b;

    t3d(s3d s3d, View view) {
        this.b = view;
    }

    @Override // defpackage.dwd
    public void onColorExtracted(int i) {
        View view = this.b;
        GradientDrawable b2 = s3d.b(i);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        view.setBackground(b2);
    }
}
