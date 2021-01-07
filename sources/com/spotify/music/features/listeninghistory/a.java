package com.spotify.music.features.listeninghistory;

import androidx.fragment.app.o;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import defpackage.di9;
import defpackage.vm5;
import kotlin.jvm.internal.h;

final class a implements Runnable {
    final /* synthetic */ ListeningHistoryFragment a;

    a(ListeningHistoryFragment listeningHistoryFragment) {
        this.a = listeningHistoryFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn5 dn5 = this.a.k0;
        if (dn5 != null) {
            dn5.a();
            ListeningHistoryFragment listeningHistoryFragment = this.a;
            String string = listeningHistoryFragment.R2().getString(C0707R.string.listening_history_filter_option_unit);
            h.d(string, "resources.getString(R.st…story_filter_option_unit)");
            String string2 = listeningHistoryFragment.R2().getString(C0707R.string.listening_history_filter_option_group);
            h.d(string2, "resources.getString(R.st…tory_filter_option_group)");
            vm5.a aVar = vm5.a;
            ListeningHistoryDataSource.HistoryType historyType = ListeningHistoryDataSource.HistoryType.ITEM;
            String name = historyType.name();
            com.spotify.music.features.listeninghistory.presenter.a aVar2 = listeningHistoryFragment.h0;
            if (aVar2 != null) {
                di9.b a2 = vm5.a.a(aVar, name, string, aVar2.d() == historyType, null, 8);
                ListeningHistoryDataSource.HistoryType historyType2 = ListeningHistoryDataSource.HistoryType.GROUP;
                String name2 = historyType2.name();
                com.spotify.music.features.listeninghistory.presenter.a aVar3 = listeningHistoryFragment.h0;
                if (aVar3 != null) {
                    di9.b a3 = vm5.a.a(aVar, name2, string2, aVar3.d() == historyType2, null, 8);
                    di9.a a4 = di9.a();
                    a4.b(ImmutableList.of(a2, a3));
                    di9 a5 = a4.a();
                    h.d(a5, "FilterAndSortConfigurati…\n                .build()");
                    o Q2 = listeningHistoryFragment.Q2();
                    h.d(Q2, "parentFragmentManager");
                    String V2 = listeningHistoryFragment.V2(C0707R.string.listening_history_filter_title);
                    h.d(V2, "getString(R.string.listening_history_filter_title)");
                    aVar.b(a5, Q2, listeningHistoryFragment, V2);
                    return;
                }
                h.k("presenter");
                throw null;
            }
            h.k("presenter");
            throw null;
        }
        h.k("listeningHistoryUbiLogger");
        throw null;
    }
}
