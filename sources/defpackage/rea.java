package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.messages.ExternalAccessoryRemoteInteraction;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: rea  reason: default package */
public final class rea<V> implements Callable<d0<? extends String>> {
    final /* synthetic */ qea a;
    final /* synthetic */ nqe b;
    final /* synthetic */ yda c;

    rea(qea qea, nqe nqe, yda yda) {
        this.a = qea;
        this.b = nqe;
        this.c = yda;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public d0<? extends String> call() {
        this.a.e.a(this.b);
        qea qea = this.a;
        ExternalAccessoryRemoteInteraction w = qea.w(qea, this.c, this.b, qea.d.b(), this.a.f.a());
        this.a.b.c(w);
        Logger.b("Sent Gabito event: %s", w);
        return z.z(this.b.b());
    }
}
