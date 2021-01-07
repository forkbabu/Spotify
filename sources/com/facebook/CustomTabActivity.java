package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class CustomTabActivity extends Activity {
    public static final String b = je.m0(CustomTabActivity.class, new StringBuilder(), ".action_customTabRedirect");
    public static final String c = je.m0(CustomTabActivity.class, new StringBuilder(), ".action_destroy");
    private BroadcastReceiver a;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(b);
            intent2.putExtra(CustomTabMainActivity.o, getIntent().getDataString());
            e6.b(this).d(intent2);
            this.a = new a();
            e6.b(this).c(this.a, new IntentFilter(c));
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(b);
        intent.putExtra(CustomTabMainActivity.o, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        e6.b(this).e(this.a);
        super.onDestroy();
    }
}
