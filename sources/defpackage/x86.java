package defpackage;

import com.google.common.base.Predicate;

/* renamed from: x86  reason: default package */
public final /* synthetic */ class x86 implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ x86(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        ane ane = (ane) obj;
        return ane != null && ane.c().equals(this.a);
    }
}
