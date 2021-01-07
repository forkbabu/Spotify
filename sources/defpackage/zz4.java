package defpackage;

import defpackage.uz4;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: zz4  reason: default package */
final class zz4<T, R> implements l<Map<String, ? extends String>, uz4> {
    public static final zz4 a = new zz4();

    zz4() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public uz4 apply(Map<String, ? extends String> map) {
        Map<String, ? extends String> map2 = map;
        h.e(map2, "productStateMap");
        String str = (String) map2.get("catalogue");
        if (str == null) {
            str = "";
        }
        return new uz4.g(str);
    }
}
