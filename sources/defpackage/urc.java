package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.e7;

/* renamed from: urc  reason: default package */
public class urc {
    private final trc a;
    private b b;
    private c c;
    private final f0 d = new a();

    /* renamed from: urc$a */
    class a implements f0 {
        a() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            urc.this.b.a(drawable);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            urc urc = urc.this;
            urc.c = new c(urc.a, urc.this.b, bitmap, loadedFrom, null);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            if (urc.this.c != null) {
                c.b(urc.this.c);
                urc.this.c = null;
            }
            urc.this.b.onPrepareLoad(drawable);
        }
    }

    /* renamed from: urc$b */
    public interface b {
        void a(Drawable drawable);

        void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var);

        void onPrepareLoad(Drawable drawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: urc$c */
    public static class c implements e7.d {
        private final b a;
        private final Bitmap b;
        private final Picasso.LoadedFrom c;
        private boolean d;

        c(trc trc, b bVar, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, a aVar) {
            this.a = bVar;
            this.b = bitmap;
            this.c = loadedFrom;
            trc.a(bitmap, this);
        }

        static void b(c cVar) {
            cVar.d = true;
        }

        @Override // defpackage.e7.d
        public void a(e7 e7Var) {
            if (!this.d) {
                this.a.b(this.b, this.c, e7Var);
            }
        }
    }

    public urc(trc trc) {
        this.a = trc;
    }

    public void e(b bVar) {
        bVar.getClass();
        this.b = bVar;
    }

    public f0 f() {
        MoreObjects.checkState(this.b != null, "Did you forget to set a listener?");
        return this.d;
    }
}
