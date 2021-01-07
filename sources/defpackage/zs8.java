package defpackage;

import com.spotify.mobile.android.util.Assertion;
import defpackage.us8;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: zs8  reason: default package */
public final class zs8 implements fjf<String> {
    private final wlf<String> a;

    public zs8(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String str;
        String str2 = this.a.get();
        us8.a aVar = us8.a;
        h.e(str2, "topicUri");
        h.e(str2, "topicUri");
        Object[] array = e.w(str2, new String[]{":"}, false, 0, 6, null).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            if (strArr.length == 3) {
                str = strArr[2];
            } else {
                Assertion.g("Topic uri is invalid");
                str = "";
            }
            yif.g(str, "Cannot return null from a non-@Nullable @Provides method");
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
