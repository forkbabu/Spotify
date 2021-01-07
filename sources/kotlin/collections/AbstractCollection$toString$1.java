package kotlin.collections;

import kotlin.jvm.internal.Lambda;

final class AbstractCollection$toString$1 extends Lambda implements nmf<E, CharSequence> {
    final /* synthetic */ AbstractCollection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractCollection$toString$1(AbstractCollection abstractCollection) {
        super(1);
        this.this$0 = abstractCollection;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.nmf
    public CharSequence invoke(Object obj) {
        return obj == this.this$0 ? "(this Collection)" : String.valueOf(obj);
    }
}
