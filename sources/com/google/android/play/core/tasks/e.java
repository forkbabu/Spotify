package com.google.android.play.core.tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class e {
    public static <ResultT> c<ResultT> a(Exception exc) {
        p pVar = new p();
        pVar.g(exc);
        return pVar;
    }

    public static <ResultT> c<ResultT> b(ResultT resultt) {
        p pVar = new p();
        pVar.h(resultt);
        return pVar;
    }

    private static <ResultT> ResultT c(c<ResultT> cVar) {
        if (cVar.f()) {
            return cVar.d();
        }
        throw new ExecutionException(cVar.c());
    }

    public static <ResultT> ResultT d(c<ResultT> cVar) {
        if (cVar == null) {
            throw new NullPointerException("Task must not be null");
        } else if (cVar.e()) {
            return (ResultT) c(cVar);
        } else {
            q qVar = new q(null);
            Executor executor = d.a;
            cVar.b(executor, qVar);
            cVar.a(executor, qVar);
            qVar.a();
            return (ResultT) c(cVar);
        }
    }
}
