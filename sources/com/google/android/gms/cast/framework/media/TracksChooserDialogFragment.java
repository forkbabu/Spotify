package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.o;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TracksChooserDialogFragment extends DialogFragment {
    private boolean u0;
    private List<MediaTrack> v0;
    private List<MediaTrack> w0;
    private long[] x0;
    private Dialog y0;
    private h z0;

    private static int a5(List<MediaTrack> list, long[] jArr, int i) {
        if (!(jArr == null || list == null)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                for (long j : jArr) {
                    if (j == list.get(i2).I1()) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    private static ArrayList<MediaTrack> c5(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        for (MediaTrack mediaTrack : list) {
            if (mediaTrack.getType() == i) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    static void d5(TracksChooserDialogFragment tracksChooserDialogFragment, y yVar, y yVar2) {
        if (!tracksChooserDialogFragment.u0 || !tracksChooserDialogFragment.z0.m()) {
            Dialog dialog = tracksChooserDialogFragment.y0;
            if (dialog != null) {
                dialog.cancel();
                tracksChooserDialogFragment.y0 = null;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack a = yVar.a();
        if (!(a == null || a.I1() == -1)) {
            arrayList.add(Long.valueOf(a.I1()));
        }
        MediaTrack a2 = yVar2.a();
        if (a2 != null) {
            arrayList.add(Long.valueOf(a2.I1()));
        }
        long[] jArr = tracksChooserDialogFragment.x0;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            for (MediaTrack mediaTrack : tracksChooserDialogFragment.w0) {
                hashSet.add(Long.valueOf(mediaTrack.I1()));
            }
            for (MediaTrack mediaTrack2 : tracksChooserDialogFragment.v0) {
                hashSet.add(Long.valueOf(mediaTrack2.I1()));
            }
            long[] jArr2 = tracksChooserDialogFragment.x0;
            for (long j : jArr2) {
                if (!hashSet.contains(Long.valueOf(j))) {
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        long[] jArr3 = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr3[i] = ((Long) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr3);
        tracksChooserDialogFragment.z0.A(jArr3);
        Dialog dialog2 = tracksChooserDialogFragment.y0;
        if (dialog2 != null) {
            dialog2.cancel();
            tracksChooserDialogFragment.y0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        int a5 = a5(this.v0, this.x0, 0);
        int a52 = a5(this.w0, this.x0, -1);
        y yVar = new y(B2(), this.v0, a5);
        y yVar2 = new y(B2(), this.w0, a52);
        AlertDialog.Builder builder = new AlertDialog.Builder(B2());
        View inflate = B2().getLayoutInflater().inflate(C0707R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(C0707R.id.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(C0707R.id.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(C0707R.id.tab_host);
        tabHost.setup();
        if (yVar.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) yVar);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(C0707R.id.text_list_view);
            newTabSpec.setIndicator(B2().getString(C0707R.string.cast_tracks_chooser_dialog_subtitles));
            tabHost.addTab(newTabSpec);
        }
        if (yVar2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) yVar2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(C0707R.id.audio_list_view);
            newTabSpec2.setIndicator(B2().getString(C0707R.string.cast_tracks_chooser_dialog_audio));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(B2().getString(C0707R.string.cast_tracks_chooser_dialog_ok), new z(this, yVar, yVar2)).setNegativeButton(C0707R.string.cast_tracks_chooser_dialog_cancel, new x(this));
        Dialog dialog = this.y0;
        if (dialog != null) {
            dialog.cancel();
            this.y0 = null;
        }
        AlertDialog create = builder.create();
        this.y0 = create;
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.u0 = true;
        this.w0 = new ArrayList();
        this.v0 = new ArrayList();
        this.x0 = new long[0];
        c d = a.e(F2()).c().d();
        if (d == null || !d.c()) {
            this.u0 = false;
            return;
        }
        h p = d.p();
        this.z0 = p;
        if (p == null || !p.m() || this.z0.h() == null) {
            this.u0 = false;
            return;
        }
        o i = this.z0.i();
        if (i != null) {
            this.x0 = i.I1();
        }
        MediaInfo h = this.z0.h();
        if (h == null) {
            this.u0 = false;
            return;
        }
        List<MediaTrack> I1 = h.I1();
        if (I1 == null) {
            this.u0 = false;
            return;
        }
        this.w0 = c5(I1, 2);
        ArrayList<MediaTrack> c5 = c5(I1, 1);
        this.v0 = c5;
        if (!c5.isEmpty()) {
            List<MediaTrack> list = this.v0;
            MediaTrack.a aVar = new MediaTrack.a(-1, 1);
            aVar.c(B2().getString(C0707R.string.cast_tracks_chooser_dialog_none));
            aVar.d(2);
            aVar.b("");
            list.add(0, aVar.a());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        if (P4() != null && S2()) {
            P4().setDismissMessage(null);
        }
        super.y3();
    }
}
