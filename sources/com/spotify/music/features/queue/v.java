package com.spotify.music.features.queue;

import androidx.recyclerview.widget.m;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import io.reactivex.g;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class v {
    private final List<a> a;
    private rx7 b;
    private int c;
    private boolean d;
    private final PublishProcessor<m.c> e = PublishProcessor.r0();

    /* access modifiers changed from: package-private */
    public static class a {
        final int a;
        final Object b;

        a(int i, Object obj, u uVar) {
            this.a = i;
            this.b = obj;
        }
    }

    public v(rx7 rx7) {
        rx7.getClass();
        this.b = rx7;
        this.a = Collections2.newArrayListWithCapacity(rx7.b());
        b(rx7);
        c(rx7);
        a(rx7);
        f();
    }

    private void a(rx7 rx7) {
        if (rx7.e().length != 0) {
            this.a.add(new a(4, new jsb(C0707R.string.queue_section_next_from_context, rx7.f()), null));
            for (sx7 sx7 : rx7.e()) {
                this.a.add(new a(3, sx7, null));
            }
        }
    }

    private void b(rx7 rx7) {
        PlayerTrack c2 = rx7.c();
        if (c2 != null) {
            this.a.add(new a(4, new lsb(C0707R.string.queue_section_now_playing), null));
            this.a.add(new a(1, sx7.a(c2, false, false, false, false), null));
        }
    }

    private void c(rx7 rx7) {
        if (rx7.a().length > 0) {
            this.a.add(new a(5, new tx7(new lsb(C0707R.string.queue_section_next_in_queue), this.d), null));
        }
        for (sx7 sx7 : rx7.a()) {
            this.a.add(new a(2, sx7, null));
        }
    }

    private void f() {
        HashMap hashMap = new HashMap(this.a.size());
        for (a aVar : this.a) {
            a aVar2 = (a) hashMap.put(Integer.valueOf(aVar.b.hashCode()), aVar);
            if (aVar2 != null) {
                StringBuilder V0 = je.V0("id collision for: ");
                V0.append(aVar2.b);
                V0.append(" and ");
                V0.append(aVar.b);
                Assertion.g(V0.toString());
            }
        }
    }

    public boolean d(int i) {
        if (i < 0 || i >= g()) {
            return false;
        }
        int i2 = this.b.c() == null ? 0 : 2;
        if (i < i2) {
            return false;
        }
        int i3 = i2 + 1;
        if (!(i3 < g() && j(i3) == 2) || i != i2) {
            return true;
        }
        return false;
    }

    public g<m.c> e() {
        return this.e;
    }

    public int g() {
        return this.a.size();
    }

    public Object h(int i) {
        return this.a.get(i).b;
    }

    public long i(int i) {
        return (long) this.a.get(i).b.hashCode();
    }

    public int j(int i) {
        return this.a.get(i).a;
    }

    public PlayerTrack[] k() {
        return (PlayerTrack[]) FluentIterable.from(this.a).filter(g.a).transform(f.a).toArray(PlayerTrack.class);
    }

    public boolean l(rx7 rx7) {
        return this.b.equals(rx7);
    }

    public void m(int i, int i2) {
        if (i >= 0) {
            a remove = this.a.remove(i);
            int i3 = this.c;
            if (i < i3 && i2 >= i3) {
                this.c = i3 - 1;
            } else if (i > i3 && i2 <= i3) {
                this.c = i3 + 1;
            }
            this.a.add(i2, remove);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        a aVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < this.a.size()) {
            a aVar2 = this.a.get(i);
            int i2 = aVar2.a;
            boolean z = true;
            if (i2 == 2 && i >= this.c) {
                aVar = new a(3, aVar2.b, null);
            } else {
                if (i2 != 3 || i >= this.c) {
                    z = false;
                }
                if (z) {
                    aVar = new a(2, aVar2.b, null);
                } else {
                    arrayList.add(aVar2);
                    i++;
                }
            }
            aVar2 = aVar;
            arrayList.add(aVar2);
            i++;
        }
        this.a.clear();
        this.a.addAll(arrayList);
    }

    public void o(boolean z) {
        this.d = z;
        p(this.b);
    }

    public void p(rx7 rx7) {
        ArrayList arrayList = new ArrayList(this.a);
        this.b = rx7;
        this.a.clear();
        b(rx7);
        c(rx7);
        this.c = this.a.size();
        a(rx7);
        f();
        this.e.onNext(m.b(new u(arrayList, this.a), true));
    }
}
