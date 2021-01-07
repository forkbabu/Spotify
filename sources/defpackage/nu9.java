package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.imagepicker.b;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: nu9  reason: default package */
public final class nu9 implements ju9 {
    private final p a = new p();
    private Uri b;
    private Uri c;
    private Uri d;
    private final y e;
    private final y f;
    private final eu9 g;
    private final b.a h;
    private final qu9 i;

    public nu9(y yVar, y yVar2, eu9 eu9, b.a aVar, qu9 qu9) {
        h.e(yVar, "mainThreadScheduler");
        h.e(yVar2, "ioScheduler");
        h.e(eu9, "imageFileHelper");
        h.e(aVar, "configurationProvider");
        h.e(qu9, "viewBinder");
        this.e = yVar;
        this.f = yVar2;
        this.g = eu9;
        this.h = aVar;
        this.i = qu9;
        qu9.i(this);
        Uri uri = Uri.EMPTY;
        h.d(uri, "Uri.EMPTY");
        this.b = uri;
        Uri uri2 = Uri.EMPTY;
        h.d(uri2, "Uri.EMPTY");
        this.c = uri2;
        Uri uri3 = Uri.EMPTY;
        h.d(uri3, "Uri.EMPTY");
        this.d = uri3;
    }

    @Override // defpackage.ju9
    public void a() {
        this.i.f(null);
    }

    @Override // defpackage.ju9
    public void b() {
        this.b = this.d;
        Uri uri = Uri.EMPTY;
        h.d(uri, "Uri.EMPTY");
        this.c = uri;
    }

    @Override // defpackage.ju9
    public void c(Bundle bundle) {
        h.e(bundle, "outState");
        bundle.putParcelable("camera-output-image-uri", this.d);
        bundle.putParcelable("image-uri", this.b);
        bundle.putParcelable("preview-image-uri", this.c);
    }

    @Override // defpackage.ju9
    public void d(Bundle bundle) {
        if (bundle != null) {
            Uri uri = (Uri) bundle.getParcelable("camera-output-image-uri");
            if (uri == null) {
                uri = Uri.EMPTY;
                h.d(uri, "Uri.EMPTY");
            }
            this.d = uri;
            Uri uri2 = (Uri) bundle.getParcelable("image-uri");
            if (uri2 == null) {
                uri2 = Uri.EMPTY;
                h.d(uri2, "Uri.EMPTY");
            }
            this.b = uri2;
            Uri uri3 = (Uri) bundle.getParcelable("preview-image-uri");
            if (uri3 == null) {
                uri3 = Uri.EMPTY;
                h.d(uri3, "Uri.EMPTY");
            }
            this.c = uri3;
        }
    }

    @Override // defpackage.ju9
    public void e() {
        Uri a2 = this.g.a();
        h.c(a2);
        this.d = a2;
        this.i.h(a2);
    }

    @Override // defpackage.ju9
    public void f(Uri uri) {
        h.e(uri, "uri");
        this.b = uri;
        Uri uri2 = Uri.EMPTY;
        h.d(uri2, "Uri.EMPTY");
        this.c = uri2;
    }

    @Override // defpackage.ju9
    public void g() {
        this.i.f(this.b);
    }

    @Override // defpackage.ju9
    public void start() {
        b v = this.h.v();
        this.i.j(v.b());
        this.i.g(v.a());
        if (h.a(this.b, Uri.EMPTY)) {
            if (v.a()) {
                Uri a2 = this.g.a();
                h.c(a2);
                this.d = a2;
                this.i.h(a2);
                return;
            }
            this.i.e();
        } else if (h.a(this.c, Uri.EMPTY)) {
            this.a.b(z.y(new ku9(this)).H(this.f).B(this.e).subscribe(new lu9(this), new mu9(this)));
        } else {
            this.i.k(this.c);
        }
    }

    @Override // defpackage.ju9
    public void stop() {
        this.a.a();
    }
}
