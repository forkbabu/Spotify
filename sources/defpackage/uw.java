package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.WeakHashMap;

/* renamed from: uw  reason: default package */
public class uw extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new uw();
    private final WeakHashMap<Drawable, Integer> a = new WeakHashMap<>();

    private uw() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable2.getAlpha());
        }
        if (this.a.containsKey(drawable2)) {
            return this.a.get(drawable2);
        }
        return Integer.valueOf((int) BitmapRenderer.ALPHA_VISIBLE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        Drawable drawable2 = drawable;
        Integer num2 = num;
        if (Build.VERSION.SDK_INT < 19) {
            this.a.put(drawable2, num2);
        }
        drawable2.setAlpha(num2.intValue());
    }
}
