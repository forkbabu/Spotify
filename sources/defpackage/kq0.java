package defpackage;

import com.google.common.base.Optional;
import defpackage.fq0;
import io.reactivex.functions.l;

/* renamed from: kq0  reason: default package */
public final /* synthetic */ class kq0 implements l {
    public final /* synthetic */ fq0.a a;

    public /* synthetic */ kq0(fq0.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        fq0.a aVar = this.a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return gq0.e(String.format("No message found with creative id %s.", aVar.a()));
        }
        F f = ((u3) optional.get()).a;
        f.getClass();
        S s = ((u3) optional.get()).b;
        s.getClass();
        return gq0.f(f, s);
    }
}
