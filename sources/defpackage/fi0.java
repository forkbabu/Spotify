package defpackage;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryPinProto$PinRequest;
import kotlin.jvm.internal.h;

/* renamed from: fi0  reason: default package */
public final class fi0 {
    private final YourLibraryPinProto$PinRequest a;
    private final String b;
    private final String c;

    public fi0(String str, String str2) {
        h.e(str, "username");
        h.e(str2, "itemUri");
        this.b = str;
        this.c = str2;
        YourLibraryPinProto$PinRequest.a i = YourLibraryPinProto$PinRequest.i();
        i.m(str2);
        this.a = (YourLibraryPinProto$PinRequest) i.build();
    }

    public final YourLibraryPinProto$PinRequest a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0 = (fi0) obj;
        return h.a(this.b, fi0.b) && h.a(this.c, fi0.c);
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryPinEndpointConfiguration(username=");
        V0.append(this.b);
        V0.append(", itemUri=");
        return je.I0(V0, this.c, ")");
    }
}
