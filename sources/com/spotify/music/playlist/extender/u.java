package com.spotify.music.playlist.extender;

import android.os.Bundle;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.playlist.extender.model.ExtenderRequest;
import com.spotify.music.playlist.extender.model.ExtenderResponse;
import com.spotify.music.playlist.extender.model.RecTrack;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class u {
    private final s0 a;
    private final String b;
    private final a c;
    private final c8a d;
    private final y e;
    private final HashSet<String> f = new HashSet<>();
    private final ArrayList<String> g = new ArrayList<>();
    private final p h = new p();
    private final int i;
    private final AtomicBoolean j = new AtomicBoolean();

    public interface a {
        void a(List<RecTrack> list);

        void onError(Throwable th);
    }

    public u(s0 s0Var, String str, d8a d8a, y yVar, a aVar, int i2) {
        this.b = str;
        this.i = i2;
        this.d = d8a.create();
        this.e = yVar;
        this.c = aVar;
        this.a = s0Var;
    }

    public static z d(u uVar, ExtenderResponse extenderResponse) {
        uVar.getClass();
        List<RecTrack> list = extenderResponse.recommendedTracks;
        return uVar.d.e(je.I0(new StringBuilder(), uVar.b, ":recommended"), (String[]) FluentIterable.from(list).transform(r.a).toArray(String.class)).A(new b(list));
    }

    public static void e(u uVar, List list) {
        synchronized (uVar) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uVar.f.add(((RecTrack) it.next()).getId());
            }
        }
    }

    public synchronized boolean a() {
        return !this.f.isEmpty();
    }

    public synchronized boolean b() {
        return this.j.get();
    }

    public /* synthetic */ void c() {
        this.j.set(false);
    }

    public synchronized void f(String str) {
        this.g.add(str);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            try {
                Set set = (Set) bundle.getSerializable("ignored_track_ids");
                if (set != null) {
                    this.f.clear();
                    this.f.addAll(set);
                }
            } catch (ClassCastException unused) {
            }
            try {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("added_track_ids");
                if (stringArrayList != null) {
                    this.g.clear();
                    this.g.addAll(stringArrayList);
                }
            } catch (ClassCastException unused2) {
            }
        }
    }

    public void h(Bundle bundle) {
        bundle.putSerializable("ignored_track_ids", this.f);
        bundle.putStringArrayList("added_track_ids", this.g);
    }

    public synchronized void i(String str) {
        if (!this.j.get()) {
            this.j.set(true);
            ArrayList<String> arrayList = this.g;
            List<String> subList = arrayList.subList(Math.max(0, arrayList.size() - 5), this.g.size());
            ExtenderRequest extenderRequest = new ExtenderRequest(this.b, this.i, ImmutableSet.copyOf((Collection) this.f), subList, str);
            p pVar = this.h;
            s<R> o0 = this.a.a(extenderRequest).P().a0(new d(this)).I(new c(this)).N(new e(this)).o0(this.e);
            a aVar = this.c;
            aVar.getClass();
            s sVar = new s(aVar);
            a aVar2 = this.c;
            aVar2.getClass();
            pVar.b(o0.subscribe(sVar, new a(aVar2)));
        }
    }

    public synchronized void j() {
        this.f.clear();
    }

    public void k() {
        this.h.a();
    }
}
