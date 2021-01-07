package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.h;
import java.io.Serializable;

/* renamed from: nf5  reason: default package */
public class nf5 implements h<b91, String, Serializable, b91> {
    /* renamed from: b */
    public b91 a(b91 b91, String str, Serializable serializable) {
        return (MoreObjects.isNullOrEmpty(str) || serializable == null) ? b91 : b91.toBuilder().d(str, serializable).g();
    }
}
