package kotlin.jvm.internal;

import kotlin.reflect.c;
import kotlin.reflect.d;
import kotlin.reflect.e;
import kotlin.reflect.f;
import kotlin.reflect.g;

public class j {
    private static final k a;
    private static final c[] b = new c[0];

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        a = kVar;
    }

    public static e a(FunctionReference functionReference) {
        a.getClass();
        return functionReference;
    }

    public static c b(Class cls) {
        a.getClass();
        return new d(cls);
    }

    public static d c(Class cls) {
        a.getClass();
        return new i(cls, "");
    }

    public static f d(MutablePropertyReference1 mutablePropertyReference1) {
        a.getClass();
        return mutablePropertyReference1;
    }

    public static g e(PropertyReference1 propertyReference1) {
        a.getClass();
        return propertyReference1;
    }

    public static String f(g gVar) {
        return a.a(gVar);
    }

    public static String g(Lambda lambda) {
        return a.a(lambda);
    }
}
