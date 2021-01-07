package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: wfb  reason: default package */
public final class wfb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    private static final wfb f = new wfb(null, null, false);
    public static final a n = new a(null);
    private final SessionState a;
    private final c b;
    private final boolean c;

    /* renamed from: wfb$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* renamed from: wfb$b */
    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new wfb((SessionState) parcel.readParcelable(wfb.class.getClassLoader()), (c) parcel.readParcelable(wfb.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new wfb[i];
        }
    }

    public wfb(SessionState sessionState, c cVar, boolean z) {
        this.a = sessionState;
        this.b = cVar;
        this.c = z;
    }

    public static wfb b(wfb wfb, SessionState sessionState, c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            sessionState = wfb.a;
        }
        if ((i & 2) != 0) {
            cVar = wfb.b;
        }
        if ((i & 4) != 0) {
            z = wfb.c;
        }
        wfb.getClass();
        return new wfb(sessionState, cVar, z);
    }

    public final c c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SessionState e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb)) {
            return false;
        }
        wfb wfb = (wfb) obj;
        return h.a(this.a, wfb.a) && h.a(this.b, wfb.b) && this.c == wfb.c;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g() {
        SessionState sessionState = this.a;
        return sessionState != null && sessionState.loggedIn() && !this.a.loggingIn() && !this.a.loggingOut();
    }

    public final boolean h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        SessionState sessionState = this.a;
        int i = 0;
        int hashCode = (sessionState != null ? sessionState.hashCode() : 0) * 31;
        c cVar = this.b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final boolean i() {
        SessionState sessionState = this.a;
        return sessionState != null && !sessionState.loggedIn() && !this.a.loggingIn() && !this.a.loggingOut();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MainActivityModel(sessionState=");
        V0.append(this.a);
        V0.append(", flags=");
        V0.append(this.b);
        V0.append(", isLoggedInSessionStarted=");
        return je.P0(V0, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
