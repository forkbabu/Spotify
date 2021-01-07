package defpackage;

import com.spotify.music.features.blendtastematch.api.Join;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: m54  reason: default package */
public final class m54<Upstream, Downstream> implements w<x44, t44> {
    final /* synthetic */ com.spotify.music.features.blendtastematch.api.a a;

    /* renamed from: m54$a */
    static final class a<T, R> implements l<x44, v<? extends Join>> {
        final /* synthetic */ m54 a;

        a(m54 m54) {
            this.a = m54;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Join> apply(x44 x44) {
            x44 x442 = x44;
            h.e(x442, "it");
            return this.a.a.a(x442.a()).F(new Join(null)).P();
        }
    }

    /* renamed from: m54$b */
    static final class b<T, R> implements l<Join, t44> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public t44 apply(Join join) {
            Join join2 = join;
            h.e(join2, "it");
            String playlistUri = join2.getPlaylistUri();
            return playlistUri == null || playlistUri.length() == 0 ? r44.a : new q44(join2.getPlaylistUri());
        }
    }

    m54(com.spotify.music.features.blendtastematch.api.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.w
    public final v<t44> apply(s<x44> sVar) {
        h.e(sVar, "createBlendObservable");
        return sVar.w(new a(this)).j0(b.a);
    }
}
