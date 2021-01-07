package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.search.transition.k;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

/* renamed from: w54  reason: default package */
public class w54 implements a64 {
    private final Context a;
    private final o b;

    public w54(Context context, o oVar) {
        context.getClass();
        this.a = context;
        oVar.getClass();
        this.b = oVar;
    }

    @Override // defpackage.a64
    public void a(z54 z54) {
        o oVar = this.b;
        n.a a2 = n.a(ViewUris.p0.toString());
        a2.c(true);
        Intent b2 = oVar.b(a2.a());
        if (z54.c().isPresent()) {
            b2.putExtra("extra_interaction_id", z54.c().get());
        }
        if (z54.a().isPresent()) {
            e74 e74 = z54.a().get();
            k.a(b2, e74.d(), e74.c(), e74.b());
        }
        yn0 yn0 = bu9.i;
        yn0.getClass();
        b2.putExtra("FeatureIdentifier.InternalReferrer", yn0);
        this.a.startActivity(b2);
    }
}
