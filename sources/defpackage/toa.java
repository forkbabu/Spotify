package defpackage;

import defpackage.soa;
import kotlin.jvm.internal.h;

/* renamed from: toa  reason: default package */
public final class toa implements soa.a {
    final /* synthetic */ woa a;

    toa(woa woa) {
        this.a = woa;
    }

    @Override // defpackage.soa.a
    public soa a(String str) {
        h.e(str, "url");
        return new xoa(this.a, str);
    }
}
