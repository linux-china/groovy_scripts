#!/usr/bin/env groovy

@Grab(group = 'commons-lang', module = 'commons-lang', version = '2.6')
import org.apache.commons.lang.StringUtils;

/**
 * demo script
 *
 * @author linux_china
 */
println("Hello World!");

if (StringUtils.isNumeric("123")) {
  println("This is Number");
}
