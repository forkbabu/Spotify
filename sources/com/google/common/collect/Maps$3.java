package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;
import java.util.Map;

final class Maps$3 extends TransformedIterator<K, Map.Entry<K, V>> {
    final /* synthetic */ Function val$function;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Maps$3(Iterator it, Function function) {
        super(it);
        this.val$function = function;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.TransformedIterator
    public Object transform(Object obj) {
        return new ImmutableEntry(obj, this.val$function.apply(obj));
    }
}
