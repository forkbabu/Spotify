package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: w40  reason: default package */
public class w40 {
    public static final w40 b = new w40(BitmapRenderer.ALPHA_VISIBLE);
    private int a;

    private w40(int i) {
        this.a = i;
    }

    public static w40 a(int i) {
        w40 w40 = b;
        if (i == 255) {
            return w40;
        }
        return new w40(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AspectRatio{");
        sb.append("value=");
        return je.A0(sb, this.a, '}');
    }
}
