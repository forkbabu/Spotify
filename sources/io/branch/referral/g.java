package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class g implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Branch b;
    final /* synthetic */ Context c;

    g(String str, Branch branch, Context context) {
        this.a = str;
        this.b = branch;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.a)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString().trim());
            if (!TextUtils.isEmpty(jSONObject.toString())) {
                a.a(jSONObject, this.b, this.c);
                return;
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException | IOException | JSONException unused) {
        }
    }
}
