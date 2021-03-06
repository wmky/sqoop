package com.cloudera.sqoop;

/**
 * @deprecated use org.apache.sqoop.SqoopVersion instead
 * @see org.apache.sqoop.SqoopVersion
 */
public final class SqoopVersion extends org.apache.sqoop.SqoopVersion {
    public SqoopVersion() {
        super();
    }
    public static final String VERSION =
            org.apache.sqoop.SqoopVersion.VERSION;
    public static final String GIT_HASH =
            org.apache.sqoop.SqoopVersion.GIT_HASH;
    public static final String COMPILE_USER =
            org.apache.sqoop.SqoopVersion.COMPILE_USER;
    public static final String COMPILE_DATE =
            org.apache.sqoop.SqoopVersion.COMPILE_DATE;
}
