package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.a;
import java.util.Map;

/* renamed from: nd9  reason: default package */
public final /* synthetic */ class nd9 implements a {
    public final /* synthetic */ od9 a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ Map c;

    public /* synthetic */ nd9(od9 od9, Optional optional, Map map) {
        this.a = od9;
        this.b = optional;
        this.c = map;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.a(this.b, this.c);
    }
}
