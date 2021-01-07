package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zb  reason: default package */
public class zb {
    private final h<String> a = new h<>();
    private final Map<h<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private final AssetManager d;
    private String e = ".ttf";

    public zb(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            ae.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    public Typeface a(String str, String str2) {
        this.a.a(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = this.c.get(str);
        if (typeface2 == null) {
            StringBuilder Z0 = je.Z0("fonts/", str);
            Z0.append(this.e);
            typeface2 = Typeface.createFromAsset(this.d, Z0.toString());
            this.c.put(str, typeface2);
        }
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface2.getStyle() != i) {
            typeface2 = Typeface.create(typeface2, i);
        }
        this.b.put(this.a, typeface2);
        return typeface2;
    }
}
