package com.spotify.music.storylines.persistence.database;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.storylines.model.StorylinesUris;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collection;
import java.util.List;

public class g implements rjd {
    private final d a;
    private final y b;

    public g(StorylinesDatabase storylinesDatabase, y yVar) {
        this.a = storylinesDatabase.t();
        this.b = yVar;
    }

    @Override // defpackage.rjd
    public boolean a(String str) {
        return ((e) this.a).a(str);
    }

    @Override // defpackage.rjd
    public a b(StorylinesUris storylinesUris) {
        return a.u(new c(this, ImmutableList.copyOf(Collections2.transform((Iterable) storylinesUris.getEntityUris(), (Function) b.a)))).G(this.b);
    }

    public /* synthetic */ d0 c() {
        return z.z(Optional.of(new StorylinesUris(ImmutableSet.copyOf((Collection) ((e) this.a).c()))));
    }

    public /* synthetic */ void d(List list) {
        ((e) this.a).e(list);
    }

    @Override // defpackage.rjd
    public z<Optional<StorylinesUris>> read() {
        return z.h(new a(this)).H(this.b);
    }
}
