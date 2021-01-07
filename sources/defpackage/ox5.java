package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: ox5  reason: default package */
public final /* synthetic */ class ox5 implements l {
    public static final /* synthetic */ ox5 a = new ox5();

    private /* synthetic */ ox5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (String) ((Optional) obj).or((Optional) "");
    }
}
