package defpackage;

import android.content.Intent;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;
import kotlin.jvm.internal.h;

/* renamed from: vn2  reason: default package */
public final class vn2 {
    public static final void a(String str, o oVar, b bVar, boolean z) {
        h.e(str, "uri");
        h.e(oVar, "adapter");
        h.e(bVar, "activityStarter");
        n.a a = n.a(str);
        a.c(true);
        a.b(z);
        Intent b = oVar.b(a.a());
        h.d(b, "intent");
        b.setFlags(67108864);
        yn0 yn0 = bu9.w;
        yn0.getClass();
        b.putExtra("FeatureIdentifier.InternalReferrer", yn0);
        bVar.b(b);
    }
}
