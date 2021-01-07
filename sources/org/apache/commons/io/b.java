package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class b {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger e;
    public static final BigInteger f;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        a = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        b = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        c = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        d = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        e = multiply4;
        valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
        f = multiply5;
        valueOf.multiply(multiply5);
    }

    private static void a(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            throw new FileNotFoundException(je.w0("Source '", file, "' does not exist"));
        }
    }

    public static void b(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e2 = null;
                for (File file2 : listFiles) {
                    try {
                        j(file2);
                    } catch (IOException e3) {
                        e2 = e3;
                    }
                }
                if (e2 != null) {
                    throw e2;
                }
                return;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static void c(File file, File file2) {
        ArrayList arrayList;
        File[] listFiles;
        a(file, file2);
        if (!file.isDirectory()) {
            throw new IOException(je.w0("Source '", file, "' exists but is not a directory"));
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath()) || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(listFiles.length);
                for (File file3 : listFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
            h(file, file2, null, true, arrayList);
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void d(File file, File file2, boolean z) {
        a(file, file2);
        if (file.isDirectory()) {
            throw new IOException(je.w0("Source '", file, "' exists but is a directory"));
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException(je.w0("Destination '", parentFile, "' directory cannot be created"));
            } else if (!file2.exists() || file2.canWrite()) {
                i(file, file2, z);
            } else {
                throw new IOException(je.w0("Destination '", file2, "' exists but is read-only"));
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    /* JADX INFO: finally extract failed */
    public static void e(InputStream inputStream, File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException(je.w0("Directory '", parentFile, "' could not be created"));
            }
        } else if (file.isDirectory()) {
            throw new IOException(je.w0("File '", file, "' exists but is a directory"));
        } else if (!file.canWrite()) {
            throw new IOException(je.w0("File '", file, "' cannot be written to"));
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        try {
            int i = d.a;
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 != read) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            int i2 = d.a;
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static void f(File file) {
        if (file.exists()) {
            if (!k(file)) {
                b(file);
            }
            if (!file.delete()) {
                throw new IOException(je.w0("Unable to delete directory ", file, "."));
            }
        }
    }

    public static boolean g(File file) {
        try {
            if (file.isDirectory()) {
                b(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    private static void h(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException(je.w0("Destination '", file2, "' exists but is not a directory"));
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException(je.w0("Destination '", file2, "' directory cannot be created"));
            }
            if (file2.canWrite()) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            h(file3, file4, fileFilter, z, list);
                        } else {
                            i(file3, file4, z);
                        }
                    }
                }
                if (z) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException(je.w0("Destination '", file2, "' cannot be written to"));
        }
        throw new IOException("Failed to list contents of " + file);
    }

    private static void i(File file, File file2, boolean z) {
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        if (!file2.exists() || !file2.isDirectory()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileChannel = fileInputStream.getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = null;
                        d.a(null, fileOutputStream, fileChannel, fileInputStream);
                        throw th;
                    }
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        long size = fileChannel.size();
                        long j = 0;
                        while (j < size) {
                            long j2 = size - j;
                            long transferFrom = channel.transferFrom(fileChannel, j, j2 > 31457280 ? 31457280 : j2);
                            if (transferFrom == 0) {
                                break;
                            }
                            j += transferFrom;
                        }
                        d.a(channel, fileOutputStream, fileChannel, fileInputStream);
                        long length = file.length();
                        long length2 = file2.length();
                        if (length != length2) {
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                        } else if (z) {
                            file2.setLastModified(file.lastModified());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        d.a(null, fileOutputStream, fileChannel, fileInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    fileChannel = null;
                    d.a(null, fileOutputStream, fileChannel, fileInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                fileOutputStream = null;
                fileChannel = null;
                d.a(null, fileOutputStream, fileChannel, fileInputStream);
                throw th;
            }
        } else {
            throw new IOException(je.w0("Destination '", file2, "' exists but is a directory"));
        }
    }

    public static void j(File file) {
        if (file.isDirectory()) {
            f(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static boolean k(File file) {
        File file2;
        File canonicalFile;
        File parentFile;
        File[] listFiles;
        if (e.a()) {
            return e.b(file);
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        } else if (c.a()) {
            return false;
        } else {
            if (file.getParent() == null) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                return true;
            }
            if (!file.exists() && (parentFile = (canonicalFile = file.getCanonicalFile()).getParentFile()) != null && parentFile.exists() && (listFiles = parentFile.listFiles(new a(canonicalFile))) != null && listFiles.length > 0) {
                return true;
            }
            return false;
        }
    }

    public static long l(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            return m(file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    private static long m(File file) {
        long j;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        long j2 = 0;
        for (File file2 : listFiles) {
            try {
                if (!k(file2)) {
                    if (file2.isDirectory()) {
                        j = m(file2);
                    } else {
                        j = file2.length();
                    }
                    j2 += j;
                    if (j2 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return j2;
    }
}
