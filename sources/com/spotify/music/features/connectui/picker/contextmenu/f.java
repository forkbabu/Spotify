package com.spotify.music.features.connectui.picker.contextmenu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;
import com.spotify.music.features.connectui.picker.contextmenu.entries.c;
import com.spotify.music.features.connectui.picker.legacy.util.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class f extends RecyclerView.e<a> {
    private final Picasso c;
    private final d f;
    private final e n;
    private b o;
    private List<DeviceContextMenuEntry> p = new ArrayList();
    private String q;
    private int r;

    static class a extends RecyclerView.b0 {
        final ImageView C;
        final TextView D;
        final ImageView E;

        a(View view) {
            super(view);
            this.C = (ImageView) view.findViewById(C0707R.id.picker_device_menu_option_icon);
            this.D = (TextView) view.findViewById(C0707R.id.picker_device_menu_option_text);
            this.E = (ImageView) view.findViewById(C0707R.id.picker_device_menu_option_extra);
        }
    }

    public interface b {
    }

    f(Picasso picasso, d dVar, e eVar) {
        this.c = picasso;
        this.f = dVar;
        this.n = eVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        DeviceContextMenuEntry deviceContextMenuEntry = this.p.get(i);
        int ordinal = deviceContextMenuEntry.getType().ordinal();
        if (ordinal == 0) {
            aVar2.D.setText(C0707R.string.connect_device_menu_logout);
            aVar2.C.setImageDrawable(this.f.b(SpotifyIconV2.DOWNLOAD));
            aVar2.C.setVisibility(0);
            aVar2.E.setImageDrawable(null);
            aVar2.E.setVisibility(8);
            ((vt0) this.n.b()).c(this.q, this.r);
        } else if (ordinal == 1) {
            com.spotify.music.features.connectui.picker.contextmenu.entries.b bVar = (com.spotify.music.features.connectui.picker.contextmenu.entries.b) deviceContextMenuEntry;
            if (bVar.b()) {
                aVar2.D.setText(C0707R.string.connect_device_tech_cast);
                aVar2.C.setImageDrawable(this.f.b(SpotifyIconV2.CHROMECAST_DISCONNECTED));
                ((vt0) this.n.b()).a(this.q, this.r);
            } else {
                aVar2.D.setText(C0707R.string.connect_device_tech_connect);
                aVar2.C.setImageDrawable(this.f.b(SpotifyIconV2.SPOTIFY_CONNECT));
                ((vt0) this.n.b()).b(this.q, this.r);
            }
            aVar2.C.setVisibility(0);
            if (bVar.c()) {
                aVar2.E.setImageDrawable(this.f.b(SpotifyIconV2.CHECK));
                aVar2.E.setVisibility(0);
            } else {
                aVar2.E.setImageDrawable(null);
                aVar2.E.setVisibility(8);
            }
        } else if (ordinal == 2) {
            c cVar = (c) deviceContextMenuEntry;
            aVar2.D.setText(cVar.d());
            aVar2.E.setImageDrawable(this.f.b(SpotifyIconV2.ARROW_UP));
            aVar2.E.setVisibility(0);
            if (cVar.c() == null) {
                aVar2.C.setImageDrawable(null);
                aVar2.C.setVisibility(8);
            } else {
                z m = this.c.m(cVar.c());
                m.i();
                m.b();
                m.m(aVar2.C);
                aVar2.C.setVisibility(0);
            }
            ((vt0) this.n.b()).d(this.q, this.r);
        }
        aVar2.a.setOnClickListener(new a(this, deviceContextMenuEntry));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a(je.G(viewGroup, C0707R.layout.picker_device_menu_entry, viewGroup, false));
    }

    public void X(DeviceContextMenuEntry deviceContextMenuEntry, View view) {
        b bVar = this.o;
        if (bVar != null) {
            e eVar = (e) bVar;
            eVar.a.b(eVar.b, deviceContextMenuEntry);
        }
    }

    public void Y(String str, int i) {
        this.q = str;
        this.r = i;
    }

    public void Z(List<DeviceContextMenuEntry> list) {
        this.p = list;
    }

    public void b0(b bVar) {
        this.o = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.p.size();
    }
}
