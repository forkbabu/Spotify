package defpackage;

import android.os.Bundle;
import com.facebook.HttpMethod;
import com.facebook.a;
import com.facebook.m;
import com.spotify.music.libs.facebook.q;
import defpackage.yl0;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: zl0  reason: default package */
public class zl0 {
    private final y a;
    private final q b;

    public zl0(y yVar, q qVar) {
        this.a = yVar;
        this.b = qVar;
    }

    public com.facebook.q a(Bundle bundle) {
        this.b.getClass();
        return new m(a.e(), "me", bundle, HttpMethod.GET).g();
    }

    public com.facebook.q b() {
        Bundle E = je.E("fields", "picture.type(large)");
        this.b.getClass();
        return new m(a.e(), "me", E, HttpMethod.GET).g();
    }

    public s<yl0> c() {
        return s.c0(new wl0(this, je.E("fields", "id,first_name,name,email"))).j0(vl0.a).G0(yl0.b.a).I0(this.a);
    }

    public s<String> d() {
        return s.c0(new ul0(this)).j0(xl0.a).I0(this.a);
    }
}
