package com.spotify.music.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.sociallistening.participantlist.impl.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SimpleNavigationManager {
    private final Deque<u3<gz1, String>> a = new ArrayDeque();
    private String b;
    private Fragment c;
    private final Context d;
    private final y e;
    private final o f;
    private final Set<xs2> g = new CopyOnWriteArraySet();
    private final z h;
    private final int i;

    public enum NavigationType {
        BACK,
        UP
    }

    SimpleNavigationManager(Context context, y yVar, o oVar, z zVar, int i2) {
        context.getClass();
        this.d = context;
        yVar.getClass();
        this.e = yVar;
        oVar.getClass();
        this.f = oVar;
        zVar.getClass();
        this.h = zVar;
        this.i = i2;
    }

    private void f(Fragment fragment, String str, boolean z) {
        x i2 = this.f.i();
        if (this.c == null) {
            i2.b(this.i, fragment);
        } else {
            if (z) {
                if (this.a.size() >= 30) {
                    this.a.removeLast();
                }
                this.a.push(new u3<>(gz1.a(this.f, this.c), this.b));
            }
            i2.q(this.i, fragment, null);
        }
        this.c = fragment;
        this.b = str;
        i2.i();
        for (xs2 xs2 : this.g) {
            Fragment fragment2 = this.c;
            fragment2.getClass();
            String str2 = this.b;
            str2.getClass();
            xs2.a(fragment2, str2);
        }
    }

    public void a(xs2 xs2) {
        this.g.add(xs2);
    }

    public Fragment b() {
        return this.c;
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public boolean d(NavigationType navigationType) {
        if (this.a.isEmpty()) {
            return false;
        }
        String str = this.b;
        u3<gz1, String> pop = this.a.pop();
        Fragment c2 = pop.a.c(this.f);
        S s = pop.b;
        s.getClass();
        f(c2, s, false);
        this.h.a(str, this.b, navigationType);
        return true;
    }

    public void e(xs2 xs2) {
        this.g.remove(xs2);
    }

    public void g(String str, String str2, SessionState sessionState, boolean z, yn0 yn0, Bundle bundle) {
        str.getClass();
        yn0.getClass();
        s a2 = this.e.a(str, str2, sessionState, z);
        if (a2 != y.a && !TextUtils.equals(this.b, str)) {
            Fragment e2 = a2.e();
            Bundle D2 = e2.D2();
            if (D2 == null) {
                D2 = new Bundle();
            }
            D2.putString("username", sessionState.currentUser());
            if (bundle != null) {
                D2.putAll(bundle);
            }
            e2.r4(D2);
            m.d(e2, yn0);
            f(e2, str, true);
        }
    }

    public void h(Bundle bundle) {
        ClassLoader classLoader = this.d.getClassLoader();
        Parcelable parcelable = bundle.getParcelable("key_current_fragment_state");
        if (parcelable != null) {
            Bundle bundle2 = (Bundle) parcelable;
            this.c = this.f.Y(bundle2, "key_current_fragment");
            this.b = bundle2.getString("key_current_fragment_uri", "");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("key_entry_fragments_states");
        if (parcelableArray != null) {
            for (Parcelable parcelable2 : parcelableArray) {
                Bundle bundle3 = (Bundle) parcelable2;
                bundle3.setClassLoader(classLoader);
                this.a.push(new u3<>(gz1.d(classLoader, bundle3.getParcelable("key_entry_fragment")), bundle3.getString("key_entry_fragment_uri", "")));
            }
        }
    }

    public Bundle i() {
        int i2;
        Bundle bundle = new Bundle();
        if (this.c != null) {
            Bundle bundle2 = new Bundle();
            this.f.z0(bundle2, "key_current_fragment", this.c);
            bundle2.putString("key_current_fragment_uri", this.b);
            bundle.putParcelable("key_current_fragment_state", bundle2);
            i2 = gf0.i(bundle).length + 0;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < 524288) {
            for (u3<gz1, String> u3Var : this.a) {
                F f2 = u3Var.a;
                f2.getClass();
                u3<Parcelable, Integer> e2 = f2.e();
                S s = e2.b;
                s.getClass();
                i2 += s.intValue();
                if (i2 >= 524288) {
                    break;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("key_entry_fragment", e2.a);
                bundle3.putString("key_entry_fragment_uri", u3Var.b);
                arrayList.add(0, bundle3);
            }
        }
        bundle.putParcelableArray("key_entry_fragments_states", (Parcelable[]) arrayList.toArray(new Bundle[0]));
        return bundle;
    }
}
