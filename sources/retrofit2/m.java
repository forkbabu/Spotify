package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class m {
    private final Method a;
    private final List<?> b;

    m(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
