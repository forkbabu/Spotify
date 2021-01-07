package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.glue.dialogs.k;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.l;
import java.util.ArrayList;

/* renamed from: mx4  reason: default package */
public class mx4 {
    private final b a;
    private final Context b;
    private final dj9 c;
    private final com.spotify.music.libs.viewuri.c d;
    private final SnackbarManager e;
    private final g f;
    private final kx4 g;

    /* access modifiers changed from: package-private */
    /* renamed from: mx4$a */
    public class a implements k {
        a() {
        }

        @Override // com.spotify.glue.dialogs.k
        public void a() {
            mx4.this.c.K();
        }

        @Override // com.spotify.glue.dialogs.k
        public void b() {
            mx4.this.c.E(PageIdentifiers.PLAYLIST_EDIT_DISCARD.path(), mx4.this.d.toString());
        }
    }

    /* renamed from: mx4$b */
    public interface b {
        void A();

        void c();

        void e();

        void r();

        void v();

        void x(l lVar, int i);

        void z();
    }

    /* renamed from: mx4$c */
    public interface c {
        mx4 a(b bVar);
    }

    public mx4(Context context, com.spotify.music.libs.viewuri.c cVar, dj9 dj9, SnackbarManager snackbarManager, g gVar, kx4 kx4, b bVar) {
        this.b = context;
        this.c = dj9;
        this.d = cVar;
        this.e = snackbarManager;
        this.f = gVar;
        this.g = kx4;
        this.a = bVar;
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        this.a.r();
    }

    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        this.a.e();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface) {
        this.a.r();
    }

    public /* synthetic */ void f(DialogInterface dialogInterface) {
        this.a.r();
    }

    public /* synthetic */ void g(l lVar, int i, View view) {
        this.a.x(lVar, i);
        this.e.dismiss();
    }

    public /* synthetic */ void h(DialogInterface dialogInterface) {
        this.a.c();
    }

    public void i() {
        f c2 = this.f.c(this.b.getString(C0707R.string.edit_playlist_discard_dialog_title), this.b.getString(C0707R.string.edit_playlist_discard_dialog_body));
        c2.f(this.b.getString(C0707R.string.edit_playlist_discard_dialog_button_cancel), new uw4(this));
        c2.e(this.b.getString(C0707R.string.edit_playlist_discard_dialog_button_discard), new rw4(this));
        c2.h(new sw4(this));
        c2.g(new qw4(this));
        c2.d(new a());
        c2.b().a();
    }

    public void j(l lVar, int i) {
        this.e.show(SnackbarConfiguration.builder((int) C0707R.string.edit_playlist_item_removed_toast_title).actionText(this.b.getString(C0707R.string.edit_playlist_item_removed_toast_button)).onClickListener(new ww4(this, lVar, i)).build());
    }

    public AlertDialog k(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b, 5);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.g.a()) {
            arrayList.add(this.b.getString(C0707R.string.edit_playlist_change_image_dialog_take_photo));
            b bVar = this.a;
            bVar.getClass();
            arrayList2.add(new pw4(bVar));
        }
        arrayList.add(this.b.getString(C0707R.string.edit_playlist_change_image_dialog_choose_photo));
        b bVar2 = this.a;
        bVar2.getClass();
        arrayList2.add(new hx4(bVar2));
        if (z) {
            arrayList.add(this.b.getString(C0707R.string.edit_playlist_change_image_dialog_remove_photo));
            b bVar3 = this.a;
            bVar3.getClass();
            arrayList2.add(new gx4(bVar3));
        }
        builder.setTitle(C0707R.string.edit_playlist_change_image_dialog_title);
        builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), new tw4(arrayList2)).setOnCancelListener(new vw4(this));
        AlertDialog create = builder.create();
        create.show();
        return create;
    }
}
