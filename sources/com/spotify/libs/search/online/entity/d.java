package com.spotify.libs.search.online.entity;

import io.reactivex.s;
import java.util.Set;

public class d implements c {
    private final s<b> a;

    public d(s<b> sVar) {
        this.a = sVar;
    }

    @Override // com.spotify.libs.search.online.entity.c
    public s<Set<RequestEntityType>> a() {
        return this.a.j0(a.a);
    }
}
