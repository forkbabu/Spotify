package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.libs.collection.model.c;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: xy3  reason: default package */
public class xy3 implements w<b91, b91> {
    private final l a;
    private final q9a b;
    private final String c;
    private final ey3 d;

    /* access modifiers changed from: private */
    /* renamed from: xy3$a */
    public static class a {
        public final b91 a;
        public final boolean b;

        a(b91 b91, boolean z) {
            this.a = b91;
            this.b = z;
        }
    }

    public xy3(l lVar, q9a q9a, String str, ey3 ey3) {
        this.a = lVar;
        this.b = q9a;
        this.c = str;
        this.d = ey3;
    }

    public v a(a aVar) {
        boolean z = false;
        if (aVar.b && !aVar.a.custom().boolValue("created-from-album-entity", false)) {
            z = true;
        }
        if (!z) {
            return s.i0(aVar.a);
        }
        return this.b.b(this.c).a().j0(new qx3(this, aVar.a));
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.a.a().j0(xx3.a), rx3.a).W(new px3(this), false, Integer.MAX_VALUE);
    }

    public /* synthetic */ b91 b(b91 b91, c cVar) {
        return !cVar.getItems().isEmpty() ? this.d.a(cVar) : b91;
    }
}
