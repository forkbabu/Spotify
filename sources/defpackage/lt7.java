package defpackage;

import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: lt7  reason: default package */
public abstract class lt7 {

    /* renamed from: lt7$a */
    public static final class a extends lt7 {
        private final e a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(null);
            h.e(eVar, "profileListData");
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar != null) {
                return eVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DataLoaded(profileListData=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lt7$b */
    public static final class b extends lt7 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: lt7$c */
    public static final class c extends lt7 {
        private final ProfileListItem a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ProfileListItem profileListItem) {
            super(null);
            h.e(profileListItem, "profileListItem");
            this.a = profileListItem;
        }

        public final ProfileListItem a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ProfileListItem profileListItem = this.a;
            if (profileListItem != null) {
                return profileListItem.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ListItemClicked(profileListItem=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: lt7$d */
    public static final class d extends lt7 {
        private final ProfileListItem a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ProfileListItem profileListItem) {
            super(null);
            h.e(profileListItem, "profileListItem");
            this.a = profileListItem;
        }

        public final ProfileListItem a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && h.a(this.a, ((d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            ProfileListItem profileListItem = this.a;
            if (profileListItem != null) {
                return profileListItem.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ListItemFollowButtonClicked(profileListItem=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private lt7() {
    }

    public lt7(f fVar) {
    }
}
