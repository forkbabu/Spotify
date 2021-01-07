package defpackage;

import android.app.Application;
import android.content.Context;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.rxjava2.p;
import defpackage.d7a;
import io.reactivex.d0;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.Map;

/* renamed from: tn1  reason: default package */
public class tn1 implements d {
    private final p a = new p();
    private final s<Boolean> b;
    private final dif c;
    private final Context f;
    private final wlf<cif> n;
    private final k5a o;
    private final Map<AudioRecordingType, e> p;

    tn1(wlf<cif> wlf, s<Boolean> sVar, eif eif, Application application, dif dif, SpSharedPreferences<Object> spSharedPreferences, s<Boolean> sVar2, k5a k5a, Map<AudioRecordingType, e> map) {
        s sVar3;
        this.p = map;
        this.c = dif;
        this.f = application.getApplicationContext();
        this.n = wlf;
        this.o = k5a;
        SpSharedPreferences.b<Object, Boolean> bVar = com.spotify.music.libs.voice.e.h;
        s<R> G0 = spSharedPreferences.p(bVar).j0(cn1.a).G0((R) Boolean.valueOf(spSharedPreferences.d(bVar, false)));
        Boolean bool = Boolean.FALSE;
        s<Boolean> G02 = sVar2.G0(bool);
        e eVar = map.get(AudioRecordingType.MICROPHONE);
        if (eVar == null) {
            sVar3 = o.a;
        } else {
            sVar3 = eVar.h();
        }
        this.b = s.l(G0, sVar, G02, sVar3.G0(bool), en1.a).E().J0(new an1(eif));
    }

    public /* synthetic */ d0 a(Boolean bool) {
        return this.o.e().R(d7a.b());
    }

    public void b(d7a d7a) {
        dif dif = this.c;
        Context context = this.f;
        d7a.getClass();
        dif.a(context, d7a instanceof d7a.a);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.b((this.n.get().c() ? this.b : o.a).a0(new bn1(this)).subscribe(new dn1(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "WakeWordPlugin";
    }
}
