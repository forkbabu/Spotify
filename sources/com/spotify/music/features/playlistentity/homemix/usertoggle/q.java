package com.spotify.music.features.playlistentity.homemix.usertoggle;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import java.util.ArrayList;
import java.util.List;

public class q extends RecyclerView.e<m> {
    private List<HomeMixUser> c = new ArrayList();
    private final n f;
    private final k n;

    public q(n nVar, k kVar) {
        this.f = nVar;
        this.n = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(m mVar, int i) {
        HomeMixUser homeMixUser = this.c.get(i);
        mVar.j0(homeMixUser, new p(this, homeMixUser, i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public m M(ViewGroup viewGroup, int i) {
        return this.f.b(viewGroup);
    }

    public void Z(List<HomeMixUser> list) {
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
