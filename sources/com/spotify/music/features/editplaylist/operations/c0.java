package com.spotify.music.features.editplaylist.operations;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.features.editplaylist.operations.a;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.models.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c0 implements i0 {
    private final i a;

    public c0(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean a(List<e0> list, e0 e0Var) {
        b0 b0Var = (b0) e0Var;
        if (!list.isEmpty()) {
            e0 e0Var2 = list.get(list.size() - 1);
            if (!(e0Var2 instanceof b0) || !((b0) e0Var2).c().equals(b0Var.c())) {
                list.add(b0Var);
                return false;
            }
            list.remove(e0Var2);
            list.add(b0Var);
            return true;
        }
        list.add(b0Var);
        return false;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public u b(u uVar, e0 e0Var) {
        b0 b0Var = (b0) e0Var;
        Integer num = uVar.j().get(b0Var.c());
        if (num == null) {
            return uVar;
        }
        Integer num2 = !MoreObjects.isNullOrEmpty(b0Var.a()) ? uVar.j().get(b0Var.a()) : null;
        ArrayList arrayList = new ArrayList(uVar.h());
        l lVar = (l) arrayList.remove(num.intValue());
        if (num2 == null) {
            arrayList.add(lVar);
        } else if (num.intValue() < num2.intValue()) {
            arrayList.add(num2.intValue() - 1, lVar);
        } else {
            arrayList.add(num2.intValue(), lVar);
        }
        a.b bVar = (a.b) uVar.k();
        bVar.e(arrayList);
        return bVar.a();
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public /* synthetic */ boolean c(List list, e0 e0Var) {
        return h0.a(this, list, e0Var);
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public boolean d(e0 e0Var) {
        return e0Var instanceof b0;
    }

    @Override // com.spotify.music.features.editplaylist.operations.i0
    public io.reactivex.a e(e0 e0Var) {
        b0 b0Var = (b0) e0Var;
        String a2 = b0Var.a();
        if (!MoreObjects.isNullOrEmpty(a2)) {
            return this.a.i(b0Var.b(), Collections.singletonList(b0Var.c()), Optional.of(a2));
        }
        return this.a.h(b0Var.b(), Collections.singletonList(b0Var.c()), Optional.absent());
    }
}
