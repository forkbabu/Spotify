package defpackage;

import android.text.style.URLSpan;
import kotlin.jvm.internal.h;

/* renamed from: soa  reason: default package */
public abstract class soa extends URLSpan {

    /* renamed from: soa$a */
    public interface a {
        soa a(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public soa(String str) {
        super(str);
        h.e(str, "url");
    }
}
