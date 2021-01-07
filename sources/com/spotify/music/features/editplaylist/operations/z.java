package com.spotify.music.features.editplaylist.operations;

import com.google.common.collect.Collections2;
import com.spotify.music.features.editplaylist.operations.a;
import com.spotify.playlist.endpoints.i;
import java.util.Iterator;
import java.util.List;

public class z implements i0 {
    private final i a;

    public z(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean a(List<e0> list, e0 e0Var) {
        y yVar = (y) e0Var;
        Iterator it = Collections2.newArrayList(list).iterator();
        while (it.hasNext()) {
            e0 e0Var2 = (e0) it.next();
            if (e0Var2 instanceof y) {
                list.remove(e0Var2);
            }
        }
        list.add(yVar);
        return true;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public u b(u uVar, e0 e0Var) {
        a.b bVar = (a.b) uVar.k();
        bVar.b(((y) e0Var).a());
        return bVar.a();
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public /* synthetic */ boolean c(List list, e0 e0Var) {
        return h0.a(this, list, e0Var);
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean d(e0 e0Var) {
        return e0Var instanceof y;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public io.reactivex.a e(e0 e0Var) {
        y yVar = (y) e0Var;
        return this.a.j(yVar.b(), yVar.a());
    }
}
