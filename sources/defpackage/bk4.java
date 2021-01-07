package defpackage;

import android.graphics.drawable.shapes.OvalShape;

/* renamed from: bk4  reason: default package */
public class bk4 extends OvalShape {
    private final int a;

    public bk4(int i) {
        this.a = i;
    }

    @Override // android.graphics.drawable.shapes.Shape, java.lang.Object, android.graphics.drawable.shapes.RectShape
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bk4) && this.a == ((bk4) obj).a && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.shapes.Shape, java.lang.Object, android.graphics.drawable.shapes.RectShape
    public int hashCode() {
        return (super.hashCode() * 31) + this.a;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.shapes.Shape, android.graphics.drawable.shapes.RectShape
    public void onResize(float f, float f2) {
        float f3 = ((float) this.a) / 2.0f;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        rect().set(f4 - f3, f5 - f3, f4 + f3, f5 + f3);
    }
}
