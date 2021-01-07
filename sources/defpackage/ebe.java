package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.uae;
import io.reactivex.disposables.b;
import io.reactivex.subjects.PublishSubject;
import java.util.Date;

/* renamed from: ebe  reason: default package */
public class ebe implements g<tae, sae>, wme, fbe {
    private final View a;
    private final Button b;
    private final DatePicker c;
    private final TextView f;
    private final PublishSubject<sae> n = PublishSubject.h1();

    /* access modifiers changed from: package-private */
    /* renamed from: ebe$a */
    public class a implements h<tae> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            ebe.b(ebe.this, (tae) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.dispose();
        }
    }

    public ebe(View view) {
        this.a = view;
        Button button = (Button) view.findViewById(C0707R.id.age_next_button);
        this.b = button;
        DatePicker datePicker = (DatePicker) view.findViewById(C0707R.id.datePicker);
        this.c = datePicker;
        datePicker.setMaxDate(new Date().getTime());
        this.f = (TextView) view.findViewById(C0707R.id.age_error_message);
        button.setOnClickListener(new bbe(this));
    }

    static void b(ebe ebe, tae tae) {
        ebe.getClass();
        if (tae.f()) {
            uae a2 = tae.a();
            a2.getClass();
            if (a2 instanceof uae.c) {
                ebe.f.setVisibility(4);
                ebe.b.setEnabled(true);
                return;
            }
            uae a3 = tae.a();
            a3.getClass();
            if (a3 instanceof uae.a) {
                ebe.f.setVisibility(0);
                ebe.b.setEnabled(false);
            }
        }
    }

    @Override // defpackage.fbe
    public void a(int i, int i2, int i3) {
        this.c.init(i, i2, i3, new cbe(this));
    }

    @Override // defpackage.wme
    public void c() {
    }

    public /* synthetic */ void d(View view) {
        this.n.onNext(sae.a());
    }

    public /* synthetic */ void e(DatePicker datePicker, int i, int i2, int i3) {
        this.n.onNext(sae.c(i, i2, i3));
    }

    @Override // com.spotify.mobius.g
    public h<tae> t(da2<sae> da2) {
        PublishSubject<sae> publishSubject = this.n;
        da2.getClass();
        return new a(publishSubject.subscribe(new dbe(da2)));
    }
}
