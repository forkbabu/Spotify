package kotlin.coroutines.intrinsics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.h;

public final class a extends b {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.a<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> kotlin.coroutines.a<T> a(kotlin.coroutines.a<? super T> aVar) {
        h.e(aVar, "$this$intercepted");
        ContinuationImpl continuationImpl = !(aVar instanceof ContinuationImpl) ? null : aVar;
        return continuationImpl != null ? (kotlin.coroutines.a<T>) continuationImpl.h() : aVar;
    }
}
