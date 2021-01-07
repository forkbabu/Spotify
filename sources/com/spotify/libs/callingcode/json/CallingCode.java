package com.spotify.libs.callingcode.json;

import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.JsonParseException;
import com.google.gson.internal.r;
import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.stream.a;
import com.google.gson.stream.b;
import com.google.gson.w;
import java.io.IOException;
import java.util.Locale;

@c20(CallingCodeAdapter.class)
public abstract class CallingCode implements Parcelable {
    public static final /* synthetic */ int a = 0;

    @Keep
    static class CallingCodeAdapter extends w<CallingCode> {
        private final s mParser = new s();

        CallingCodeAdapter() {
        }

        @Override // com.google.gson.w
        public CallingCode read(a aVar) {
            this.mParser.getClass();
            boolean m = aVar.m();
            aVar.Q(true);
            try {
                p b = r.b(aVar);
                aVar.Q(m);
                com.google.gson.r c = b.c();
                String e = c.h("countryCode").e();
                String e2 = c.h("callingCode").e();
                int i = CallingCode.a;
                return new c(e, e2, new Locale("", e).getDisplayCountry());
            } catch (StackOverflowError e3) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e3);
            } catch (OutOfMemoryError e4) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e4);
            } catch (Throwable th) {
                aVar.Q(m);
                throw th;
            }
        }

        public void write(b bVar, CallingCode callingCode) {
            throw new IOException();
        }
    }

    public static CallingCode e(String str, String str2) {
        return new c(str, str2, new Locale("", str).getDisplayCountry());
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CallingCode)) {
            return false;
        }
        CallingCode callingCode = (CallingCode) obj;
        if (!b().equals(callingCode.b()) || !a().equals(callingCode.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return a().hashCode() + ((b().hashCode() + 217) * 31);
    }
}
