package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class Multisets$5 extends TransformedIterator<Multiset.Entry<E>, E> {
    Multisets$5(Iterator it) {
        super(it);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.TransformedIterator
    public Object transform(Object obj) {
        return ((Multiset.Entry) obj).getElement();
    }
}
