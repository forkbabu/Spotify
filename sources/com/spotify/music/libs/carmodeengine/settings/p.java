package com.spotify.music.libs.carmodeengine.settings;

import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;
import com.spotify.ubi.specification.factories.r3;
import defpackage.y6a;
import kotlin.jvm.internal.h;

public final class p implements CarModeUserSettingsLogger {
    private final ere a;
    private final r3 b;

    static final class a<T, R> implements ti0<y6a.c, nqe> {
        final /* synthetic */ p a;

        a(p pVar) {
            this.a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public nqe apply(y6a.c cVar) {
            h.e(cVar, "it");
            return this.a.b.e().d().c().a();
        }
    }

    static final class b<T, R> implements ti0<y6a.b, nqe> {
        final /* synthetic */ p a;

        b(p pVar) {
            this.a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public nqe apply(y6a.b bVar) {
            h.e(bVar, "it");
            return this.a.b.e().d().d().a();
        }
    }

    static final class c<T, R> implements ti0<y6a.a, nqe> {
        final /* synthetic */ p a;

        c(p pVar) {
            this.a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public nqe apply(y6a.a aVar) {
            h.e(aVar, "it");
            return this.a.b.e().d().b().a();
        }
    }

    public p(ere ere, r3 r3Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(r3Var, "settingsEventFactory");
        this.a = ere;
        this.b = r3Var;
    }

    @Override // com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger
    public void a(boolean z) {
        nqe nqe;
        if (z) {
            nqe = this.b.e().b().b();
            h.d(nqe, "settingsEventFactory\n   …      .hitSettingEnable()");
        } else {
            nqe = this.b.e().b().a();
            h.d(nqe, "settingsEventFactory\n   …     .hitSettingDisable()");
        }
        this.a.a(nqe);
    }

    @Override // com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger
    public void b(boolean z, CarModeUserSettingsLogger.AutoActivationChangedReason autoActivationChangedReason) {
        nqe nqe;
        h.e(autoActivationChangedReason, "reason");
        if (z) {
            nqe = this.b.e().c(autoActivationChangedReason.name()).b();
            h.d(nqe, "settingsEventFactory\n   …      .hitSettingEnable()");
        } else {
            nqe = this.b.e().c(autoActivationChangedReason.name()).a();
            h.d(nqe, "settingsEventFactory\n   …     .hitSettingDisable()");
        }
        this.a.a(nqe);
    }

    @Override // com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger
    public void c(y6a y6a) {
        h.e(y6a, "availabilitySetting");
        Object c2 = y6a.c(new a(this), new b(this), new c(this));
        h.d(c2, "availabilitySetting.map(…)\n            }\n        )");
        this.a.a((nqe) c2);
    }
}
