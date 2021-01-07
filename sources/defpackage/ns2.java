package defpackage;

import com.spotify.music.concat.d;
import com.spotify.music.concat.proto.TechuCoreExercise$TechUCoreExerciseRequest;
import defpackage.js2;
import io.reactivex.functions.l;

/* renamed from: ns2  reason: default package */
public final /* synthetic */ class ns2 implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ ns2(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        js2.a aVar = (js2.a) obj;
        TechuCoreExercise$TechUCoreExerciseRequest.a l = TechuCoreExercise$TechUCoreExerciseRequest.l();
        l.m(aVar.a());
        l.n(aVar.b());
        return dVar.b((TechuCoreExercise$TechUCoreExerciseRequest) l.build()).A(os2.a);
    }
}
