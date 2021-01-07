package com.spotify.music.playlist.permissions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b extends PlaylistPermissionsBottomSheetFragmentAdapter {
    private static final List<PlaylistPermissionsBottomSheetFragmentAdapter.a> o = d.u(new PlaylistPermissionsBottomSheetFragmentAdapter.a(PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.PUBLIC, C0707R.string.not_translated_playlist_permissions_option_public_title, C0707R.string.not_translated_playlist_permissions_option_public_subtitle), new PlaylistPermissionsBottomSheetFragmentAdapter.a(PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.UNLISTED, C0707R.string.not_translated_playlist_permissions_option_unlisted_title, C0707R.string.not_translated_playlist_permissions_option_unlisted_subtitle), new PlaylistPermissionsBottomSheetFragmentAdapter.a(PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.PRIVATE, C0707R.string.not_translated_playlist_permissions_option_private_title, C0707R.string.not_translated_playlist_permissions_option_private_subtitle));
    private boolean c;
    private PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType f = PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType.NONE;
    private final PlaylistPermissionsBottomSheetFragmentAdapter.c n;

    static final class a implements View.OnClickListener {
        final /* synthetic */ b a;
        final /* synthetic */ PlaylistPermissionsBottomSheetFragmentAdapter.a b;
        final /* synthetic */ int c;

        a(b bVar, PlaylistPermissionsBottomSheetFragmentAdapter.a aVar, int i) {
            this.a = bVar;
            this.b = aVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.n.a(this.b, this.c);
        }
    }

    public b(PlaylistPermissionsBottomSheetFragmentAdapter.c cVar) {
        h.e(cVar, "callback");
        this.n = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        View view = b0Var.a;
        h.d(view, "holder.itemView");
        PlaylistPermissionsBottomSheetFragmentAdapter.a aVar = o.get(i);
        g90 o2 = l70.o(view, x90.class);
        h.d(o2, "GlueViewBinders.restore(… RowTwoLines::class.java)");
        x90 x90 = (x90) o2;
        Context context = view.getContext();
        h.d(context, "view.context");
        x90.setTitle(context.getString(aVar.b()));
        x90.setSubtitle(context.getString(aVar.a()));
        if (this.f == aVar.c()) {
            x90.z0(z42.h(context, z42.e(context, SpotifyIconV2.CHECK)));
        } else {
            x90.z0(null);
        }
        view.setOnClickListener(new a(this, aVar, i));
        view.setEnabled(!this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        h90 h0 = h90.h0(e90.d().g(viewGroup.getContext(), viewGroup));
        h.d(h0, "GlueViewHolder.forViewBi…(parent.context, parent))");
        return h0;
    }

    @Override // com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter
    public void X(boolean z) {
        this.c = z;
        z();
    }

    @Override // com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter
    public void Y(PlaylistPermissionsBottomSheetFragmentAdapter.PermissionType permissionType) {
        h.e(permissionType, "type");
        this.f = permissionType;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return o.size();
    }
}
