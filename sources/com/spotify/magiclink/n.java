package com.spotify.magiclink;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.spotify.login.r0;
import com.spotify.music.C0707R;
import io.reactivex.y;

public final class n {
    public static Intent a(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.APP_EMAIL");
            intent.setFlags(268435456);
            return Intent.createChooser(intent, context.getString(C0707R.string.magiclink_request_sent_choose_email));
        } catch (ActivityNotFoundException unused) {
            return null;
        }
    }

    public static void b(MagicLinkActivity magicLinkActivity, r0 r0Var) {
        magicLinkActivity.B = r0Var;
    }

    public static void c(MagicLinkActivity magicLinkActivity, o11 o11) {
        magicLinkActivity.E = o11;
    }

    public static void d(MagiclinkBottomSheetDialog magiclinkBottomSheetDialog, o11 o11) {
        magiclinkBottomSheetDialog.v0 = o11;
    }

    public static void e(MagicLinkActivity magicLinkActivity, r rVar) {
        magicLinkActivity.F = rVar;
    }

    public static void f(MagicLinkActivity magicLinkActivity, y yVar) {
        magicLinkActivity.C = yVar;
    }

    public static void g(MagicLinkActivity magicLinkActivity, s sVar) {
        magicLinkActivity.D = sVar;
    }
}
