package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: sx  reason: default package */
public final class sx implements tx {
    private final tx a;
    private final float b;

    public sx(float f, tx txVar) {
        while (txVar instanceof sx) {
            txVar = ((sx) txVar).a;
            f += ((sx) txVar).b;
        }
        this.a = txVar;
        this.b = f;
    }

    @Override // defpackage.tx
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        if (!this.a.equals(sxVar.a) || this.b != sxVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
