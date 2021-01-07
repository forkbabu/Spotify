package defpackage;

import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import com.spotify.base.java.logging.a;
import com.spotify.base.java.logging.b;
import com.spotify.base.java.logging.g;
import com.spotify.base.java.logging.h;
import defpackage.ov9;
import java.util.ArrayList;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
/* renamed from: lv9  reason: default package */
public final class lv9 {
    private final qf0 a;
    private final ov9.a b;

    lv9(qf0 qf0, ov9.a aVar) {
        this.a = qf0;
        this.b = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        EnumSet enumSet;
        ArrayList arrayList = new ArrayList(6);
        boolean b2 = this.b.b();
        if (b2) {
            enumSet = EnumSet.allOf(LogLevel.class);
        } else {
            enumSet = EnumSet.of(LogLevel.ERROR);
        }
        arrayList.add(new pf0(enumSet));
        arrayList.add(this.a);
        Logger.a(b2 ? new g() : new a(), b2 ? new b() : new h(), arrayList);
    }
}
