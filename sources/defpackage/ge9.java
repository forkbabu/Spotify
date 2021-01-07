package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;

/* renamed from: ge9  reason: default package */
public abstract class ge9 {

    /* renamed from: ge9$a */
    public static final class a extends ge9 {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ge9
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) he9.c(((de9) ti04).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).a == this.a) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.a;
        }

        public int hashCode() {
            return je.n(this.a, 0);
        }

        public String toString() {
            return je.O0(je.V0("ConnectedState{connected="), this.a, '}');
        }
    }

    /* renamed from: ge9$b */
    public static final class b extends ge9 {
        private final ImmutableList<MusicItem> a;

        b(ImmutableList<MusicItem> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        @Override // defpackage.ge9
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) he9.b(((ae9) ti03).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final ImmutableList<MusicItem> f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DecoratedRecsReceived{decoratedRecs=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ge9$c */
    public static final class c extends ge9 {
        private final ImmutableList<RecsTrack> a;

        c(ImmutableList<RecsTrack> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        @Override // defpackage.ge9
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) ((be9) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final ImmutableList<RecsTrack> f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("RawRecsReceived{recsTracks=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: ge9$d */
    public static final class d extends ge9 {
        private final ImmutableList<String> a;

        d(ImmutableList<String> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        @Override // defpackage.ge9
        public final <R_> R_ c(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) he9.a(((ce9) ti0).a, this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final ImmutableList<String> f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SourceTracksUpdated{trackUris=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    ge9() {
    }

    public static ge9 a(boolean z) {
        return new a(z);
    }

    public static ge9 b(ImmutableList<MusicItem> immutableList) {
        return new b(immutableList);
    }

    public static ge9 d(ImmutableList<RecsTrack> immutableList) {
        return new c(immutableList);
    }

    public static ge9 e(ImmutableList<String> immutableList) {
        return new d(immutableList);
    }

    public abstract <R_> R_ c(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04);
}
