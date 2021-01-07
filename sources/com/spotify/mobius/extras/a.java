package com.spotify.mobius.extras;

import com.spotify.mobius.g;
import com.spotify.mobius.h;

public final class a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.mobius.extras.a$a  reason: collision with other inner class name */
    public class C0203a implements ea2<da2<O>, h<J>> {
        final /* synthetic */ ea2 a;
        final /* synthetic */ g b;

        C0203a(ea2 ea2, g gVar) {
            this.a = ea2;
            this.b = gVar;
        }

        @Override // defpackage.ea2
        public Object apply(Object obj) {
            return x92.b(this.a, this.b, (da2) obj);
        }
    }

    public static <I, J, O> g<J, O> a(ea2<J, I> ea2, g<I, O> gVar) {
        return c.a(new C0203a(ea2, gVar));
    }
}
