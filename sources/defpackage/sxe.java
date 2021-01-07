package defpackage;

import defpackage.uue;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: sxe  reason: default package */
public final /* synthetic */ class sxe implements l {
    public static final /* synthetic */ sxe a = new sxe();

    private /* synthetic */ sxe() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue.e0 e0Var = (uue.e0) obj;
        int i = yye.b;
        return s.W0((long) e0Var.b(), TimeUnit.SECONDS).j0(new oye(e0Var));
    }
}
