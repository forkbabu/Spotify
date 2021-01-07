package defpackage;

import com.spotify.music.builtinauth.model.a;
import io.reactivex.b;
import io.reactivex.d;

/* renamed from: eq1  reason: default package */
public final /* synthetic */ class eq1 implements d {
    public final /* synthetic */ fq1 a;
    public final /* synthetic */ a b;

    public /* synthetic */ eq1(fq1 fq1, a aVar) {
        this.a = fq1;
        this.b = aVar;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.c(this.b, bVar);
    }
}
