package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.h;
import java.util.List;

/* renamed from: ub  reason: default package */
public class ub extends jb<h, Path> {
    private final h i = new h();
    private final Path j = new Path();

    public ub(List<fe<h>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fe, float] */
    @Override // defpackage.jb
    public Path h(fe<h> feVar, float f) {
        this.i.c(feVar.b, feVar.c, f);
        de.e(this.i, this.j);
        return this.j;
    }
}
