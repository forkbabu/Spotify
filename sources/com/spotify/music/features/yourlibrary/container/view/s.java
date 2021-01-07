package com.spotify.music.features.yourlibrary.container.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.music.features.yourlibrary.container.utils.l;
import com.spotify.music.sociallistening.participantlist.impl.m;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.g;
import defpackage.ifd;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;

public class s extends t implements r, z09 {
    private final k h;
    private final w09 i;
    private final ifd.b j;
    private final zpd k;
    private final l l;
    private final Map<Integer, WeakReference<f>> m;
    private final Map<YourLibraryPageId, WeakReference<f>> n;
    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> o;
    private ImmutableList<g> p = ImmutableList.of();
    private boolean q;
    private ImmutableList<String> r;

    public s(o oVar, k kVar, w09 w09, ifd.b bVar, zpd zpd, l lVar) {
        super(oVar);
        this.h = kVar;
        this.i = w09;
        this.j = bVar;
        this.k = zpd;
        this.l = lVar;
        this.m = new TreeMap();
        this.n = new TreeMap();
    }

    private g y(int i2) {
        if (!this.q) {
            return this.p.get(i2);
        }
        ImmutableList<g> immutableList = this.p;
        return immutableList.get((immutableList.size() - i2) - 1);
    }

    public Optional<f> A(YourLibraryPageId yourLibraryPageId) {
        WeakReference<f> weakReference = this.n.get(yourLibraryPageId);
        if (weakReference == null) {
            return Optional.absent();
        }
        f fVar = weakReference.get();
        return fVar == null ? Optional.absent() : Optional.of(fVar);
    }

    public f B(YourLibraryPageId yourLibraryPageId) {
        WeakReference<f> weakReference = this.m.get(Integer.valueOf(z(yourLibraryPageId)));
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.m.get(Integer.valueOf(z(yourLibraryPageId))).get();
    }

    public void C(boolean z) {
        if (this.q != z) {
            this.q = z;
            j();
        }
    }

    public void D(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
        this.o = immutableSortedMap;
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableIterator<Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>>> it = this.o.mo54entrySet().iterator();
        while (it.hasNext()) {
            zpd zpd = this.k;
            zpd.getClass();
            builder.addAll(Collections2.transform((Iterable) it.next().getValue(), (Function) new q(zpd)));
        }
        this.p = builder.build();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        ImmutableList.Builder builder3 = new ImmutableList.Builder();
        UnmodifiableIterator<YourLibraryPageGroup> it2 = this.o.mo55keySet().iterator();
        while (it2.hasNext()) {
            YourLibraryPageGroup next = it2.next();
            if (next != null) {
                builder2.mo53add((ImmutableList.Builder) this.l.a(next));
                builder3.mo53add((ImmutableList.Builder) next);
            }
        }
        this.r = builder2.build();
        builder3.build();
        j();
    }

    @Override // defpackage.z09
    public Optional<YourLibraryPageId> a(f fVar) {
        for (Map.Entry<YourLibraryPageId, WeakReference<f>> entry : this.n.entrySet()) {
            f fVar2 = entry.getValue().get();
            if (fVar2 != null && fVar2.equals(fVar)) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.absent();
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.p.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence f(int i2) {
        return y(i2).getTitle();
    }

    @Override // androidx.fragment.app.t, androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i2) {
        Object h2 = super.h(viewGroup, i2);
        if (h2 instanceof f) {
            g y = y(i2);
            f fVar = (f) h2;
            this.m.put(Integer.valueOf(i2), new WeakReference<>(fVar));
            this.n.put(y.b(), new WeakReference<>(fVar));
            return h2;
        }
        throw new IllegalStateException("YourLibraryPage.getFragment() must return the YourLibraryPage itself.");
    }

    @Override // androidx.fragment.app.t
    public Fragment r(int i2) {
        g y = y(i2);
        Fragment e = y.a(this.h.getFlags(), this.i.w1()).e();
        m.d(e, yn0.a(this.j.z1()));
        YourLibraryPageId b = y.b();
        Bundle D2 = e.D2();
        if (D2 == null) {
            D2 = je.D(e);
        }
        D2.putSerializable("your-library-page-id", b);
        YourLibraryPageGroup b2 = this.k.b(y.b());
        Bundle D22 = e.D2();
        if (D22 == null) {
            D22 = je.D(e);
        }
        D22.putSerializable("your-library-page-group", b2);
        return e;
    }

    public ImmutableList<View> t(int i2) {
        WeakReference<f> weakReference = this.m.get(Integer.valueOf(i2));
        if (weakReference == null) {
            return ImmutableList.of();
        }
        f fVar = weakReference.get();
        return fVar == null ? ImmutableList.of() : fVar.l0();
    }

    public int u() {
        return this.o.size();
    }

    public int v(int i2) {
        ImmutableList immutableList = (ImmutableList) this.o.mo50values();
        immutableList.getClass();
        return ((ImmutableList) immutableList.get(i2)).size();
    }

    public CharSequence w(int i2) {
        return this.r.get(i2);
    }

    public YourLibraryPageId x(int i2) {
        return y(i2).b();
    }

    public int z(YourLibraryPageId yourLibraryPageId) {
        int indexOf = Collections2.indexOf(this.p.iterator(), new c(yourLibraryPageId));
        return (!this.q || indexOf < 0) ? indexOf : (this.p.size() - indexOf) - 1;
    }
}
