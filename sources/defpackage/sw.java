package defpackage;

import android.animation.TypeEvaluator;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: sw  reason: default package */
public class sw implements TypeEvaluator<Integer> {
    private static final sw a = new sw();

    public static sw a() {
        return a;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d);
        float a2 = je.a(((float) ((intValue2 >> 24) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f, f2, f, f2);
        float a3 = je.a(pow4, pow, f, pow);
        float a4 = je.a((float) Math.pow((double) (((float) ((intValue2 >> 8) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d), pow2, f, pow2);
        float a5 = je.a((float) Math.pow((double) (((float) (intValue2 & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f), 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow((double) a3, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) a5, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a2 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) a4, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
