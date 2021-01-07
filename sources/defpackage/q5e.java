package defpackage;

import android.view.View;
import com.google.common.base.Function;

/* access modifiers changed from: package-private */
/* renamed from: q5e  reason: default package */
public final class q5e<F, T> implements Function<tg0<View>, View> {
    public static final q5e a = new q5e();

    q5e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Function
    public View apply(tg0<View> tg0) {
        tg0<View> tg02 = tg0;
        if (tg02 != null) {
            return tg02.get();
        }
        return null;
    }
}
