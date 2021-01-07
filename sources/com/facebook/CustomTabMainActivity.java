package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.a0;
import com.facebook.internal.e;
import com.facebook.internal.f0;

public class CustomTabMainActivity extends Activity {
    public static final String c = je.m0(CustomTabMainActivity.class, new StringBuilder(), ".extra_action");
    public static final String f = je.m0(CustomTabMainActivity.class, new StringBuilder(), ".extra_params");
    public static final String n = je.m0(CustomTabMainActivity.class, new StringBuilder(), ".extra_chromePackage");
    public static final String o = je.m0(CustomTabMainActivity.class, new StringBuilder(), ".extra_url");
    public static final String p = je.m0(CustomTabMainActivity.class, new StringBuilder(), ".action_refresh");
    private boolean a = true;
    private BroadcastReceiver b;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.p);
            String str = CustomTabMainActivity.o;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private void a(int i, Intent intent) {
        Bundle bundle;
        e6.b(this).e(this.b);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(o);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = f0.J(parse.getQuery());
                bundle.putAll(f0.J(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent h = a0.h(getIntent(), bundle, null);
            if (h != null) {
                intent = h;
            }
            setResult(i, intent);
        } else {
            setResult(i, a0.h(getIntent(), null, null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.b;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(c);
            Bundle bundleExtra = getIntent().getBundleExtra(f);
            new e(stringExtra, bundleExtra).b(this, getIntent().getStringExtra(n));
            this.a = false;
            this.b = new a();
            e6.b(this).c(this.b, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (p.equals(intent.getAction())) {
            e6.b(this).d(new Intent(CustomTabActivity.c));
            a(-1, intent);
        } else if (CustomTabActivity.b.equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.a) {
            a(0, null);
        }
        this.a = true;
    }
}
