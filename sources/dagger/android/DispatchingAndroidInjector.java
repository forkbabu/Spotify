package dagger.android;

import dagger.android.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class DispatchingAndroidInjector<T> implements b<T> {
    private final Map<String, wlf<b.a<?>>> a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    DispatchingAndroidInjector(Map<Class<?>, wlf<b.a<?>>> map, Map<String, wlf<b.a<?>>> map2) {
        if (!map.isEmpty()) {
            LinkedHashMap c = cjf.c(map2.size() + map.size());
            c.putAll(map2);
            for (Map.Entry<Class<?>, wlf<b.a<?>>> entry : map.entrySet()) {
                c.put(entry.getKey().getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(c);
        }
        this.a = map2;
    }

    @Override // dagger.android.b
    public void a(T t) {
        boolean z;
        String str;
        wlf<b.a<?>> wlf = this.a.get(t.getClass().getName());
        if (wlf == null) {
            z = false;
        } else {
            b.a<?> aVar = wlf.get();
            try {
                b<?> a2 = aVar.a(t);
                yif.h(a2, "%s.create(I) should not return null.", aVar.getClass());
                a2.a(t);
                z = true;
            } catch (ClassCastException e) {
                throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", aVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()), e);
            }
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (this.a.containsKey(cls.getCanonicalName())) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            if (arrayList.isEmpty()) {
                str = String.format("No injector factory bound for Class<%s>", t.getClass().getCanonicalName());
            } else {
                str = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t.getClass().getCanonicalName(), arrayList);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
