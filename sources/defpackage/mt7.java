package defpackage;

import android.os.Parcelable;
import com.spotify.music.features.profile.model.e;
import defpackage.et7;

/* renamed from: mt7  reason: default package */
public abstract class mt7 implements Parcelable {
    public static final mt7 a;

    /* renamed from: mt7$a */
    public static abstract class a {
        public abstract mt7 a();

        public abstract a b(String str);

        public abstract a c(e eVar);

        public abstract a d(String str);
    }

    static {
        et7.b bVar = new et7.b();
        bVar.d("");
        bVar.b("");
        bVar.c(e.a);
        a = bVar.a();
    }

    public abstract String a();

    public abstract e b();

    public abstract String c();

    public abstract a e();
}
