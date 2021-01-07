package kotlin.jvm.internal;

import kotlin.reflect.h;

public abstract class MutablePropertyReference extends PropertyReference implements h {
    public MutablePropertyReference() {
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
