package defpackage;

import com.spotify.voice.api.l;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Set;

/* renamed from: x3f  reason: default package */
public final /* synthetic */ class x3f implements w {
    public final /* synthetic */ l a;
    public final /* synthetic */ p7f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ExperimentsViewFactory.Experiment d;
    public final /* synthetic */ Set e;

    public /* synthetic */ x3f(l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set) {
        this.a = lVar;
        this.b = p7f;
        this.c = str;
        this.d = experiment;
        this.e = set;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new z3f(this.a, this.b, this.c, this.d, this.e));
    }
}
