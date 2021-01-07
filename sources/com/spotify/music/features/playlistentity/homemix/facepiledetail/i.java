package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i extends RecyclerView.e<f> {
    private Map<String, HomeMixUser> c = new HashMap();
    private List<f> f = new ArrayList();
    private final g n;

    public i(g gVar) {
        this.n = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(f fVar, int i) {
        f fVar2 = fVar;
        HomeMixUser homeMixUser = this.c.get(this.f.get(i).c());
        if (homeMixUser != null) {
            fVar2.h0(homeMixUser, this.f.get(i));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public f M(ViewGroup viewGroup, int i) {
        return this.n.b(viewGroup);
    }

    public void X(Map<String, HomeMixUser> map, List<f> list) {
        this.c = map;
        this.f = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
