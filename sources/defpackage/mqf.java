package defpackage;

import java.io.IOException;
import okhttp3.e0;
import retrofit2.j;

/* renamed from: mqf  reason: default package */
final class mqf implements j<e0, Character> {
    static final mqf a = new mqf();

    mqf() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // retrofit2.j
    public Character convert(e0 e0Var) {
        String m = e0Var.m();
        if (m.length() == 1) {
            return Character.valueOf(m.charAt(0));
        }
        StringBuilder V0 = je.V0("Expected body of length 1 for Character conversion but was ");
        V0.append(m.length());
        throw new IOException(V0.toString());
    }
}
