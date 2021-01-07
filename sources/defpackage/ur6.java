package defpackage;

import android.content.Intent;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

/* access modifiers changed from: package-private */
/* renamed from: ur6  reason: default package */
public class ur6 {
    private final b a;
    private final o b;

    public ur6(b bVar, o oVar) {
        this.a = bVar;
        this.b = oVar;
    }

    public void a(String str, yn0 yn0) {
        o oVar = this.b;
        n.a a2 = n.a(str);
        a2.f(true);
        Intent b2 = oVar.b(a2.a());
        yn0.getClass();
        b2.putExtra("FeatureIdentifier.InternalReferrer", yn0);
        this.a.b(b2);
    }
}
