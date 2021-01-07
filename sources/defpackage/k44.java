package defpackage;

import com.spotify.music.features.blendinvitation.api.InvitationUrl;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: k44  reason: default package */
public final class k44<Upstream, Downstream> implements w<z34, v34> {
    final /* synthetic */ com.spotify.music.features.blendinvitation.api.a a;

    /* renamed from: k44$a */
    static final class a<T, R> implements l<z34, v<? extends InvitationUrl>> {
        final /* synthetic */ k44 a;

        a(k44 k44) {
            this.a = k44;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends InvitationUrl> apply(z34 z34) {
            h.e(z34, "it");
            return this.a.a.a();
        }
    }

    /* renamed from: k44$b */
    static final class b<T, R> implements l<InvitationUrl, v34> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v34 apply(InvitationUrl invitationUrl) {
            InvitationUrl invitationUrl2 = invitationUrl;
            h.e(invitationUrl2, "it");
            return new b44(invitationUrl2.getUrl());
        }
    }

    k44(com.spotify.music.features.blendinvitation.api.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.w
    public final v<v34> apply(s<z34> sVar) {
        h.e(sVar, "getInvitationUrl");
        return sVar.W(new a(this), false, Integer.MAX_VALUE).j0(b.a);
    }
}
