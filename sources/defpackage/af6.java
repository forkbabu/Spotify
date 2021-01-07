package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

/* renamed from: af6  reason: default package */
public class af6 {
    private final Context a;
    private final SnackbarManager b;

    /* renamed from: af6$a */
    public interface a {
    }

    public af6(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    private void g(String str, String str2, View.OnClickListener onClickListener) {
        this.b.show(SnackbarConfiguration.builder(str).actionText(str2).onClickListener(onClickListener).build());
    }

    public void a() {
        this.b.dismiss();
    }

    public void b() {
        g(this.a.getString(C0707R.string.home_mix_unknown_error_title), null, null);
    }

    public void c() {
        g(this.a.getString(C0707R.string.home_mix_explicit_tracks_included), null, null);
    }

    public void d() {
        g(this.a.getString(C0707R.string.home_mix_explicit_tracks_removed), null, null);
    }

    public void e(int i, a aVar) {
        String string = this.a.getString(i);
        g(this.a.getString(C0707R.string.home_mix_duo_join_to_be_in_the_mix, string), this.a.getString(C0707R.string.home_mix_join_text), new ze6(aVar, string));
    }

    public void f() {
        g(this.a.getString(C0707R.string.home_mix_no_internet_connection), null, null);
    }

    public void h(int i) {
        g(this.a.getString(C0707R.string.home_mix_user_joined_message, this.a.getString(i)), null, null);
    }

    public void i(int i) {
        g(this.a.getString(C0707R.string.home_mix_user_left_message, this.a.getString(i)), null, null);
    }
}
