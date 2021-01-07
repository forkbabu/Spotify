package retrofit2;

import java.util.concurrent.CompletableFuture;
import retrofit2.g;

class f implements d<R> {
    final /* synthetic */ CompletableFuture a;

    f(g.a aVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    @Override // retrofit2.d
    public void a(b<R> bVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // retrofit2.d
    public void b(b<R> bVar, v<R> vVar) {
        if (vVar.f()) {
            this.a.complete(vVar.a());
        } else {
            this.a.completeExceptionally(new HttpException(vVar));
        }
    }
}
