package defpackage;

import com.spotify.music.explicitcontent.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ch3  reason: default package */
public class ch3 implements w<b91, b91> {
    private final f a;
    private final ah3 b;

    public ch3(f fVar, ah3 ah3) {
        this.a = fVar;
        this.b = ah3;
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.a.b(), this.b);
    }
}
