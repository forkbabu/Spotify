package defpackage;

import com.google.common.base.Predicate;
import defpackage.di9;

/* renamed from: ri9  reason: default package */
public final /* synthetic */ class ri9 implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ ri9(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        String str = this.a;
        di9.d dVar = (di9.d) obj;
        dVar.getClass();
        return dVar.c().c().equals(str);
    }
}
