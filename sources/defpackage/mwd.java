package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableSet;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import com.squareup.picasso.l;
import com.squareup.picasso.y;
import java.io.InputStream;
import okhttp3.a0;
import okhttp3.d0;
import okio.o;

/* renamed from: mwd  reason: default package */
public class mwd extends a0 {
    private static final ImmutableSet<String> c = ImmutableSet.of("content", "file", "android.resource");
    private final lwd a;
    private final l b;

    public mwd(lwd lwd, l lVar) {
        this.a = lwd;
        this.b = lVar;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        return !c.contains(yVar.c.getScheme());
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        d0 d0Var;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        InputStream a2 = this.a.a(yVar.c);
        if (a2 != null) {
            return new a0.a(o.i(a2), loadedFrom);
        }
        String scheme = yVar.c.getScheme();
        if ("http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
            l lVar = this.b;
            a0.a aVar = new a0.a();
            aVar.j(yVar.c.toString());
            d0Var = lVar.a(aVar.b());
        } else {
            d0Var = null;
        }
        if (d0Var == null) {
            return null;
        }
        return new a0.a(d0Var.a().l(), loadedFrom);
    }
}
