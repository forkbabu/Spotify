package com.spotify.imageresolve;

import com.spotify.imageresolve.proto.ProjectionMap;
import com.spotify.imageresolve.proto.ProjectionsResponse;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import retrofit2.v;

public class c0 implements w<v<ProjectionsResponse>, ProjectionMap> {
    private final b0 a;
    private final y b;

    public c0(b0 b0Var, y yVar) {
        this.a = b0Var;
        this.b = yVar;
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public io.reactivex.v<ProjectionMap> apply(s<v<ProjectionsResponse>> sVar) {
        s<R> o0 = sVar.j0(k.a).o0(this.b);
        b0 b0Var = this.a;
        b0Var.getClass();
        s<R> N = o0.N(new o(b0Var));
        b0 b0Var2 = this.a;
        b0Var2.getClass();
        return l.d(new j(b0Var2)).v().I0(this.b).x(N);
    }
}
