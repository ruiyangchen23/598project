package org.apache.spark.status.api.v1;
  interface ApiRequestContext {
  public  javax.servlet.ServletContext servletContext ()  ;
  public  javax.servlet.http.HttpServletRequest httpRequest ()  ;
  public  org.apache.spark.status.api.v1.UIRoot uiRoot ()  ;
}
