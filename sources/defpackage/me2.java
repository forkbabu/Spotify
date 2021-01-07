package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.h;

/* renamed from: me2  reason: default package */
public final class me2 implements le2 {
    @Override // defpackage.le2
    public String a(String str) {
        h.e(str, "url");
        String encode = Uri.encode(str);
        h.d(encode, "Uri.encode(url)");
        return encode;
    }
}
