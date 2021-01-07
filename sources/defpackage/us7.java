package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.l;

/* renamed from: us7  reason: default package */
public final /* synthetic */ class us7 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ us7(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (ct7) ((ImmutableMap) obj).getOrDefault(this.a, ct7.a);
    }
}
