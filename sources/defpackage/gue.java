package defpackage;

import com.google.common.base.Function;
import com.spotify.voice.results.model.e;
import defpackage.vue;

/* renamed from: gue  reason: default package */
public final /* synthetic */ class gue implements Function {
    public final /* synthetic */ vue.l a;

    public /* synthetic */ gue(vue.l lVar) {
        this.a = lVar;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        e.a aVar = (e.a) obj;
        return aVar.k(this.a.s().equals(aVar));
    }
}
