package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.s;
import com.squareup.picasso.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: zvd  reason: default package */
public class zvd {
    private final List<WeakReference<f0>> a = new ArrayList();
    private final List<WeakReference<ImageView>> b = new ArrayList();
    private final Picasso c;

    zvd(Picasso picasso) {
        picasso.getClass();
        this.c = picasso;
    }

    public void a(ImageView imageView) {
        synchronized (this.b) {
            List<WeakReference<ImageView>> list = this.b;
            imageView.getClass();
            list.add(new WeakReference<>(imageView));
        }
    }

    public void b(f0 f0Var) {
        synchronized (this.a) {
            List<WeakReference<f0>> list = this.a;
            f0Var.getClass();
            list.add(new WeakReference<>(f0Var));
        }
    }

    public void c() {
        synchronized (this.a) {
            for (WeakReference<f0> weakReference : this.a) {
                f0 f0Var = weakReference.get();
                if (f0Var != null) {
                    this.c.c(f0Var);
                }
            }
            this.a.clear();
        }
        synchronized (this.b) {
            for (WeakReference<ImageView> weakReference2 : this.b) {
                ImageView imageView = weakReference2.get();
                if (imageView != null) {
                    this.c.b(imageView);
                }
            }
            this.b.clear();
        }
    }

    public z d(Uri uri) {
        return new s(this, this.c.l(uri));
    }

    public z e(String str) {
        return new s(this, this.c.m(str));
    }
}
