package retrofit2;

import java.util.concurrent.CompletableFuture;
import retrofit2.g;

class e extends CompletableFuture<R> {
    final /* synthetic */ b a;

    e(g.a aVar, b bVar) {
        this.a = bVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
