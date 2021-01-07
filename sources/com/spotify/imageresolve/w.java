package com.spotify.imageresolve;

import com.google.common.collect.ImmutableMultimap;
import com.google.protobuf.ByteString;
import com.spotify.http.u;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

public class w implements h0 {
    private final u a;
    private b b = EmptyDisposable.INSTANCE;
    private final AtomicReference<ImmutableMultimap<ByteString, a0>> c = new AtomicReference<>();
    private final c0 d;
    private final b0 e;

    public w(u uVar, c0 c0Var, b0 b0Var) {
        this.a = uVar;
        this.d = c0Var;
        this.e = b0Var;
    }

    public static void b(w wVar, ImmutableMultimap immutableMultimap) {
        wVar.c.set(immutableMultimap);
    }

    @Override // com.spotify.imageresolve.h0
    public ImmutableMultimap<ByteString, a0> a() {
        return this.c.get();
    }

    public void c() {
        this.e.d();
    }

    public void d() {
        this.b = ((f0) this.a.c(f0.class)).a().P().q(this.d).j0(c.a).Q(b.a).j0(p.a).subscribe(new g(this), f.a);
    }

    public void e() {
        this.b.dispose();
        this.c.set(null);
    }
}
