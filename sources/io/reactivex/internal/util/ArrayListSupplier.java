package io.reactivex.internal.util;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public enum ArrayListSupplier implements Callable<List<Object>>, l<Object, List<Object>> {
    INSTANCE;

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // io.reactivex.functions.l
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public List<Object> call() {
        return new ArrayList();
    }
}
