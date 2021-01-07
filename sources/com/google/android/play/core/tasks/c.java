package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

public abstract class c<ResultT> {
    public abstract c<ResultT> a(Executor executor, a aVar);

    public abstract c<ResultT> b(Executor executor, b<? super ResultT> bVar);

    public abstract Exception c();

    public abstract ResultT d();

    public abstract boolean e();

    public abstract boolean f();
}
