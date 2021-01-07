package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import defpackage.b1a;
import defpackage.z0a;
import io.reactivex.functions.h;
import java.util.LinkedHashMap;
import java.util.List;

public final /* synthetic */ class o implements h {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ o(o0 o0Var, e eVar) {
        this.a = o0Var;
        this.b = eVar;
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        o0 o0Var = this.a;
        e eVar = this.b;
        z0a.a aVar = (z0a.a) obj2;
        b1a.a aVar2 = (b1a.a) obj3;
        o0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(p0.m(aVar2.c()), new z0(aVar2.c(), aVar2.a(), aVar2.b(), o0Var.a.f));
        linkedHashMap.put(p0.m(aVar.c()), new z0(aVar.c(), aVar.a(), aVar.b(), o0Var.a.f));
        linkedHashMap.put(p0.m(eVar.getUri()), new z0(eVar.getUri(), eVar.getName(), (List) obj, o0Var.a.f));
        return linkedHashMap;
    }
}
