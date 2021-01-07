package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.u;
import defpackage.ru0;
import kotlin.jvm.internal.h;

/* renamed from: wu0  reason: default package */
public final class wu0 implements ru0.a {
    private final u a;
    private final yu0 b;

    public wu0(u uVar, yu0 yu0) {
        h.e(uVar, "flagProvider");
        h.e(yu0, "dataManager");
        this.a = uVar;
        this.b = yu0;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        if (!this.a.b()) {
            Logger.b("Cleaning device sorting data", new Object[0]);
            this.b.a();
        }
    }

    @Override // defpackage.ru0.a
    public void onStop() {
    }
}
