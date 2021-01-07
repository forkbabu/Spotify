package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements cmf<Iterator<? extends T>> {
    final /* synthetic */ Iterable $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CollectionsKt___CollectionsKt$withIndex$1(Iterable iterable) {
        super(0);
        this.$this_withIndex = iterable;
    }

    @Override // defpackage.cmf
    public Object invoke() {
        return this.$this_withIndex.iterator();
    }
}
