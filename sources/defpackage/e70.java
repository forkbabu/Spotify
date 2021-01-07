package defpackage;

import com.google.common.base.Optional;
import com.spotify.accountinfostore.room.a;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: e70  reason: default package */
public final /* synthetic */ class e70 implements l {
    public static final /* synthetic */ e70 a = new e70();

    private /* synthetic */ e70() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return Optional.absent();
        }
        a aVar = (a) list.get(0);
        return Optional.of(new f70(aVar.a, aVar.b, aVar.c, aVar.d, aVar.f != null));
    }
}
