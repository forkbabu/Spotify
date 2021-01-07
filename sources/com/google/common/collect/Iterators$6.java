package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class Iterators$6 extends TransformedIterator<F, T> {
    final /* synthetic */ Function val$function;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Iterators$6(Iterator it, Function function) {
        super(it);
        this.val$function = function;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.TransformedIterator
    public T transform(F f) {
        return (T) this.val$function.apply(f);
    }
}
