package com.spotify.remoteconfig.runtime.model;

import com.spotify.remoteconfig.runtime.model.PropertyModel;
import com.spotify.remoteconfig.runtime.model.a;
import java.util.List;
import kotlin.jvm.internal.h;

public abstract class b implements PropertyModel {

    public static abstract class a extends PropertyModel.a<b> {
    }

    public static b a(String str, String str2, String str3, List<String> list) {
        h.f(str, "name");
        h.f(str2, "componentId");
        h.f(str3, "enumValue");
        h.f(list, "values");
        a.b bVar = new a.b();
        bVar.c(str);
        bVar.b(str2);
        bVar.e(r0e.b(list));
        bVar.d(PropertyModel.PropertyModelType.a);
        bVar.f(str3);
        PropertyModel a2 = bVar.a();
        a aVar = (a) a2;
        if (aVar.c().a(aVar.value())) {
            return (b) a2;
        }
        throw new IllegalArgumentException("Invalid value for this property model.".toString());
    }

    public abstract String b();
}
