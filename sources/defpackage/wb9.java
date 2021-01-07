package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponseItem;

/* renamed from: wb9  reason: default package */
public abstract class wb9 {

    /* renamed from: wb9$a */
    public static final class a extends wb9 {
        a() {
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "LoadCachedFilterTags{}";
        }
    }

    /* renamed from: wb9$b */
    public static final class b extends wb9 {
        b() {
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "RequestFilterTags{}";
        }
    }

    /* renamed from: wb9$c */
    public static final class c extends wb9 {
        private final ImmutableList<FilterTagsResponseItem> a;
        private final ImmutableMap<String, Boolean> b;

        c(ImmutableList<FilterTagsResponseItem> immutableList, ImmutableMap<String, Boolean> immutableMap) {
            immutableList.getClass();
            this.a = immutableList;
            immutableMap.getClass();
            this.b = immutableMap;
        }

        public final ImmutableList<FilterTagsResponseItem> a() {
            return this.a;
        }

        public final ImmutableMap<String, Boolean> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateFilterTagsStates{availableFilterTags=");
            V0.append(this.a);
            V0.append(", filterStates=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    wb9() {
    }
}
