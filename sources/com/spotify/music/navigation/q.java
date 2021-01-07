package com.spotify.music.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class q implements r, i {
    private final o a;
    private final Set<xs2> b = new CopyOnWriteArraySet();
    private final Set<u> c = new CopyOnWriteArraySet();
    private final int d;
    private final Deque<u3<gz1, a>> e = new ArrayDeque();
    private final Context f;
    private final jz1 g;
    private final cqe h;
    private Fragment i;
    private a j;

    /* access modifiers changed from: private */
    public static class a {
        private String a;
        private final String b;
        private final String c;
        private final String d;

        a(String str, String str2, String str3, String str4) {
            this.a = str;
            str2.getClass();
            this.b = str2;
            this.c = str3;
            str4.getClass();
            this.d = str4;
        }

        static a e(Bundle bundle) {
            String string = bundle.getString("title");
            String string2 = bundle.getString("spotify_uri_key");
            String string3 = bundle.getString("tag");
            String string4 = bundle.getString("feature_id_key");
            string2.getClass();
            string4.getClass();
            return new a(string, string2, string3, string4);
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.a;
        }

        public void f(String str) {
            this.a = str;
        }

        /* access modifiers changed from: package-private */
        public void g(Bundle bundle) {
            String str = this.a;
            if (str != null) {
                bundle.putString("title", str);
            }
            bundle.putString("spotify_uri_key", this.b);
            bundle.putString("tag", this.c);
            bundle.putString("feature_id_key", this.d);
        }
    }

    public q(c cVar, int i2, jz1 jz1, cqe cqe) {
        cVar.getClass();
        this.f = cVar;
        o v0 = cVar.v0();
        v0.getClass();
        this.a = v0;
        MoreObjects.checkArgument(i2 != 0);
        this.d = i2;
        this.g = jz1;
        this.h = cqe;
    }

    private void l() {
        boolean z = true;
        boolean z2 = this.i == null;
        if (this.j != null) {
            z = false;
        }
        if (z2 != z) {
            throw new AssertionError();
        }
    }

    private void m(xs2 xs2) {
        String str;
        l();
        Fragment fragment = this.i;
        a aVar = this.j;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.b();
        }
        if (fragment != null && str != null) {
            xs2.a(fragment, str);
        }
    }

    private void n() {
        for (xs2 xs2 : this.b) {
            m(xs2);
        }
    }

    private void o(u uVar) {
        String str;
        l();
        Fragment fragment = this.i;
        a aVar = this.j;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.b();
        }
        if (fragment != null && str != null) {
            uVar.a(fragment, str);
        }
    }

    private void p() {
        for (u uVar : this.c) {
            o(uVar);
        }
    }

    @Override // com.spotify.music.navigation.r
    public void a(BackNavigationInteractionType backNavigationInteractionType) {
        if (!this.a.o0() && !this.e.isEmpty()) {
            p();
            x i2 = this.a.i();
            Fragment fragment = this.i;
            if (fragment != null) {
                i2.p(fragment);
            }
            a aVar = this.j;
            String str = null;
            if (aVar == null) {
                aVar = null;
            }
            u3<gz1, a> pop = this.e.pop();
            F f2 = pop.a;
            f2.getClass();
            Fragment c2 = f2.c(this.a);
            this.i = c2;
            this.j = pop.b;
            l();
            i2.b(this.d, c2);
            i2.i();
            this.a.Q();
            if (BackNavigationInteractionType.NO_BUTTON_PRESSED != backNavigationInteractionType) {
                String backNavigationInteractionType2 = backNavigationInteractionType.toString();
                String a2 = aVar != null ? aVar.a() : null;
                String b2 = aVar != null ? aVar.b() : null;
                jz1 jz1 = this.g;
                a aVar2 = this.j;
                if (aVar2 != null) {
                    str = aVar2.b();
                }
                jz1.a(new fa1(null, a2, b2, null, 0, str, "hit", backNavigationInteractionType2, (double) this.h.d()));
            }
            n();
        }
    }

    @Override // com.spotify.music.navigation.r
    public void b(Fragment fragment, String str, String str2, String str3, String str4, boolean z, c cVar) {
        p();
        x i2 = this.a.i();
        if (z) {
            Fragment fragment2 = this.i;
            if (fragment2 != null) {
                i2.p(fragment2);
                this.i = null;
                this.j = null;
            }
            this.e.clear();
        }
        if (this.e.size() >= 30) {
            this.e.removeLast();
        }
        if (cVar != null && cVar.b()) {
            i2.s(cVar.a(), 0);
        }
        Fragment fragment3 = this.i;
        if (fragment3 != null && fragment3.e3()) {
            this.e.push(new u3<>(gz1.a(this.a, this.i), this.j));
            i2.p(this.i);
        }
        fragment.getClass();
        this.i = fragment;
        this.j = new a(str, str2, str3, str4);
        i2.b(this.d, fragment);
        i2.i();
        this.a.Q();
        n();
    }

    @Override // com.spotify.music.navigation.i
    public String c() {
        String d2;
        a aVar = this.j;
        return (aVar == null || (d2 = aVar.d()) == null) ? "" : d2;
    }

    @Override // com.spotify.music.navigation.r
    public void d(Fragment fragment, String str, String str2, String str3, String str4, boolean z) {
        p();
        x i2 = this.a.i();
        if (z) {
            i2.s(C0707R.anim.fade_in_hard, 0);
        }
        Fragment fragment2 = this.i;
        if (fragment2 != null) {
            i2.p(fragment2);
            this.i = null;
            this.j = null;
        }
        i2.b(this.d, fragment);
        this.i = fragment;
        this.j = new a(str, str2, str3, str4);
        i2.i();
        this.a.Q();
        n();
    }

    @Override // com.spotify.music.navigation.r
    public boolean e() {
        return !this.e.isEmpty();
    }

    @Override // com.spotify.music.navigation.r
    public void f(String str, Fragment fragment, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        str.getClass();
        a aVar = this.j;
        if (aVar == null) {
            str6 = null;
        } else {
            str6 = aVar.c();
        }
        if (!rw.equal(str, str6) && !this.e.isEmpty()) {
            boolean z2 = false;
            Iterator<u3<gz1, a>> it = this.e.iterator();
            while (it.hasNext() && !z2) {
                S s = it.next().b;
                s.getClass();
                if (rw.equal(str, s.c())) {
                    z2 = true;
                }
            }
            if (z2) {
                u3<gz1, a> pop = this.e.pop();
                while (pop != null) {
                    S s2 = pop.b;
                    s2.getClass();
                    if (rw.equal(str, s2.c())) {
                        break;
                    }
                    pop = !this.e.isEmpty() ? this.e.pop() : null;
                }
            }
        }
        d(fragment, str2, str3, str4, str5, z);
    }

    public void g(xs2 xs2) {
        this.b.add(xs2);
        m(xs2);
    }

    public void h(u uVar) {
        this.c.add(uVar);
        o(uVar);
    }

    public void i() {
        this.e.clear();
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        if (this.i != null) {
            sb.append("active: ");
            sb.append(this.i.getClass());
            sb.append('\n');
        }
        for (u3<gz1, a> u3Var : this.e) {
            sb.append("inactive: ");
            F f2 = u3Var.a;
            f2.getClass();
            sb.append(f2.b());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // com.spotify.music.navigation.i
    public void k(Fragment fragment, String str) {
        a aVar;
        l();
        fragment.getClass();
        if (fragment.equals(this.i) && (aVar = this.j) != null) {
            aVar.f(str);
        }
    }

    public void q(xs2 xs2) {
        this.b.remove(xs2);
    }

    public void r(Bundle bundle) {
        ClassLoader classLoader = this.f.getClassLoader();
        this.e.clear();
        Parcelable parcelable = bundle.getParcelable("active");
        if (parcelable != null) {
            Bundle bundle2 = (Bundle) parcelable;
            Fragment Y = this.a.Y(bundle2, "fragment");
            this.i = Y;
            if (Y != null) {
                this.j = a.e(bundle2);
            }
            l();
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("entries");
        parcelableArray.getClass();
        for (Parcelable parcelable2 : parcelableArray) {
            Bundle bundle3 = (Bundle) parcelable2;
            bundle3.setClassLoader(classLoader);
            this.e.push(new u3<>(gz1.d(classLoader, bundle3.getParcelable("fragment_snapshot")), a.e(bundle3)));
        }
        n();
    }

    public Bundle s() {
        int i2;
        Bundle bundle = new Bundle();
        l();
        if (this.i == null || this.j == null) {
            i2 = 0;
        } else {
            Bundle bundle2 = new Bundle();
            this.a.z0(bundle2, "fragment", this.i);
            this.j.g(bundle2);
            bundle.putParcelable("active", bundle2);
            i2 = gf0.i(bundle).length + 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < 262144) {
            for (u3<gz1, a> u3Var : this.e) {
                Bundle bundle3 = new Bundle();
                F f2 = u3Var.a;
                f2.getClass();
                u3<Parcelable, Integer> e2 = f2.e();
                S s = e2.b;
                s.getClass();
                i2 += s.intValue();
                if (i2 >= 262144) {
                    break;
                }
                bundle3.putParcelable("fragment_snapshot", e2.a);
                S s2 = u3Var.b;
                s2.getClass();
                s2.g(bundle3);
                arrayList.add(0, bundle3);
            }
        }
        bundle.putParcelableArray("entries", (Parcelable[]) arrayList.toArray(new Bundle[0]));
        return bundle;
    }

    @Override // com.spotify.music.navigation.i
    public Fragment u() {
        return this.i;
    }
}
