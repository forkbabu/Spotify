package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.functions.n;

/* renamed from: xu5  reason: default package */
public final /* synthetic */ class xu5 implements n {
    public final /* synthetic */ av5 a;

    public /* synthetic */ xu5(av5 av5) {
        this.a = av5;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.d((Fragment) obj);
    }
}
