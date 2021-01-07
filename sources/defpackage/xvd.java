package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: xvd  reason: default package */
public final /* synthetic */ class xvd implements pud {
    public final /* synthetic */ ImageView a;

    public /* synthetic */ xvd(ImageView imageView) {
        this.a = imageView;
    }

    @Override // defpackage.pud
    public final Drawable createDrawable(Bitmap bitmap) {
        return new BitmapDrawable(this.a.getResources(), bitmap);
    }
}
