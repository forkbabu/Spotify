package com.spotify.music.features.radio.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.spotify.android.glue.patterns.prettylist.compat.c;
import com.spotify.android.glue.patterns.prettylist.compat.i;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.RelatedArtistModel;
import com.spotify.paste.widgets.HeaderView;
import java.util.Iterator;

public class StationFragment extends AbstractStationFragment<i> implements ToolbarConfig.b {
    private TextView W0;
    private boolean X0;
    a Y0;
    u28 Z0;

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public void A5(RadioStationsModel radioStationsModel) {
        this.X0 = false;
        String v5 = v5();
        Iterator<RadioStationModel> it = radioStationsModel.savedStations().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().uri.equals(v5)) {
                    this.X0 = true;
                    break;
                }
            } else {
                break;
            }
        }
        c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
        RadioStationModel radioStationModel = (RadioStationModel) O4();
        if (radioStationModel != null) {
            a5(q5(radioStationModel));
            c B22 = B2();
            if (B22 != null) {
                B22.invalidateOptionsMenu();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public void B5(RadioStationModel radioStationModel) {
        RelatedArtistModel[] relatedArtistModelArr = radioStationModel.relatedArtists;
        if (relatedArtistModelArr == null || relatedArtistModelArr.length == 0) {
            t5().k(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (RelatedArtistModel relatedArtistModel : relatedArtistModelArr) {
            sb.append(relatedArtistModel.artistName());
            sb.append(", ");
        }
        this.W0.setText(R2().getString(C0707R.string.station_description_and_more, sb));
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return !x5();
    }

    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment, com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        ((i) u5().j()).f(agd.e(B2(), l0.z(agd.d(v5()))));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, android.view.View] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment, com.spotify.music.features.radio.common.AbstractContentFragment
    public void U4(RadioStationModel radioStationModel, View view) {
        RadioStationModel radioStationModel2 = radioStationModel;
        this.X0 = radioStationModel2.explicitSave;
        super.U4(radioStationModel2, view);
        c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
    }

    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment, com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        super.g(a0Var);
        RadioStationModel radioStationModel = (RadioStationModel) O4();
        if (!S4(radioStationModel)) {
            this.Z0.b(radioStationModel, a0Var);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "station";
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public RadioStationModel q5(RadioStationModel radioStationModel) {
        return new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, this.X0);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public com.spotify.android.glue.patterns.prettylist.compat.c<i> r5(boolean z, HeaderView headerView, com.spotify.android.flags.c cVar) {
        if (z) {
            c.a<i> d = com.spotify.android.glue.patterns.prettylist.compat.c.c(B2()).c().d();
            d.g(headerView);
            return d.a(this);
        }
        c.a<i> d2 = com.spotify.android.glue.patterns.prettylist.compat.c.b(B2()).c().d();
        d2.f(this.z0);
        d2.g(headerView);
        d2.c(true);
        return d2.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public void s5(v42 v42) {
        this.W0 = (TextView) LayoutInflater.from(B2()).inflate(C0707R.layout.simple_text_view, (ViewGroup) u5().h().getListView(), false);
        int g = nud.g(16.0f, R2()) + F2().getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin);
        this.W0.setPadding(g, 0, g, 0);
        v42.b(new w02(this.W0, false), C0707R.string.station_description_header, 0);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.a(this.Y0);
    }

    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.fragments.AbstractStationFragment
    public void z5(RadioStationModel radioStationModel, View view) {
        this.X0 = radioStationModel.explicitSave;
        super.U4(radioStationModel, view);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
    }
}
