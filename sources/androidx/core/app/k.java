package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.spotify.music.C0707R;
import java.util.ArrayList;

public class k {
    @Deprecated
    public ArrayList<String> A;
    public Context a;
    public ArrayList<h> b = new ArrayList<>();
    ArrayList<h> c = new ArrayList<>();
    CharSequence d;
    CharSequence e;
    PendingIntent f;
    Bitmap g;
    int h;
    int i;
    boolean j = true;
    n k;
    CharSequence l;
    int m;
    int n;
    boolean o;
    String p;
    boolean q = false;
    String r;
    Bundle s;
    int t = 0;
    int u = 0;
    RemoteViews v;
    RemoteViews w;
    String x;
    boolean y;
    Notification z;

    public k(Context context, String str) {
        Notification notification = new Notification();
        this.z = notification;
        this.a = context;
        this.x = str;
        notification.when = System.currentTimeMillis();
        this.z.audioStreamType = -1;
        this.i = 0;
        this.A = new ArrayList<>();
        this.y = true;
    }

    protected static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    private void o(int i2, boolean z2) {
        if (z2) {
            Notification notification = this.z;
            notification.flags = i2 | notification.flags;
            return;
        }
        Notification notification2 = this.z;
        notification2.flags = (i2 ^ -1) & notification2.flags;
    }

    public k A(Uri uri) {
        Notification notification = this.z;
        notification.sound = uri;
        notification.audioStreamType = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        return this;
    }

    public k B(n nVar) {
        if (this.k != nVar) {
            this.k = nVar;
            nVar.i(this);
        }
        return this;
    }

    public k C(CharSequence charSequence) {
        this.l = c(charSequence);
        return this;
    }

    public k D(CharSequence charSequence) {
        this.z.tickerText = c(charSequence);
        return this;
    }

    public k E(long[] jArr) {
        this.z.vibrate = jArr;
        return this;
    }

    public k F(int i2) {
        this.u = i2;
        return this;
    }

    public k G(long j2) {
        this.z.when = j2;
        return this;
    }

    public Notification a() {
        return new o(this).b();
    }

    public long b() {
        if (this.j) {
            return this.z.when;
        }
        return 0;
    }

    public k d(boolean z2) {
        o(16, z2);
        return this;
    }

    public k e(String str) {
        this.r = str;
        return this;
    }

    public k f(String str) {
        this.x = str;
        return this;
    }

    public k g(int i2) {
        this.t = i2;
        return this;
    }

    public k h(PendingIntent pendingIntent) {
        this.f = pendingIntent;
        return this;
    }

    public k i(CharSequence charSequence) {
        this.e = c(charSequence);
        return this;
    }

    public k j(CharSequence charSequence) {
        this.d = c(charSequence);
        return this;
    }

    public k k(RemoteViews remoteViews) {
        this.w = remoteViews;
        return this;
    }

    public k l(RemoteViews remoteViews) {
        this.v = remoteViews;
        return this;
    }

    public k m(int i2) {
        Notification notification = this.z;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
        return this;
    }

    public k n(PendingIntent pendingIntent) {
        this.z.deleteIntent = pendingIntent;
        return this;
    }

    public k p(String str) {
        this.p = str;
        return this;
    }

    public k q(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0707R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d2 = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d2);
                Double.isNaN(max);
                Double.isNaN(d2);
                Double.isNaN(max);
                double d3 = d2 / max;
                double d4 = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(d4);
                Double.isNaN(max2);
                Double.isNaN(d4);
                Double.isNaN(max2);
                double min = Math.min(d3, d4 / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                Double.isNaN(width);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.g = bitmap;
        return this;
    }

    public k r(int i2, int i3, int i4) {
        Notification notification = this.z;
        notification.ledARGB = i2;
        notification.ledOnMS = i3;
        notification.ledOffMS = i4;
        notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & -2);
        return this;
    }

    public k s(boolean z2) {
        this.q = z2;
        return this;
    }

    public k t(int i2) {
        this.h = i2;
        return this;
    }

    public k u(boolean z2) {
        o(2, z2);
        return this;
    }

    public k v(boolean z2) {
        o(8, z2);
        return this;
    }

    public k w(int i2) {
        this.i = i2;
        return this;
    }

    public k x(int i2, int i3, boolean z2) {
        this.m = i2;
        this.n = i3;
        this.o = z2;
        return this;
    }

    public k y(boolean z2) {
        this.j = z2;
        return this;
    }

    public k z(int i2) {
        this.z.icon = i2;
        return this;
    }
}
