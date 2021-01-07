package com.spotify.music.homething.settings.adapter;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

class e implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ft9 a;
    final /* synthetic */ List b;
    final /* synthetic */ HomethingSettingsAdapter c;

    e(HomethingSettingsAdapter homethingSettingsAdapter, ft9 ft9, List list) {
        this.c = homethingSettingsAdapter;
        this.a = ft9;
        this.b = list;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        HomethingSettingsAdapter.X(this.c).c(this.a, ((et9) this.b.get(i)).value());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
