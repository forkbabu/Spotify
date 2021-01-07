package defpackage;

import com.spotify.mobile.android.util.l0;
import defpackage.zo6;

/* renamed from: ct6  reason: default package */
public class ct6 implements zo6.a {
    private final boolean a;
    private final zo6.c b;
    private final lga c;
    private final fga d;

    public ct6(et6 et6, lga lga, boolean z, fga fga) {
        this.a = z;
        this.b = et6;
        this.c = lga;
        this.d = fga;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        if (!this.a || !this.c.a()) {
            return false;
        }
        String k = l0.z(bVar.b()).k();
        fga fga = this.d;
        if (k == null) {
            k = "";
        }
        return fga.a(k);
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.b;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return bt6.class;
    }
}
