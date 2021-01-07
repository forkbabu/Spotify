package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.glue.dialogs.k;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.j;
import java.util.Collections;
import java.util.List;

/* renamed from: jj3  reason: default package */
public class jj3 {
    private final c a = ViewUris.T0;
    private final Context b;
    private final dj9 c;
    private final SnackbarManager d;
    private final b e;
    private final g f;

    /* access modifiers changed from: package-private */
    /* renamed from: jj3$a */
    public class a implements k {
        a() {
        }

        @Override // com.spotify.glue.dialogs.k
        public void a() {
            jj3.this.c.K();
        }

        @Override // com.spotify.glue.dialogs.k
        public void b() {
            jj3.this.c.E(PageIdentifiers.PLAYLIST_ADDTOPLAYLIST_DUPLICATEDIALOG.path(), jj3.this.a.toString());
        }
    }

    /* renamed from: jj3$b */
    public interface b {
        void c(j jVar, List<String> list);

        void d(j jVar, Optional<List<String>> optional);

        void i(j jVar);
    }

    public jj3(Context context, dj9 dj9, SnackbarManager snackbarManager, g gVar, b bVar) {
        this.b = context;
        this.c = dj9;
        this.d = snackbarManager;
        this.f = gVar;
        this.e = bVar;
    }

    private void g(String str) {
        String str2;
        if (MoreObjects.isNullOrEmpty(str)) {
            str2 = this.b.getString(C0707R.string.toast_added_to_generic_playlist);
        } else {
            str2 = this.b.getString(C0707R.string.toast_added_to_playlist, str);
        }
        this.d.showOnNextAttach(SnackbarConfiguration.builder(str2).build());
    }

    private void i(j jVar, List<String> list, Optional<List<String>> optional, int i, int i2, int i3, int i4) {
        f c2 = this.f.c(this.b.getString(i), this.b.getString(i2));
        c2.f(this.b.getString(i3), new zi3(this, jVar, optional));
        c2.e(this.b.getString(i4), new yi3(this, jVar, list));
        c2.h(new aj3(this, jVar));
        c2.d(new a());
        c2.b().a();
    }

    public /* synthetic */ void c(j jVar, Optional optional, DialogInterface dialogInterface, int i) {
        this.e.d(jVar, optional);
    }

    public /* synthetic */ void d(j jVar, List list, DialogInterface dialogInterface, int i) {
        this.e.c(jVar, list);
    }

    public /* synthetic */ void e(j jVar, DialogInterface dialogInterface) {
        this.e.i(jVar);
    }

    public void f(j jVar) {
        g(jVar.j());
    }

    public void h() {
        g(this.b.getString(C0707R.string.your_episodes_title));
    }

    public void j(j jVar, String str) {
        i(jVar, Collections.singletonList(str), Optional.absent(), C0707R.string.add_to_playlist_duplicates_dialog_title, C0707R.string.add_to_playlist_duplicates_dialog_body_single, C0707R.string.add_to_playlist_duplicates_dialog_button_skip_single, C0707R.string.add_to_playlist_duplicates_dialog_button_add_single);
    }

    public void k(j jVar, List<String> list, List<String> list2) {
        i(jVar, list, Optional.of(list2), C0707R.string.add_to_playlist_duplicates_dialog_title, C0707R.string.add_to_playlist_duplicates_dialog_body_multiple, C0707R.string.add_to_playlist_duplicates_dialog_button_skip_multiple, C0707R.string.add_to_playlist_duplicates_dialog_button_add_multiple);
    }

    public void l() {
        this.d.showOnNextAttach(SnackbarConfiguration.builder(this.b.getString(C0707R.string.add_to_playlist_snackbar_removed_from_your_episodes)).build());
    }

    public void m() {
        je.e(C0707R.string.toast_playlist_size_limit_exceeded, this.d);
    }

    public void n() {
        this.d.showOnNextAttach(SnackbarConfiguration.builder((int) C0707R.string.error_general_title).build());
    }
}
