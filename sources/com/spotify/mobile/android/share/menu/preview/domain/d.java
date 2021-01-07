package com.spotify.mobile.android.share.menu.preview.domain;

import kotlin.jvm.internal.h;

public abstract class d {

    public static final class a extends d {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends d {
        private final a a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(null);
            h.e(aVar, "destinationListState");
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DestinationListStateChanged(destinationListState=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class c extends d {
        private final int a;

        public c(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.a == ((c) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return je.B0(je.V0("FetchPayloadRequested(payloadIndex="), this.a, ")");
        }
    }

    /* renamed from: com.spotify.mobile.android.share.menu.preview.domain.d$d  reason: collision with other inner class name */
    public static final class C0189d extends d {
        private final b a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0189d(b bVar, int i) {
            super(null);
            h.e(bVar, "payloadState");
            this.a = bVar;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final b b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0189d)) {
                return false;
            }
            C0189d dVar = (C0189d) obj;
            return h.a(this.a, dVar.a) && this.b == dVar.b;
        }

        public int hashCode() {
            b bVar = this.a;
            return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("PayloadStateChanged(payloadState=");
            V0.append(this.a);
            V0.append(", payloadIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class e extends d {
        private final com.spotify.mobile.android.share.menu.preview.api.a a;
        private final int b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.spotify.mobile.android.share.menu.preview.api.a aVar, int i) {
            super(null);
            h.e(aVar, "destination");
            this.a = aVar;
            this.b = i;
        }

        public final com.spotify.mobile.android.share.menu.preview.api.a a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return h.a(this.a, eVar.a) && this.b == eVar.b;
        }

        public int hashCode() {
            com.spotify.mobile.android.share.menu.preview.api.a aVar = this.a;
            return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShareRequested(destination=");
            V0.append(this.a);
            V0.append(", payloadIndex=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class f extends d {
        private final com.spotify.mobile.android.share.menu.preview.api.h a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.spotify.mobile.android.share.menu.preview.api.h hVar) {
            super(null);
            h.e(hVar, "shareResult");
            this.a = hVar;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && h.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.mobile.android.share.menu.preview.api.h hVar = this.a;
            if (hVar != null) {
                return hVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("ShareResultReceived(shareResult=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private d() {
    }

    public d(kotlin.jvm.internal.f fVar) {
    }
}
