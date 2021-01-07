package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* renamed from: owd  reason: default package */
public class owd<T extends View> implements f0 {
    public static final e<View> n = new b();
    private final T a;
    private final e<T> b;
    private final d c;
    private c f;

    /* renamed from: owd$a */
    class a implements c {
        a() {
        }
    }

    /* renamed from: owd$b */
    static class b implements e<View> {
        b() {
        }

        @Override // defpackage.owd.e
        public void a(View view, Drawable drawable) {
        }

        @Override // defpackage.owd.e
        public void b(View view, int i) {
            Drawable e = nud.e(view.getContext(), i);
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            view.setBackground(e);
        }

        @Override // defpackage.owd.e
        public void c(View view, Drawable drawable) {
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            view.setBackground(null);
        }
    }

    /* renamed from: owd$c */
    interface c {
    }

    /* renamed from: owd$d */
    public interface d {
        void a(int i);

        void b(Drawable drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: owd$e */
    public interface e<T extends View> {
        void a(T t, Drawable drawable);

        void b(T t, int i);

        void c(T t, Drawable drawable);
    }

    public owd(T t, e<T> eVar) {
        this.f = new a();
        this.b = eVar;
        t.getClass();
        this.a = t;
        this.c = null;
        t.setTag(C0707R.id.glue_color_target_tag, this);
    }

    static void a(owd owd, int i) {
        d dVar = owd.c;
        if (dVar != null) {
            dVar.a(i);
        }
        e<T> eVar = owd.b;
        if (eVar != null) {
            eVar.b(owd.a, i);
        }
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.b(drawable);
        }
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.c(this.a, drawable);
        }
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            int pixel = bitmap.getPixel(0, 0);
            d dVar = this.c;
            if (dVar != null) {
                dVar.a(pixel);
            }
            e<T> eVar = this.b;
            if (eVar != null) {
                eVar.b(this.a, pixel);
            }
        } else {
            a aVar = (a) this.f;
            aVar.getClass();
            kvd.a(bitmap).b(new nwd(aVar));
        }
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(this.a, drawable);
        }
    }

    public owd(d dVar) {
        this.f = new a();
        this.b = null;
        this.a = null;
        this.c = dVar;
    }
}
