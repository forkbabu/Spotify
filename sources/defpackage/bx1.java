package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.mobile.android.util.Assertion;
import defpackage.yda;
import io.reactivex.disposables.b;
import io.reactivex.s;

/* renamed from: bx1  reason: default package */
public class bx1 {
    private final s<String> a;
    private yda b;
    private final hv3 c;
    private b d;

    public bx1(s<String> sVar, yda yda, hv3 hv3) {
        this.a = sVar;
        this.b = yda;
        this.c = hv3;
    }

    public void a() {
        this.d = this.a.N0(1).subscribe(new xw1(this), ww1.a);
    }

    public void b() {
        try {
            this.c.b(this.b);
        } catch (JsonProcessingException e) {
            Assertion.i("Could not disconnect BT as external accessory", e);
        }
        b bVar = this.d;
        if (bVar != null && !bVar.d()) {
            this.d.dispose();
        }
        this.d = null;
    }

    public void c(String str) {
        yda yda = this.b;
        yda.b bVar = new yda.b("bluetooth");
        bVar.s(yda.i());
        bVar.l(str);
        bVar.o(yda.e());
        bVar.n(yda.c());
        bVar.p(yda.f());
        yda k = bVar.k();
        this.b = k;
        try {
            this.c.a(k);
        } catch (JsonProcessingException e) {
            Assertion.i("Could not connect BT as external accessory", e);
        }
    }
}
