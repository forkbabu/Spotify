package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.v;

@v.b("navigation")
public class p extends v<o> {
    private final w a;

    public p(w wVar) {
        this.a = wVar;
    }

    /* Return type fixed from 'androidx.navigation.m' to match base method */
    @Override // androidx.navigation.v
    public o a() {
        return new o(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a] */
    @Override // androidx.navigation.v
    public m b(o oVar, Bundle bundle, s sVar, v.a aVar) {
        o oVar2 = oVar;
        int I = oVar2.I();
        if (I != 0) {
            m E = oVar2.E(I, false);
            if (E != null) {
                return this.a.c(E.l()).b(E, E.e(bundle), sVar, aVar);
            }
            throw new IllegalArgumentException(je.y0("navigation destination ", oVar2.H(), " is not a direct child of this NavGraph"));
        }
        StringBuilder V0 = je.V0("no start destination defined via app:startDestination for ");
        V0.append(oVar2.i());
        throw new IllegalStateException(V0.toString());
    }

    @Override // androidx.navigation.v
    public boolean e() {
        return true;
    }
}
