package com.spotify.music.features.entityselector.common;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class a {

    /* renamed from: com.spotify.music.features.entityselector.common.a$a  reason: collision with other inner class name */
    public static final class C0229a extends a {
        private final uy4 a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0229a(uy4 uy4) {
            super(null);
            h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
            this.a = uy4;
        }

        public final uy4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0229a) && h.a(this.a, ((C0229a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            uy4 uy4 = this.a;
            if (uy4 != null) {
                return uy4.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AddTrack(track=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends a {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "previewId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Pause(previewId="), this.a, ")");
        }
    }

    public static final class c extends a {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            h.e(str, "previewId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("Play(previewId="), this.a, ")");
        }
    }

    private a() {
    }

    public a(f fVar) {
    }
}
