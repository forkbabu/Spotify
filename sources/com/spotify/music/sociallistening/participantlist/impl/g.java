package com.spotify.music.sociallistening.participantlist.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.Participant;
import java.util.Collection;
import java.util.List;

public class g extends RecyclerView.e<b> {
    private final lqa c;
    private ImmutableList<Participant> f = ImmutableList.of();
    private String n = "";
    private a o = c.a;

    public interface a {
        void a(Participant participant, int i);
    }

    public static class b extends RecyclerView.b0 {
        final ImageView C;
        final TextView D;

        public b(View view) {
            super(view);
            this.C = (ImageView) view.findViewById(C0707R.id.participant_image);
            this.D = (TextView) view.findViewById(C0707R.id.participant_name);
        }
    }

    public g(lqa lqa) {
        this.c = lqa;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        b bVar2 = bVar;
        Participant participant = this.f.get(i);
        this.c.a(bVar2.C, participant.getLargeImageUrl(), participant.getUsername(), participant.getDisplayName(), false, null);
        bVar2.C.setOnClickListener(new a(this, participant, i));
        bVar2.D.setText(participant.getDisplayName());
        bVar2.D.setOnClickListener(new b(this, participant, i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        return new b(je.G(viewGroup, C0707R.layout.participant, viewGroup, false));
    }

    public /* synthetic */ void X(Participant participant, int i, View view) {
        this.o.a(participant, i);
    }

    public /* synthetic */ void Y(Participant participant, int i, View view) {
        this.o.a(participant, i);
    }

    public void Z(String str) {
        if (!this.n.equals(str)) {
            this.n = str;
            z();
        }
    }

    public void b0(a aVar) {
        this.o = aVar;
    }

    public void c0(List<Participant> list) {
        if (!this.f.equals(list)) {
            this.f = ImmutableList.copyOf((Collection) list);
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
