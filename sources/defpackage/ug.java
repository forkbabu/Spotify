package defpackage;

import com.google.android.datatransport.b;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: ug  reason: default package */
public final class ug implements f {
    private final Set<b> a;
    private final tg b;
    private final xg c;

    ug(Set<b> set, tg tgVar, xg xgVar) {
        this.a = set;
        this.b = tgVar;
        this.c = xgVar;
    }

    @Override // com.google.android.datatransport.f
    public <T> e<T> a(String str, Class<T> cls, d<T, byte[]> dVar) {
        return b(str, cls, b.b("proto"), dVar);
    }

    @Override // com.google.android.datatransport.f
    public <T> e<T> b(String str, Class<T> cls, b bVar, d<T, byte[]> dVar) {
        if (this.a.contains(bVar)) {
            return new wg(this.b, str, bVar, dVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.a));
    }
}
