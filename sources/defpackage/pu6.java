package defpackage;

import android.content.Context;
import com.spotify.playlist.models.j;
import io.reactivex.functions.a;

/* renamed from: pu6  reason: default package */
public final /* synthetic */ class pu6 implements a {
    public final /* synthetic */ av6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ j c;

    public /* synthetic */ pu6(av6 av6, Context context, j jVar) {
        this.a = av6;
        this.b = context;
        this.c = jVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.h(this.b, this.c);
    }
}
