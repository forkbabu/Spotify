package com.google.gson;

import com.google.gson.internal.n;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k {
    private n a = n.c;
    private LongSerializationPolicy b = LongSerializationPolicy.DEFAULT;
    private d c = FieldNamingPolicy.IDENTITY;
    private final Map<Type, l<?>> d = new HashMap();
    private final List<x> e = new ArrayList();
    private final List<x> f = new ArrayList();
    private int g = 2;
    private int h = 2;
    private boolean i = true;

    public j a() {
        ArrayList arrayList = new ArrayList(this.f.size() + this.e.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i2 = this.g;
        int i3 = this.h;
        if (!(i2 == 2 || i3 == 2)) {
            a aVar = new a(Date.class, i2, i3);
            a aVar2 = new a(Timestamp.class, i2, i3);
            a aVar3 = new a(java.sql.Date.class, i2, i3);
            arrayList.add(s20.a(Date.class, aVar));
            arrayList.add(s20.a(Timestamp.class, aVar2));
            arrayList.add(s20.a(java.sql.Date.class, aVar3));
        }
        return new j(this.a, this.c, this.d, false, false, false, this.i, false, false, false, this.b, null, this.g, this.h, this.e, this.f, arrayList);
    }

    public k b() {
        this.i = false;
        return this;
    }
}
