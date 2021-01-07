package defpackage;

import android.media.AudioRecord;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.schedulers.a;

/* renamed from: od0  reason: default package */
public final /* synthetic */ class od0 implements l {
    public final /* synthetic */ td0 a;

    public /* synthetic */ od0(td0 td0) {
        this.a = td0;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return g.p(new wd0((AudioRecord) obj, this.a.a()), BackpressureStrategy.DROP).e0(a.c());
    }
}
