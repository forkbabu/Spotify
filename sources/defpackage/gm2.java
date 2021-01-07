package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.GeneratedMessageLite;
import io.reactivex.functions.l;

/* renamed from: gm2  reason: default package */
public final /* synthetic */ class gm2 implements l {
    public static final /* synthetic */ gm2 a = new gm2();

    private /* synthetic */ gm2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (GeneratedMessageLite) ((Optional) obj).get();
    }
}
