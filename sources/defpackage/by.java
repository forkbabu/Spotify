package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: by  reason: default package */
public final class by implements tx {
    private final float a;

    public by(float f) {
        this.a = f;
    }

    @Override // defpackage.tx
    public float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof by) && this.a == ((by) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
