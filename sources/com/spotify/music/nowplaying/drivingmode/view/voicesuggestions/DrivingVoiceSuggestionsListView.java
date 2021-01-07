package com.spotify.music.nowplaying.drivingmode.view.voicesuggestions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;

public class DrivingVoiceSuggestionsListView extends LinearLayoutCompat implements Object {
    private d y;
    private c z;

    public DrivingVoiceSuggestionsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
    }

    private void s() {
        ViewGroup.inflate(getContext(), C0707R.layout.driving_voice_suggestions, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0707R.id.driving_voice_suggestions);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.k(new b(a.d(getContext(), C0707R.drawable.driving_voice_suggestions_divider)), -1);
        d dVar = new d(this);
        this.y = dVar;
        recyclerView.setAdapter(dVar);
    }

    public /* bridge */ /* synthetic */ void c(int i, View view, Object obj) {
        t((uvb) obj);
    }

    public void setListener(c cVar) {
        this.z = cVar;
    }

    public void setPicasso(Picasso picasso) {
        this.y.b0(picasso);
    }

    public void setSuggestedItems(List<uvb> list) {
        d dVar = this.y;
        if (dVar != null) {
            dVar.Z(list);
        }
    }

    public void t(uvb uvb) {
        c cVar = this.z;
        if (cVar != null) {
            cVar.a(uvb.b());
        }
    }

    public DrivingVoiceSuggestionsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s();
    }
}
