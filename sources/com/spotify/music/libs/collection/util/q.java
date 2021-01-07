package com.spotify.music.libs.collection.util;

import com.spotify.playlist.models.offline.a;

public class q implements e8c {
    private final boolean a;
    private final a b;
    private final a c;

    public q(String str, AlbumCollectionState albumCollectionState, a aVar, a aVar2) {
        this.a = albumCollectionState != AlbumCollectionState.YES;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // defpackage.e8c
    public a a() {
        return this.b;
    }

    @Override // defpackage.e8c
    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.b == qVar.b && this.a == qVar.a && this.c == qVar.c;
    }

    public int hashCode() {
        return ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.a ? 1 : 0);
    }
}
