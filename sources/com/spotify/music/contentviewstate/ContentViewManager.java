package com.spotify.music.contentviewstate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.x;
import com.spotify.music.contentviewstate.view.LoadingView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ContentViewManager {
    private final Map<ContentState, d> a = new EnumMap(ContentState.class);
    private final PriorityQueue<d> b = new PriorityQueue<>(ContentState.n.length, new StateDateComparator(null));
    private final gb0 c;
    private final View d;
    private final Context e;
    private final c f;
    private LoadingView g;
    private d h;

    public enum ContentState {
        NO_NETWORK(Integer.MAX_VALUE),
        SERVICE_ERROR(2147483646),
        SERVICE_WARNING(2147483645),
        EMPTY_CONTENT(2147483644);
        
        public static final ContentState[] n = values();
        private final int mPriority;

        private ContentState(int i) {
            this.mPriority = i;
        }

        public int d() {
            return this.mPriority;
        }
    }

    private static class StateDateComparator implements Comparator<d>, Serializable {
        private static final long serialVersionUID = -3812187713254980877L;

        StateDateComparator(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(d dVar, d dVar2) {
            return dVar2.a.d() - dVar.a.d();
        }
    }

    public static class b {
        private final List<d> a = new ArrayList();
        private final Context b;
        private final gb0 c;
        private final View d;
        private c e;

        public b(Context context, gb0 gb0, View view) {
            this.b = context;
            this.c = gb0;
            this.d = view;
        }

        private void e(ContentState contentState) {
            for (d dVar : this.a) {
                Assertion.d(contentState, dVar.a);
            }
        }

        public b a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
            ContentState contentState = ContentState.EMPTY_CONTENT;
            e(contentState);
            this.a.add(new d(contentState, spotifyIconV2, i, i2, null));
            return this;
        }

        public b b(int i, int i2) {
            ContentState contentState = ContentState.NO_NETWORK;
            e(contentState);
            this.a.add(new d(contentState, SpotifyIconV2.OFFLINE, i, i2, null));
            return this;
        }

        public b c(int i, int i2) {
            ContentState contentState = ContentState.SERVICE_ERROR;
            e(contentState);
            this.a.add(new d(contentState, SpotifyIconV2.WARNING, i, i2, null));
            return this;
        }

        public b d(SpotifyIconV2 spotifyIconV2, int i, int i2) {
            ContentState contentState = ContentState.SERVICE_WARNING;
            e(contentState);
            this.a.add(new d(contentState, spotifyIconV2, i, i2, null));
            return this;
        }

        public ContentViewManager f() {
            ContentViewManager contentViewManager = new ContentViewManager(this.b, this.c, this.d, this.e, null);
            for (d dVar : this.a) {
                ContentViewManager.a(contentViewManager, dVar);
            }
            return contentViewManager;
        }

        public b g(c cVar) {
            this.e = cVar;
            return this;
        }
    }

    public interface c {
        void a(gb0 gb0, ContentState contentState);
    }

    /* access modifiers changed from: private */
    public static class d {
        public final ContentState a;
        public final int b;
        public final int c;
        private final SpotifyIconV2 d;
        private WeakReference<Drawable> e = new WeakReference<>(null);

        d(ContentState contentState, SpotifyIconV2 spotifyIconV2, int i, int i2, a aVar) {
            this.a = contentState;
            this.d = spotifyIconV2;
            this.b = i;
            this.c = i2;
        }

        public Drawable a(Context context) {
            Drawable drawable = this.e.get();
            if (drawable != null) {
                return drawable;
            }
            Drawable e2 = yc0.e(context, this.d, Float.NaN, true, true, (float) nud.g(32.0f, context.getResources()));
            this.e = new WeakReference<>(e2);
            return e2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d) || ((d) obj).a.d() != this.a.d()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a.d();
        }
    }

    ContentViewManager(Context context, gb0 gb0, View view, c cVar, a aVar) {
        this.e = context;
        this.c = gb0;
        this.d = view;
        this.f = cVar;
        gb0.getView().setVisibility(8);
        view.setVisibility(8);
    }

    static void a(ContentViewManager contentViewManager, d dVar) {
        contentViewManager.a.put(dVar.a, dVar);
    }

    private View b() {
        if (this.c.getView().getVisibility() == 0) {
            return this.c.getView();
        }
        if (this.d.getVisibility() == 0) {
            return this.d;
        }
        return null;
    }

    private d d(ContentState contentState) {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.a == contentState) {
                return next;
            }
        }
        return null;
    }

    private void j(ContentState contentState, boolean z) {
        z42.a("Not called on main looper");
        if (!this.a.containsKey(contentState)) {
            Assertion.g(String.format("You can not set to a state(%s). Set the state among configured(%s)", contentState.name(), this.a.keySet().toString()));
            return;
        }
        ContentState contentState2 = null;
        if (z) {
            if (d(contentState) == null) {
                this.b.add(this.a.get(contentState));
            }
            d dVar = this.h;
            if (dVar != null) {
                contentState2 = dVar.a;
            }
            if (contentState2 == contentState) {
                return;
            }
        } else {
            d d2 = d(contentState);
            if (d2 != null) {
                this.b.remove(d2);
                d dVar2 = this.h;
                if (dVar2 != null) {
                    contentState2 = dVar2.a;
                }
                if (contentState2 != contentState) {
                    return;
                }
            } else {
                return;
            }
        }
        this.h = this.b.peek();
        l();
    }

    private void l() {
        if (this.h == null) {
            this.c.getView().setVisibility(8);
            this.d.setVisibility(0);
        } else {
            hb0 D2 = this.c.D2();
            x.f(this.e);
            D2.c(this.h.a(this.e));
            this.c.setTitle(this.e.getText(this.h.b));
            this.c.setSubtitle(this.e.getText(this.h.c));
            this.c.getView().setVisibility(0);
            this.d.setVisibility(8);
            c cVar = this.f;
            if (cVar != null) {
                cVar.a(this.c, this.h.a);
            }
        }
        LoadingView loadingView = this.g;
        if (loadingView != null) {
            if (loadingView.p()) {
                View b2 = b();
                if (b2 != null) {
                    b2.setVisibility(8);
                    LoadingView loadingView2 = this.g;
                    loadingView2.setListener(new com.spotify.music.contentviewstate.view.a(loadingView2.getContext(), b2));
                }
                this.g.setTargetContentView(b2);
                this.g.n();
            }
            this.g = null;
        }
    }

    public boolean c(ContentState contentState) {
        return this.a.containsKey(contentState);
    }

    public void e(ContentState contentState) {
        z42.a("Not called on main looper");
        this.b.clear();
        if (contentState != null) {
            j(contentState, true);
            return;
        }
        this.h = null;
        l();
    }

    public void f(boolean z) {
        j(ContentState.EMPTY_CONTENT, z);
    }

    public void g(LoadingView loadingView) {
        z42.a("Not called on main looper");
        this.g = loadingView;
        loadingView.q();
        this.g.setTargetContentView(b());
        this.c.getView().setVisibility(8);
        this.d.setVisibility(8);
        this.g.r();
    }

    public void h(boolean z) {
        j(ContentState.NO_NETWORK, z);
    }

    public void i(boolean z) {
        j(ContentState.SERVICE_ERROR, z);
    }

    public void k(boolean z) {
        j(ContentState.SERVICE_WARNING, z);
    }
}
