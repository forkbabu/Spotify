package retrofit2;

import java.util.concurrent.CompletableFuture;
import retrofit2.g;

class h extends CompletableFuture<v<R>> {
    final /* synthetic */ b a;

    h(g.b bVar, b bVar2) {
        this.a = bVar2;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
