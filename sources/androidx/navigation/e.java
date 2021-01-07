package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.h;
import kotlin.reflect.c;

public final class e<Args extends d> implements kotlin.d<Args> {
    private Args a;
    private final c<Args> b;
    private final cmf<Bundle> c;

    public e(c<Args> cVar, cmf<Bundle> cmf) {
        h.f(cVar, "navArgsClass");
        h.f(cmf, "argumentProducer");
        this.b = cVar;
        this.c = cmf;
    }

    @Override // kotlin.d
    public Object getValue() {
        Args args = this.a;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.c.invoke();
        Method method = f.a().get(this.b);
        if (method == null) {
            Class s = yif.s(this.b);
            Class<Bundle>[] b2 = f.b();
            method = s.getMethod("fromBundle", (Class[]) Arrays.copyOf(b2, b2.length));
            f.a().put(this.b, method);
            h.b(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke2 = method.invoke(null, invoke);
        if (invoke2 != null) {
            Args args2 = (Args) ((d) invoke2);
            this.a = args2;
            return args2;
        }
        throw new TypeCastException("null cannot be cast to non-null type Args");
    }
}
