package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;

/* renamed from: xb9  reason: default package */
public abstract class xb9 {

    /* renamed from: xb9$a */
    public static final class a extends xb9 {
        a() {
        }

        @Override // defpackage.xb9
        public final <R_> R_ d(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) ((rb9) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "ErrorOnFilterTagsReceived{}";
        }
    }

    /* renamed from: xb9$b */
    public static final class b extends xb9 {
        private final ImmutableMap<String, Boolean> a;

        b(ImmutableMap<String, Boolean> immutableMap) {
            immutableMap.getClass();
            this.a = immutableMap;
        }

        @Override // defpackage.xb9
        public final <R_> R_ d(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) ((sb9) ti03).apply(this);
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

        public final ImmutableMap<String, Boolean> f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FilterStateChanged{filterStates=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: xb9$c */
    public static final class c extends xb9 {
        private final ImmutableList<FilterTagsResponseItem> a;

        c(ImmutableList<FilterTagsResponseItem> immutableList) {
            immutableList.getClass();
            this.a = immutableList;
        }

        @Override // defpackage.xb9
        public final <R_> R_ d(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) ((tb9) ti02).apply(this);
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

        public final ImmutableList<FilterTagsResponseItem> f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("FilterTagsResponseReceived{availableFilterTags=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: xb9$d */
    public static final class d extends xb9 {
        d() {
        }

        @Override // defpackage.xb9
        public final <R_> R_ d(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04) {
            return (R_) ((ub9) ti0).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "SourceTracksUpdated{}";
        }
    }

    xb9() {
    }

    public static xb9 a() {
        return new a();
    }

    public static xb9 b(ImmutableMap<String, Boolean> immutableMap) {
        return new b(immutableMap);
    }

    public static xb9 c(ImmutableList<FilterTagsResponseItem> immutableList) {
        return new c(immutableList);
    }

    public static xb9 e() {
        return new d();
    }

    public abstract <R_> R_ d(ti0<d, R_> ti0, ti0<c, R_> ti02, ti0<b, R_> ti03, ti0<a, R_> ti04);
}
