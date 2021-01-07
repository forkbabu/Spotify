package defpackage;

import android.util.Pair;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import com.spotify.contexts.ClientId;

/* renamed from: mg3  reason: default package */
public class mg3 implements fk0 {
    private final String a;

    public mg3(String str) {
        this.a = str;
    }

    @Override // defpackage.fk0
    public u c() {
        ClientId.b i = ClientId.i();
        i.m(ByteString.h(BaseEncoding.base16().lowerCase().decode(this.a)));
        return i.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_client_id";
    }
}
