package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: rt1  reason: default package */
public final /* synthetic */ class rt1 implements g {
    public final /* synthetic */ bu1 a;

    public /* synthetic */ rt1(bu1 bu1) {
        this.a = bu1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        bu1.a(this.a, (Optional) obj);
    }
}
