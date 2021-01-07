package defpackage;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* renamed from: nv  reason: default package */
public final class nv {
    private static final a.g<yu> a;
    private static final a.g<yu> b;
    public static final a.AbstractC0094a<yu, xu> c;
    private static final a.AbstractC0094a<yu, ov> d;

    static {
        a.g<yu> gVar = new a.g<>();
        a = gVar;
        a.g<yu> gVar2 = new a.g<>();
        b = gVar2;
        mv mvVar = new mv();
        c = mvVar;
        pv pvVar = new pv();
        d = pvVar;
        new Scope("profile");
        new Scope("email");
        new a("SignIn.API", mvVar, gVar);
        new a("SignIn.INTERNAL_API", pvVar, gVar2);
    }
}
