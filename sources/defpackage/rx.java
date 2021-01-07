package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: rx  reason: default package */
public final class rx implements tx {
    private final float a;

    public rx(float f) {
        this.a = f;
    }

    @Override // defpackage.tx
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rx) && this.a == ((rx) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
