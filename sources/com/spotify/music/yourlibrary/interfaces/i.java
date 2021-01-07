package com.spotify.music.yourlibrary.interfaces;

import android.os.Parcelable;
import com.spotify.music.yourlibrary.interfaces.a;

public abstract class i implements Parcelable {
    public static final i a;

    public static abstract class a {
        public abstract i a();

        public abstract a b(int i);

        public abstract a c(boolean z);

        public abstract a d(boolean z);

        public abstract a e(int i);
    }

    static {
        a.b bVar = new a.b();
        bVar.d(false);
        bVar.c(false);
        bVar.b(0);
        bVar.e(0);
        a = bVar.a();
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int e();

    public abstract a f();
}
