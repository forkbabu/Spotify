package com.spotify.music.features.yourlibraryx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.c;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class YourLibraryXFilterRowView extends FrameLayout implements g<f, YourLibraryXEvent>, AppBarLayout.c {
    private Component<FilterRowLibrary.Model, FilterRowLibrary.Event> a;
    private final int b;
    private eh9 c;

    public YourLibraryXFilterRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final b a(YourLibraryXFilterRowView yourLibraryXFilterRowView, int i) {
        yourLibraryXFilterRowView.getClass();
        EmptyList emptyList = EmptyList.a;
        if (i == C0707R.id.your_library_filter_albums) {
            return new b.a(emptyList);
        }
        if (i == C0707R.id.your_library_filter_artists) {
            return new b.C0269b(emptyList);
        }
        if (i == C0707R.id.your_library_filter_downloads) {
            return b.c.a;
        }
        if (i == C0707R.id.your_library_filter_playlists) {
            return new b.e(emptyList);
        }
        if (i == C0707R.id.your_library_filter_podcasts) {
            return new b.f(emptyList);
        }
        if (i == -1) {
            return b.d.a;
        }
        throw new IllegalArgumentException(je.p0("Invalid id, ", i));
    }

    public static final /* synthetic */ Component b(YourLibraryXFilterRowView yourLibraryXFilterRowView) {
        Component<FilterRowLibrary.Model, FilterRowLibrary.Event> component = yourLibraryXFilterRowView.a;
        if (component != null) {
            return component;
        }
        h.k("filterRowLibrary");
        throw null;
    }

    public static final FilterRowLibrary.Model d(YourLibraryXFilterRowView yourLibraryXFilterRowView, List list, List list2) {
        List<b> list3;
        yourLibraryXFilterRowView.getClass();
        EmptyList emptyList = EmptyList.a;
        b.d dVar = b.d.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!h.a((b) obj, dVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(yourLibraryXFilterRowView.e((b) it.next())));
        }
        Set Z = d.Z(arrayList2);
        if (Z.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(d.e(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                int e = yourLibraryXFilterRowView.e(bVar);
                Context context = yourLibraryXFilterRowView.getContext();
                h.d(context, "context");
                arrayList3.add(new FilterRowLibrary.Filter(e, c.a(bVar, context), false, 4, null));
            }
            return new FilterRowLibrary.Model(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            if (Z.contains(Integer.valueOf(yourLibraryXFilterRowView.e(bVar2)))) {
                arrayList4.add(bVar2);
                if (!h.a(bVar2, dVar)) {
                    if (bVar2 instanceof b.e) {
                        list3 = ((b.e) bVar2).a();
                    } else if (bVar2 instanceof b.C0269b) {
                        list3 = ((b.C0269b) bVar2).a();
                    } else if (bVar2 instanceof b.a) {
                        list3 = ((b.a) bVar2).a();
                    } else if (bVar2 instanceof b.f) {
                        list3 = ((b.f) bVar2).a();
                    } else if (!h.a(bVar2, b.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList4.addAll(list3);
                }
                list3 = emptyList;
                arrayList4.addAll(list3);
            }
        }
        ArrayList arrayList5 = new ArrayList(d.e(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            b bVar3 = (b) it4.next();
            int e2 = yourLibraryXFilterRowView.e(bVar3);
            Context context2 = yourLibraryXFilterRowView.getContext();
            h.d(context2, "context");
            arrayList5.add(new FilterRowLibrary.Filter(e2, c.a(bVar3, context2), Z.contains(Integer.valueOf(yourLibraryXFilterRowView.e(bVar3)))));
        }
        h.e(arrayList5, "$this$distinct");
        return new FilterRowLibrary.Model(d.Q(d.Y(arrayList5)));
    }

    private final int e(b bVar) {
        if (h.a(bVar, b.d.a)) {
            return -1;
        }
        if (bVar instanceof b.a) {
            return C0707R.id.your_library_filter_albums;
        }
        if (bVar instanceof b.C0269b) {
            return C0707R.id.your_library_filter_artists;
        }
        if (h.a(bVar, b.c.a)) {
            return C0707R.id.your_library_filter_downloads;
        }
        if (bVar instanceof b.e) {
            return C0707R.id.your_library_filter_playlists;
        }
        if (bVar instanceof b.f) {
            return C0707R.id.your_library_filter_podcasts;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int i2 = this.b;
        float f = ((float) (i + i2)) / ((float) i2);
        Component<FilterRowLibrary.Model, FilterRowLibrary.Event> component = this.a;
        if (component != null) {
            component.getView().setAlpha(knf.a(f, 0.0f));
        } else {
            h.k("filterRowLibrary");
            throw null;
        }
    }

    public final void setFilterRowLibraryFactory$apps_music_features_your_library_x(ComponentFactory<Component<FilterRowLibrary.Model, FilterRowLibrary.Event>, ? super FilterRowLibrary.Configuration> componentFactory) {
        h.e(componentFactory, "factory");
        Component<FilterRowLibrary.Model, FilterRowLibrary.Event> make = componentFactory.make();
        this.a = make;
        if (make != null) {
            make.getView().setMinimumHeight(nud.g(48.0f, getResources()));
            Component<FilterRowLibrary.Model, FilterRowLibrary.Event> component = this.a;
            if (component != null) {
                addView(component.getView(), new FrameLayout.LayoutParams(-1, -2, 16));
            } else {
                h.k("filterRowLibrary");
                throw null;
            }
        } else {
            h.k("filterRowLibrary");
            throw null;
        }
    }

    public final void setLogger$apps_music_features_your_library_x(eh9 eh9) {
        h.e(eh9, "yourLibraryXLogger");
        this.c = eh9;
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<f> t(da2<YourLibraryXEvent> da2) {
        h.e(da2, "output");
        Component<FilterRowLibrary.Model, FilterRowLibrary.Event> component = this.a;
        if (component != null) {
            component.onEvent(new YourLibraryXFilterRowView$onEvent$1(this, da2));
            return new YourLibraryXFilterRowView$connect$1(this);
        }
        h.k("filterRowLibrary");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryXFilterRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.b = nud.g(20.0f, context.getResources());
    }
}
