package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ib  reason: default package */
public class ib implements sa, jb.b {
    private final boolean a;
    private final List<jb.b> b = new ArrayList();
    private final ShapeTrimPath.Type c;
    private final jb<?, Float> d;
    private final jb<?, Float> e;
    private final jb<?, Float> f;

    public ib(b bVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.f();
        this.c = shapeTrimPath.e();
        jb<Float, Float> a2 = shapeTrimPath.d().a();
        this.d = a2;
        jb<Float, Float> a3 = shapeTrimPath.b().a();
        this.e = a3;
        jb<Float, Float> a4 = shapeTrimPath.c().a();
        this.f = a4;
        bVar.i(a2);
        bVar.i(a3);
        bVar.i(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    @Override // defpackage.jb.b
    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).a();
        }
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
    }

    /* access modifiers changed from: package-private */
    public void c(jb.b bVar) {
        this.b.add(bVar);
    }

    public jb<?, Float> d() {
        return this.e;
    }

    public jb<?, Float> f() {
        return this.f;
    }

    public jb<?, Float> h() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public ShapeTrimPath.Type i() {
        return this.c;
    }

    public boolean j() {
        return this.a;
    }
}
