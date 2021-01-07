package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.urc;

/* renamed from: jpc  reason: default package */
public class jpc implements g90 {
    private final kpc a;
    private final urc b;
    private fqc c;
    private final urc.b f;
    private final f0 n = new b();

    /* renamed from: jpc$a */
    class a implements urc.b {
        a() {
        }

        @Override // defpackage.urc.b
        public void a(Drawable drawable) {
            jpc.this.c.d();
        }

        @Override // defpackage.urc.b
        public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
            int b = wrc.b(e7Var);
            int i = 855638016;
            if (ovd.c(855638016, b) <= ovd.c(872415231, b)) {
                i = 872415231;
            }
            jpc.this.c.e(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY, b, i);
        }

        @Override // defpackage.urc.b
        public void onPrepareLoad(Drawable drawable) {
            jpc.this.c.f();
        }
    }

    /* renamed from: jpc$b */
    class b implements f0 {
        b() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            jpc.this.c.a();
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            jpc.this.c.b(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            jpc.this.c.c();
        }
    }

    private jpc(hpc hpc, Context context, ViewGroup viewGroup) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.b = urc;
        a aVar = new a();
        this.f = aVar;
        urc.e(aVar);
        this.a = new lpc(hpc, context, viewGroup);
        getView().setTag(C0707R.id.glue_viewholder_tag, this);
    }

    public static jpc c(hpc hpc, Context context, ViewGroup viewGroup) {
        return new jpc(hpc, context, viewGroup);
    }

    public f0 M1() {
        return this.n;
    }

    public f0 d() {
        return this.b.f();
    }

    public void g(String str, String str2, String str3, boolean z, int i) {
        ((lpc) this.a).h();
        fqc fqc = new fqc(new iqc(), this.a);
        this.c = fqc;
        fqc.g(str.trim(), str2.trim(), str3.trim(), z, i);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return ((lpc) this.a).b();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        ((lpc) this.a).b().setOnClickListener(onClickListener);
    }
}
