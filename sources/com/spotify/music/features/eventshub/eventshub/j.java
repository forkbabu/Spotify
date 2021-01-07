package com.spotify.music.features.eventshub.eventshub;

import android.os.Bundle;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.eventshub.locationsearch.LocationSearchFragment;
import com.spotify.music.features.eventshub.locationsearch.f;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.music.features.eventshub.model.EventSection;
import com.spotify.music.features.eventshub.model.EventsHubModel;
import com.spotify.music.features.eventshub.model.SourceType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.s5;
import io.reactivex.android.schedulers.a;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import retrofit2.v;

public class j {
    private final l a;
    private final p05 b;
    private final g<ConcertResult> c;
    private final h d;
    private final s5 e;
    private final f f;
    private final t g;
    private EventsHubModel h = EventsHubModel.EMPTY;
    private b i = EmptyDisposable.INSTANCE;
    private boolean j;

    public j(l lVar, p05 p05, h hVar, f fVar, g<ConcertResult> gVar, t tVar, s5 s5Var) {
        Assertion.e(lVar);
        this.a = lVar;
        this.b = p05;
        this.d = hVar;
        this.f = fVar;
        this.c = gVar;
        this.g = tVar;
        this.e = s5Var;
    }

    public void a() {
        if (!this.i.d()) {
            this.i.dispose();
        }
    }

    public void b(v vVar) {
        if (!vVar.f() || vVar.a() == null) {
            ((EventsHubFragment) this.a).P4();
            return;
        }
        EventsHubModel eventsHubModel = (EventsHubModel) vVar.a();
        Assertion.e(eventsHubModel);
        this.h = eventsHubModel;
        int numberOfConcerts = eventsHubModel.getNumberOfConcerts();
        this.d.e();
        if (eventsHubModel.getUserLocation() == null) {
            ((EventsHubFragment) this.a).S4();
        } else if (numberOfConcerts <= 0) {
            ((EventsHubFragment) this.a).R4();
        } else {
            ((EventsHubFragment) this.a).N4(eventsHubModel.getUserLocation());
            ((EventsHubFragment) this.a).M4(eventsHubModel.getHeaderImageUri());
            if (this.e.a()) {
                l lVar = this.a;
                ArrayList newArrayList = Collections2.newArrayList(Collections2.filter((Iterable) eventsHubModel.getEvents(), (Predicate) new d(SourceType.VIRTUAL)));
                EventSection eventSection = EventSection.VIRTUAL;
                ((EventsHubFragment) lVar).L4(newArrayList, eventSection);
                ((EventsHubFragment) this.a).O4(eventSection, new Object[0]);
            }
            l lVar2 = this.a;
            ArrayList newArrayList2 = Collections2.newArrayList(Collections2.filter((Iterable) eventsHubModel.getEvents(), (Predicate) new d(SourceType.POPULAR)));
            EventSection eventSection2 = EventSection.POPULAR;
            ((EventsHubFragment) lVar2).L4(newArrayList2, eventSection2);
            ((EventsHubFragment) this.a).O4(eventSection2, eventsHubModel.getUserLocation());
            l lVar3 = this.a;
            ArrayList newArrayList3 = Collections2.newArrayList(Collections2.filter((Iterable) eventsHubModel.getEvents(), (Predicate) new d(SourceType.RECOMMENDATIONS)));
            EventSection eventSection3 = EventSection.RECOMMENDATIONS;
            ((EventsHubFragment) lVar3).L4(newArrayList3, eventSection3);
            ((EventsHubFragment) this.a).O4(eventSection3, new Object[0]);
            l lVar4 = this.a;
            ArrayList newArrayList4 = Collections2.newArrayList(Collections2.filter((Iterable) eventsHubModel.getEvents(), (Predicate) new d(SourceType.ALL)));
            EventSection eventSection4 = EventSection.ALL;
            ((EventsHubFragment) lVar4).L4(newArrayList4, eventSection4);
            ((EventsHubFragment) this.a).O4(eventSection4, eventsHubModel.getUserLocation());
            EventsHubFragment eventsHubFragment = (EventsHubFragment) this.a;
            if (eventsHubFragment.e3()) {
                eventsHubFragment.o0.e(null);
            }
        }
    }

    public void c() {
        ((EventsHubFragment) this.a).n0.d(LocationSearchFragment.E0);
        this.d.a();
    }

    public void d(ConcertResult concertResult, long j2, SourceType sourceType) {
        Boolean discovery = concertResult.getDiscovery();
        if (discovery == null || !discovery.booleanValue()) {
            this.d.c(Long.valueOf(j2), sourceType, concertResult.getConcert().getId());
        } else {
            this.d.d(Long.valueOf(j2), sourceType, concertResult.getConcert().getId());
        }
        try {
            this.c.accept(concertResult);
        } catch (Exception e2) {
            Logger.b("Failed to perform click action for concert result: %s", e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        boolean z2 = false;
        if (!z && !(this.h != EventsHubModel.EMPTY)) {
            a();
            ((EventsHubFragment) this.a).T4();
        }
        if (z && !this.j) {
            z2 = true;
        }
        if (z2) {
            a();
            this.j = true;
            ((EventsHubFragment) this.a).Q4();
            this.i = this.b.b(this.f.a().mGeonameId).B(a.b()).subscribe(new c(this));
        }
    }

    public void f(EventResult eventResult, long j2, SourceType sourceType) {
        if (eventResult.isSingleConcert()) {
            d(eventResult.getPosterConcertResult(), j2, sourceType);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("event-result-arg", eventResult);
        bundle.putString("header-image-uri-arg", this.h.getHeaderImageUri());
        this.g.f(ViewUris.k0.toString(), bundle);
    }
}
