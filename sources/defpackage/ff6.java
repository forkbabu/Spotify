package defpackage;

import com.google.common.base.Predicate;
import retrofit2.v;

/* renamed from: ff6  reason: default package */
public final /* synthetic */ class ff6 implements Predicate {
    public static final /* synthetic */ ff6 a = new ff6();

    private /* synthetic */ ff6() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        v vVar = (v) obj;
        return vVar != null && (vVar.b() == 200 || vVar.b() == 202);
    }
}
