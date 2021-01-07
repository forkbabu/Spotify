package com.spotify.music.features.collectionartist.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import java.util.ArrayList;
import java.util.List;

public class AlbumsWithTracksAdapter extends BaseAdapter {
    private static final int t = Type.f.length;
    private final List<Object> a = new ArrayList();
    private final List<Type> b = new ArrayList();
    private final List<o> c = new ArrayList();
    private String f;
    private final Context n;
    private final boolean o;
    private final b4<o> p;
    private final b4<a> q;
    private final c r;
    private final h s;

    private enum Type {
        TRACK,
        ALBUM,
        PLACEHOLDER;
        
        private static final Type[] f = values();
    }

    public static final class a {
        private final o a;

        public a(o oVar) {
            this.a = oVar;
        }

        public String a() {
            return q.e(this.a, Covers.Size.NORMAL);
        }

        public String b() {
            return this.a.getAlbum().g();
        }

        public long c() {
            return (long) this.a.getUri().hashCode();
        }

        public String d() {
            return this.a.getAlbum().getUri();
        }
    }

    public AlbumsWithTracksAdapter(boolean z, b4<o> b4Var, b4<a> b4Var2, Context context, c cVar, h hVar) {
        this.n = context;
        this.o = z;
        this.p = b4Var;
        this.q = b4Var2;
        this.r = cVar;
        this.s = hVar;
    }

    public void a(String str) {
        this.f = str;
        notifyDataSetChanged();
    }

    public void b(List<o> list) {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        String str = null;
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            o oVar = list.get(i2);
            LinkType q2 = l0.z(oVar.getUri()).q();
            if (!(q2 == LinkType.ALBUM || q2 == LinkType.COLLECTION_ALBUM)) {
                if (i == -1) {
                    i = i2;
                }
                String uri = oVar.getAlbum().getUri();
                boolean z = !rw.equal(str, uri);
                if (i2 > i && z) {
                    List<Object> list2 = this.a;
                    list2.add(list2.get(list2.size() - 1));
                    this.b.add(Type.PLACEHOLDER);
                }
                if (z) {
                    this.a.add(new a(oVar));
                    this.b.add(Type.ALBUM);
                }
                this.a.add(oVar);
                this.b.add(Type.TRACK);
                this.c.add(oVar);
                str = uri;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.b.get(i) == Type.ALBUM) {
            return ((a) this.a.get(i)).c();
        }
        return (long) ((o) this.a.get(i)).getUri().hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.b.get(i).ordinal();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Type type = this.b.get(i);
        int i2 = e90.i;
        ViewProvider viewProvider = (p90) l70.p(view, p90.class);
        boolean z = true;
        if (viewProvider == null) {
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                viewProvider = e90.d().h(this.n, viewGroup, !this.o);
            } else if (ordinal != 2) {
                viewProvider = e90.d().d(this.n, viewGroup);
            } else {
                viewProvider = e90.d().f(this.n, viewGroup);
            }
        }
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            x90 x90 = (x90) viewProvider;
            o oVar = (o) this.a.get(i);
            x90.setTitle(oVar.getName());
            ImmutableList<b> artists = oVar.getArtists();
            if (artists == null || artists.isEmpty()) {
                x90.setSubtitle("");
            } else {
                x90.setSubtitle(artists.get(0).f());
            }
            TextView subtitleView = x90.getSubtitleView();
            TextLabelUtil.a(this.n, subtitleView, oVar.getIs19plus());
            TextLabelUtil.b(this.n, subtitleView, oVar.isExplicit());
            x90.setActive(oVar.getUri().equals(this.f));
            x90.getView().setEnabled(oVar.isCurrentlyPlayable());
            x.m(this.n, x90.getSubtitleView(), oVar.getOfflineState());
            x90.z0(p42.c(this.n, this.p, oVar, this.r));
            if (oVar.isCurrentlyPlayable()) {
                PlayabilityRestriction playabilityRestriction = oVar.getPlayabilityRestriction();
                if (!((playabilityRestriction == PlayabilityRestriction.NO_RESTRICTION || playabilityRestriction == PlayabilityRestriction.UNKNOWN) ? false : true)) {
                    z = false;
                }
            }
            x90.setAppearsDisabled(z);
            View view2 = x90.getView();
            view2.setTag(oVar);
            view2.setTag(C0707R.id.context_menu_tag, new i42(this.p, oVar));
        } else if (ordinal2 == 1) {
            u90 u90 = (u90) viewProvider;
            a aVar = (a) this.a.get(i);
            u90.Z().setTypeface(i2.e(this.n, R.font.encore_font_circular_bold));
            u90.setText(aVar.b());
            this.s.f(u90.getImageView(), !TextUtils.isEmpty(aVar.a()) ? Uri.parse(aVar.a()) : Uri.EMPTY);
            u90.getImageView().setVisibility(0);
            u90.z0(p42.c(this.n, this.q, aVar, this.r));
            View view3 = u90.getView();
            view3.setTag(aVar);
            view3.setTag(C0707R.id.context_menu_tag, new i42(this.q, aVar));
        } else if (ordinal2 != 2) {
            Assertion.p("Unknown type " + type);
        } else {
            ((t90) viewProvider).setText("");
        }
        return viewProvider.getView();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return t;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return Type.f[this.b.get(i).ordinal()] != Type.PLACEHOLDER;
    }
}
