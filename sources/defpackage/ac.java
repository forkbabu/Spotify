package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.b;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ac  reason: default package */
public class ac {
    private static final Object e = new Object();
    private final Context a;
    private String b;
    private b c;
    private final Map<String, g> d;

    public ac(Drawable.Callback callback, String str, b bVar, Map<String, g> map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.b = je.H0(new StringBuilder(), this.b, '/');
            }
        }
        if (!(callback instanceof View)) {
            ae.c("LottieDrawable must be inside of a view for images to work.");
            this.d = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.d = map;
        this.c = bVar;
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        g gVar = this.d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a2 = gVar.a();
        if (a2 != null) {
            return a2;
        }
        b bVar = this.c;
        if (bVar != null) {
            Bitmap a3 = bVar.a(gVar);
            if (a3 != null) {
                c(str, a3);
            }
            return a3;
        }
        String b2 = gVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b2.startsWith("data:") || b2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.b)) {
                    AssetManager assets = this.a.getAssets();
                    Bitmap f = ee.f(BitmapFactory.decodeStream(assets.open(this.b + b2), null, options), gVar.e(), gVar.c());
                    c(str, f);
                    return f;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e2) {
                ae.d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b2.substring(b2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                c(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e3) {
                ae.d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public void d(b bVar) {
        this.c = bVar;
    }
}
