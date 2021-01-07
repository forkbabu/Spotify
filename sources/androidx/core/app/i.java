package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;

public class i extends n {
    private Bitmap e;
    private Bitmap f;
    private boolean g;

    @Override // androidx.core.app.n
    public void a(g gVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((o) gVar).a()).setBigContentTitle(this.b).bigPicture(this.e);
        if (this.g) {
            bigPicture.bigLargeIcon(this.f);
        }
        if (this.d) {
            bigPicture.setSummaryText(this.c);
        }
    }

    public i j(Bitmap bitmap) {
        this.f = null;
        this.g = true;
        return this;
    }

    public i k(Bitmap bitmap) {
        this.e = bitmap;
        return this;
    }

    public i l(CharSequence charSequence) {
        this.b = k.c(charSequence);
        return this;
    }

    public i m(CharSequence charSequence) {
        this.c = k.c(charSequence);
        this.d = true;
        return this;
    }
}
