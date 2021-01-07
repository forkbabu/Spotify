package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.List;

/* renamed from: gb  reason: default package */
public class gb implements cb, jb.b {
    private final Path a = new Path();
    private final boolean b;
    private final f c;
    private final jb<?, Path> d;
    private boolean e;
    private ra f = new ra();

    public gb(f fVar, b bVar, k kVar) {
        this.b = kVar.c();
        this.c = fVar;
        jb<h, Path> a2 = kVar.b().a();
        this.d = a2;
        bVar.i(a2);
        a2.a(this);
    }

    @Override // defpackage.jb.b
    public void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i = 0; i < list.size(); i++) {
            sa saVar = list.get(i);
            if (saVar instanceof ib) {
                ib ibVar = (ib) saVar;
                if (ibVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f.a(ibVar);
                    ibVar.c(this);
                }
            }
        }
    }

    @Override // defpackage.cb
    public Path o() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set(this.d.g());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.b(this.a);
        this.e = true;
        return this.a;
    }
}
