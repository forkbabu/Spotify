package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.datasource.c;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public abstract class y3 implements r4, Parcelable {
    public static final y3 a;
    public static final y3 b;

    public static abstract class a {
        public abstract y3 a();

        public abstract a b(x3 x3Var);

        public abstract a c(int i);

        public abstract a d(int i);

        public abstract a e(boolean z);

        public abstract a f(ImmutableList<MusicItem> immutableList);

        public abstract a g(y3 y3Var);

        public abstract a h(MusicItem musicItem);
    }

    public static class b {
    }

    static {
        c.b bVar = new c.b();
        bVar.e(false);
        bVar.c(0);
        bVar.d(0);
        bVar.f(ImmutableList.of());
        bVar.h(MusicItem.a);
        bVar.b(null);
        bVar.g(null);
        y3 a2 = bVar.a();
        a = a2;
        a l = a2.l();
        l.e(true);
        b = l.a();
    }

    public abstract x3 a();

    public abstract int b();

    public abstract int c();

    public x3 e() {
        y3 y3Var = this;
        while (y3Var.a() == null && y3Var.j() != null) {
            y3Var = y3Var.j();
            y3Var.getClass();
        }
        return y3Var.a();
    }

    public boolean f() {
        for (y3 y3Var = this; y3Var != null; y3Var = y3Var.j()) {
            if (y3Var.h()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        for (y3 y3Var = this; y3Var != null; y3Var = y3Var.j()) {
            if (!y3Var.i().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.r4
    public int getCount() {
        y3 j = j();
        return b() + (j != null ? j.getCount() : 0);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.r4
    public MusicItem getItem(int i) {
        if (i >= b()) {
            y3 j = j();
            if (j != null) {
                return j.getItem(i - b());
            }
        } else if (i >= c() && i - c() < i().size()) {
            return i().get(i - c());
        }
        return k();
    }

    public abstract boolean h();

    public abstract ImmutableList<MusicItem> i();

    public abstract y3 j();

    public abstract MusicItem k();

    public abstract a l();
}
