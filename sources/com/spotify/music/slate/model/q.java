package com.spotify.music.slate.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public abstract class q implements Parcelable {
    public static q c(int i) {
        return new h(new i(i), null);
    }

    public static q e(Uri uri) {
        return new h(new l(uri), null);
    }

    public void a(ImageView imageView, Picasso picasso, dwd dwd, l3d l3d) {
        qud qud;
        z p1 = f().p1(picasso);
        n b = b();
        if (l3d == null || b == null) {
            qud = null;
        } else {
            qud = l3d.a(b);
            Drawable b2 = ((o3d) qud).b();
            p1 = p1.t(b2).g(b2);
        }
        if (dwd == null && qud == null) {
            p1.m(imageView);
        } else if (dwd == null) {
            p1.o(rwd.g(imageView, qud, null));
        } else if (qud == null) {
            p1.o(rwd.h(imageView, dwd));
        } else {
            p1.o(rwd.g(imageView, qud, dwd));
        }
    }

    /* access modifiers changed from: protected */
    public abstract n b();

    /* access modifiers changed from: protected */
    public abstract o f();
}
