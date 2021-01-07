package defpackage;

import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import defpackage.p2f;
import io.reactivex.functions.l;
import java.util.Set;

/* renamed from: a6f  reason: default package */
public final /* synthetic */ class a6f implements l {
    public final /* synthetic */ com.spotify.voice.api.l a;
    public final /* synthetic */ p7f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ExperimentsViewFactory.Experiment f;
    public final /* synthetic */ Set n;

    public /* synthetic */ a6f(com.spotify.voice.api.l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set) {
        this.a = lVar;
        this.b = p7f;
        this.c = str;
        this.f = experiment;
        this.n = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return k7f.h(this.a, this.b, this.c, this.f, this.n, (p2f.t) obj);
    }
}
