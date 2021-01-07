package defpackage;

import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.libs.callingcode.json.b;
import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;

/* renamed from: vq0  reason: default package */
public final /* synthetic */ class vq0 implements l {
    public static final /* synthetic */ vq0 a = new vq0();

    private /* synthetic */ vq0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        int i = CallingCode.a;
        Collections.sort(list, b.a);
        return list;
    }
}
