package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.item.a;
import com.spotify.music.features.yourlibrary.musicpages.item.c;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.offline.a;
import defpackage.d39;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

public abstract class MusicItem implements d39.b<Type>, Parcelable {
    public static final MusicItem a;
    private static final EnumSet<Type> b = EnumSet.of(Type.SECTION_HEADER, Type.SECTION_HEADER_WITH_BUTTON, Type.SECTION_HEADER_CUSTOM);

    public enum Type {
        ADD_ARTISTS_BUTTON("add_artists_button"),
        ALBUM("album"),
        ARTIST("artist"),
        ARTIST_TWO_LINES("artist_two_lines"),
        BANNED_ARTISTS("banned_artists"),
        BANNED_TRACKS("banned_tracks"),
        CREATE_PLAYLIST_BUTTON("create_playlist_button"),
        DOWNLOAD_TOGGLE("download_toggle"),
        FILTER_INDICATOR("filter_indicator"),
        FILTER_INFO("filter_info"),
        FILTER_TAGS("filter_tags"),
        FOLDER("folder"),
        LIKED_SONGS("liked_songs"),
        LIKED_SONGS_EMPTY("liked_songs_empty"),
        LOADING_INDICATOR("loading_indicator"),
        PLACEHOLDER("placeholder"),
        PLAYLIST("playlist"),
        SECTION_HEADER("section-header"),
        SECTION_HEADER_CUSTOM("section-header-custom"),
        SECTION_HEADER_WITH_BUTTON("section-header-with-action-button"),
        TRACK(AppProtocol.TrackData.TYPE_TRACK),
        TRACK_SHUFFLE_ONLY("track_shuffle_only"),
        YOUR_EPISODES("your_episodes");
        
        public static final Type[] G = values();
        private final String mStringValue;

        private Type(String str) {
            this.mStringValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStringValue;
        }
    }

    static class a implements Parcelable.Creator<MusicItem> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MusicItem createFromParcel(Parcel parcel) {
            return i.CREATOR.createFromParcel(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MusicItem[] newArray(int i) {
            return new i[i];
        }
    }

    public static abstract class b {
        public abstract b a(int i);

        public abstract MusicItem b();

        public abstract b c(c cVar);

        public abstract b d(List<fb9> list);

        public abstract b e(boolean z);

        public abstract b f(String str);

        public abstract b g(int i);

        public abstract b h(boolean z);

        public abstract b i(boolean z);

        public abstract b j(Boolean bool);

        public abstract b k(com.spotify.playlist.models.offline.a aVar);

        public abstract b l(boolean z);

        public abstract b m(String str);

        public abstract b n(String str);

        public abstract b o(String str);

        public abstract b p(Type type);

        public abstract b q(long j);

        public abstract b r(String str);
    }

    public interface c extends Parcelable {
    }

    public static class d {
    }

    public static abstract class e implements c {

        public static abstract class a {
        }

        public abstract List<va9> a();
    }

    public static abstract class f implements c {

        public static abstract class a {
            public abstract f a();

            public abstract a b(String str);

            public abstract a c(boolean z);

            public abstract a d(String str);

            public abstract a e(boolean z);

            public abstract a f(String str);

            public abstract a g(String str);

            public abstract a h(String str);
        }

        static {
            a().a();
        }

        public static a a() {
            c.a aVar = new c.a();
            aVar.b("");
            aVar.h("");
            aVar.g("");
            aVar.f("");
            aVar.c(false);
            aVar.e(false);
            aVar.d("");
            return aVar;
        }

        public abstract String b();

        public abstract boolean c();

        public abstract String e();

        public abstract boolean f();

        public abstract String g();

        public abstract String h();

        public abstract String i();
    }

    public static abstract class g implements c {

        public static abstract class a {
            public abstract a a(boolean z);

            public abstract g b();

            public abstract a c(boolean z);

            public abstract a d(boolean z);

            public abstract a e(boolean z);

            public abstract a f(boolean z);

            public abstract a g(boolean z);

            public abstract a h(boolean z);

            public abstract a i(boolean z);

            public abstract a j(PlayabilityRestriction playabilityRestriction);

            public abstract a k(String str);

            public abstract a l(boolean z);
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract String e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean j();

        public abstract PlayabilityRestriction k();

        public abstract String l();

        public abstract boolean m();

        public abstract a n();
    }

    static {
        b c2 = c();
        c2.q(0);
        c2.p(Type.PLACEHOLDER);
        a = c2.b();
    }

    public static b c() {
        a.b bVar = new a.b();
        bVar.o("");
        bVar.m("");
        bVar.r("");
        bVar.n("");
        bVar.a(0);
        bVar.f("");
        bVar.j(null);
        bVar.k(a.f.a);
        bVar.h(true);
        bVar.e(false);
        bVar.l(false);
        bVar.i(false);
        bVar.g(-1);
        bVar.t(null);
        bVar.s(null);
        bVar.d(null);
        return bVar;
    }

    public static MusicItem e(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3, com.spotify.playlist.models.offline.a aVar, String str6) {
        fg9 c2 = fg9.c(str6);
        return new i(j, Type.ALBUM, true, z2, z3, false, str, str2, str3, str4, str5, i, i2, Boolean.valueOf(z), aVar, null, c2.d(), c2.b(), null);
    }

    public static Parcelable.Creator<MusicItem> f() {
        return new a();
    }

    public abstract String A();

    @Override // defpackage.d39.b
    public abstract long a();

    public abstract int b();

    public abstract c g();

    public abstract List<fb9> h();

    public abstract boolean i();

    public abstract String j();

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract Boolean n();

    public boolean o() {
        return type() == Type.TRACK || type() == Type.TRACK_SHUFFLE_ONLY;
    }

    public abstract com.spotify.playlist.models.offline.a p();

    public abstract Date q();

    public abstract String r();

    public f s() {
        if (!b.contains(type()) || g() == null) {
            Assertion.n();
        }
        return (f) g();
    }

    public abstract boolean t();

    public abstract String u();

    public abstract String v();

    public abstract String w();

    public abstract b x();

    public g y() {
        if (!o() || g() == null) {
            Assertion.n();
        }
        return (g) g();
    }

    /* renamed from: z */
    public abstract Type type();
}
