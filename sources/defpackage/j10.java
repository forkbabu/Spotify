package defpackage;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.b;
import com.google.firebase.encoders.c;

/* renamed from: j10  reason: default package */
final /* synthetic */ class j10 implements b {
    private static final j10 a = new j10();

    private j10() {
    }

    public static b b() {
        return a;
    }

    @Override // com.google.firebase.encoders.b
    public void a(Object obj, Object obj2) {
        c cVar = (c) obj2;
        int i = m10.i;
        StringBuilder V0 = je.V0("Couldn't find encoder for type ");
        V0.append(obj.getClass().getCanonicalName());
        throw new EncodingException(V0.toString());
    }
}
