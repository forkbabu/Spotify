package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.PublicSessionInfo;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.SessionMember;
import defpackage.wt4;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class a implements wt4 {
    private s<List<GaiaDevice>> a;
    private long b = -1;
    private final s<Long> c;
    private final wt4 d;
    private final FrictionlessJoinManager e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.a$a  reason: collision with other inner class name */
    public static final class C0218a<T1, T2, R> implements io.reactivex.functions.c<List<? extends GaiaDevice>, Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>, List<? extends GaiaDevice>> {
        final /* synthetic */ a a;

        C0218a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: java.util.ArrayList */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.c
        public List<? extends GaiaDevice> a(List<? extends GaiaDevice> list, Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>> pair) {
            Object obj;
            Object obj2;
            Iterator<T> it;
            EmptyList emptyList;
            String str;
            List<? extends GaiaDevice> list2 = list;
            Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>> pair2 = pair;
            h.e(list2, "devices");
            h.e(pair2, "pair");
            int i = 10;
            ArrayList arrayList = new ArrayList(d.e(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                a aVar = this.a;
                Object c = pair2.c();
                h.d(c, "pair.first");
                Object d = pair2.d();
                h.d(d, "pair.second");
                List list3 = (List) d;
                aVar.getClass();
                GaiaDevice copy = it2.next().copy();
                Iterator it3 = ((List) c).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    PublicSessionInfo publicSessionInfo = ((AvailableSession) obj).getPublicSessionInfo();
                    String hostActiveDeviceId = publicSessionInfo != null ? publicSessionInfo.getHostActiveDeviceId() : null;
                    h.d(copy, "device");
                    if (e.f(hostActiveDeviceId, copy.getPhysicalIdentifier(), false)) {
                        break;
                    }
                }
                AvailableSession availableSession = (AvailableSession) obj;
                Iterator it4 = list3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (h.a(((Session) obj2).getJoinSessionToken(), availableSession != null ? availableSession.getJoinToken() : null)) {
                        break;
                    }
                }
                Session session = (Session) obj2;
                if (availableSession == null || session == null) {
                    it = it2;
                    h.d(copy, "device");
                    copy.setFrictionlessJoinData(null);
                } else {
                    h.d(copy, "device");
                    String joinToken = availableSession.getJoinToken();
                    List<SessionMember> sessionMembers = session.getSessionMembers();
                    if (sessionMembers != null) {
                        ArrayList arrayList2 = new ArrayList(d.e(sessionMembers, i));
                        for (T t : sessionMembers) {
                            String id = t.getId();
                            String str2 = id != null ? id : "";
                            String displayName = t.getDisplayName();
                            if (displayName != null) {
                                str = displayName;
                            } else {
                                str = "";
                            }
                            String imageUrl = t.getImageUrl();
                            boolean a2 = h.a(t.getId(), session.getSessionOwnerId());
                            String username = t.getUsername();
                            if (username == null) {
                                username = "";
                            }
                            arrayList2.add(new com.spotify.libs.connect.model.d(str2, str, imageUrl, a2, username));
                            it2 = it2;
                        }
                        it = it2;
                        emptyList = arrayList2;
                    } else {
                        it = it2;
                        emptyList = EmptyList.a;
                    }
                    copy.setFrictionlessJoinData(new com.spotify.libs.connect.model.b(joinToken, emptyList));
                }
                arrayList.add(copy);
                it2 = it;
                i = 10;
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, R> implements io.reactivex.functions.c<List<? extends GaiaDevice>, Long, Pair<? extends Long, ? extends List<? extends GaiaDevice>>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Pair<? extends Long, ? extends List<? extends GaiaDevice>> a(List<? extends GaiaDevice> list, Long l) {
            List<? extends GaiaDevice> list2 = list;
            Long l2 = l;
            h.e(list2, "devices");
            h.e(l2, "interval");
            return new Pair<>(l2, list2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements l<Pair<? extends Long, ? extends List<? extends GaiaDevice>>, v<? extends Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>>> {
        final /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Pair<? extends List<? extends AvailableSession>, ? extends List<? extends Session>>> apply(Pair<? extends Long, ? extends List<? extends GaiaDevice>> pair) {
            Pair<? extends Long, ? extends List<? extends GaiaDevice>> pair2 = pair;
            h.e(pair2, "pair");
            Object d = pair2.d();
            h.d(d, "pair.second");
            Object c = pair2.c();
            h.d(c, "pair.first");
            long longValue = ((Number) c).longValue();
            ArrayList arrayList = new ArrayList();
            for (T t : (List) d) {
                if (!t.isSelf()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((GaiaDevice) it.next()).getPhysicalIdentifier());
            }
            s<R> r0 = this.a.e.d(arrayList2, a.g(this.a, longValue)).P().r0(b.a).W(new d(this), false, Integer.MAX_VALUE).r0(e.a);
            if (longValue == 0) {
                EmptyList emptyList = EmptyList.a;
                r0 = r0.G0((R) new Pair(emptyList, emptyList));
            }
            this.a.b = longValue;
            return r0;
        }
    }

    public a(wt4 wt4, FrictionlessJoinManager frictionlessJoinManager, j jVar) {
        h.e(wt4, "baseDevicesProvider");
        h.e(frictionlessJoinManager, "frictionlessJoinManager");
        h.e(jVar, "pollingObservableProvider");
        this.d = wt4;
        this.e = frictionlessJoinManager;
        this.c = jVar.a();
    }

    public static final FrictionlessJoinManager.Origin g(a aVar, long j) {
        long j2 = aVar.b;
        if (j2 == -1) {
            return FrictionlessJoinManager.Origin.PICKER_OPENED;
        }
        if (j == j2) {
            return FrictionlessJoinManager.Origin.DEVICES_REFRESH;
        }
        return FrictionlessJoinManager.Origin.POLLING;
    }

    @Override // defpackage.wt4
    public s<Boolean> a() {
        return this.d.a();
    }

    @Override // defpackage.wt4
    public s<Boolean> b() {
        return this.d.b();
    }

    @Override // defpackage.wt4
    public void c(s<List<GaiaDevice>> sVar) {
        h.e(sVar, "observable");
        this.d.c(sVar);
    }

    @Override // defpackage.wt4
    public s<List<GaiaDevice>> d() {
        if (this.a == null) {
            s n = s.n(this.d.d(), this.c, b.a);
            h.d(n, "Observable.combineLatest…          }\n            )");
            this.a = s.n(this.d.d(), n.W(new c(this), false, Integer.MAX_VALUE), new C0218a(this)).E();
        }
        s<List<GaiaDevice>> sVar = this.a;
        h.c(sVar);
        return sVar;
    }

    @Override // defpackage.wt4
    public s<GaiaDevice> e() {
        return this.d.e();
    }

    @Override // defpackage.wt4
    public void f(wt4.a aVar) {
        h.e(aVar, "updateListener");
        this.d.f(aVar);
    }

    @Override // defpackage.wt4
    public List<GaiaDevice> getItems() {
        return this.d.getItems();
    }

    @Override // defpackage.wt4
    public void start() {
        this.d.stop();
        this.d.c(d());
    }

    @Override // defpackage.wt4
    public void stop() {
        this.d.stop();
    }
}
