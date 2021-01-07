package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* access modifiers changed from: package-private */
/* renamed from: oj7  reason: default package */
public class oj7 implements f0, tc0 {
    private final Picasso a;
    private final uj7 b;
    private final ij7 c;
    private ImageView f;
    private View n;

    oj7(Picasso picasso, uj7 uj7, ij7 ij7) {
        this.a = picasso;
        this.b = uj7;
        this.c = ij7;
    }

    public void a(View view, s81 s81) {
        this.n = view.findViewById(C0707R.id.image_gradient_overlay);
        this.f = (ImageView) view.findViewById(C0707R.id.image);
        x81 main = s81.images().main();
        this.a.m(main != null ? main.uri() : null).o(this);
    }

    @Override // defpackage.tc0
    public void e0(int i, float f2) {
        ImageView imageView = this.f;
        if (imageView != null && this.n != null) {
            imageView.setTranslationY((float) (-i));
            this.f.setAlpha(1.0f - f2);
            this.n.setAlpha(f2);
            if (f2 <= 0.5f) {
                float f3 = 1.5f - f2;
                this.f.setScaleY(f3);
                this.f.setScaleX(f3);
            }
        }
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        Assertion.g(exc.getMessage());
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        int i;
        this.f.setImageBitmap(bitmap);
        uj7 uj7 = this.b;
        Context context = this.n.getContext();
        ij7 ij7 = this.c;
        Context context2 = this.n.getContext();
        ij7.getClass();
        kvd a2 = kvd.a(bitmap).a();
        Resources resources = context2.getResources();
        int i2 = R.color.gray_30;
        String format = String.format("#%06X", Integer.valueOf(a2.c(i2.c(resources, i2, null)) & 16777215));
        uj7.getClass();
        if (format != null) {
            try {
                i = Color.parseColor(format);
            } catch (IllegalArgumentException unused) {
                i = i2.c(context.getResources(), R.color.gray_30, null);
            }
        } else {
            i = i2.c(context.getResources(), i2, null);
        }
        this.n.setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, 0}));
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
