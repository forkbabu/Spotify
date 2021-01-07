package defpackage;

import android.content.Intent;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.callingcode.CallingCodePickerActivity;
import io.reactivex.disposables.a;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Iterator;
import java.util.List;

/* renamed from: yq0  reason: default package */
public class yq0 {
    private final a a = new a();
    private final dr0 b;
    private final y c;
    private zq0 d;
    private String e;

    public yq0(dr0 dr0, y yVar) {
        this.b = dr0;
        this.c = yVar;
    }

    public static void a(yq0 yq0, Throwable th) {
        yq0.getClass();
        Assertion.i("Failed to deserialize calling codes. This shouldn't happen.", th);
        zq0 zq0 = yq0.d;
        if (zq0 != null) {
            CallingCodePickerActivity callingCodePickerActivity = (CallingCodePickerActivity) zq0;
            callingCodePickerActivity.setResult(0, new Intent());
            callingCodePickerActivity.finish();
        }
    }

    public static void b(yq0 yq0, List list) {
        zq0 zq0 = yq0.d;
        if (zq0 != null) {
            ((CallingCodePickerActivity) zq0).R0(list);
            String str = yq0.e;
            int i = -1;
            if (str != null) {
                int i2 = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((CallingCode) it.next()).b().equals(str)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i >= 0) {
                ((CallingCodePickerActivity) yq0.d).P0(i);
            }
        }
    }

    public void c() {
        zq0 zq0 = this.d;
        if (zq0 != null) {
            CallingCodePickerActivity callingCodePickerActivity = (CallingCodePickerActivity) zq0;
            callingCodePickerActivity.setResult(0, new Intent());
            callingCodePickerActivity.finish();
        }
    }

    public void d(String str) {
        zq0 zq0 = this.d;
        if (zq0 != null) {
            ((CallingCodePickerActivity) zq0).O0(str);
        }
    }

    public void e(CallingCode callingCode) {
        zq0 zq0 = this.d;
        if (zq0 != null) {
            CallingCodePickerActivity callingCodePickerActivity = (CallingCodePickerActivity) zq0;
            Intent intent = new Intent();
            if (callingCode != null) {
                intent.putExtra("calling-code", callingCode);
            }
            callingCodePickerActivity.setResult(-1, intent);
            callingCodePickerActivity.finish();
        }
    }

    public void f(zq0 zq0, String str, List<CallingCode> list) {
        z<R> zVar;
        this.d = zq0;
        this.e = str;
        if (list == null || list.isEmpty()) {
            zVar = this.b.a().A(vq0.a);
        } else {
            zVar = z.z(list);
        }
        this.a.b(zVar.B(this.c).subscribe(new rq0(this), new qq0(this)));
    }

    public void g() {
        this.a.f();
        this.d = null;
        this.e = null;
    }
}
