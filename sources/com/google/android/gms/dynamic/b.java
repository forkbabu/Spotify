package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.dynamic.a;
import java.lang.reflect.Field;

public final class b<T> extends a.AbstractBinderC0099a {
    private final T a;

    private b(T t) {
        this.a = t;
    }

    @RecentlyNonNull
    public static <T> T E3(@RecentlyNonNull a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            g.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(je.f0(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }

    @RecentlyNonNull
    public static <T> a F3(@RecentlyNonNull T t) {
        return new b(t);
    }
}
