package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.b;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: u01  reason: default package */
public final class u01 implements d {
    private final Map<Class<? extends Destination>, y01<? extends Destination>> a;
    private final c b;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends com.spotify.loginflow.navigation.Destination>, ? extends y01<? extends com.spotify.loginflow.navigation.Destination>> */
    /* JADX WARN: Multi-variable type inference failed */
    public u01(Map<Class<? extends Destination>, ? extends y01<? extends Destination>> map, c cVar) {
        h.e(map, "destinations");
        h.e(cVar, "activity");
        this.a = map;
        this.b = cVar;
    }

    private final <T extends Destination> y01<T> e(T t) {
        try {
            y01<T> y01 = (y01<T>) this.a.get(t.getClass());
            if (y01 != null) {
                return y01;
            }
            throw new IllegalStateException("Could not find a Resolver for the destination (" + t.getClass() + ')');
        } catch (ClassCastException e) {
            StringBuilder V0 = je.V0("The resolver for ");
            V0.append(t.getClass());
            V0.append(" does not have the same class");
            throw new IllegalStateException(V0.toString(), e);
        }
    }

    private final void f(Fragment fragment, b bVar) {
        x i = this.b.v0().i();
        b.a a2 = bVar.a();
        if (a2 != null) {
            i.t(a2.a(), a2.b(), a2.c(), a2.d());
        }
        i.q(C0707R.id.zero_navigation_container, fragment, "flow_fragment");
        h.d(i, "activity.supportFragment…w_fragment\"\n            )");
        if (this.b.v0().U("flow_fragment") != null) {
            i.g(null);
        }
        i.i();
    }

    private final void g(Intent intent, b bVar) {
        Bundle bundle;
        c cVar = this.b;
        b.a a2 = bVar.a();
        if (a2 != null) {
            bundle = new Bundle();
            bundle.putInt("zero_enter_anim", a2.c());
            bundle.putInt("zero_enter_anim", a2.d());
        } else {
            bundle = null;
        }
        cVar.startActivity(intent, bundle);
        b.a a3 = bVar.a();
        if (a3 != null) {
            this.b.overridePendingTransition(a3.a(), a3.b());
        }
    }

    @Override // com.spotify.loginflow.navigation.d
    public <T extends Destination> void a(int i, T t, b bVar) {
        h.e(t, "destination");
        if (bVar == null) {
            bVar = new b(new b.a(C0707R.anim.nav_slide_in_right, C0707R.anim.nav_slide_out_left, C0707R.anim.nav_slide_in_left, C0707R.anim.nav_slide_out_right));
        }
        y01<T> e = e(t);
        Bundle bundle = null;
        if (!(e instanceof v01)) {
            e = null;
        }
        v01 v01 = (v01) e;
        if (v01 != null) {
            c cVar = this.b;
            Intent b2 = v01.b(t, cVar);
            b.a a2 = bVar.a();
            if (a2 != null) {
                bundle = new Bundle();
                bundle.putInt("zero_enter_anim", a2.c());
                bundle.putInt("zero_enter_anim", a2.d());
            }
            cVar.startActivityForResult(b2, i, bundle);
            b.a a3 = bVar.a();
            if (a3 != null) {
                this.b.overridePendingTransition(a3.a(), a3.b());
                return;
            }
            return;
        }
        StringBuilder V0 = je.V0("Could not find an ActivityResolver for the destination (");
        V0.append(t.getClass());
        V0.append(')');
        throw new IllegalStateException(V0.toString());
    }

    @Override // com.spotify.loginflow.navigation.d
    public <T extends Destination> void b(T t) {
        h.e(t, "destination");
        h.e(t, "destination");
        c(t, null);
    }

    @Override // com.spotify.loginflow.navigation.d
    public <T extends Destination> void c(T t, b bVar) {
        Bundle bundle;
        h.e(t, "destination");
        if (bVar == null) {
            bVar = new b(new b.a(C0707R.anim.nav_slide_in_right, C0707R.anim.nav_slide_out_left, C0707R.anim.nav_slide_in_left, C0707R.anim.nav_slide_out_right));
        }
        y01<T> e = e(t);
        if (e instanceof w01) {
            DialogFragment a2 = ((w01) e).a(t);
            o v0 = this.b.v0();
            String h = ((kotlin.jvm.internal.d) j.b(t.getClass())).h();
            if (h == null) {
                h = "zero_dialog_fragment";
            }
            a2.Y4(v0, h);
        } else if (e instanceof x01) {
            f(((x01) e).a(t), bVar);
        } else if (e instanceof v01) {
            g(((v01) e).b(t, this.b), bVar);
        } else if (e instanceof z01) {
            z01 z01 = (z01) e;
            Object b2 = z01.b(t, this.b);
            if (b2 instanceof Fragment) {
                f((Fragment) b2, bVar);
            } else if (!(b2 instanceof Intent)) {
                StringBuilder V0 = je.V0("Resolver of type (");
                V0.append(e.getClass());
                V0.append(") for destination ");
                V0.append('(');
                V0.append(t.getClass());
                V0.append(") is not supported");
                throw new IllegalStateException(V0.toString());
            } else if (z01.c()) {
                Intent intent = (Intent) b2;
                c cVar = this.b;
                b.a a3 = bVar.a();
                if (a3 != null) {
                    bundle = new Bundle();
                    bundle.putInt("zero_enter_anim", a3.c());
                    bundle.putInt("zero_enter_anim", a3.d());
                } else {
                    bundle = null;
                }
                cVar.startActivityForResult(intent, 45501, bundle);
                b.a a4 = bVar.a();
                if (a4 != null) {
                    this.b.overridePendingTransition(a4.a(), a4.b());
                }
            } else {
                g((Intent) b2, bVar);
            }
        } else {
            StringBuilder V02 = je.V0("Resolver of type (");
            V02.append(e.getClass());
            V02.append(") for destination ");
            V02.append('(');
            V02.append(t.getClass());
            V02.append(") is not supported");
            throw new IllegalStateException(V02.toString());
        }
    }

    @Override // com.spotify.loginflow.navigation.d
    public <T extends Destination> void d(int i, T t) {
        h.e(t, "destination");
        h.e(t, "destination");
        a(i, t, null);
    }
}
