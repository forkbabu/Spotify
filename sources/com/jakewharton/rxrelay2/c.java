package com.jakewharton.rxrelay2;

import io.reactivex.functions.g;
import io.reactivex.s;

public abstract class c<T> extends s<T> implements g<T> {
    @Override // io.reactivex.functions.g
    public abstract void accept(T t);
}
