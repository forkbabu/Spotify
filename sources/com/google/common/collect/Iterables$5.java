package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class Iterables$5 extends FluentIterable<T> {
    final /* synthetic */ Iterable val$fromIterable;
    final /* synthetic */ Function val$function;

    Iterables$5(Iterable iterable, Function function) {
        this.val$fromIterable = iterable;
        this.val$function = function;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return Collections2.transform(this.val$fromIterable.iterator(), this.val$function);
    }
}
