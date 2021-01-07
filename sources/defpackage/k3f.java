package defpackage;

import com.spotify.voice.api.l;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Set;

/* renamed from: k3f  reason: default package */
public final /* synthetic */ class k3f implements w {
    public final /* synthetic */ l a;
    public final /* synthetic */ p7f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ExperimentsViewFactory.Experiment d;
    public final /* synthetic */ Set e;

    public /* synthetic */ k3f(l lVar, p7f p7f, String str, ExperimentsViewFactory.Experiment experiment, Set set) {
        this.a = lVar;
        this.b = p7f;
        this.c = str;
        this.d = experiment;
        this.e = set;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new i6f(this.a, this.b, this.c, this.d, this.e));
    }
}
