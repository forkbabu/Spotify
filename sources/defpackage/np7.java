package defpackage;

import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist;
import defpackage.kp7;
import java.util.Collections;
import java.util.List;

/* renamed from: np7  reason: default package */
public abstract class np7 {
    public static final np7 a;

    /* renamed from: np7$a */
    public static abstract class a {
        public abstract np7 a();

        public abstract a b(int i);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(boolean z);

        public abstract a f(ct7 ct7);

        public abstract a g(boolean z);

        public abstract a h(String str);

        public abstract a i(LoadingState loadingState);

        public abstract a j(List<PlaylistlistResponse$Playlist> list);

        public abstract a k(int i);

        public abstract a l(List<ArtistlistResponse$Artist> list);

        public abstract a m(boolean z);

        public abstract a n(String str);

        public abstract a o(String str);

        public abstract a p(boolean z);
    }

    static {
        kp7.b bVar = new kp7.b();
        bVar.i(LoadingState.NOT_LOADED);
        bVar.o("");
        bVar.c("");
        bVar.d("");
        bVar.h("");
        bVar.g(false);
        bVar.p(false);
        bVar.e(false);
        bVar.m(false);
        bVar.k(0);
        bVar.f(ct7.a);
        bVar.l(Collections.emptyList());
        bVar.j(Collections.emptyList());
        bVar.n("");
        bVar.b(0);
        a = bVar.a();
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public abstract ct7 e();

    public abstract boolean f();

    public abstract String g();

    public abstract LoadingState h();

    public abstract List<PlaylistlistResponse$Playlist> i();

    public abstract int j();

    public abstract List<ArtistlistResponse$Artist> k();

    public abstract boolean l();

    public abstract String m();

    public abstract a n();

    public abstract String o();

    public abstract boolean p();
}
