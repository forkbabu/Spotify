package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import com.squareup.picasso.f0;
import com.squareup.picasso.g;
import com.squareup.picasso.l;
import com.squareup.picasso.t;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: rwd  reason: default package */
public class rwd {
    private Picasso a;
    private final Context b;
    private final l c;
    private final List<a0> d;
    private final Optional<ExecutorService> e;

    /* renamed from: rwd$a */
    public static final class a implements f0 {
        private final ImageView a;
        private pud b;
        private g c;
        private final boolean f;

        a(ImageView imageView, pud pud, boolean z) {
            this.a = imageView;
            this.b = pud;
            this.f = z;
        }

        /* access modifiers changed from: package-private */
        public void b(g gVar) {
            this.c = gVar;
        }

        /* access modifiers changed from: package-private */
        public void c(pud pud) {
            this.b = pud;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a == this.a && aVar.b == this.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            g gVar = this.c;
            if (gVar != null) {
                gVar.onError(exc);
            }
            this.a.setImageDrawable(drawable);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            g gVar = this.c;
            if (gVar != null) {
                gVar.onSuccess();
            }
            if (this.c instanceof dwd) {
                kvd.a(bitmap).b(new qwd(this));
            }
            ImageView imageView = this.a;
            Drawable createDrawable = this.b.createDrawable(bitmap);
            boolean z = this.f;
            int i = iwd.j;
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
            imageView.setImageDrawable(new iwd(imageView.getContext(), createDrawable, drawable, loadedFrom, z));
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            ImageView imageView = this.a;
            int i = iwd.j;
            imageView.setImageDrawable(drawable);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) imageView.getDrawable()).start();
            }
        }
    }

    rwd(Context context, l lVar, List<a0> list, Optional<ExecutorService> optional) {
        z42.a("Not called on main looper");
        this.b = context;
        this.c = lVar;
        this.d = list;
        this.e = optional;
    }

    private void a() {
        if (this.a == null) {
            Picasso.b bVar = new Picasso.b(this.b);
            if (this.e.isPresent()) {
                bVar.e(this.e.get());
            }
            for (a0 a0Var : this.d) {
                bVar.a(a0Var);
            }
            bVar.d(this.c);
            if (Build.VERSION.SDK_INT <= 18) {
                bVar.c(Bitmap.Config.RGB_565);
                bVar.g(new pwd(new t(b(this.b) / 2)));
            } else {
                bVar.g(new pwd(new t(b(this.b))));
            }
            bVar.f(wvd.a);
            this.a = bVar.b();
        }
    }

    private static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return Math.max(memoryClass, 16) * 149796;
    }

    public static f0 c(ImageView imageView) {
        return g(imageView, b.a(), null);
    }

    public static f0 f(ImageView imageView, pud pud) {
        return g(imageView, pud, null);
    }

    public static f0 g(ImageView imageView, pud pud, g gVar) {
        imageView.getClass();
        pud.getClass();
        a aVar = (a) imageView.getTag(C0707R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, pud, false);
            imageView.setTag(C0707R.id.picasso_target, aVar);
        }
        aVar.b(gVar);
        aVar.c(pud);
        return aVar;
    }

    public static f0 h(ImageView imageView, dwd dwd) {
        imageView.getClass();
        a aVar = (a) imageView.getTag(C0707R.id.picasso_target);
        if (aVar == null) {
            aVar = new a(imageView, new xvd(imageView), false);
            imageView.setTag(C0707R.id.picasso_target, aVar);
        }
        aVar.b(dwd);
        return aVar;
    }

    @Deprecated
    public synchronized zvd d() {
        synchronized (this) {
            a();
        }
        return new zvd(this.a);
        return new zvd(this.a);
    }

    @Deprecated
    public synchronized Picasso e() {
        a();
        return this.a;
    }
}
