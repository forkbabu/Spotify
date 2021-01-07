package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.sh9;
import defpackage.th9;
import defpackage.uh9;
import java.util.List;

/* renamed from: di9  reason: default package */
public abstract class di9 implements Parcelable {
    public static final di9 a = a().a();

    /* renamed from: di9$a */
    public static abstract class a {
        public abstract di9 a();

        public abstract a b(ImmutableList<b> immutableList);

        public abstract a c(boolean z);

        public abstract a d(boolean z);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(List<d> list);

        public abstract a h(String str);
    }

    /* renamed from: di9$b */
    public static abstract class b implements Parcelable {

        /* renamed from: di9$b$a */
        public static abstract class a {
            public abstract a a(SpotifyIconV2 spotifyIconV2);

            public abstract a b(String str);

            public abstract b c();

            public abstract a d(String str);

            public abstract a e(SpotifyIconV2 spotifyIconV2);

            public abstract a f(String str);

            public abstract a g(boolean z);
        }

        public static a c() {
            return new th9.b();
        }

        public abstract SpotifyIconV2 a();

        public abstract String b();

        public abstract String e();

        public abstract SpotifyIconV2 f();

        public abstract String g();

        public abstract boolean h();

        public abstract a i();
    }

    /* renamed from: di9$c */
    public static class c {
    }

    /* renamed from: di9$d */
    public static abstract class d implements Parcelable {

        /* renamed from: di9$d$a */
        public static abstract class a {
            public abstract d a();

            public abstract a b(boolean z);

            public abstract a c(ane ane);

            public abstract a d(int i);
        }

        public static a a() {
            uh9.a aVar = new uh9.a();
            aVar.b(false);
            return aVar;
        }

        public abstract boolean b();

        public abstract ane c();

        public abstract int e();
    }

    /* renamed from: di9$e */
    public static class e {
    }

    public static a a() {
        sh9.b bVar = new sh9.b();
        bVar.e("");
        bVar.f("");
        bVar.d(false);
        bVar.c(false);
        bVar.g(ImmutableList.of());
        bVar.b(ImmutableList.of());
        bVar.h("");
        return bVar;
    }

    public abstract ImmutableList<b> b();

    public abstract boolean c();

    public abstract boolean e();

    public abstract String f();

    public abstract String g();

    public abstract ImmutableList<d> h();

    public abstract String i();

    public abstract a j();
}
