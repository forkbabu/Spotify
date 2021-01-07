package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

/* renamed from: nvc  reason: default package */
public final class nvc {
    private final Picasso a;

    public nvc(Picasso picasso) {
        h.e(picasso, "picasso");
        this.a = picasso;
    }

    public final void a(ImageView imageView, String str, Context context) {
        h.e(str, "imageUri");
        h.e(context, "context");
        if (imageView != null) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.show_art_image_view_size);
            float dimension = context.getResources().getDimension(C0707R.dimen.show_art_image_view_radius);
            Drawable g = yc0.g(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.b(imageView);
            z m = this.a.m(str);
            m.t(g);
            m.g(g);
            m.u(dimensionPixelOffset, dimensionPixelOffset);
            m.o(rwd.g(imageView, d.a(dimension), null));
        }
    }
}
