package retrofit2;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements nmf<Throwable, f> {
    final /* synthetic */ b $this_awaitResponse$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(b bVar) {
        super(1);
        this.$this_awaitResponse$inlined = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
        return f.a;
    }
}
