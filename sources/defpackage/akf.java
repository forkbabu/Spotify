package defpackage;

import android.content.DialogInterface;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: akf  reason: default package */
public final class akf implements DialogInterface.OnClickListener {
    final /* synthetic */ JSONObject a;

    akf(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        xjf.b(xjf.a(this.a, "g"));
    }
}
