package defpackage;

import com.spotify.voice.experiments.experience.view.e1;
import io.reactivex.functions.g;

/* renamed from: z2f  reason: default package */
public final /* synthetic */ class z2f implements g {
    public final /* synthetic */ e1 a;

    public /* synthetic */ z2f(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(((Float) obj).floatValue());
    }
}
