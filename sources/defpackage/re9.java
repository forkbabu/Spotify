package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import io.reactivex.functions.l;

/* renamed from: re9  reason: default package */
public final /* synthetic */ class re9 implements l {
    public final /* synthetic */ ye9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ re9(ye9 ye9, String str, String str2) {
        this.a = ye9;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ye9 ye9 = this.a;
        ImmutableList immutableList = (ImmutableList) obj;
        return ((we9) ye9).a.b(this.b, this.c, (String[]) Collections2.toArray(ImmutableSet.copyOf(Collections2.transform(Collections2.filter((Iterable) immutableList, (Predicate) je9.a), ke9.a)), String.class)).j0(new se9(immutableList));
    }
}
