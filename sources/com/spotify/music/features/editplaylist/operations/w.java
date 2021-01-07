package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.operations.a;
import com.spotify.playlist.endpoints.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class w implements i0 {
    private final i a;

    public w(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean a(List<e0> list, e0 e0Var) {
        list.add(e0Var);
        return true;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public u b(u uVar, e0 e0Var) {
        Integer num = uVar.j().get(((v) e0Var).b());
        if (num == null) {
            return uVar;
        }
        ArrayList arrayList = new ArrayList(uVar.h());
        arrayList.remove(num.intValue());
        a.b bVar = (a.b) uVar.k();
        bVar.e(arrayList);
        return bVar.a();
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean c(List<e0> list, e0 e0Var) {
        v vVar = (v) e0Var;
        if (list.isEmpty()) {
            return false;
        }
        e0 e0Var2 = list.get(list.size() - 1);
        if (!(e0Var2 instanceof v) || !((v) e0Var2).b().equals(vVar.b())) {
            return false;
        }
        list.remove(e0Var2);
        return true;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean d(e0 e0Var) {
        return e0Var instanceof v;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public io.reactivex.a e(e0 e0Var) {
        v vVar = (v) e0Var;
        return this.a.a(vVar.a(), Collections.singletonList(vVar.b()));
    }
}
