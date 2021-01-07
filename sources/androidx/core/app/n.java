package androidx.core.app;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.music.C0707R;

public abstract class n {
    protected k a;
    CharSequence b;
    CharSequence c;
    boolean d = false;

    private Bitmap d(IconCompat iconCompat, int i, int i2) {
        Drawable m = iconCompat.m(this.a.a);
        int intrinsicWidth = i2 == 0 ? m.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = m.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        m.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            m.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        m.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private Bitmap e(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap d2 = d(IconCompat.e(this.a.a, C0707R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(d2);
        Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return d2;
    }

    public abstract void a(g gVar);

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews b(boolean r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.n.b(boolean, int, boolean):android.widget.RemoteViews");
    }

    /* access modifiers changed from: package-private */
    public Bitmap c(IconCompat iconCompat, int i) {
        return d(iconCompat, i, 0);
    }

    public RemoteViews f(g gVar) {
        return null;
    }

    public RemoteViews g(g gVar) {
        return null;
    }

    public RemoteViews h(g gVar) {
        return null;
    }

    public void i(k kVar) {
        if (this.a != kVar) {
            this.a = kVar;
            if (kVar.k != this) {
                kVar.k = this;
                i(kVar);
            }
        }
    }
}
