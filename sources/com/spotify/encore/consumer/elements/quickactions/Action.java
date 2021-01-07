package com.spotify.encore.consumer.elements.quickactions;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class Action {

    public static final class Ban extends Action {
        public static final Ban INSTANCE = new Ban();

        private Ban() {
            super(null);
        }
    }

    public static final class Heart extends Action {
        public static final Heart INSTANCE = new Heart();

        private Heart() {
            super(null);
        }
    }

    public static final class Hide extends Action {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super(null);
        }
    }

    public static final class None extends Action {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class Profile extends Action {
        private final List<Face> faces;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Profile(List<Face> list) {
            super(null);
            h.e(list, "faces");
            this.faces = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.encore.consumer.elements.quickactions.Action$Profile */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Profile copy$default(Profile profile, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = profile.faces;
            }
            return profile.copy(list);
        }

        public final List<Face> component1() {
            return this.faces;
        }

        public final Profile copy(List<Face> list) {
            h.e(list, "faces");
            return new Profile(list);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Profile) && h.a(this.faces, ((Profile) obj).faces);
            }
            return true;
        }

        public final List<Face> getFaces() {
            return this.faces;
        }

        public int hashCode() {
            List<Face> list = this.faces;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Profile(faces="), this.faces, ")");
        }
    }

    private Action() {
    }

    public /* synthetic */ Action(f fVar) {
        this();
    }
}
