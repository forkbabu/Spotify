package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.music.C0707R;
import java.util.HashSet;
import java.util.Set;

public final class c4 {
    private static final Set<Integer> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(Integer.valueOf((int) C0707R.id.context_menu_browse_artist));
        hashSet.add(Integer.valueOf((int) C0707R.id.context_menu_browse_album));
        hashSet.add(Integer.valueOf((int) C0707R.id.context_menu_add_full_album_to_collection));
        hashSet.add(Integer.valueOf((int) C0707R.id.options_menu_mark_explicit));
        hashSet.add(Integer.valueOf((int) C0707R.id.menu_item_start_station));
        hashSet.add(Integer.valueOf((int) C0707R.id.menu_item_report));
        hashSet.add(Integer.valueOf((int) C0707R.id.menu_item_show_credits));
    }

    public static ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        for (b bVar : contextMenuViewModel.l()) {
            boolean z2 = true;
            boolean z3 = !z && a.contains(Integer.valueOf(bVar.c()));
            if (!bVar.h() || z3) {
                z2 = false;
            }
            bVar.m(z2);
        }
        return contextMenuViewModel;
    }
}
