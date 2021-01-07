package com.spotify.mobile.android.service.feature;

import com.spotify.android.flags.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class v implements m {
    private List<b<?>> a;
    private List<b<?>> b;

    private static void c(List<? extends m> list, List<b<?>> list2, List<b<?>> list3) {
        for (m mVar : list) {
            Field[] declaredFields = mVar.getClass().getDeclaredFields();
            try {
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Field field = declaredFields[i];
                        if (b.class.isAssignableFrom(field.getType())) {
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            b<?> bVar = (b) field.get(null);
                            if ("product-state".equals(bVar.e().b())) {
                                list2.add(bVar);
                                list3.add(bVar);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        i++;
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Override // com.spotify.mobile.android.service.feature.m
    public List<b<?>> a() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c(b(), arrayList, arrayList2);
            this.a = Collections.unmodifiableList(arrayList);
            this.b = Collections.unmodifiableList(arrayList2);
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public List<? extends m> b() {
        return Collections.singletonList(this);
    }
}
