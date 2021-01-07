package com.spotify.mobile.android.spotlets.appprotocol.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class c {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Picasso b;
    private final Set<b> c = new HashSet(5);
    private boolean d;

    public interface a {
        void a(Uri uri);

        void b(Uri uri);

        void c(Uri uri, byte[] bArr);
    }

    public final class b implements f0 {
        private final ImageFormat a;
        private final a b;
        private final Uri c;
        private boolean f;
        private final int n;
        private final boolean o;
        private final int p;

        b(a aVar, Uri uri, ImageFormat imageFormat, int i, int i2, boolean z) {
            Logger.l("Loading %s image with uri = \"%s\", size = %d x %d.", imageFormat, uri, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = aVar;
            this.c = uri;
            this.a = imageFormat;
            this.p = i;
            this.n = i2;
            this.o = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            z l = c.this.b.l(this.c);
            l.x(new C0191c(this.p, this.n));
            l.o(this);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.o) {
                Logger.n("Throttled an outstanding image request with uri = \"%s\".", this.c);
                this.f = true;
                this.b.b(this.c);
                synchronized (c.this.c) {
                    c.this.c.remove(this);
                }
            }
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            if (!this.f && !c.this.d) {
                Logger.d("Failed to load image with uri = \"%s\".", this.c);
                this.b.a(this.c);
            }
            synchronized (c.this.c) {
                c.this.c.remove(this);
            }
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            Bitmap.CompressFormat compressFormat;
            MoreObjects.checkArgument(!bitmap.isRecycled());
            if (!this.f && !c.this.d) {
                ImageFormat imageFormat = this.a;
                double width = (double) (bitmap.getWidth() * bitmap.getHeight() * 3);
                Double.isNaN(width);
                Double.isNaN(width);
                Double.isNaN(width);
                Double.isNaN(width);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (width * 0.5d));
                int ordinal = imageFormat.ordinal();
                if (ordinal == 0) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } else if (ordinal == 1) {
                    compressFormat = Bitmap.CompressFormat.JPEG;
                } else {
                    throw new IllegalArgumentException("Invalid image format.");
                }
                bitmap.compress(compressFormat, 90, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Logger.b("Loaded image with uri = \"%s\", size = %d bytes.", this.c, Integer.valueOf(byteArray.length));
                this.b.c(this.c, byteArray);
            }
            synchronized (c.this.c) {
                c.this.c.remove(this);
            }
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.mobile.android.spotlets.appprotocol.image.c$c  reason: collision with other inner class name */
    public static class C0191c implements h0 {
        private final int a;
        private final int b;

        C0191c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.squareup.picasso.h0
        public String a() {
            return String.format(Locale.ENGLISH, "%s%d", C0191c.class.getName(), Integer.valueOf(this.b));
        }

        @Override // com.squareup.picasso.h0
        public Bitmap b(Bitmap bitmap) {
            if (bitmap != null && bitmap.getWidth() == this.a && bitmap.getHeight() == this.b) {
                return bitmap;
            }
            float min = Math.min(((float) this.a) / ((float) bitmap.getWidth()), ((float) this.b) / ((float) bitmap.getHeight()));
            Bitmap createBitmap = Bitmap.createBitmap((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.setScale(min, min);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            if (!bitmap.equals(createBitmap)) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    public c(Picasso picasso) {
        this.b = picasso;
    }

    public void d(b bVar) {
        this.a.post(new b(this, bVar));
        synchronized (this.c) {
            this.c.remove(bVar);
        }
    }

    public /* synthetic */ void e(b bVar) {
        this.b.c(bVar);
    }

    public /* synthetic */ void f(Uri uri, b bVar, a aVar) {
        try {
            Logger.l("Attempting to load image with uri: \"%s\".", uri);
            bVar.a();
        } catch (Exception e) {
            Logger.e(e, "Exception while trying to load image with uri = \"%s\".", uri);
            synchronized (this.c) {
                this.c.remove(bVar);
                aVar.a(uri);
            }
        }
    }

    public Optional<b> g(Uri uri, ImageFormat imageFormat, int i, int i2, boolean z, a aVar) {
        if (this.d) {
            Logger.d("Can't load images after the loader has been stopped.", new Object[0]);
            return Optional.absent();
        }
        b bVar = new b(aVar, uri, imageFormat, i, i2, z);
        synchronized (this.c) {
            this.c.add(bVar);
        }
        this.a.post(new a(this, uri, bVar, aVar));
        return Optional.of(bVar);
    }

    public void h() {
        this.d = true;
        synchronized (this.c) {
            this.c.clear();
        }
    }

    public void i() {
        if (!this.d) {
            synchronized (this.c) {
                for (b bVar : this.c) {
                    bVar.b();
                }
            }
        }
    }
}
