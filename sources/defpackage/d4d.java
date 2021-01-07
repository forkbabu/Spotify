package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.sleeptimer.n;
import com.spotify.music.sleeptimer.s;
import java.util.concurrent.TimeUnit;

/* renamed from: d4d  reason: default package */
public class d4d implements e {
    private final SnackbarManager a;
    private final String b;
    private final s c;
    private final n d;

    public d4d(n nVar, SnackbarManager snackbarManager, String str, s sVar) {
        this.d = nVar;
        this.a = snackbarManager;
        this.b = str;
        this.c = sVar;
    }

    private void b(int i) {
        this.a.show(SnackbarConfiguration.builder(i).build());
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public void a(b bVar) {
        int c2 = bVar.c();
        if (c2 == C0707R.id.menu_item_sleep_timer_turn_off) {
            this.d.a();
            b(C0707R.string.context_menu_sleep_timer_turn_off_message);
        } else if (c2 == C0707R.id.menu_item_sleep_timer_end_of_episode || c2 == C0707R.id.menu_item_sleep_timer_end_of_track) {
            this.d.b(this.b);
            b(C0707R.string.context_menu_sleep_timer_select_message);
        } else {
            this.d.c(TimeUnit.MILLISECONDS, a4d.a(c2));
            b(C0707R.string.context_menu_sleep_timer_select_message);
        }
        this.c.a(c2, this.b);
    }
}
