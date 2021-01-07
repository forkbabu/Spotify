package com.spotify.music.features.queue;

import androidx.recyclerview.widget.m;
import com.spotify.music.features.queue.v;
import java.util.List;

/* access modifiers changed from: package-private */
public final class u extends m.b {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    u(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public boolean a(int i, int i2) {
        return ((v.a) this.a.get(i)).b.equals(((v.a) this.b.get(i2)).b);
    }

    @Override // androidx.recyclerview.widget.m.b
    public boolean b(int i, int i2) {
        return ((v.a) this.a.get(i)).b.hashCode() == ((v.a) this.b.get(i2)).b.hashCode();
    }

    @Override // androidx.recyclerview.widget.m.b
    public int d() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public int e() {
        return this.a.size();
    }
}
