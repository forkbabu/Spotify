package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.a;
import com.facebook.f;
import com.facebook.i;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.o;
import com.spotify.music.libs.facebook.q;

/* renamed from: tl0  reason: default package */
public class tl0 {
    final f a = new CallbackManagerImpl();
    private final q b;

    public tl0(q qVar) {
        this.b = qVar;
    }

    public void a(int i, int i2, Intent intent) {
        ((CallbackManagerImpl) this.a).a(i, i2, intent);
    }

    public void b(Fragment fragment, i<com.facebook.login.q> iVar) {
        o a2 = this.b.a();
        this.b.getClass();
        if (a.e() != null) {
            a2.j();
        }
        a2.l(this.a, iVar);
        a2.i(fragment, q.d);
    }
}
