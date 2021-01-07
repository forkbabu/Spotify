package retrofit2;

import java.util.concurrent.CompletableFuture;
import retrofit2.g;

class i implements d<R> {
    final /* synthetic */ CompletableFuture a;

    i(g.b bVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // retrofit2.d
    public void a(b<R> bVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // retrofit2.d
    public void b(b<R> bVar, v<R> vVar) {
        this.a.complete(vVar);
    }
}
