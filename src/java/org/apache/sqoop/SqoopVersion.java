package org.apache.sqoop;

public class SqoopVersion {
    public SqoopVersion() {
    }

    public static final String VERSION="${version}";
    public static final String GIT_HASH="${signature}";
    public static final String COMPILE_USER="${USER}";
    public static final String COMPILE_DATE="${compiledate}";

    @Override
    public String toString() {
        return "Sqoop " + VERSION + "\n"
                + "git commit id " + GIT_HASH + "\n"
                + "Compiled by " + COMPILE_USER
                + " on " + COMPILE_DATE + "\n";
    }
}