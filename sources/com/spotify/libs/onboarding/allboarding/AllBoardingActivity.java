package com.spotify.libs.onboarding.allboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.x;
import androidx.lifecycle.f0;
import com.spotify.libs.onboarding.allboarding.flow.FlowFragment;
import com.spotify.libs.onboarding.allboarding.flow.c;
import com.spotify.music.C0707R;
import dagger.android.support.b;
import defpackage.ij9;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public class AllBoardingActivity extends b implements ij9.b {
    public static final a C = new a(null);
    private final d B = new f0(j.b(b.class), new AllBoardingActivity$$special$$inlined$viewModels$2(this), new AllBoardingActivity$$special$$inlined$viewModels$1(this));

    public static final class a {
        public a(f fVar) {
        }

        public final Intent a(Context context, EntryPoint entryPoint) {
            h.e(context, "context");
            h.e(entryPoint, "entryPoint");
            Intent intent = new Intent(context, AllBoardingActivity.class);
            intent.putExtra("entry-point", entryPoint.ordinal());
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    @Override // dagger.android.support.b, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_allboarding);
        if (bundle == null) {
            x i = v0().i();
            EntryPoint[] values = EntryPoint.values();
            Intent intent = getIntent();
            EntryPoint entryPoint = EntryPoint.f;
            EntryPoint entryPoint2 = values[intent.getIntExtra("entry-point", 3)];
            h.e(entryPoint2, "entry");
            FlowFragment flowFragment = new FlowFragment();
            flowFragment.r4(new c(entryPoint2).b());
            i.q(C0707R.id.content, flowFragment, null);
            i.i();
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 c = ij9.c(((b) this.B.getValue()).i());
        h.d(c, "PageViewObservable.create(pageViewModel.delegate)");
        return c;
    }
}
