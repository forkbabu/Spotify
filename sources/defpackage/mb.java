package defpackage;

import com.airbnb.lottie.model.content.c;
import java.util.List;

/* renamed from: mb  reason: default package */
public class mb extends ob<c> {
    private final c i;

    public mb(List<fe<c>> list) {
        super(list);
        int i2 = 0;
        T t = list.get(0).b;
        i2 = t != null ? t.c() : i2;
        this.i = new c(new float[i2], new int[i2]);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        this.i.d(feVar.b, feVar.c, f);
        return this.i;
    }
}
