package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.boa;
import defpackage.urc;
import defpackage.zna;
import io.reactivex.f;
import io.reactivex.t;

/* access modifiers changed from: package-private */
/* renamed from: aoa  reason: default package */
public class aoa implements urc.b {
    private final Picasso a;
    private final Context b;
    private final Uri c;
    private final boa.a d = new zna.b();
    private f<boa> e;
    public final int f;
    private final urc g;

    aoa(Picasso picasso, Context context, Uri uri) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.g = urc;
        this.a = picasso;
        this.b = context;
        this.c = uri;
        urc.e(this);
        this.f = a.b(context, C0707R.color.cat_button_primary_text);
    }

    private void c() {
        f<boa> fVar = this.e;
        if (fVar != null) {
            fVar.onNext(((zna.b) this.d).b());
        }
    }

    @Override // defpackage.urc.b
    public void a(Drawable drawable) {
        zna.b bVar = (zna.b) this.d;
        bVar.a(null);
        zna.b bVar2 = bVar;
        bVar2.d(drawable);
        zna.b bVar3 = bVar2;
        bVar3.e(this.f);
        bVar3.c(-11316397);
        c();
    }

    @Override // defpackage.urc.b
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
        int i;
        int b2 = wrc.b(e7Var);
        boa.a aVar = this.d;
        if (e7Var == null) {
            i = this.f;
        } else {
            i = e7Var.g(this.f);
        }
        zna.b bVar = (zna.b) aVar;
        bVar.e(i);
        zna.b bVar2 = bVar;
        bVar2.a(bitmap);
        zna.b bVar3 = bVar2;
        bVar3.d(null);
        bVar3.c(b2);
        c();
    }

    public void d(t tVar) {
        this.e = tVar;
        z l = this.a.l(this.c);
        l.t(yc0.g(this.b));
        l.g(yc0.g(this.b));
        l.o(this.g.f());
        tVar.e(new yna(this));
    }

    public /* synthetic */ void e() {
        this.e = null;
    }

    @Override // defpackage.urc.b
    public void onPrepareLoad(Drawable drawable) {
        zna.b bVar = (zna.b) this.d;
        bVar.a(null);
        zna.b bVar2 = bVar;
        bVar2.d(drawable);
        zna.b bVar3 = bVar2;
        bVar3.e(this.f);
        bVar3.c(-11316397);
        c();
    }
}
