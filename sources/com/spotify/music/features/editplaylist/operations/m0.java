package com.spotify.music.features.editplaylist.operations;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.music.features.editplaylist.operations.a;
import com.spotify.playlist.endpoints.i;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import java.util.Iterator;
import java.util.List;

public class m0 implements i0 {
    private final i a;

    public m0(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean a(List<e0> list, e0 e0Var) {
        l0 l0Var = (l0) e0Var;
        Iterator it = Collections2.newArrayList(list).iterator();
        while (it.hasNext()) {
            e0 e0Var2 = (e0) it.next();
            if (e0Var2 instanceof l0) {
                list.remove(e0Var2);
            }
        }
        if (MoreObjects.isNullOrEmpty(l0Var.a())) {
            return false;
        }
        list.add(l0Var);
        return true;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public u b(u uVar, e0 e0Var) {
        l0 l0Var = (l0) e0Var;
        if (MoreObjects.isNullOrEmpty(l0Var.a())) {
            return uVar;
        }
        a.b bVar = (a.b) uVar.k();
        bVar.f(l0Var.a());
        return bVar.a();
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public /* synthetic */ boolean c(List list, e0 e0Var) {
        return h0.a(this, list, e0Var);
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean d(e0 e0Var) {
        return e0Var instanceof l0;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public io.reactivex.a e(e0 e0Var) {
        return io.reactivex.a.n(new g(this, (l0) e0Var));
    }

    public /* synthetic */ e f(l0 l0Var) {
        if (!MoreObjects.isNullOrEmpty(l0Var.a())) {
            return this.a.g(l0Var.b(), l0Var.a());
        }
        return b.a;
    }
}
