package com.spotify.music.playlist.permissions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import kotlin.jvm.internal.h;

public final class p implements o {
    private ViewGroup a;
    private PlaylistPermissionsBottomSheetFragmentAdapter b;
    private final PlaylistPermissionsBottomSheetFragmentAdapter.b c;
    private final l d;

    public p(PlaylistPermissionsBottomSheetFragmentAdapter.b bVar, l lVar) {
        h.e(bVar, "adapterFactory");
        h.e(lVar, "presenter");
        this.c = bVar;
        this.d = lVar;
    }

    public View a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(context, "context");
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.playlist_permissions_bottom_sheet_fragment, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById = frameLayout.findViewById(C0707R.id.progress_container);
            h.d(findViewById, "view.findViewById(R.id.progress_container)");
            this.a = (ViewGroup) findViewById;
            this.b = this.c.a(this.d);
            View findViewById2 = frameLayout.findViewById(C0707R.id.recycler_view);
            h.d(findViewById2, "view.findViewById(R.id.recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById2;
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            PlaylistPermissionsBottomSheetFragmentAdapter playlistPermissionsBottomSheetFragmentAdapter = this.b;
            if (playlistPermissionsBottomSheetFragmentAdapter != null) {
                recyclerView.setAdapter(playlistPermissionsBottomSheetFragmentAdapter);
                return frameLayout;
            }
            h.k("adapter");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public void b(PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType permissionType) {
        h.e(permissionType, "type");
        PlaylistPermissionsBottomSheetFragmentAdapter playlistPermissionsBottomSheetFragmentAdapter = this.b;
        if (playlistPermissionsBottomSheetFragmentAdapter != null) {
            playlistPermissionsBottomSheetFragmentAdapter.Y(permissionType);
        } else {
            h.k("adapter");
            throw null;
        }
    }

    public void c(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.a;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                PlaylistPermissionsBottomSheetFragmentAdapter playlistPermissionsBottomSheetFragmentAdapter = this.b;
                if (playlistPermissionsBottomSheetFragmentAdapter != null) {
                    playlistPermissionsBottomSheetFragmentAdapter.X(true);
                } else {
                    h.k("adapter");
                    throw null;
                }
            } else {
                h.k("progressContainer");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.a;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                PlaylistPermissionsBottomSheetFragmentAdapter playlistPermissionsBottomSheetFragmentAdapter2 = this.b;
                if (playlistPermissionsBottomSheetFragmentAdapter2 != null) {
                    playlistPermissionsBottomSheetFragmentAdapter2.X(false);
                } else {
                    h.k("adapter");
                    throw null;
                }
            } else {
                h.k("progressContainer");
                throw null;
            }
        }
    }
}
