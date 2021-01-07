package defpackage;

import android.graphics.Color;

/* access modifiers changed from: package-private */
/* renamed from: mvd  reason: default package */
public class mvd implements nvd {
    private final int a;
    private final int b;

    mvd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.nvd
    public int a(float f) {
        int i = this.a;
        int i2 = this.b;
        int i3 = s2.b;
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }
}
