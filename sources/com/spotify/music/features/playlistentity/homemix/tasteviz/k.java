package com.spotify.music.features.playlistentity.homemix.tasteviz;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.f;
import com.spotify.music.features.playlistentity.homemix.models.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k extends RecyclerView.e<h> {
    private List<h> c = new ArrayList();
    private Map<String, HomeMixUser> f = new HashMap(10);
    private final i n;

    public k(i iVar) {
        this.n = iVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h hVar, int i) {
        int i2;
        h hVar2 = hVar;
        h hVar3 = this.c.get(i);
        try {
            i2 = Color.parseColor(hVar3.color());
        } catch (IllegalArgumentException unused) {
            i2 = Color.parseColor("lightgray");
        }
        Map<String, HomeMixUser> map = this.f;
        hVar3.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (f fVar : hVar3.affinityUsers()) {
            HomeMixUser homeMixUser = map.get(fVar.c());
            if (homeMixUser != null) {
                arrayList.add(homeMixUser.getFace());
            }
        }
        hVar2.h0(i2, hVar3, arrayList);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h M(ViewGroup viewGroup, int i) {
        return this.n.b(viewGroup);
    }

    public void X(List<h> list, Map<String, HomeMixUser> map) {
        this.c = new ArrayList(list);
        this.f = map;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
