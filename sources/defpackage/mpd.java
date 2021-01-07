package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.ipd;
import defpackage.jpd;

/* renamed from: mpd  reason: default package */
public abstract class mpd {

    /* renamed from: mpd$a */
    public static abstract class a {
        public abstract mpd a();

        public abstract a b(boolean z);

        public abstract a c(boolean z);

        public abstract a d(ImmutableList<b> immutableList);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    /* renamed from: mpd$b */
    public static abstract class b {

        /* renamed from: mpd$b$a */
        public static abstract class a {
            public abstract a a(boolean z);

            public abstract b b();

            public abstract a c(SpotifyIconV2 spotifyIconV2);

            public abstract a d(String str);

            public abstract a e(String str);
        }

        public static a b() {
            return new jpd.b();
        }

        public abstract boolean a();

        public abstract SpotifyIconV2 c();

        public abstract String d();

        public abstract String e();
    }

    public static mpd c() {
        ipd.b bVar = new ipd.b();
        bVar.b(false);
        bVar.e("");
        bVar.c(false);
        bVar.f("");
        bVar.d(ImmutableList.of());
        return bVar.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract ImmutableList<b> d();

    public abstract String e();

    public abstract String f();

    public abstract a g();
}
