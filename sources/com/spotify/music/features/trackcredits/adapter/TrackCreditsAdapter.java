package com.spotify.music.features.trackcredits.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class TrackCreditsAdapter extends RecyclerView.e<RecyclerView.b0> {
    private final List<d> c = new ArrayList();

    public enum ViewType {
        HEADER,
        ROW,
        REPORT_ERROR
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        int w = w(i);
        d dVar = this.c.get(i);
        if (w == 0) {
            ia0 ia0 = (ia0) l70.o(b0Var.a, ia0.class);
            String d = dVar.d();
            Context context = b0Var.a.getContext();
            d.hashCode();
            char c2 = 65535;
            switch (d.hashCode()) {
                case -1812638661:
                    if (d.equals("Source")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1027308992:
                    if (d.equals("Writers")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -357223528:
                    if (d.equals("Sources")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -271042939:
                    if (d.equals("Performers")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 952124161:
                    if (d.equals("Producers")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    d = context.getString(C0707R.string.track_credits_section_header_source);
                    break;
                case 1:
                    d = context.getString(C0707R.string.track_credits_section_header_writers);
                    break;
                case 2:
                    d = context.getString(C0707R.string.track_credits_section_header_sources);
                    break;
                case 3:
                    d = context.getString(C0707R.string.track_credits_section_header_performers);
                    break;
                case 4:
                    d = context.getString(C0707R.string.track_credits_section_header_producers);
                    break;
            }
            ia0.setTitle(d);
        }
        if (w == 1) {
            t90 t90 = (t90) l70.o(b0Var.a, t90.class);
            t90.setText(dVar.d());
            View W1 = t90.W1();
            if (dVar.c().isPresent()) {
                t90.getView().setOnClickListener(new b(this, dVar));
                W1.setVisibility(0);
            } else {
                t90.getView().setOnClickListener(null);
                W1.setVisibility(8);
            }
        }
        if (w == 2) {
            t90 t902 = (t90) l70.o(b0Var.a, t90.class);
            t902.setText(b0Var.a.getContext().getString(C0707R.string.track_credits_report_error));
            t902.getView().setOnClickListener(new a(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return h90.h0(e90.e().a(viewGroup.getContext(), viewGroup));
        }
        if (i == 1 || i == 2) {
            t90 c2 = e90.d().c(viewGroup.getContext(), viewGroup);
            ImageButton i2 = z42.i(viewGroup.getContext(), SpotifyIconV2.CHEVRON_RIGHT);
            i2.setClickable(false);
            c2.z0(i2);
            return h90.h0(h90.h0(c2).j0());
        }
        throw new IllegalArgumentException(je.p0("Unsupported view type: ", i));
    }

    public void X(List<d> list) {
        this.c.clear();
        List<d> list2 = this.c;
        list.getClass();
        list2.addAll(list);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.c.get(i).e().ordinal();
    }
}
