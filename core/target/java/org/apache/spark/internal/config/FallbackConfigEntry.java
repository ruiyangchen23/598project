package org.apache.spark.internal.config;
/**
 * A config entry whose default value is defined by another config entry.
 */
  class FallbackConfigEntry<T extends java.lang.Object> extends org.apache.spark.internal.config.ConfigEntry<T> {
  public  org.apache.spark.internal.config.ConfigEntry<T> fallback ()  { throw new RuntimeException(); }
  // not preceding
  public   FallbackConfigEntry (java.lang.String key, scala.collection.immutable.List<java.lang.String> alternatives, java.lang.String doc, boolean isPublic, org.apache.spark.internal.config.ConfigEntry<T> fallback)  { throw new RuntimeException(); }
  public  java.lang.String defaultValueString ()  { throw new RuntimeException(); }
  public  T readFrom (org.apache.spark.internal.config.ConfigReader reader)  { throw new RuntimeException(); }
}