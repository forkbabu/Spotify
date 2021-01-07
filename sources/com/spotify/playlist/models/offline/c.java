package com.spotify.playlist.models.offline;

import android.os.Parcel;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class c {
    public static final a a = new a(null);

    public static final class a {
        public a(f fVar) {
        }
    }

    public a a(Parcel parcel) {
        WaitingReason waitingReason;
        a.f fVar = a.f.a;
        h.e(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            return fVar;
        }
        h.d(readString, "parcel.readString() ?: r…urn notAvailableOffline()");
        if (h.a(readString, a.f.class.getCanonicalName())) {
            return fVar;
        }
        int readInt = parcel.readInt();
        if (h.a(readString, a.h.class.getCanonicalName()) && (waitingReason = (WaitingReason) parcel.readSerializable()) != null) {
            h.e(waitingReason, "waitingReason");
            return new a.h(waitingReason, readInt);
        } else if (h.a(readString, a.g.class.getCanonicalName())) {
            return a.g.a;
        } else {
            if (h.a(readString, a.e.class.getCanonicalName())) {
                return a.e.a;
            }
            if (h.a(readString, a.d.class.getCanonicalName())) {
                return a.d.a;
            }
            if (h.a(readString, a.c.class.getCanonicalName())) {
                return a.c.a;
            }
            if (h.a(readString, a.C0377a.class.getCanonicalName())) {
                return a.C0377a.a;
            }
            return h.a(readString, a.b.class.getCanonicalName()) ? new a.b(readInt) : fVar;
        }
    }

    public void b(a aVar, Parcel parcel) {
        h.e(aVar, "offlineState");
        h.e(parcel, "dest");
        if (aVar instanceof a.f) {
            parcel.writeString(a.f.class.getCanonicalName());
        } else if (aVar instanceof a.g) {
            parcel.writeString(a.g.class.getCanonicalName());
            parcel.writeInt(0);
        } else if (aVar instanceof a.e) {
            parcel.writeString(a.e.class.getCanonicalName());
            parcel.writeInt(0);
        } else if (aVar instanceof a.h) {
            a.h hVar = (a.h) aVar;
            int c = hVar.c();
            parcel.writeString(a.h.class.getCanonicalName());
            parcel.writeInt(c);
            parcel.writeSerializable(hVar.d());
        } else if (aVar instanceof a.d) {
            parcel.writeString(a.d.class.getCanonicalName());
            parcel.writeInt(0);
        } else if (aVar instanceof a.C0377a) {
            parcel.writeString(a.C0377a.class.getCanonicalName());
            parcel.writeInt(0);
        } else if (aVar instanceof a.c) {
            parcel.writeString(a.c.class.getCanonicalName());
            parcel.writeInt(0);
        } else if (aVar instanceof a.b) {
            String canonicalName = a.b.class.getCanonicalName();
            int c2 = ((a.b) aVar).c();
            parcel.writeString(canonicalName);
            parcel.writeInt(c2);
        }
    }
}
