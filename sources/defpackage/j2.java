package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: j2  reason: default package */
public final class j2 {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private j2(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c4, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.j2 a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2.a(android.content.res.Resources, int, android.content.res.Resources$Theme):j2");
    }

    static j2 b(int i) {
        return new j2(null, null, i);
    }

    public static j2 e(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int c() {
        return this.c;
    }

    public Shader d() {
        return this.a;
    }

    public boolean f() {
        return this.a != null;
    }

    public boolean g() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean h(int[] iArr) {
        if (g()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void i(int i) {
        this.c = i;
    }

    public boolean j() {
        return f() || this.c != 0;
    }
}
